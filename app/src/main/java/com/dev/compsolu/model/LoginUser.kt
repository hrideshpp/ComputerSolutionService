package com.dev.compsolu.model

class LoginUser {
    lateinit  var username: String
    lateinit  var password: String
    var userAthenticate : Boolean = false

    fun userAuthentication(username : String, password : String){

        userAthenticate = true;
    }
}
