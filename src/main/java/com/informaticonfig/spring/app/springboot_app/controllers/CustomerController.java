package com.informaticonfig.spring.app.springboot_app.controllers;

import com.informaticonfig.spring.app.springboot_app.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        Empleados empleado1 = new Empleados("Juan","Rodriguez", null,"Gerente",
                45,970178500,002);
        model.addAttribute("Titulo", "xxx");
        model.addAttribute("Empleado", empleado1);

        return "detalle_info";
    }

    @ModelAttribute("Empleados") //Empleados es el modelo de objeto del cual me guiare
    public List<Empleados> ListaEmpleados(){
        return Arrays.asList(
                new Empleados("María", "Perez", "Calle segunda no.2", "Secretaria", 20, 123654987, 02),
                new Empleados("Juan", "Rodriguez", "Calle primera no.1", "Gerente", 35, 123456789, 01),
                new Empleados("Luis", "Martínez", "Calle tercera no.3", "Contador", 28, 987654321, 03),
                new Empleados("Ana", "González", "Avenida central no.4", "Diseñadora", 30, 456789123, 04),
                new Empleados("Pedro", "Sánchez", "Boulevard no.5", "Analista", 25, 789123456, 05)
        );
    }
}
