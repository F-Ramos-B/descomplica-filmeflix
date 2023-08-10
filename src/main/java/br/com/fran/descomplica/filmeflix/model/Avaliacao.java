package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDateTime;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
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
public class Avaliacao extends BaseEntity {

    private Integer nota;

    @Size(max = 1000)
    private String critica;

    @Basic(optional = false)
    @NotNull
    @Column(name = "data_hora_avaliacao")
    private LocalDateTime dataHoraAvaliacao;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @JoinColumn(name = "id_filme", referencedColumnName = "id")
    @ManyToOne
    private Filme filme;

    @JoinColumn(name = "id_playlist", referencedColumnName = "id")
    @ManyToOne
    private Playlist playlist;

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuario;

}
