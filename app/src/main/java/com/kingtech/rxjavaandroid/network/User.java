package com.kingtech.rxjavaandroid.network;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class User {

    private String name;
    private String profileUrl;
    private String projectName;
    /*later on add fields for updated and createdAt*/

    public User(String name, String profileUrl, String projectName) {
        this.name = name;
        this.profileUrl = profileUrl;
        this.projectName = projectName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public static class UserDiffUtil extends DiffUtil.ItemCallback<User> {

        @Override
        public boolean areItemsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem.name.equals(newItem.name);
        }

        @Override
        public boolean areContentsTheSame(@NonNull User oldItem, @NonNull User newItem) {
            return oldItem.name.equals(newItem.name);
        }
    }
}
