package com.example.valentinaholosenko.lesson3hw;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Car> mCarDataSet = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Prepare DataSet
        mCarDataSet = prepareDataSet();

        //Initialize Grid View for programming
        GridView gridview = (GridView) findViewById(R.id.gridView);

        //Connect DataSet to Adapter
        CarAdapter carAdapter = new CarAdapter(this, mCarDataSet);

        //Now Connect Adapter To GridView
        gridview.setAdapter(carAdapter);

        //Add Listener For Grid View Item Click
        gridview.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        //Show Name Of The Flower
        Toast.makeText(MainActivity.this, mCarDataSet.get(position).getCarName(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private ArrayList<Car> prepareDataSet() {
        ArrayList<Car> carData = new ArrayList<>();
        Resources res = getResources();
        Car car;

        //1st Item
        car = new Car();
        car.setCarName("Alyssum");
        car.setPhotoPath(res,R.drawable.convertible,null);
        carData.add(car);

        //2nd Item
        car = new Car();
        car.setCarName("Alyssum");
        //car.setPhotoPath(R.drawable.);
        carData.add(car);


        //3rd Item
        car = new Car();
        car.setCarName("Alyssum");
        //car.setPhotoPath(R.drawable.);
        carData.add(car);


        //4th Item
        car = new Car();
        car.setCarName("Alyssum");
        //car.setPhotoPath(R.drawable.);
        carData.add(car);


        //5th Item
        car = new Car();
        car.setCarName("Alyssum");
        //car.setPhotoPath(R.drawable.);
        carData.add(car);


        //6th Item
        car = new Car();
        car.setCarName("Alyssum");
        //car.setPhotoPath(R.drawable.);
        carData.add(car);

        return carData;
    }
}
