package org.example.joeysparidaans.mijntop2000.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SongDatabaseDao {
    @Insert
    fun insert(song: Song)

    @Update
    fun update(song: Song)

    @Query("SELECT * FROM song_table WHERE songId = :key")
    fun get(key: Long): Song?

    @Query("DELETE FROM song_table")
    fun clear()

    @Query("SELECT * FROM song_table WHERE artist_id = :artistId")
    fun getSongsFromArtist(artistId: String): LiveData<List<Song>>

    @Query("SELECT * FROM song_table ORDER BY position")
    fun getAllSongsInOrder(): LiveData<List<Song>>

    @Query("SELECT * FROM song_table ORDER BY delta_position")
    fun getAllSongsOrderedByDelta(): LiveData<List<Song>>
}