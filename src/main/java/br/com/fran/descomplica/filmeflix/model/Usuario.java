package br.com.fran.descomplica.filmeflix.model;

import br.com.fran.descomplica.filmeflix.enums.EnumPerfil;
import br.com.fran.descomplica.filmeflix.model.base.BaseEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Usuario extends BaseEntity implements UserDetails {
    
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
    
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
    
    @Column(name = "updatedAt")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Contato> contatos = new ArrayList<>();
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "id_perfil")
    private EnumPerfil perfil;
    
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(perfil.toString()));
    }
    
    @Override
    public String getPassword() {
        return senha;
    }
    
    @Override
    public String getUsername() {
        return apelido;
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
