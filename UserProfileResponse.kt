package com.safebag_user.models.dummy


data class UserProfileResponse(
    var data: UserProfileData
) : BaseResponse()


data class UserProfileData(
    var firstName : String,
    var lastName : String,
    var userId : String,
    var phoneNumber : String,
    var emailAddr : String,
    var homeAddr : String,
    var gender : String
)