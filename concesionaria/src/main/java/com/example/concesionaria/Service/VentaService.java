package com.example.concesionaria.Service;


import com.example.concesionaria.Entity.Venta;
import com.example.concesionaria.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    public Venta guardarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
}