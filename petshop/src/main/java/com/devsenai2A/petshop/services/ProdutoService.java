package com.devsenai2A.petshop.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsenai2A.petshop.entities.Produto;
import com.devsenai2A.petshop.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
        Produto produto = buscarPorId(id);

        produto.setNome(produtoAtualizado.getNome());
        produto.setDescricao(produtoAtualizado.getDescricao());
        produto.setPreco(produtoAtualizado.getPreco());
        produto.setPrecoDesconto(produtoAtualizado.getPrecoDesconto());
        produto.setImagem(produtoAtualizado.getImagem());
        produto.setQtdEstoque(produtoAtualizado.getQtdEstoque());
        produto.setAtivo(produtoAtualizado.getAtivo());
        produto.setCategoria(produtoAtualizado.getCategoria());

        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}