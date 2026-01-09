package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    public Date date;

    public Mood() {
        this.date = new Date();
    }
    public Mood(Date date) {
        this.date = date;
    }

    public abstract String intoString();

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
