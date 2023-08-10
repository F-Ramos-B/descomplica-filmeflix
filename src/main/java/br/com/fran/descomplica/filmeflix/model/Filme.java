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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "filmes")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Filme extends BaseEntity {

    @Size(max = 50)
    private String titulo;

    @Size(max = 500)
    private String descricao;

    @Column(name = "numero_visualizaoes")
    private Integer numeroVisualizaoes;

    @Size(max = 255)
    @Column(name = "link_imagem")
    private String linkImagem;

    @Size(max = 255)
    @Column(name = "link_filme")
    private String linkFilme;

    @Column(name = "classificacao_indicativa")
    private Integer classificacaoIndicativa;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @JoinTable(name = "generos_filmes", joinColumns = {
        @JoinColumn(name = "id_filme", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "id_genero", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Genero> generos = new ArrayList<>();

    @JoinTable(name = "filmes_atores", joinColumns = {
        @JoinColumn(name = "id_filme", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "id_ator", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ator> atores = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "playlistFilmePK.filme", fetch = FetchType.LAZY)
    private List<PlaylistFilme> playlists = new ArrayList<>();

    @OneToMany(mappedBy = "filme", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    @JoinColumn(name = "id_plataforma", referencedColumnName = "id")
    @ManyToOne
    private Plataforma plataforma;

}
