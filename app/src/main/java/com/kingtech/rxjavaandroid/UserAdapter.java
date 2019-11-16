package com.kingtech.rxjavaandroid;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kingtech.rxjavaandroid.databinding.LayoutUserRepoBinding;
import com.kingtech.rxjavaandroid.network.User;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends ListAdapter<User, UserAdapter.UserViewHolder> {

    private LayoutUserRepoBinding viewBinding;

    protected UserAdapter() {
        super(new User.UserDiffUtil());
    }

    @BindingAdapter("profileImage")
    public static void loadImage(CircleImageView view, String url) {
        Glide.with(view.getContext())
                .asBitmap()
                .load(url)
                .into(view);
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        viewBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.layout_user_repo, parent, false);
        return new UserViewHolder(viewBinding);
    }

    public void setData(List<User> users) {
        submitList(users);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        public UserViewHolder(@NonNull LayoutUserRepoBinding view) {
            super(view.getRoot());
        }

        private void bind(User user) {
            viewBinding.setUser(user);
            viewBinding.executePendingBindings();
        }
    }
}
