package com.jdaly

class BootStrap {

    def init = { servletContext ->
    	def cityhealth = new Surgery (
name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S10 1NG',
telephone: '0114555555',
numberOfPatients: '50',
description: 'Use placeholder text',
openingTime: '09.00'
    		).save()

    	def sarah = new Doctor (
fullName: 'Dr. Sarah Macdonald',
qualification: 'MBChB(Sheffield)',
position: 'GP, Surgeon',
doctorEmail: 's.macdonald@myemail.com',
password: 'secret222',
doctorOffice: 'D-9888',
doctorPhone: '01111777',
bio: 'Use placeholder text'
    		).save()
def McDevvo = new Patient (
patientName: 'MC Devvo',
patientAddress: '1101 Hallam Hills',
patientResidence: 'Sheffield',
patientDob: new Date('09/07/2019'),
patientId: '46843545',
dateRegistered: new Date ('20/06/2015'),
patientPhone: '07791239239').save()
    	def rob = new Receptionist (
recepName: 'Rob Kingston',
recepEmail: 'r.kingston@email.com',
recepUsername: 'rking',
recepPassword: 'secret2019',
recepPhone: '01142224445'
    		).save()
    	def susan = new Nurse (
nurseName: 'Susan Peters',
qualifications: 'Registered General Nurse',
nurseEmail: 's.peters@myemail.com',
nurseOffice: 'B-455',
nursePhone: '01142224433'    		
    		).save()
    	def appntmnts = new Appointment(
appDate: new Date('11/04/2019'),
appTime: '15.00',
appDuration: '30..45..60',
roomNumber: 'A-1111'    		
    		).save()
    	def meds = new Prescription (
pharmacyName: 'City Centre Pharmacy',
prescripNumber: '56788',
medicine: 'Paracetamol',
totalCost: '£5.90',
dateIssued: new Date('25/05/2019'),
patientPaying: 'yes'    		
    		).save() 
    }
    def destroy = {
    }
}
