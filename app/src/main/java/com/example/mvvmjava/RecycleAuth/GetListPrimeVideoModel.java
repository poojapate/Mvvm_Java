package com.example.mvvmjava.RecycleAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetListPrimeVideoModel {

    @SerializedName("result")
    @Expose
    private boolean result;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("totalVideos")
    @Expose
    private int totalVideos;
    @SerializedName("data")
    @Expose
    private List<Datum> data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalVideos() {
        return totalVideos;
    }

    public void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
    public class Datum {

        @SerializedName("videoId")
        @Expose
        private int videoId;
        @SerializedName("userId")
        @Expose
        private int userId;
        @SerializedName("userName")
        @Expose
        private String userName;
        @SerializedName("userProfileUrl")
        @Expose
        private String userProfileUrl;
        @SerializedName("categoryId")
        @Expose
        private int categoryId;
        @SerializedName("categoryName")
        @Expose
        private String categoryName;
        @SerializedName("subCategoryId")
        @Expose
        private int subCategoryId;
        @SerializedName("subCategoryName")
        @Expose
        private String subCategoryName;
        @SerializedName("videoTitle")
        @Expose
        private String videoTitle;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("tag")
        @Expose
        private String tag;
        @SerializedName("videoType")
        @Expose
        private String videoType;
        @SerializedName("uploadDate")
        @Expose
        private String uploadDate;
        @SerializedName("videoUrl")
        @Expose
        private String videoUrl;
        @SerializedName("thumbNailUrl")
        @Expose
        private String thumbNailUrl;
        @SerializedName("totalViews")
        @Expose
        private int totalViews;
        @SerializedName("totalLikes")
        @Expose
        private int totalLikes;
        @SerializedName("likeStatus")
        @Expose
        private boolean likeStatus;
        @SerializedName("downloadStatus")
        @Expose
        private boolean downloadStatus;
        @SerializedName("subscribeStatus")
        @Expose
        private boolean subscribeStatus;
        @SerializedName("totalSubscriber")
        @Expose
        private int totalSubscriber;
        @SerializedName("channelId")
        @Expose
        private int channelId;
        @SerializedName("channelName")
        @Expose
        private String channelName;
        @SerializedName("channelProfileImgUrl")
        @Expose
        private String channelProfileImgUrl;
        @SerializedName("isVerified")
        @Expose
        private boolean isVerified;
        @SerializedName("verified")
        @Expose
        private boolean verified;

        public int getVideoId() {
            return videoId;
        }

        public void setVideoId(int videoId) {
            this.videoId = videoId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserProfileUrl() {
            return userProfileUrl;
        }

        public void setUserProfileUrl(String userProfileUrl) {
            this.userProfileUrl = userProfileUrl;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        public int getSubCategoryId() {
            return subCategoryId;
        }

        public void setSubCategoryId(int subCategoryId) {
            this.subCategoryId = subCategoryId;
        }

        public String getSubCategoryName() {
            return subCategoryName;
        }

        public void setSubCategoryName(String subCategoryName) {
            this.subCategoryName = subCategoryName;
        }

        public String getVideoTitle() {
            return videoTitle;
        }

        public void setVideoTitle(String videoTitle) {
            this.videoTitle = videoTitle;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getVideoType() {
            return videoType;
        }

        public void setVideoType(String videoType) {
            this.videoType = videoType;
        }

        public String getUploadDate() {
            return uploadDate;
        }

        public void setUploadDate(String uploadDate) {
            this.uploadDate = uploadDate;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getThumbNailUrl() {
            return thumbNailUrl;
        }

        public void setThumbNailUrl(String thumbNailUrl) {
            this.thumbNailUrl = thumbNailUrl;
        }

        public int getTotalViews() {
            return totalViews;
        }

        public void setTotalViews(int totalViews) {
            this.totalViews = totalViews;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public boolean isLikeStatus() {
            return likeStatus;
        }

        public void setLikeStatus(boolean likeStatus) {
            this.likeStatus = likeStatus;
        }

        public boolean isDownloadStatus() {
            return downloadStatus;
        }

        public void setDownloadStatus(boolean downloadStatus) {
            this.downloadStatus = downloadStatus;
        }

        public boolean isSubscribeStatus() {
            return subscribeStatus;
        }

        public void setSubscribeStatus(boolean subscribeStatus) {
            this.subscribeStatus = subscribeStatus;
        }

        public int getTotalSubscriber() {
            return totalSubscriber;
        }

        public void setTotalSubscriber(int totalSubscriber) {
            this.totalSubscriber = totalSubscriber;
        }

        public int getChannelId() {
            return channelId;
        }

        public void setChannelId(int channelId) {
            this.channelId = channelId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getChannelProfileImgUrl() {
            return channelProfileImgUrl;
        }

        public void setChannelProfileImgUrl(String channelProfileImgUrl) {
            this.channelProfileImgUrl = channelProfileImgUrl;
        }

        public boolean isIsVerified() {
            return isVerified;
        }

        public void setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
        }

        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }

    }
}
