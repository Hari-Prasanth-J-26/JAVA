function validate(){
    var username = document.getElementById("firstName");
    var password = document.getElementById("password");
    var email = document.getElementById("email");
    if(username.matches("[a-zA-Z]{4,15}") && email.matches("[a-z0-9._%+-]+@[a-z0-9.9.-]+\.[a-z]{2,}$") && password.matches("[a-zA-Z0-9@]{8,15}")){
        alert("Registration done successfully...");
        return false;
    }
    else{
        alert("Registration unsuccessfull... Kindly retry");
    }
}