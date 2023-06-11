package com.deivis.financas.repository;

import com.deivis.financas.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryLancamento extends JpaRepository<Lancamento,Long> {
}
