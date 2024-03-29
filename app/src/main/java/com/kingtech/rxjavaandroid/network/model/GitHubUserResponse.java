
package com.kingtech.rxjavaandroid.network.model;

import com.google.gson.annotations.SerializedName;

public class GitHubUserResponse {

    @SerializedName("archive_url")
    private String mArchiveUrl;
    @SerializedName("archived")
    private boolean mArchived;
    @SerializedName("assignees_url")
    private String mAssigneesUrl;
    @SerializedName("blobs_url")
    private String mBlobsUrl;
    @SerializedName("branches_url")
    private String mBranchesUrl;
    @SerializedName("clone_url")
    private String mCloneUrl;
    @SerializedName("collaborators_url")
    private String mCollaboratorsUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("commits_url")
    private String mCommitsUrl;
    @SerializedName("compare_url")
    private String mCompareUrl;
    @SerializedName("contents_url")
    private String mContentsUrl;
    @SerializedName("contributors_url")
    private String mContributorsUrl;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("default_branch")
    private String mDefaultBranch;
    @SerializedName("deployments_url")
    private String mDeploymentsUrl;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("disabled")
    private boolean mDisabled;
    @SerializedName("downloads_url")
    private String mDownloadsUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("fork")
    private boolean mFork;
    @SerializedName("forks")
    private long mForks;
    @SerializedName("forks_count")
    private long mForksCount;
    @SerializedName("forks_url")
    private String mForksUrl;
    @SerializedName("full_name")
    private String mFullName;
    @SerializedName("git_commits_url")
    private String mGitCommitsUrl;
    @SerializedName("git_refs_url")
    private String mGitRefsUrl;
    @SerializedName("git_tags_url")
    private String mGitTagsUrl;
    @SerializedName("git_url")
    private String mGitUrl;
    @SerializedName("has_downloads")
    private boolean mHasDownloads;
    @SerializedName("has_issues")
    private boolean mHasIssues;
    @SerializedName("has_pages")
    private boolean mHasPages;
    @SerializedName("has_projects")
    private boolean mHasProjects;
    @SerializedName("has_wiki")
    private boolean mHasWiki;
    @SerializedName("homepage")
    private Object mHomepage;
    @SerializedName("hooks_url")
    private String mHooksUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private long mId;
    @SerializedName("issue_comment_url")
    private String mIssueCommentUrl;
    @SerializedName("issue_events_url")
    private String mIssueEventsUrl;
    @SerializedName("issues_url")
    private String mIssuesUrl;
    @SerializedName("keys_url")
    private String mKeysUrl;
    @SerializedName("labels_url")
    private String mLabelsUrl;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("languages_url")
    private String mLanguagesUrl;
    @SerializedName("license")
    private Object mLicense;
    @SerializedName("merges_url")
    private String mMergesUrl;
    @SerializedName("milestones_url")
    private String mMilestonesUrl;
    @SerializedName("mirror_url")
    private Object mMirrorUrl;
    @SerializedName("name")
    private String mName;
    @SerializedName("node_id")
    private String mNodeId;
    @SerializedName("notifications_url")
    private String mNotificationsUrl;
    @SerializedName("open_issues")
    private long mOpenIssues;
    @SerializedName("open_issues_count")
    private long mOpenIssuesCount;
    @SerializedName("owner")
    private Owner mOwner;
    @SerializedName("private")
    private boolean mPrivate;
    @SerializedName("pulls_url")
    private String mPullsUrl;
    @SerializedName("pushed_at")
    private String mPushedAt;
    @SerializedName("releases_url")
    private String mReleasesUrl;
    @SerializedName("size")
    private long mSize;
    @SerializedName("ssh_url")
    private String mSshUrl;
    @SerializedName("stargazers_count")
    private long mStargazersCount;
    @SerializedName("stargazers_url")
    private String mStargazersUrl;
    @SerializedName("statuses_url")
    private String mStatusesUrl;
    @SerializedName("subscribers_url")
    private String mSubscribersUrl;
    @SerializedName("subscription_url")
    private String mSubscriptionUrl;
    @SerializedName("svn_url")
    private String mSvnUrl;
    @SerializedName("tags_url")
    private String mTagsUrl;
    @SerializedName("teams_url")
    private String mTeamsUrl;
    @SerializedName("trees_url")
    private String mTreesUrl;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("watchers")
    private long mWatchers;
    @SerializedName("watchers_count")
    private long mWatchersCount;

    public String getArchiveUrl() {
        return mArchiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        mArchiveUrl = archiveUrl;
    }

    public boolean getArchived() {
        return mArchived;
    }

    public void setArchived(boolean archived) {
        mArchived = archived;
    }

    public String getAssigneesUrl() {
        return mAssigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        mAssigneesUrl = assigneesUrl;
    }

    public String getBlobsUrl() {
        return mBlobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        mBlobsUrl = blobsUrl;
    }

    public String getBranchesUrl() {
        return mBranchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        mBranchesUrl = branchesUrl;
    }

    public String getCloneUrl() {
        return mCloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        mCloneUrl = cloneUrl;
    }

    public String getCollaboratorsUrl() {
        return mCollaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        mCollaboratorsUrl = collaboratorsUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        mCommitsUrl = commitsUrl;
    }

    public String getCompareUrl() {
        return mCompareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        mCompareUrl = compareUrl;
    }

    public String getContentsUrl() {
        return mContentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        mContentsUrl = contentsUrl;
    }

    public String getContributorsUrl() {
        return mContributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        mContributorsUrl = contributorsUrl;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        mDefaultBranch = defaultBranch;
    }

