package com.example.crud_spring.controller;

import com.example.crud_spring.model.User;
import com.example.crud_spring.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")  // Mapeia a URL para /usuarios
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) { // construtor do userService(crud)
        this.userService = userService;
    }

    // Endpoint para listar todos os usuários
    @GetMapping
    public Iterable<User> listarTodos() {
        return userService.listarTodos();  // Chama o método listarTodos() do UserService
    }

    @PostMapping
    public User criarUsuario(@RequestBody User user){
        return userService.criarUsuario(user);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Integer id){
        userService.deletarUsuario(id);
    }

    @PutMapping("/{id}")
    public User atualizarUsuario(@PathVariable Integer id, @RequestBody User user){
        return userService.atualizarUsuario(id, user);
    }
}
