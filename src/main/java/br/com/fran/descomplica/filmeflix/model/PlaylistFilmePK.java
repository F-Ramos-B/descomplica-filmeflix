package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseSerializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PlaylistFilmePK extends BaseSerializable {

    @JoinColumn(name = "id_filme", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Filme filme;

    @JoinColumn(name = "id_playlist", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Playlist playlist;

}
