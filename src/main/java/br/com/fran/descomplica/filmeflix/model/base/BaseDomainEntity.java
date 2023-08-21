package br.com.fran.descomplica.filmeflix.model.base;

import javax.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDomainEntity extends BaseEntity<Long> {

    private String nome;

    public BaseDomainEntity(Long id) {
        super(id);
    }

}
