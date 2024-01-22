package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entities.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
