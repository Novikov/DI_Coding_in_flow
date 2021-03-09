package com.app.coding_in_flow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.app.coding_in_flow.car.Car;
import com.app.coding_in_flow.dagger.CarComponent;
import com.app.coding_in_flow.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }
}
