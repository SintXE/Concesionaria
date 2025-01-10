package com.example.concesionaria.Service;


import com.example.concesionaria.Entity.Vehiculo;
import com.example.concesionaria.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {
    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> listarVehiculos() {
        return vehiculoRepository.findAll();
    }

    public Vehiculo guardarVehiculo(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }
}