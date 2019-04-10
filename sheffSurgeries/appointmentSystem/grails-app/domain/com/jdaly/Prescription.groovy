package com.jdaly

class Prescription {
String pharmacyName;
int prescripNumber;
String medicine;
double totalCost;
Date dateIssued;
Boolean patientPaying;

static hasMany=[doctors:Doctor]
static belongsTo=[Doctor]

String toString(){
return pharmacyName
}

    static constraints = {

        pharmacyName nullable: false
        pharmacyName blank: false
        pharmacyName unique: true

        prescripNumber nullable: false
        prescripNumber blank: false
        prescripNumber unique: true

        medicine nullable: false
        medicine blank: false

        totalCost nullable: false
        totalCost blank: false

        dateIssued nullable: false
        dateIssued blank: false

        patientPaying nullable: false
        patientPaying blank: false
    }



}
