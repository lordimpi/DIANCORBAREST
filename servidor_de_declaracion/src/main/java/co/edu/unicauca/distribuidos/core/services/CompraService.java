package co.edu.unicauca.distribuidos.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.core.models.Compra;
import co.edu.unicauca.distribuidos.core.repositories.CompraRepository;

@Service
public class CompraService implements ICompraService{

    @Autowired
    private CompraRepository servicioCompra;

    @Override
    public Compra RegistarCompra(Compra nuevaCompra) {

        return servicioCompra.RegistrarCompra(nuevaCompra);
    }
    
}
