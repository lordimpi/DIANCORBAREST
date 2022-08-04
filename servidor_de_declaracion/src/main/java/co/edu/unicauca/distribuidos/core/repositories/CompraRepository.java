package co.edu.unicauca.distribuidos.core.repositories;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import co.edu.unicauca.distribuidos.core.models.Compra;

@Service
public class CompraRepository {
    private ArrayList<Compra> listaCompras;

    public CompraRepository(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public List<Compra> ListarCompras(){
        List<Compra> compras = new ArrayList<>();
        for (Compra item : listaCompras) {
            compras.add(item);
        }
        return compras;
    }

    public Compra RegistrarCompra(Compra nuevaCompra) {
        System.out.println("Invocando a RegistrarCompra");
        listaCompras.add(nuevaCompra);
        if (ValidarUmbral(nuevaCompra)) {

        }
        return nuevaCompra;
    }

    private boolean ValidarUmbral(Compra nuevaCompra) {
        if (SumaComprasEnAño(nuevaCompra) > 45000000) {
            return true;
        }
        return false;
    }

    private double SumaComprasEnAño(Compra compra) {
        double sumaTotalEnAnio = 0;
        for (Compra item : listaCompras) {
            if (item.getIdentifiacion().equals(compra.getIdentifiacion()) 
                && this.getAnio(item.getFechaHora()).equals(this.getAnio(compra.getFechaHora()))
            ) {
                sumaTotalEnAnio += item.getValorCompra();
            }
        }
        return sumaTotalEnAnio;
    }

    private String getAnio(Date fecha) {

        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        return getYearFormat.format(fecha);
    }
}
