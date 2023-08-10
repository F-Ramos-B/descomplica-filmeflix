package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "usuarios")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Usuario extends BaseEntity {

    @Size(max = 100)
    private String nome;

    @Size(max = 30)
    private String apelido;

    @Size(max = 100)
    private String senha;

    @Size(max = 50)
    private String email;

    @Size(max = 50)
    private String genero;

    @Size(max = 250)
    @Column(name = "link_avatar")
    private String linkAvatar;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "idUsuario")
    private List<Contato> contatoList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<PerfilUsuario> perfilUsuarioList = new ArrayList<>();

    @OneToMany(mappedBy = "idCliente")
    private List<Avaliacao> avaliacaoList = new ArrayList<>();

}
