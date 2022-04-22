package com.example.speedcardgame;

public class UserModel {
    private String userName;
    private String userPassword;
    private int userBestScore;

    public UserModel(String userName, String userPassword, int userBestScore) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userBestScore = userBestScore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public int getUserBestScore() {
        return userBestScore;
    }

    public void setUserBestScore(int userBestScore) {
        this.userBestScore = userBestScore;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBestScore=" + userBestScore +
                '}';
    }
}
