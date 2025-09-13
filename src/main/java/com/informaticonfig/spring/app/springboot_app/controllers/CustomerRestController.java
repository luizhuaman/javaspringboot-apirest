package com.informaticonfig.spring.app.springboot_app.controllers;

import com.informaticonfig.spring.app.springboot_app.models.Empleados;
import com.informaticonfig.spring.app.springboot_app.models.dto.ClaseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

//con esta anotacion convertimos en un API REST - interfaces que permite la comunicacion de sistemas a traves de http
@RestController
@RequestMapping("/api") //con esto se convierte en un api-rest -
//requestMapping sirve como una ruta primer nivel porque esta encima del controlador
public class CustomerRestController {
    //@RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    @GetMapping(path = "/detalles_info2")

    //DTO, sirve como contenedor de datos.
    public ClaseDTO detalles_info() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informatic");

        return usuario1;
    }
}
