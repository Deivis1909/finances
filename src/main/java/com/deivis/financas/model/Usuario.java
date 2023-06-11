package com.deivis.financas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode //AUXILIA NA COMPARACAO DE OBJETOS
@Entity
@ToString // AJUDA A VER AS PROPRIEDADES EM UM DEBUG
@Table(schema = "financas")
@Builder
public class Usuario {

    @Id //autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String senha;
}
