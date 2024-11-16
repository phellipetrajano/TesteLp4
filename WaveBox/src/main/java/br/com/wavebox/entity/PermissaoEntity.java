package br.com.wavebox.entity;

import jakarta.persistence.*;

@Entity
public class PermissaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Ex: "ROLE_ADMIN", "ROLE_USER"

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}