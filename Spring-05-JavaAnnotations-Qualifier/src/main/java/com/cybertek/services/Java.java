package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

//@Autowired
//@Qualifier("officeHours")

    private ExtraSessions extraSessions;

    @Autowired
    @Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions2;

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }



    @Override
    public void gethours() {

        System.out.println("Weekly teachin hours : 30 + " + (extraSessions.getExtraHours()));
        System.out.println("Weekly teachin hours : 30 + " + (extraSessions2.getExtraHours()));
    }
}
