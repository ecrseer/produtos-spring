package br.tp2.gabcouto.produtostp2.produto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {


    final ProdutoService produtoService;

    public ProdutoController(ProdutoService service) {
        this.produtoService = service;
    }


    @PutMapping("/atualizar")
    public int atualizaProduto(@RequestBody Produto produto) {
        System.out.println("PUT");
        return this.produtoService.atualizar(produto);
    }

    @PostMapping("/criar")
    public int cadastraProduto(@RequestBody Produto produto) {
        produtoService.cadastrar(produto);
        return produto.getId();
    }


    @DeleteMapping
    public int removeProduto(@RequestBody Produto produto) {
        return this.produtoService.removerPorId(produto.getId());
    }

    @GetMapping
    public List<Produto> listaProdutos() {
        return this.produtoService.mostrarTodos();
    }

}
