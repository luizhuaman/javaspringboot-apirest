package com.informaticonfig.spring.app.springboot_app.controllers;


import com.informaticonfig.spring.app.springboot_app.models.Empleados;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;


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

    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap<>();
        json.put("Usuario: ", usuario);
        json.put("Codigo: ", codigo);
        json.put("Mensaje: ", mensaje);
        json.put("Valores: ", valores);

        return json;
    }
}
