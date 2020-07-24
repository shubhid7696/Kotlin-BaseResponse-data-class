package com.safebag_user.models.dummy

open class BaseResponse {
    var status : Boolean = false
    var statusCode : Int? = 0
    var errorMessage : String? = ""
    // and other parameters for base response.
}