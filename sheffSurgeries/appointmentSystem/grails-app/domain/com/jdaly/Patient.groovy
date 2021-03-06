package com.jdaly

class Patient {
String patientName;
String patientAddress;
String patientResidence;
Date patientDob;
String patientID;
Date dateRegistered;
String patientPhone;
static hasMany=[surgerys:Surgery,prescriptions:Prescription,doctors:Doctor]
static belongsTo=[Surgery,Prescription]
String toString(){
return patientName
}
    static constraints = {

        patientName nullable: false
        patientName blank: false

        patientAddress nullable: false
        patientAddress blank: false

        patientResidence nullable: false
        patientResidence blank: false

        patientDob nullable: false
        patientDob blank: false

        patientID nullable: false
        patientID blank: false
        patientID unique: true

        dateRegistered nullable: false
        dateRegistered blank: false

        patientPhone nullable: false
        patientPhone blank: false
        patientPhone unique: true
    }

}
