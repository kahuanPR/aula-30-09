package com.sesi.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sesi.tarefas.model.TarefaCategoria;

@Repository
public interface TarefaCategoriaRepository extends JpaRepository<TarefaCategoria, Integer> {

}
