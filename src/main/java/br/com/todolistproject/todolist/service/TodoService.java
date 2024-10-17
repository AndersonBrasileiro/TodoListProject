package br.com.todolistproject.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.todolistproject.todolist.entity.TodoEntity;
import br.com.todolistproject.todolist.repository.TodoRepository;


@Service
public class TodoService {
    
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<TodoEntity> create (TodoEntity todoEntity){
        todoRepository.save(todoEntity);
        return list();
    }
            
    public List<TodoEntity> list (){
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());
        List<TodoEntity> pesquisado = todoRepository.findAll(sort);
        return pesquisado;

    }

    public List<TodoEntity> update(TodoEntity todoEntity){
        todoRepository.save(todoEntity);
        return list();
    }

    public List<TodoEntity> delete (Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
