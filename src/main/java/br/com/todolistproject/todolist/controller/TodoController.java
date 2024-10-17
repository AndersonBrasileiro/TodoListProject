package br.com.todolistproject.todolist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.todolistproject.todolist.entity.TodoEntity;
import br.com.todolistproject.todolist.service.TodoService;

@RestController
@RequestMapping("/todos")

public class TodoController {

    private TodoService todoService;
    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    List<TodoEntity> create (@RequestBody TodoEntity todoEntity){
        return todoService.create(todoEntity);
    }

    @GetMapping
    List<TodoEntity> list(){
        return todoService.list();
    }

    @PutMapping
    List<TodoEntity> update (@RequestBody TodoEntity todoEntity){
        return todoService.update(todoEntity);
    }

    @DeleteMapping("{id}")
    List<TodoEntity> delete (@PathVariable ("id")Long id){
        return todoService.delete(id);
    }

    
    
}
