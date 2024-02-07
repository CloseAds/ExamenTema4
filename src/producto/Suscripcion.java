package producto;

public class Suscripcion implements Comprable{

    private String descripcion;

    private int existencas;

    private double precio;

    public Suscripcion(String descripcion, int existencas, double precio) {
        this.descripcion = descripcion;
        this.existencas = existencas;
        this.precio = precio;
    }



    @Override
    public boolean hayUnidades(int cantidad) {
        return true;
    }

    @Override
    public void cogerUnidad() {

    }

    @Override
    public void cogerUnidad(int cantidad) throws NoHayExistenciasException {
        if (cantidad > existencas){
            throw new IllegalArgumentException("No hay suficientes existencias.");
        }
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
