package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {


    @Autowired
    @Qualifier("officeHours") // Normally this line is not b=necessary cause there is just one bean
    ExtraSessions extraSessions;

    @Value("${instructor}")
    public String instructorName;

    @Override
    public int getTeachinhHours() {
        return 20 + extraSessions.getExtraSessions();
    }
}
