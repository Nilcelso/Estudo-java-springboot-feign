package com.nilcelsoestudo.projetoopenfeign1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato(){
        return Contato.builder()
                .id(1L)
                .nome("Nilcelso")
                .telefone("0000-0000")
                .build();
    }

}
