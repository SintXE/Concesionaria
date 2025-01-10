package com.example.concesionaria.Controller;

import com.example.concesionaria.Entity.Modelo;
import com.example.concesionaria.Service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/modelos")
public class ModeloController {
    @Autowired
    private ModeloService modeloService;

    @GetMapping
    public List<Modelo> listar() {
        return modeloService.listarModelos();
    }

    @PostMapping
    public Modelo guardar(@RequestBody Modelo modelo) {
        return modeloService.guardarModelo(modelo);
    }
}