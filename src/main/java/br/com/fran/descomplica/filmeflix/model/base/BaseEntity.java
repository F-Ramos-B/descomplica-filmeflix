package br.com.fran.descomplica.filmeflix.model.base;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public abstract class BaseEntity extends BaseSerializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

}
