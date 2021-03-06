package com.jdaly

class Doctor {
String fullName;
String qualification;
String position;
String doctorEmail;
String password;
String doctorOffice;
int doctorPhone;
String bio;
static hasMany=[prescriptions:Prescription,nurses:Nurse,patients:Patient]
static belongsTo=[Patient,Surgery,Prescription,Nurse]

String toString() {
return fullName
}

    static constraints = {

        fullName nullable: false
        fullName blank: false

        qualification nullable: false
        qualification blank: false

        position nullable: false
        position blank: false
        
        doctorEmail nullable: false
        doctorEmail blank: false
        doctorEmail valid: true

        password nullable: false
        password blank: false

        doctorOffice nullable: false
        doctorOffice blank: false

        doctorPhone nullable: false
        doctorPhone blank: false

        bio nullable: false
        bio blank: false
        bio widget: 'textarea'
    }
    

}
