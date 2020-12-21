package org.example.joeysparidaans.mijntop2000.database

fun List<Song>.asDomainModel(): List<Song> {
    return map {
        Song(
            songId = it.songId,
            title = it.title,
            artist = it.artist,
            artistId = it.artistId,
            year = it.year,
            position = it.position,
            previousPosition = it.previousPosition,
            image = it.image,
            deltaPosition = it.deltaPosition
        )
    }
}