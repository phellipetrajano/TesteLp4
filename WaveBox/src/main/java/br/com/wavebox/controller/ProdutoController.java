
package br.com.wavebox.controller;

import br.com.wavebox.entity.ProdutoEntity;
import br.com.wavebox.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProduto(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return "produto"; // Retorna a view com a lista de produtos
    }

    @GetMapping("/{id}")
    public String detalharProduto(@PathVariable Long id, Model model) {
        ProdutoEntity produto = produtoRepository.findById(id).orElse(null);
        model.addAttribute("produto", produto);
        return "produtoDetalhes"; // Retorna a view com os detalhes do produto
    }

    @GetMapping("/novo")
    public String novoProduto(Model model) {
        model.addAttribute("produto", new ProdutoEntity());
        return "produtoFormulario"; // Retorna a view para criar um novo produto
    }

    @PostMapping
    public String salvarProduto(@ModelAttribute ProdutoEntity produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos"; // Redireciona para a lista de produtos
    }

    @GetMapping("/editar/{id}")
    public String editarProduto(@PathVariable Long id, Model model) {
        ProdutoEntity produto = produtoRepository.findById(id).orElse(null);
        model.addAttribute("produto", produto);
        return "produtoFormulario"; // Retorna a view para editar o produto
    }

    @PostMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/produtos"; // Redireciona para a lista de produtos
    }
}