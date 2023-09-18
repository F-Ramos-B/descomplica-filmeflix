package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "filmes")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Filme extends BaseEntity<Long> {

    @Size(max = 50)
    private String titulo;

    @Size(max = 2048)
    private String descricao;
    
    @Column(name = "ano_publicacao")
    private int anoPublicacao;

    @Column(name = "numero_visualizacoes")
    private int numeroVisualizacoes;

    @Size(max = 255)
    @Column(name = "link_imagem")
    private String linkImagem;

    @Size(max = 255)
    @Column(name = "link_filme")
    private String linkFilme;

    @Column(name = "classificacao_indicativa")
    private int classificacaoIndicativa;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @JoinTable(name = "generos_filmes", joinColumns = {
        @JoinColumn(name = "id_filme", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "id_genero", referencedColumnName = "id")})
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Genero> generos = new ArrayList<>();

    @JoinTable(name = "filmes_atores", joinColumns = {
        @JoinColumn(name = "id_filme", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "id_ator", referencedColumnName = "id")})
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private List<Ator> atores = new ArrayList<>();

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "playlistFilmePK.filme", fetch = FetchType.LAZY)
    private List<PlaylistFilme> playlists = new ArrayList<>();

    @OneToMany(mappedBy = "filme", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    @JoinColumn(name = "id_plataforma", referencedColumnName = "id")
    @ManyToOne(cascade = CascadeType.MERGE)
    private Plataforma plataforma;

    public int incrementarVisualizacoes() {
        return ++numeroVisualizacoes;
    }

    public Filme(Long id) {
        super(id);
    }

}
