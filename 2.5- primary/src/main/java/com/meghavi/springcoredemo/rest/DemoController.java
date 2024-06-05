package com.meghavi.springcoredemo.rest;

import com.meghavi.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach; //Field Injection

//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

//      You could use any method instead of setCoach and it would still work
//    @Autowired
//    public void doSomeStuff(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}

