package com.deivis.financas.model;

import com.deivis.financas.model.enums.StatusLancamento;
import com.deivis.financas.model.enums.TipoLancamento;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity
@Table(schema = "financas")
public class Lancamento {

    private Long id;
    private Integer mes;

    private Integer ano;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    //@Convert conveterndo a variavel para tipo data no banco de dados
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate data_cadastro;


    // anotacao pra dizer que é um enum
    @Enumerated(value = EnumType.STRING)
    private TipoLancamento tipo;

    @Enumerated(value = EnumType.STRING)
    private StatusLancamento status ;



}
