package co.edu.unicauca.distribuidos.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.core.models.Compra;
import co.edu.unicauca.distribuidos.core.services.ICompraService;

@RestController
@RequestMapping("/api")
public class CompraRestController {

    @Autowired
    private ICompraService compraService;

    @PostMapping("/compras/{identifiacion}/{tipoIdentificacion}")
    public Compra registrar(@PathVariable("identifiacion") String identifiacion,
            @PathVariable("tipoIdentificacion") String tipoIdentificacion, @RequestBody Compra nuevaCompra) {
        Compra compra = compraService.RegistarCompra(nuevaCompra);
        if (compra == null) {
            System.out.println("No se pudo registrar la compra.");
            return compra;
        }
        System.out.println("Compra registrada con éxito.");
        return compra;
    }
}
