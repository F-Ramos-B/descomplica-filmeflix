package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "avaliacoes")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Avaliacao extends BaseEntity<Long> {

    private int nota;

    @Size(max = 2048)
    private String critica;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @JoinColumn(name = "id_filme", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Filme filme;

    @JoinColumn(name = "id_playlist", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Playlist playlist;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuario;

}
