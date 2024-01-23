package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entities.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    List<Compra> findByIdCompraOrderByFechaDesc(int id_cliente);
    Optional<List<Compra>> findByMedioPagoOrderByIdCompraDesc(String medio_pago);
}
