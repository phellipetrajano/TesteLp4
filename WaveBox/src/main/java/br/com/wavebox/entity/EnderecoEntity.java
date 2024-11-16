package br.com.wavebox.entity;

import jakarta.persistence.*;

@Entity
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    // Getters e Setters
    // (mesmos métodos que já definimos anteriormente)
}