package com.oftheday.syalsahab.oftheday.Model;

import java.sql.Blob;
import java.sql.Date;

/**
 * Created by Anuj Syal on 4/19/2015.
 */
public class Laugh {

    private int id;
    private  String content;
    private String image_url;
    private String source;
    private Date created_on;
    private Date upload_on;
    private Boolean is_uploaded;
    private Double like_counter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public Date getUpload_on() {
        return upload_on;
    }

    public void setUpload_on(Date upload_on) {
        this.upload_on = upload_on;
    }

    public Boolean getIs_uploaded() {
        return is_uploaded;
    }

    public void setIs_uploaded(Boolean is_uploaded) {
        this.is_uploaded = is_uploaded;
    }

    public Double getLike_counter() {
        return like_counter;
    }

    public void setLike_counter(Double like_counter) {
        this.like_counter = like_counter;
    }
}
