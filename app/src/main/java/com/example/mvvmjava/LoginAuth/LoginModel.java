package com.example.mvvmjava.LoginAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModel {

    @SerializedName("result")
    @Expose
    private boolean result;
    @SerializedName("data")
    @Expose
    private Data data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    public class Data {

        @SerializedName("userId")
        @Expose
        private int userId;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("password")
        @Expose
        private String password;
        @SerializedName("profileImgUrl")
        @Expose
        private String profileImgUrl;
        @SerializedName("backgroundImgUrl")
        @Expose
        private String backgroundImgUrl;
        @SerializedName("totalSubscriber")
        @Expose
        private int totalSubscriber;
        @SerializedName("totalUploadedVideos")
        @Expose
        private int totalUploadedVideos;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("channelUri")
        @Expose
        private String channelUri;
        @SerializedName("active")
        @Expose
        private boolean active;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getProfileImgUrl() {
            return profileImgUrl;
        }

        public void setProfileImgUrl(String profileImgUrl) {
            this.profileImgUrl = profileImgUrl;
        }

        public String getBackgroundImgUrl() {
            return backgroundImgUrl;
        }

        public void setBackgroundImgUrl(String backgroundImgUrl) {
            this.backgroundImgUrl = backgroundImgUrl;
        }

        public int getTotalSubscriber() {
            return totalSubscriber;
        }

        public void setTotalSubscriber(int totalSubscriber) {
            this.totalSubscriber = totalSubscriber;
        }

        public int getTotalUploadedVideos() {
            return totalUploadedVideos;
        }

        public void setTotalUploadedVideos(int totalUploadedVideos) {
            this.totalUploadedVideos = totalUploadedVideos;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getChannelUri() {
            return channelUri;
        }

        public void setChannelUri(String channelUri) {
            this.channelUri = channelUri;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

    }

}













