package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseSerializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "playlists_filmes")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PlaylistFilme extends BaseSerializable {

    @EmbeddedId
    protected PlaylistFilmePK playlistFilmePK;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public PlaylistFilme(Filme filme, Playlist playlist) {
        this.playlistFilmePK = new PlaylistFilmePK(filme, playlist);
    }

}
