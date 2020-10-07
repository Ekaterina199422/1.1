package com.company;

public class Book {
    private String title;
    private StatusEnum status;

    public Book(String title) {
        this.title = title;
        this.status = StatusEnum.AVAILABLE;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
