package com.jdaly

class ReceptionistLoginTagLib {
    // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggleForReceptionist={
if(request.getSession(false) && session.user){
out << "<h1>Welcome ${session.user}.</h1>"

out << "<a href=${createLink(controller:'Receptionist',action:'logout')}>"
out << "Logout </a>"
} else {
out << "<a href=${createLink(controller:'Receptionist',action:'login')}>"
out << "Login as a Receptionist </a>"
}
}
}
