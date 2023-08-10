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

/**
 *
 * @author User
 */
@Entity
@Table(name = "enderecos")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Endereco extends BaseEntity {

    @Size(max = 8)
    private String cep;

    @Size(max = 50)
    private String logradouro;

    @Size(max = 50)
    private String complemento;

    @Size(max = 50)
    private String bairro;

    @Size(max = 50)
    private String cidade;

    @Basic(optional = false)
    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Basic(optional = false)
    @NotNull
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    @JoinColumn(name = "id_uf", referencedColumnName = "id")
    @ManyToOne
    private Estado estado;

}
