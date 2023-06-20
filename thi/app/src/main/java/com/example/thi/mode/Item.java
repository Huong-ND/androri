package com.example.thi.mode;

import java.io.Serializable;

public class Item implements Serializable {
    private int id;
    private String title,categoly,price,date;
    public Item(){

    }

    public Item(int id, String title, String categoly, String price, String date) {
        this.id = id;
        this.title = title;
        this.categoly = categoly;
        this.price = price;
        this.date = date;
    }

    public Item(String title, String categoly, String price, String date) {
        this.title = title;
        this.categoly = categoly;
        this.price = price;
        this.date = date;
    }


    public Item(int id) {
        this.id = id;
    }
}
