package com.nilcelsoestudo.projetoopenfeign2;

@FeignClient(name="Agenda", url="http://localhost:8080/contato")
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value="/")
    Contato retornaContato();

}
