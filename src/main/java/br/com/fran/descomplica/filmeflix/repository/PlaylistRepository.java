package br.com.fran.descomplica.filmeflix.repository;

import br.com.fran.descomplica.filmeflix.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

}
