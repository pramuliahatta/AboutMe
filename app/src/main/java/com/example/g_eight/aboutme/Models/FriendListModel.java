package com.example.g_eight.aboutme.Models;

/**
 * Created by G-Eight on 5/20/2019.
 * 10116114
 * Hatta Pramulia
 * IF-3
 **/

public class FriendListModel {
    private String studentId, name, classRoom, phoneNumber,email, socialMedia;

    public FriendListModel(String studentId, String name, String classRoom, String phoneNumber, String email, String socialMedia) {
        this.studentId = studentId;
        this.name = name;
        this.classRoom = classRoom;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.socialMedia = socialMedia;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }
}