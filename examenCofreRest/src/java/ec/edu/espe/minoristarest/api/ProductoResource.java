
package ec.edu.espe.minoristarest.api;

import ec.edu.espe.minoristarest.repository.ProductoWS;
import ec.edu.espe.minoristarest.repository.ProductoWS_Service;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author cofre
 */
@Path("producto")
public class ProductoResource {

    @Context
    private UriInfo context;

    public ProductoResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        ProductoWS_Service service = new ProductoWS_Service();
        ProductoWS port = service.getProductoWSPort();
        port.listarTodos();
    }

    /**
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
