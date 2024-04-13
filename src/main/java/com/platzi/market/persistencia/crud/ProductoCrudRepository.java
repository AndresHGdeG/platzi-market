package com.platzi.market.persistencia.crud;

import com.platzi.market.persistencia.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

}
