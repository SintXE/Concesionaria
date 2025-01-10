package com.example.concesionaria.Controller;

import com.example.concesionaria.Entity.Venta;
import com.example.concesionaria.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> listar() {
        return ventaService.listarVentas();
    }

    @PostMapping
    public Venta guardar(@RequestBody Venta venta) {
        return ventaService.guardarVenta(venta);
    }
}