package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.CompraCrudRepository;
import com.platzi.market.persistence.entities.Compra;

import java.util.List;
import java.util.Optional;

public class CompraRepository {
    private CompraCrudRepository compraCrudRepository;

    public List<Compra> getAll(){
        return (List<Compra>) compraCrudRepository.findAll();
    }

    public List<Compra> getPorId (int idCompra){
        return compraCrudRepository.findByIdCompraOrderByFechaDesc(idCompra);
    }

    public Optional<List<Compra>> getMedioPago (String medioPago){
        return compraCrudRepository.findByMedioPagoOrderByIdCompraDesc(medioPago);
    }

}
