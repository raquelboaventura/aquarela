package com.aquarela.aquarela.dao;

import java.util.List;

import com.aquarela.aquarela.domain.Artista;

public interface ArtistaDao {
    public Artista postArtista();
    public List<Artista> getAllArtistas();
    public Artista getArtista(int id);
    public void updateArtista(Artista artista);
    public void deleteArtista(Artista artista);
}
