package co.edu.unicauca.distribuidos.core.services;

import java.util.List;

import co.edu.unicauca.distribuidos.core.models.Compra;

public interface ICompraService {
    public Compra RegistarCompra(Compra nuevaCompra);
    public List<Compra> ListarCompras();
}
