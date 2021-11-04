package com.example.sping_portfolio.data.SQL;

import com.example.sping_portfolio.data.Song;
import org.springframework.data.jpa.repository.JpaRepository;

/*
Extends the JpaRepository interface from Spring Data JPA.
-- Java Persistent API (JPA) - Hibernate: map, store, update and retrieve data
-- JpaRepository defines standard CRUD methods
-- Via JPA the developer can retrieve data from relational databases to Java objects and vice versa.
 */
public interface SongJpaRepository extends JpaRepository<Song, Long> {

}
