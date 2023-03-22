package com.algaworks.algalog.api.controller;


import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1l);
        cliente1.setNome("João");
        cliente1.setTelefone("81 98736-2671");
        cliente1.setEmail("jubileu@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2l);
        cliente2.setNome("Julia");
        cliente2.setTelefone("81 9803-2917");
        cliente2.setEmail("julinha@gmail.com");

        return Arrays.asList(cliente1,cliente2);
    }
}
