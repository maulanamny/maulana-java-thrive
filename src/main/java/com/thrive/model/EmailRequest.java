package com.thrive.model;

public class EmailRequest {

    String email;
    String nama;
    String content;

    public EmailRequest(String email, String nama, String content) {
        this.email = email;
        this.nama = nama;
        this.content = content;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getContent() {
        return content;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
