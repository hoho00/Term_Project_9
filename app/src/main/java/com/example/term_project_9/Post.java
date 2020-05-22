package com.example.term_project_9;

import java.util.Date;

public class Post {
    private String documentId;
    private String category;
    private String term;
    private String maxNum;
    private String title;
    private String contents;


    public Post() {
    }

    public Post(String documentId, String category, String term, String maxNum, String title, String contents) {
        this.documentId = documentId;
        this.category = category;
        this.term = term;
        this.maxNum = maxNum;
        this.title = title;
        this.contents = contents;

    }

    public String getDocumentId() {
        return documentId;
    }

    public String getCategory() {
        return category;
    }

    public String getTerm() {
        return term;
    }

    public String getMaxNum() {
        return maxNum;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setMaxNum(String maxNum) {
        this.maxNum = maxNum;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }



    @Override
    public String toString() {
        return "Post{" +
                "documentId='" + documentId + '\'' +
                ", category='" + category + '\'' +
                ", term='" + term + '\'' +
                ", maxNum='" + maxNum + '\'' +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}

