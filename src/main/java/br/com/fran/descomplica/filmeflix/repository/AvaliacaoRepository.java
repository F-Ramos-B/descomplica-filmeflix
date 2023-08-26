package br.com.fran.descomplica.filmeflix.repository;

import br.com.fran.descomplica.filmeflix.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {

}
