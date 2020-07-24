package com.safebag_user.models.dummy

data class NotesResponse(
    var data : ArrayList<NotesData>
) : BaseResponse()

data class NotesData(
    var notesId : String,
    var notesString: String,
    var createdOn: Long?,
    var updated: Long?,
    var createdBy: String
)