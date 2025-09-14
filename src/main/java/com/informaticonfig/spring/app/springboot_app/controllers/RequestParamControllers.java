package com.informaticonfig.spring.app.springboot_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parametros")
public class RequestParamControllers {

    //Recibe un parametro desde la pagina web que lo retorna
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "Hola") String informacion) {
        ParametroDTO parametro1 = new ParametroDTO();
        if (informacion != null) { parametro1.setInformacion(informacion); }
        return parametro1;

    }
}
