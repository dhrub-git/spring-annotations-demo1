package com.hcl.academy;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Tennis Coach";
    }
}
