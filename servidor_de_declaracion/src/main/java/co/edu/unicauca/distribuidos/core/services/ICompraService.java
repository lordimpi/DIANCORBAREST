package co.edu.unicauca.distribuidos.core.services;

import co.edu.unicauca.distribuidos.core.models.Compra;

import java.util.List;

public interface ICompraService {
    public Compra RegistarCompra(Compra nuevaCompra);
    public List<Compra> ListarCompras();
}
