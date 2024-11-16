package br.com.wavebox.repository;

import br.com.wavebox.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}