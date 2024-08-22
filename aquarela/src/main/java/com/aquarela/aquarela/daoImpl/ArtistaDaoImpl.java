package com.aquarela.aquarela.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aquarela.aquarela.dao.ArtistaDao;
import com.aquarela.aquarela.domain.Artista;


@Repository
public class ArtistaDaoImpl implements ArtistaDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Artista postArtista() {
        
        throw new UnsupportedOperationException("Unimplemented method 'postArtista'");
    }

    @Override
    public List<Artista> getAllArtistas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllArtistas'");
    }

    @Override
    public Artista getArtista(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArtista'");
    }

    @Override
    public void updateArtista(Artista artista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateArtista'");
    }

    @Override
    public void deleteArtista(Artista artista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteArtista'");
    }
    
}
