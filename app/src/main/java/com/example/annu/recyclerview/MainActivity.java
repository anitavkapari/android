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
        employeeList.add(new Employee(R.drawable.dad,
                "Dad","Simri","9122495172"));
        employeeList.add(new Employee(R.drawable.mummy,
                "Mummy","Simri","8862938816"));
        employeeList.add(new Employee(R.drawable.ic_person_outline_black_24dp,
                "Myno.","Saswad","9763075433"));
        employeeList.add(new Employee(R.drawable.profile,
                "Vikash jee","Saswad","9881078842"));
        employeeList.add(new Employee(R.drawable.kanchandee,
                "Kanchan Dee","Kolkata","8596835821"));
        employeeList.add(new Employee(R.drawable.kavita,
                "Kavita","Sitamadhi","7979716310"));
        employeeList.add(new Employee(R.drawable.rohit,
                "Rohit jee","Sitamadhi","9102697817"));
        employeeList.add(new Employee(R.drawable.uday,
                "Uday jee","Delhi","8435002994"));
        employeeList.add(new Employee(R.drawable.guddu,
                "Roushan","Delhi","7814245468"));
        employeeList.add(new Employee(R.drawable.buaaji,
                "BuaaJee","pune","8830304705"));
        employeeList.add(new Employee(R.drawable.papa,
                "Papa","Umgaon","8210975982"));
        employeeList.add(new Employee(R.drawable.bhai,
                "Bhai","Gurgaon","9999149690"));
        employeeList.add(new Employee(R.drawable.bhabhi,
                "Bhabhi","Gurgaon","9999149590"));
        //create adapter
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList);

        rvEmployee.setAdapter(employeeAdapter);
    }
}
