package org.example.joeysparidaans.mijntop2000.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "song_table")
data class Song(
    @PrimaryKey(autoGenerate = true)
    var songId: Long = 0L,

    @ColumnInfo(name = "song_title")
    var title: String,

    @ColumnInfo(name = "artist_name")
    var artist: String,

    @ColumnInfo(name = "artist_id")
    var artistId: String,

    @ColumnInfo(name = "year")
    var year: Int,

    @ColumnInfo(name = "position")
    var position: Int,

    @ColumnInfo(name = "previous_position")
    var previousPosition: Int,

    @ColumnInfo(name = "delta_position")
    var deltaPosition: Int = previousPosition - position,

    @ColumnInfo(name = "image_url")
    var image: String
)