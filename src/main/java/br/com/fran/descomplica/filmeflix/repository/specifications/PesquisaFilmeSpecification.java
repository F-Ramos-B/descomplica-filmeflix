package br.com.fran.descomplica.filmeflix.repository.specifications;

import br.com.fran.descomplica.filmeflix.dto.FiltroPesquisarFilmeDTO;
import br.com.fran.descomplica.filmeflix.model.Filme;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.jpa.domain.Specification;

@AllArgsConstructor
public class PesquisaFilmeSpecification implements Specification<Filme> {

    private FiltroPesquisarFilmeDTO pesquisaFilmeDTO;

    @Override
    public Predicate toPredicate(Root<Filme> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        query.distinct(true);

        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.isNotBlank(pesquisaFilmeDTO.getTitulo())) {
            predicates.add(cb.like(root.get("titulo"), wrapLike(pesquisaFilmeDTO.getTitulo())));
        }

        if (StringUtils.isNotBlank(pesquisaFilmeDTO.getDescricao())) {
            predicates.add(cb.like(root.get("descricao"), wrapLike(pesquisaFilmeDTO.getDescricao())));
        }

        if (ObjectUtils.anyNotNull(pesquisaFilmeDTO.getClassificacaoIndicativaMin(), pesquisaFilmeDTO.getClassificacaoIndicativaMax())) {
            Integer pesquisaMin = ObjectUtils.defaultIfNull(pesquisaFilmeDTO.getClassificacaoIndicativaMin(), 0);
            Integer pesquisaMax = ObjectUtils.defaultIfNull(pesquisaFilmeDTO.getClassificacaoIndicativaMax(), 100);

            predicates.add(cb.between(root.get("classificacaoIndicativa"), pesquisaMin, pesquisaMax));
        }
        
        if (ObjectUtils.anyNotNull(pesquisaFilmeDTO.getAnoPublicacaoMin(), pesquisaFilmeDTO.getAnoPublicacaoMax())) {
            Integer pesquisaMin = ObjectUtils.defaultIfNull(pesquisaFilmeDTO.getAnoPublicacaoMin(), 1900);
            Integer pesquisaMax = ObjectUtils.defaultIfNull(pesquisaFilmeDTO.getAnoPublicacaoMax(), LocalDate.now().getYear());

            predicates.add(cb.between(root.get("anoPublicacao"), pesquisaMin, pesquisaMax));
        }

        if (pesquisaFilmeDTO.getPlataforma() != null) {
            predicates.add(cb.equal(root.get("plataforma").get("id"), pesquisaFilmeDTO.getPlataforma()));
        }

        if (CollectionUtils.isNotEmpty(pesquisaFilmeDTO.getGeneros())) {
            predicates.add(root.join("generos").in(pesquisaFilmeDTO.getGeneros()));
        }

        return cb.and(predicates.toArray(Predicate[]::new));
    }

    private String wrapLike(String value) {
        return "%" + StringUtils.trim(value) + "%";
    }

}
