package com.example.crud_spring.service;

import com.example.crud_spring.model.User;
import com.example.crud_spring.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository; // instancia dos codigos CRUD prontos

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    //metodo para criar usuarios
    public User criarUsuario(User user){
        return userRepository.save(user);
    }

    // metodo para ler usuarios
    public Iterable<User> listarTodos(){
        return userRepository.findAll();
    }


    //metodo para deletar usuario
    public void deletarUsuario(Integer id){
        if(userRepository.existsById(id)){ // verificando se usuario existe
            userRepository.deleteById(id); // deletando
        } else {
            throw new RuntimeException("Usuario nao encontrado.");
        }
    }

    //metodo para atualizar usuario
    public User atualizarUsuario(Integer id, User user){
        if(userRepository.existsById(id)){
            user.setId(id);
            return userRepository.save(user);
        }else{
            throw new RuntimeException("Usuario nao encontrado");
        }
    }
}

