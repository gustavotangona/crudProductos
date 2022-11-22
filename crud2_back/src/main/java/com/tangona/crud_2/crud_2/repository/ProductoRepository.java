package com.tangona.crud_2.crud_2.repository;

import com.tangona.crud_2.crud_2.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByNombre(String nombre);
    boolean existsByNombre(String nombre);

}
