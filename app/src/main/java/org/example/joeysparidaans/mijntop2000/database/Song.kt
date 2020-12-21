package org.example.joeysparidaans.mijntop2000.database

import androidx.room.Entity

@Entity
data class Song(
    var songId: Long = 0L,
    var title: String,
    var artist: String,
    var artistId: String,
    var year: Int,
    var position: Int,
    var previousPosition: Int,
    var image: String
)