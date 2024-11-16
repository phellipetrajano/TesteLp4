package br.com.wavebox.entity;

import jakarta.persistence.*;

@Entity
public class AssinaturaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo; // Ex: "1 mês", "3 meses", "6 meses", "9 meses", "1 ano"
    private double preco;

    // Getters e Setters
    // (mesmos métodos que já definimos anteriormente)
}