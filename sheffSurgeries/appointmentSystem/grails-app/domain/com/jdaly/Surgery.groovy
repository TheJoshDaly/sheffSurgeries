package com.jdaly

class Surgery {
String name;
String address;
String postcode;
int telephone;
int numberOfPatients;
String description;
Date openingTime;

    static constraints = {
        name nullable: false
        name blank: false

        address nullable: false
        address blank: false

        postcode nullable: false
        postcode blank: false

        telephone nullable: false
        telephone blank: false

        numberOfPatients nullable: false
        numberOfPatients blank: false
        numberOfPatients Size: 0..50

        description nullable: false
        description blank: false
        description widget: 'textarea'

        openingTime nullable: false
        openingTime blank: false
    }
}
