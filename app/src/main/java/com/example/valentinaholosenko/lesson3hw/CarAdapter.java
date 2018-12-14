package com.example.valentinaholosenko.lesson3hw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarAdapter extends BaseAdapter {

        private ArrayList<Car> CarData = new ArrayList<>();
        private LayoutInflater InflaterCatalogListItems;

        public CarAdapter(Context context, ArrayList<Car> carData) {
            CarData = carData;
            InflaterCatalogListItems = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        //This function will determine how many items to be displayed
        @Override
        public int getCount() {
            return CarData.size();
        }

        @Override
        public Object getItem(int position) {
            return CarData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        //This function will iterate through each object in the Data Set. This function will form each item in a Grid View
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder;

            if (convertView == null) {

                holder = new ViewHolder();
                convertView = InflaterCatalogListItems.inflate(R.layout.custom_item_img,
                        null);
                holder.sCarName = (TextView) convertView.findViewById(R.id.name);
                holder.sCarPhotoPath = (ImageView) convertView.findViewById(R.id.imageView);
                convertView.setTag(holder);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }


            //Change the content here
            if (CarData.get(position) != null) {
                holder.sCarName.setText(CarData.get(position).getCarName());
                holder.sCarPhotoPath.setImageResource(CarData.get(position).getCarImage());
            }

            return convertView;
        }

        //View Holder class used for reusing the same inflated view. It will decrease the inflation overhead @getView
        private static class ViewHolder {
            TextView sCarName;
            ImageView sCarPhotoPath;

        }

    }

