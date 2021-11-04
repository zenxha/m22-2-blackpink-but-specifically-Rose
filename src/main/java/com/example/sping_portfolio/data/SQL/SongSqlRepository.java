package com.example.sping_portfolio.data.SQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.sping_portfolio.data.Song;
import java.util.List;

/*
This class has an instance of Java Persistence API (JPA)
-- @Autowired annotation. Allows Spring to resolve and inject collaborating beans into our bean.
-- Spring Data JPA will generate a proxy instance
-- Below are some CRUD methods that we can use with our database
*/
@Service
@Transactional
public class SongSqlRepository {

    @Autowired
    private SongJpaRepository jpa;

    public  List<Song>listAll() {
        return jpa.findAll();
    }

    public void save(Song song) {
        jpa.save(song);
    }

    public Song get(long id) {
        return jpa.findById(id).get();
    }

    public void delete(long id) {
        jpa.deleteById(id);
    }
    public void deleteAll() {jpa.deleteAll();}
}
