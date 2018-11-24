package com.dev.compsolu.database.dao

import androidx.room.*
import com.dev.compsolu.database.entity.ClientInfo

@Dao
interface ClientInfoDao{

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertClientInfo(clientinfo : ClientInfo)
    @Update
    fun updateClientInfo(clientinfo: ClientInfo)
    @Delete
    fun deleteClientInfo(clientinfo: ClientInfo)
    @Query("Select * from ClientInfo")
    fun retrieveAllClientInfo() : List<ClientInfo>

}