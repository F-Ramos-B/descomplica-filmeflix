package br.com.fran.descomplica.filmeflix.repository;

import br.com.fran.descomplica.filmeflix.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
