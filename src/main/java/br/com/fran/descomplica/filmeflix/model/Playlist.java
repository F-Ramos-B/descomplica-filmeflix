package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "playlists")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Playlist extends BaseEntity<Long> {

    @Size(max = 50)
    private String nome;
    
    @Size(max = 2048)
    private String descricao;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playlistFilmePK.playlist", fetch = FetchType.LAZY)
    private List<PlaylistFilme> filmes = new ArrayList<>();

    @OneToMany(mappedBy = "playlist", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Usuario usuario;

}
