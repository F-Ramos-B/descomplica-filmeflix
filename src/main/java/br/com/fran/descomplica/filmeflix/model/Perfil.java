package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "perfis")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Perfil extends BaseEntity implements GrantedAuthority {

    @Size(max = 20)
    private String descricao;

    @OneToMany(mappedBy = "perfil", fetch = FetchType.LAZY)
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public String getAuthority() {
        return descricao;
    }

    public Perfil(Long id) {
        super(id);
    }

}
