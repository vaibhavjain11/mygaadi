package com.example.administrator.recycleviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;


import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    RecyclerView recyclerView;
    ArrayList<Employee> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();


        list.add(new Employee("Santosh" , "26 year", R.drawable.first));
        list.add(new Employee("aushotosh" , "25 year", R.drawable.second));
        list.add(new Employee("Sanjay" , "24 year", R.drawable.third));

        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        LinearLayoutManager  lm = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(lm);

        MyRecycleAdapter adapter = new MyRecycleAdapter(MainActivity.this, list);

        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }




}
class Employee
{
    String empName;
    String age;
    int empImage;

    public Employee(String name, String age, int image)
    {
        this.empName = name;
        this.age = age;
        this.empImage = image;
    }

}