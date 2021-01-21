
package ec.edu.espe.minoristarest.repository;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.minoristarest.repository package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarTodosResponse_QNAME = new QName("http://ws.mayorista.espe.edu.ec/", "listarTodosResponse");
    private final static QName _ActualizarCompra_QNAME = new QName("http://ws.mayorista.espe.edu.ec/", "actualizarCompra");
    private final static QName _ListarTodos_QNAME = new QName("http://ws.mayorista.espe.edu.ec/", "listarTodos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.minoristarest.repository
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarTodos }
     * 
     */
    public ListarTodos createListarTodos() {
        return new ListarTodos();
    }

    /**
     * Create an instance of {@link ListarTodosResponse }
     * 
     */
    public ListarTodosResponse createListarTodosResponse() {
        return new ListarTodosResponse();
    }

    /**
     * Create an instance of {@link ActualizarCompra }
     * 
     */
    public ActualizarCompra createActualizarCompra() {
        return new ActualizarCompra();
    }

    /**
     * Create an instance of {@link ProductoKardex }
     * 
     */
    public ProductoKardex createProductoKardex() {
        return new ProductoKardex();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mayorista.espe.edu.ec/", name = "listarTodosResponse")
    public JAXBElement<ListarTodosResponse> createListarTodosResponse(ListarTodosResponse value) {
        return new JAXBElement<ListarTodosResponse>(_ListarTodosResponse_QNAME, ListarTodosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mayorista.espe.edu.ec/", name = "actualizarCompra")
    public JAXBElement<ActualizarCompra> createActualizarCompra(ActualizarCompra value) {
        return new JAXBElement<ActualizarCompra>(_ActualizarCompra_QNAME, ActualizarCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mayorista.espe.edu.ec/", name = "listarTodos")
    public JAXBElement<ListarTodos> createListarTodos(ListarTodos value) {
        return new JAXBElement<ListarTodos>(_ListarTodos_QNAME, ListarTodos.class, null, value);
    }

}
