package com.dev.compsolu.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dev.compsolu.database.entity.ClientInfo

@Database(entities = arrayOf(ClientInfo :: class), version = 1)
abstract class ComputerSolutionDB : RoomDatabase() {

    public abstract fun clientInfo() : ClientInfo
}