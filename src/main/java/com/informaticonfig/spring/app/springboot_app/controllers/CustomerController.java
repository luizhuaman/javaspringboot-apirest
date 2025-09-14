package com.informaticonfig.spring.app.springboot_app.controllers;

import com.informaticonfig.spring.app.springboot_app.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class CustomerController {

    @GetMapping("/detalle_info")

//    public String info(Model model) {
//        //definimos nuestras variables que le queremos pasar a la vista
//        model.addAttribute("Titulo", "Servidor en Linea");
//        model.addAttribute("Servidor", "Integratel");
//        model.addAttribute("Ip", "192.168.1.1");
//
//        return "detalle_info";
//    }

    //use interface Model for show "empleado1" object in html
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan","Rodriguez", null,"gerente",
                35,970178500,002);
        model.addAttribute("Empleado", empleado1);

        return "detalle_info";
    }
}
