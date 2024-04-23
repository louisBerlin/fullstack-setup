package org.louis.backend;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class TodoService {


    private final TodoRepository todoRepo;

    public List<Todo> getAllTodos(){
        return todoRepo.findAll();
    }
}
