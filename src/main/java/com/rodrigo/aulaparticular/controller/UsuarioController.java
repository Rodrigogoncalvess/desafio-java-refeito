package com.rodrigo.aulaparticular.controller;


import com.rodrigo.aulaparticular.Util.RestTemplateService;
import com.rodrigo.aulaparticular.api.object.ReplyMessage;
import com.rodrigo.aulaparticular.api.object.ViaCepObject;
import com.rodrigo.aulaparticular.domain.User;

import com.rodrigo.aulaparticular.repository.AddressRepository;
import com.rodrigo.aulaparticular.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;




    @PostMapping
    private ResponseEntity<?> create (@Valid @RequestBody User user) {
        ViaCepObject viaCepObject = RestTemplateService.getCepViaRestTemplate(user.getAddress().getCep());
        if (viaCepObject == null || userRepository.existsByNameOrLogin(user.getName(), user.getLogin())) {

            return ResponseEntity.status(400).body(new ReplyMessage("Cep invalido ou Name/Login já cadastrado"));
        } else {
            user.getAddress().UpdateComViaCepObject(viaCepObject);

            return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(user));

        }
    }
    @GetMapping
    private List<User> buscarTodos() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    private ResponseEntity<User> bscarId(@PathVariable("id") Long id,@Valid @RequestBody User user) {
        if (!userRepository.existsById(id))
            return ResponseEntity.notFound().build();
        user.setId(id);
        return ResponseEntity.ok(userRepository.save(user));

    }


    @DeleteMapping("/{id}")
    private ResponseEntity<?>  excluir(@PathVariable("id") Long id) {
        if (!userRepository.existsById(id)){
            return ResponseEntity.notFound().build();}
        userRepository.deleteById(id);
        return ResponseEntity.noContent().build();


    }


}

