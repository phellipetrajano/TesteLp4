package br.com.wavebox.repository;

import br.com.wavebox.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}