package org.louis.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoController {


    private TodoService todoService;

    @GetMapping
    List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }


}
