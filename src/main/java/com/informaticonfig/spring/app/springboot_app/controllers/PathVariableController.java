package com.informaticonfig.spring.app.springboot_app.controllers;


import com.informaticonfig.spring.app.springboot_app.models.Empleados;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje) {

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    //Responde solicitud tipo post
    @PostMapping("/solicitud")
    public Empleados crearEmpleados(@RequestBody Empleados empleados1) {
        return empleados1;
    }
}
