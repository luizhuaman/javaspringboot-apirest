package com.informaticonfig.spring.app.springboot_app.controllers;

import com.informaticonfig.spring.app.springboot_app.models.Empleados;
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
    @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    //@GetMapping("/detalle_info2")

//    public String info(Model model) {
//        //definimos nuestras variables que le queremos pasar a la vista
//        model.addAttribute("Titulo", "Servidor en Linea");
//        model.addAttribute("Servidor", "Integratel");
//        model.addAttribute("Ip", "192.168.1.1");
//
//        return "detalle_info";
//    }

    //con este cambio retornara el json (Map)
    public Map<String, Object> detalles_info2() {
        Empleados empleado1 = new Empleados("Juan","Rodriguez","Calle1 Nro2","gerente",
                35,970178500,001);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("empleado", empleado1);
//        respuesta.put("Titulo", "Servidor en Linea");
//        respuesta.put("Servidor", "Integratel");
//        respuesta.put("Ip", "192.168.1.1");
        return respuesta;
    }
}
