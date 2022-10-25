package com.thrive.model;

public class Item {

    Long id;
    String name;
    String count;
    String status;

    public Item(Long id, String name, String count, String status) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public String getCount() {
        return this.count;
    }

    public String getStatus() {
        return this.status;
    }

    public Object getId() {
        return this.id;
    }

}
