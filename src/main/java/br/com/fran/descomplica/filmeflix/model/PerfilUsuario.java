package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseSerializable;
import java.time.LocalDateTime;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "perfis_usuarios")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class PerfilUsuario extends BaseSerializable {

    @EmbeddedId
    protected PerfilUsuarioPK perfilUsuarioPK;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
