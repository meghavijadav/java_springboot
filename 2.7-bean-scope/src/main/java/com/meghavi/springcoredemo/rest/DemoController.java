package com.meghavi.springcoredemo.rest;

import com.meghavi.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for dependency
    private Coach myCoach; //Field Injection
    private Coach anotherCoach;

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
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach){
        //We are using the same bean for all dependency injection
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
        //singleton: true
        //prototype: false
    }
}

