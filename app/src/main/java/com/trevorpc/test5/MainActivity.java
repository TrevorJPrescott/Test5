package com.trevorpc.test5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer array[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        String dread = "{Trevor Prescott)";
        //checker(dread);
        //Spiral(array);



    }

//    public void checker(String input) {
//
//        // loop through input
//        // if end bracket return false
//        // if start bracket look for corresponding end bracket
//        // if found delete end bracket
//        // if not found return false
//
//        for (int x =0;x<=input.length();x++){
//            Log.d("TAG", "checker: "+ input.charAt(x));
//
//            String temp = Character.toString(input.charAt(x));
//
//            if (temp.matches()
//            {
//                Log.d("TAG", "checker: false");
//            }
//            if (temp.matches("]")){
//                Log.d("TAG", "checker: false");
//            }
//            if (temp.matches(")")){
//                Log.d("TAG", "checker: false");
//            }
//
//
//            if(temp.matches(""))
//            {
//                  search for corresponding end and remove it if none false
//            }
//            if(temp.matches("[")) {
//                  search for corresponding end and remove it, if none false
//            }
//
//
//
//
//        }
//    }

    public void Spiral(Integer[][] input) {
        int MaxHeight = input.length -1;
        int MaxWidth = input[0].length -1;
        int MinHeight = 0;
        int MinWidth = 0;


        for (int count = 0;count< 1;count++)
        {

            Log.d("TAG", "Spiral: East");
            for (int h = MinHeight; h <= MaxHeight; h++) {
                Log.d("TAG", "Spiral: " + input[MinWidth][h]);
            }
            MinWidth = MinWidth +1;


            Log.d("TAG", "Spiral: South");


            for (int w = MinWidth; w <= MaxWidth; w++) {
                Log.d("TAG", "Spiral: " + input[w][MaxHeight]);
            }
            MaxHeight = MaxHeight -1;


            Log.d("TAG", "Spiral: West");

            for (int h = MaxHeight; h >= MinHeight; h--) {
                Log.d("TAG", "Spiral: " + input[MaxWidth][h]);
            }
            MaxWidth = MaxWidth -1;


            Log.d("TAG", "Spiral: North");

            for (int w = MaxWidth; w >= MinWidth; w--) {
                Log.d("TAG", "Spiral: " + input[w][MinHeight]);
            }
            MinHeight = MinHeight +1;


        }
    }



}
