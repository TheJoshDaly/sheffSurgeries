package com.jdaly

class Appointment {
Date appDate;
float appTime;
int appDuration;
String roomNumber;

String toString(){
return appDate
}

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
    static belongsTo=[Patient]
static hasMany=[doctors:Doctor]
}
