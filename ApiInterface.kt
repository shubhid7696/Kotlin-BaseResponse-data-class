package com.safebag_user.models.dummy

import com.safebag_user.models.response.StoreListing
import com.safebag_user.models.response.UserLoginResponse
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {

    // -----  get notes list
    @FormUrlEncoded
    @POST("notesList")
    fun getNotesList(
        @Header("accessToken") accessToken: String,
        @Field("userId") userId: String
    ): Observable<NotesResponse>

    // -----  get user response
    @POST("userProfile")
    @FormUrlEncoded
    fun getUserProfile(
        @Header("accessToken") accessToken: String,
        @Field("userId") userId: String
    ): Observable<UserProfileResponse>

}