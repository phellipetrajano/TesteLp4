package br.com.wavebox.entity;

import jakarta.persistence.*;

@Entity
public class UsuarioPermissaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    @ManyToOne
    @JoinColumn(name = "permissao_id")
    private PermissaoEntity permissao;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public PermissaoEntity getPermissao() {
        return permissao;
    }
        public void setPermissao(PermissaoEntity permissao) {
            this.permissao = permissao;
        }
    }