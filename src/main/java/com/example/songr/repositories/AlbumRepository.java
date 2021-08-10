package com.example.songr.repositories;

import com.example.songr.modals.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
}
