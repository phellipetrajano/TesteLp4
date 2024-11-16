package br.com.wavebox.controller;

import br.com.wavebox.entity.AssinaturaEntity;
import br.com.wavebox.repository.AssinaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assinatura")
public class AssinaturaController {

    @Autowired
    private AssinaturaRepository assinaturaRepository;

    @GetMapping
    public String listarAssinaturas(Model model) {
        model.addAttribute("assinatura", assinaturaRepository.findAll());
        return "assinatura"; // Retorna a view com a lista de assinaturas
    }

    @GetMapping("/{id}")
    public String detalharAssinatura(@PathVariable Long id, Model model) {
        AssinaturaEntity assinatura = assinaturaRepository.findById(id).orElse(null);
        model.addAttribute("assinatura", assinatura);
        return "assinaturaDetalhes"; // Retorna a view com os detalhes da assinatura
    }

    @GetMapping("/novo")
    public String novaAssinatura(Model model) {
        model.addAttribute("assinatura", new AssinaturaEntity());
        return "assinaturaFormulario"; // Retorna a view para criar uma nova assinatura
    }

    @PostMapping
    public String salvarAssinatura(@ModelAttribute AssinaturaEntity assinatura) {
        assinaturaRepository.save(assinatura);
        return "redirect:/assinatura"; // Redireciona para a lista de assinaturas
    }

    @GetMapping("/editar/{id}")
    public String editarAssinatura(@PathVariable Long id, Model model) {
        AssinaturaEntity assinatura = assinaturaRepository.findById(id).orElse(null);
        model.addAttribute("assinatura", assinatura);
        return "assinaturaFormulario"; // Retorna a view para editar a assinatura
    }

    @PostMapping("/deletar/{id}")
    public String deletarAssinatura(@PathVariable Long id) {
        assinaturaRepository.deleteById(id);
        return "redirect:/assinaturas"; // Redireciona para a lista de assinaturas
    }
}