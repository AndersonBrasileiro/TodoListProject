package br.com.todolistproject.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.todolistproject.todolist.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    
}
