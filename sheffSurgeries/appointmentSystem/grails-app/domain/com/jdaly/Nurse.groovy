package com.jdaly

class Nurse {
String nurseName;
String qualifications;
String nurseEmail;
String nurseOffice;
String nursePhone;
static hasMany=[doctors:Doctor]
static belongsTo=[Surgery,Doctor]

String toString() {
return nurseName
}
    static constraints = {

        nurseName nullable: false
        nurseName blank: false

        qualifications nullable: false
        qualifications blank: false

        nurseEmail nullable: false
        nurseEmail blank: false
        nurseEmail valid: true

        nurseOffice nullable: false
        nurseOffice blank: false

        nursePhone nullable: false
        nursePhone blank: false
        nursePhone unique: true
    }
    
}