    public String getDeploymentsUrl() {
        return mDeploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        mDeploymentsUrl = deploymentsUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean getDisabled() {
        return mDisabled;
    }

    public void setDisabled(boolean disabled) {
        mDisabled = disabled;
    }

    public String getDownloadsUrl() {
        return mDownloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        mDownloadsUrl = downloadsUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public boolean getFork() {
        return mFork;
    }

    public void setFork(boolean fork) {
        mFork = fork;
    }

    public long getForks() {
        return mForks;
    }

    public void setForks(long forks) {
        mForks = forks;
    }

    public long getForksCount() {
        return mForksCount;
    }

    public void setForksCount(long forksCount) {
        mForksCount = forksCount;
    }

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forksUrl) {
        mForksUrl = forksUrl;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public String getGitCommitsUrl() {
        return mGitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        mGitCommitsUrl = gitCommitsUrl;
    }

    public String getGitRefsUrl() {
        return mGitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        mGitRefsUrl = gitRefsUrl;
    }

    public String getGitTagsUrl() {
        return mGitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        mGitTagsUrl = gitTagsUrl;
    }

    public String getGitUrl() {
        return mGitUrl;
    }

    public void setGitUrl(String gitUrl) {
        mGitUrl = gitUrl;
    }

    public boolean getHasDownloads() {
        return mHasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        mHasDownloads = hasDownloads;
    }

    public boolean getHasIssues() {
        return mHasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        mHasIssues = hasIssues;
    }

    public boolean getHasPages() {
        return mHasPages;
    }

    public void setHasPages(boolean hasPages) {
        mHasPages = hasPages;
    }

    public boolean getHasProjects() {
        return mHasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        mHasProjects = hasProjects;
    }

    public boolean getHasWiki() {
        return mHasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        mHasWiki = hasWiki;
    }

    public Object getHomepage() {
        return mHomepage;
    }

    public void setHomepage(Object homepage) {
        mHomepage = homepage;
    }

    public String getHooksUrl() {
        return mHooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        mHooksUrl = hooksUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getIssueCommentUrl() {
        return mIssueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        mIssueCommentUrl = issueCommentUrl;
    }

    public String getIssueEventsUrl() {
        return mIssueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        mIssueEventsUrl = issueEventsUrl;
    }

    public String getIssuesUrl() {
        return mIssuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        mIssuesUrl = issuesUrl;
    }

    public String getKeysUrl() {
        return mKeysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        mKeysUrl = keysUrl;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        mLabelsUrl = labelsUrl;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public String getLanguagesUrl() {
        return mLanguagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        mLanguagesUrl = languagesUrl;
    }

    public Object getLicense() {
        return mLicense;
    }

    public void setLicense(Object license) {
        mLicense = license;
    }

    public String getMergesUrl() {
        return mMergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        mMergesUrl = mergesUrl;
    }

    public String getMilestonesUrl() {
        return mMilestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        mMilestonesUrl = milestonesUrl;
    }

    public Object getMirrorUrl() {
        return mMirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        mMirrorUrl = mirrorUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getNodeId() {
        return mNodeId;
    }

    public void setNodeId(String nodeId) {
        mNodeId = nodeId;
    }

    public String getNotificationsUrl() {
        return mNotificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        mNotificationsUrl = notificationsUrl;
    }

    public long getOpenIssues() {
        return mOpenIssues;
    }

    public void setOpenIssues(long openIssues) {
        mOpenIssues = openIssues;
    }

    public long getOpenIssuesCount() {
        return mOpenIssuesCount;
    }

    public void setOpenIssuesCount(long openIssuesCount) {
        mOpenIssuesCount = openIssuesCount;
    }

    public Owner getOwner() {
        return mOwner;
    }

    public void setOwner(Owner owner) {
        mOwner = owner;
    }

    public boolean getPrivate() {
        return mPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.mPrivate = isPrivate;
    }

    public String getPullsUrl() {
        return mPullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        mPullsUrl = pullsUrl;
    }

    public String getPushedAt() {
        return mPushedAt;
    }

    public void setPushedAt(String pushedAt) {
        mPushedAt = pushedAt;
    }

    public String getReleasesUrl() {
        return mReleasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        mReleasesUrl = releasesUrl;
    }

    public long getSize() {
        return mSize;
    }

    public void setSize(long size) {
        mSize = size;
    }

    public String getSshUrl() {
        return mSshUrl;
    }

    public void setSshUrl(String sshUrl) {
        mSshUrl = sshUrl;
    }

    public long getStargazersCount() {
        return mStargazersCount;
    }

    public void setStargazersCount(long stargazersCount) {
        mStargazersCount = stargazersCount;
    }

    public String getStargazersUrl() {
        return mStargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        mStargazersUrl = stargazersUrl;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        mStatusesUrl = statusesUrl;
    }

    public String getSubscribersUrl() {
        return mSubscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        mSubscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return mSubscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        mSubscriptionUrl = subscriptionUrl;
    }

    public String getSvnUrl() {
        return mSvnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        mSvnUrl = svnUrl;
    }

    public String getTagsUrl() {
        return mTagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        mTagsUrl = tagsUrl;
    }

    public String getTeamsUrl() {
        return mTeamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        mTeamsUrl = teamsUrl;
    }

    public String getTreesUrl() {
        return mTreesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        mTreesUrl = treesUrl;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public long getWatchers() {
        return mWatchers;
    }

    public void setWatchers(long watchers) {
        mWatchers = watchers;
    }

    public long getWatchersCount() {
        return mWatchersCount;
    }

    public void setWatchersCount(long watchersCount) {
        mWatchersCount = watchersCount;
    }

}
