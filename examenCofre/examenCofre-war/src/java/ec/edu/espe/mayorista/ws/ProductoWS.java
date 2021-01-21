/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.mayorista.ws;

import ec.edu.espe.mayorista.model.Producto;
import ec.edu.espe.mayorista.services.ProductoServicio;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author cofre
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    @EJB
    private ProductoServicio ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "listarTodos")
    public List<Producto> listarTodos() {
        return ejbRef.listarTodos();
    }

    @WebMethod(operationName = "actualizarCompra")
    @Oneway
    public void actualizarCompra(@WebParam(name = "codigo") String codigo, @WebParam(name = "cantidad") Integer cantidad) {
        ejbRef.actualizarCompra(codigo, cantidad);
    }
    
}
