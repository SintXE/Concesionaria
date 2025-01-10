package com.example.concesionaria.Service;

import com.example.concesionaria.Entity.Modelo;
import com.example.concesionaria.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {
    @Autowired
    private ModeloRepository modeloRepository;

    public List<Modelo> listarModelos() {
        return modeloRepository.findAll();
    }

    public Modelo guardarModelo(Modelo modelo) {
        return modeloRepository.save(modelo);
    }
}