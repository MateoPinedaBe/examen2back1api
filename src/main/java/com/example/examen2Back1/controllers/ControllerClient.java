package com.example.examen2Back1.controllers;

import com.example.examen2Back1.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examenapi/v1/clients")
public class ControllerClient {


//@Autowired


    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client data){
        Client responseApi =this.servicio
    }
}
