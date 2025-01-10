package com.example.concesionaria.repository;

import com.example.concesionaria.Entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {}