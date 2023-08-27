package br.com.fran.descomplica.filmeflix.repository;

import br.com.fran.descomplica.filmeflix.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {

}
