package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "atores")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Ator extends BaseEntity {

    @Size(max = 50)
    private String nome;

    @Size(max = 500)
    private String sobrenome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Size(max = 500)
    private String biografia;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @ManyToMany(mappedBy = "atores")
    private List<Filme> filmes = new ArrayList<>();

}
