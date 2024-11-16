package br.com.wavebox.repository;

import br.com.wavebox.entity.PermissaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}