package com.jdaly

class Appointment {
Date appDate;
Date appTime;
int appDuration;
String roomNumber;
    static constraints = {

        appDate nullable: false
        appDate blank: false

        appTime nullable: false
        appTime blank: false

        appDuration nullable: false
        appDuration blank: false
        appDuration: 30..60

        roomNumber nullable: false
        roomNumber blank: false

    }
}
