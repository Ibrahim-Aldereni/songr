package com.example.songr.repositories;

import com.example.songr.modals.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Integer>{
}
