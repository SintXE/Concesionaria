package com.example.concesionaria.repository;

import com.example.concesionaria.Entity.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {}