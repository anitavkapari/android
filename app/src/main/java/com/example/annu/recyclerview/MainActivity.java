package com.example.annu.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rvEmployee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvEmployee=findViewById(R.id.rvEmployee);
        //applied orientation
        rvEmployee.setLayoutManager(new LinearLayoutManager(this));
//create list
        List<Employee> employeeList= new ArrayList<>();
        //adding data list
        employeeList.add(new Employee(R.drawable.ic_launcher_background,
                "Ravi","Saswad","28988978"));
        employeeList.add(new Employee(R.drawable.profile,
                "Deversh","Pune","9883782833"));
        employeeList.add(new Employee(R.drawable.ic_launcher_foreground,
                "Deversh","Pune","9883782833"));
        employeeList.add(new Employee(R.drawable.profile,
                "prem","Mumbai","6171888"));
        employeeList.add(new Employee(R.drawable.ic_launcher_foreground,
                "prem","Mumbai","6171888"));
        employeeList.add(new Employee(R.drawable.profile,
                "prem","Mumbai","6171888"));
        //create adapter
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);

        rvEmployee.setAdapter(employeeAdapter);
    }
}
