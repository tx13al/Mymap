package com.example.mymap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   Button showCustomLayoutButton = findViewById(R.id.first_floor);
     //   ViewSwitcher customLayoutSwitcher = findViewById(R.id.switch_fisrtfloor);
        FirstFloor firstFloor = findViewById(R.id.floor_plan);
        firstFloor.setPaintColor(Color.LTGRAY);
     //
     //   showCustomLayoutButton.setOnClickListener(new View.OnClickListener() {
     //       @Override
     //       public void onClick(View view) {
     //           if (customLayoutSwitcher.getCurrentView() == firstFloor) {
     //               customLayoutSwitcher.showNext();
     //           } else {
     //               customLayoutSwitcher.showPrevious();
     //           }
     //       }
     //   });

    }


}