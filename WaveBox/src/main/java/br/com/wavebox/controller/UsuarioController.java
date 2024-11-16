package br.com.wavebox.controller;

import br.com.wavebox.entity.UsuarioEntity;
import br.com.wavebox.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "usuarios"; // Retorna a view com a lista de usuários
    }

    @GetMapping("/{id}")
    public String detalharUsuario(@PathVariable Long id, Model model) {
        UsuarioEntity usuario = usuarioRepository.findById(id).orElse(null);
        model.addAttribute("usuario", usuario);
        return "usuarioDetalhes"; // Retorna a view com os detalhes do usuário
    }

    @GetMapping("/novo")
    public String novoUsuario(Model model) {
        model.addAttribute("usuario", new UsuarioEntity());
        return "usuarioFormulario"; // Retorna a view para criar um novo usuário
    }

    @PostMapping
    public String salvarUsuario(@ModelAttribute UsuarioEntity usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/usuarios"; // Redireciona para a lista de usuários
    }

    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable Long id, Model model) {
        UsuarioEntity usuario = usuarioRepository.findById(id).orElse(null);
        model.addAttribute("usuario", usuario);
        return "usuarioFormulario"; // Retorna a view para editar o usuário
    }

    @PostMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return "redirect:/usuarios"; // Redireciona para a lista de usuários
    }
}