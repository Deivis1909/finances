package com.deivis.financas.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private String nome;
    private String senha;
    private String email;
}
