package br.com.wavebox.repository;

import br.com.wavebox.entity.AssinaturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssinaturaRepository extends JpaRepository<AssinaturaEntity, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}