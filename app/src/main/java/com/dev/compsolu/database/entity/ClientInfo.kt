package com.dev.compsolu.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ClientInfo")
data class ClientInfo(

    @PrimaryKey var ID : Int,
    @ColumnInfo(name = "ClientName") var clientName : String?,
    @ColumnInfo(name = "ClientAddress") var clientAddress : String?

)