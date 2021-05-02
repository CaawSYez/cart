package com.yh.shopCart.entity;

public class Book {
    private Integer id;
    private String address;

    private String sexy;


    private String name;
    
    

    private String author;

    private Double money;

    private String description;

    private String path;

    private String oldimagename;

    private String newimagename;

    private String categoryid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getOldimagename() {
        return oldimagename;
    }

    public void setOldimagename(String oldimagename) {
        this.oldimagename = oldimagename == null ? null : oldimagename.trim();
    }

    public String getNewimagename() {
        return newimagename;
    }

    public void setNewimagename(String newimagename) {
        this.newimagename = newimagename == null ? null : newimagename.trim();
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid == null ? null : categoryid.trim();
    }
}