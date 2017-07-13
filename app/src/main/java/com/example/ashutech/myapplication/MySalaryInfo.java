package com.example.ashutech.myapplication;

import java.util.Comparator;

/**
 * Created by Ashu.Yadav on 7/13/2017.
 */

class MySalaryInfo implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
