package com.github.yuriy27.objects;

import java.util.ArrayList;

public class Delivery {

    private ArrayList<String> recepiens;

    public Delivery() {
        recepiens = new ArrayList<String>();
    }

    public ArrayList<String> getRecepiens() {
        return recepiens;
    }

    public void setRecepiens(ArrayList<String> recepiens) {
        this.recepiens = recepiens;
    }
}
