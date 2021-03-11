package com.app.coding_in_flow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.app.coding_in_flow.car.Car;
import com.app.coding_in_flow.dagger.ActivityComponent;
import com.app.coding_in_flow.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityComponent component = ((ExampleApp)getApplication())
                .getAppComponent()
                .getActivityComponentBuilder()
                .horsePower(140)
                .engineCapacity(1500)
                .build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
