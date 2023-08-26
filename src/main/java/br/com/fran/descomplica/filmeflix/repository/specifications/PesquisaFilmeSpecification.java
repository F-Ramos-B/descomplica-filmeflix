package br.com.fran.descomplica.filmeflix.repository.specifications;

import br.com.fran.descomplica.filmeflix.dto.FiltroPesquisarFilmeDTO;
import br.com.fran.descomplica.filmeflix.model.Filme;
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

            predicates.add(cb.between(root.get("classificacaoIndicativa").as(Integer.class), pesquisaMin, pesquisaMax));
        }

        if (pesquisaFilmeDTO.getPlataforma() != null) {
            predicates.add(cb.equal(root.get("plataforma").get("id"), pesquisaFilmeDTO.getPlataforma()));
        }

        if (CollectionUtils.isNotEmpty(pesquisaFilmeDTO.getGeneros())) {
            CriteriaBuilder.In inGeneros = cb.in(root.join("generos"));

            pesquisaFilmeDTO.getGeneros().forEach(genero -> inGeneros.value(genero));

            predicates.add(inGeneros);
        }

        return cb.and(predicates.toArray(new Predicate[0]));
    }

    private String wrapLike(String value) {
        return "%" + StringUtils.trim(value) + "%";
    }

}
