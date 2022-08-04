package servicios;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.jackson.JacksonFeature;

import Models.Compra;

public class CompraServices {

    private String endPoint;
    private Client objClientePeticiones;

    public CompraServices() {
        this.endPoint = "http://localhost:6000/api/compras";
        this.objClientePeticiones = ClientBuilder.newClient().register(new JacksonFeature());
    }

    public Compra registrarCompra(Compra objCompraRegistar) {
        Compra objCompra = null;
        WebTarget target = this.objClientePeticiones.target(
                this.endPoint + "/" + objCompraRegistar.getIdentifiacion() + "/" + objCompraRegistar.getIdentifiacion());
        Entity<Compra> data = Entity.entity(objCompraRegistar, MediaType.APPLICATION_JSON_TYPE);
        Builder objPeticion = target.request(MediaType.APPLICATION_JSON_TYPE);
        objCompra = objPeticion.post(data, Compra.class);
        return objCompra;
    }
}
