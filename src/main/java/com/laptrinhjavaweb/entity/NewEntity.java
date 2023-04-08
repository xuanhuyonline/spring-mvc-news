package com.laptrinhjavaweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "new")
public class NewEntity {

    //src/main/resources/META-INF/persistence.xml
    @Id
    // not null and PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //tu tang gia tri len
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "shortdescription", columnDefinition = "TEXT")
    private String shortDescription;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
