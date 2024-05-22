package br.tp2.gabcouto.produtostp2.produto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;

}
