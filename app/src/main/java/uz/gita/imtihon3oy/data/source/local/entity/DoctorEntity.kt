package uz.gita.imtihon3oy.data.source.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "doctors")
data class DoctorEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Long = 0,
    val name: String,
    val degree: String,
    val rate: String,
    val picture: String,
    var isFavourite: Int = 0,
)
