package com.laura.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laura.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	//SELECT * FROM songs
	List<Song> findAll();
	List<Song> findTop10ByOrderByRatingDesc();
	List<Song> findByArtistContaining(String artist);

}
