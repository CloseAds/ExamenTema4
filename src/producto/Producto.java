package producto;

public class Producto implements Comprable{

    private final String descripcion;

    private final double precioBruto;

    public Producto(String descripcion, double precioBruto) {
        this.descripcion = descripcion;
        this.precioBruto = precioBruto;
    }
    public String setDescripcion(String descripcion) throws Exception{

        if (descripcion == null){
            throw new IllegalArgumentException("Descripción no válida");
        }
        return descripcion;
    }

    public double setprecioBruto(double precioBruto)throws Exception {

        if (precioBruto <= 0){
            throw new IllegalArgumentException("Precio no válido");
        }
        return precioBruto;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public double getPrecioNeto(double precioNeto){
        return precioNeto;
    }

    @Override
    public String toString() {
        String s = "Producto{"
                + descripcion + ":"
                + precioBruto + " €";

        return s;
    }

    @Override
    public boolean hayUnidades(int cantidad) {
        return false;
    }

    @Override
    public void cogerUnidad() {

    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }
}
