package com.jdaly

class AppointmentSystemTagLib {
   // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle={
if(request.getSession(false) && session.user){
out << "<h1>Welcome ${session.user}.</h1>"

out << "<a href=${createLink(controller:'Doctor',action:'logout')}>"
out << "Logout </a>"
} else {
out << "<a href=${createLink(controller:'Doctor',action:'login')}>"
out << "Login </a>"
}

}
}

