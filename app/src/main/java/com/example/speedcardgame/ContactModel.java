package com.example.speedcardgame;

import java.util.Arrays;

public class ContactModel extends UserModel implements IContactsModelBound{
    private String telephone;
    private String email;
    private  byte[] userPhoto = new byte[2000]; // blob data type  -- big data

    public ContactModel(String userName, String userPassword, int userBestScore, String telephone, String email, byte[] userPhoto) {
        super(userName, userPassword, userBestScore);
        this.telephone = telephone;
        this.email = email;
        this.userPhoto = userPhoto;
    }

    @Override
    public void getIMatch() {

    }

    @Override
    public boolean isEmailUsing() {
        if (email == null)
            return false;
        return true;
    }

    @Override
    public boolean isMailValid() {
        isEmailUsing();
        if (email.contains("@"))
            return true;
        return false;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(byte[] userPhoto) {
        this.userPhoto = userPhoto;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", userPhoto=" + Arrays.toString(userPhoto) +
                '}';
    }
}
