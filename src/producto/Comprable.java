package producto;

public interface Comprable {

    boolean hayUnidades(int cantidad) throws NoHayExistenciasException;

    void cogerUnidad();

    void cogerUnidad(int cantidad) throws NoHayExistenciasException;

    double getPrecioVenta();

}
