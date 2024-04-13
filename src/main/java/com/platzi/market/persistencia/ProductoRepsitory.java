package com.platzi.market.persistencia;

import com.platzi.market.persistencia.crud.ProductoCrudRepository;
import com.platzi.market.persistencia.entity.Producto;

import java.util.List;

public class ProductoRepsitory {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> findAll() {
        return (List<Producto>)productoCrudRepository.findAll();
    }
}
