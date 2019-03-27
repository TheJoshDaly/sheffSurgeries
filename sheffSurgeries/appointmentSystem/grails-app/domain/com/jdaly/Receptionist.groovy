package com.jdaly

class Receptionist {
String recepName;
String recepEmail;
String recepUsername;
String recepPassword;
int recepPhone;
static belongsTo=[Surgery]

String toString(){
return recepName
}

    static constraints = {

        recepName nullable: false
        recepName blank: false

        recepEmail nullable: false
        recepEmail blank: false
        recepEmail valid: true

        recepUsername nullable: false
        recepUsername blank: false
        recepUsername unique: true

        recepPassword nullable: false
        recepPassword blank: false

        recepPhone nullable: false
        recepPhone blank: false
        recepPhone unique: true
    }
    
}
