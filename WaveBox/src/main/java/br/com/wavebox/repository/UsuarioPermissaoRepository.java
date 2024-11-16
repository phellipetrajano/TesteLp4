package br.com.wavebox.repository;

import br.com.wavebox.entity.UsuarioPermissaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioPermissaoRepository extends JpaRepository<UsuarioPermissaoEntity, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}