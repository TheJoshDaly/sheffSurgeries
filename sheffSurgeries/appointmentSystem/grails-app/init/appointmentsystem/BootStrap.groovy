package appointmentsystem

class BootStrap {

    def init = { servletContext ->
    	def cityhealth = new Surgery (
name: 'City Health Centre',
address: '21 Marble Street, Sheffield',
postcode: 'S10 1NG',
telephone: '0114555555',
numberOfPatients: '50',
description: 'Use placeholder text',
openingTime: new Time('09:00')
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

    	def tom = new Patient (
patientName: 'Tom Rivers',
patientAddress: '2 One Way Street, Eckington',
patientResidence: 'Sheffield, Barnsley, Doncaster',
patientDob: new Date('20/09/1988'),
patientID: 'E25555',
dateRegistered: new Date('26/02/2018'),
patientPhone: '01142224444'
    		).save()
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
    	def appntmnt = new Appointment (
appDate: new Date('11/04/2019'),
appTime: new Time('15:00'),
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
