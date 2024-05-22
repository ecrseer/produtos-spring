package br.tp2.gabcouto.produtostp2.produto;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(Produto prod) {
        prod.setId(produtos.size() + 1);
        this.produtos.add(prod);
    }

    public List<Produto> mostrarTodos() {
        return this.produtos;
    }

    public int atualizar(Produto atualizacoes) {
        for (Produto usuario : this.produtos) {
            if (usuario.getId() == atualizacoes.getId()) {
                usuario.setNome(atualizacoes.getNome());
                return usuario.getId();
            }
        }
        return -1;
    }

    public int removerPorId(int id) {
        for (Produto usuario : this.produtos) {
            if (usuario.getId() == id) {
                produtos.remove(usuario);
                return usuario.getId();
            }
        }
        return -1;
    }
}

