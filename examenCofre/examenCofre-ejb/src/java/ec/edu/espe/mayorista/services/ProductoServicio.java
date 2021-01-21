
package ec.edu.espe.mayorista.services;

import ec.edu.espe.mayorista.dao.ProductoFacade;
import ec.edu.espe.mayorista.dao.ProductoKardexFacade;
import ec.edu.espe.mayorista.model.Producto;
import ec.edu.espe.mayorista.model.ProductoKardex;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.Query;

/**
 *
 * @author cofre
 */
@Stateless
@LocalBean
public class ProductoServicio {

    private static final Logger LOG = Logger.getLogger(ProductoServicio.class.getName());

    @EJB
    private ProductoFacade productoDao;
    private ProductoKardexFacade productoKardexDao;
    
    public List<Producto> listarTodos(){
        return this.productoDao.findAll();
    }
    public void actualizarCompra(String codigo, Integer cantidad){
        Producto producto = productoDao.find(codigo);
         if(producto!=null){
             if(producto.getExistencia()>=cantidad){
                producto.setExistencia(producto.getExistencia() - cantidad);
                List<ProductoKardex> kardexProductos = producto.getProductoKardexList();
                ProductoKardex productoKardex = new ProductoKardex();
                productoKardex.setProducto(producto);
                productoKardex.setExistencia(producto.getExistencia());
                productoKardex.setCantidad(cantidad);
                productoKardex.setFecha(new Date());
                kardexProductos.add(productoKardex);
                productoDao.edit(producto);
             }else{
                 LOG.info("No existe inventario para el producto");
             }
         }else{
             LOG.info("No existe producto");
         } 
    }
}
