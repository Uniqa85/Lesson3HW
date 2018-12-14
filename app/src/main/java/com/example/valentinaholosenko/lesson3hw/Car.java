package com.example.valentinaholosenko.lesson3hw;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class Car {
    int carImage;
    String carName;

    public Car() {
        this.carImage = carImage;
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getCarImage(){
        return carImage;
    }

    public void setCarName(String name) {
        carName = name;
    }

    public void setPhotoPath(Resources res, int photoPath, Object o) {
        carImage = photoPath;
    }
}
