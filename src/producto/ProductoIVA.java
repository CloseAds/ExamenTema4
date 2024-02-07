package producto;

public abstract class ProductoIVA extends Producto{

    private double iva;

    public ProductoIVA(String descripcion, double precioBruto, double iva) {
        super(descripcion, precioBruto);
        this.iva = iva;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioNeto(){
        double preciofinal = getPrecioBruto() * (1 + (iva / 100));
        return preciofinal;
    }

    @Override
    public String toString() {
        return "ProductoIVA{" + getDescripcion() + ":"
                + getPrecioBruto() + " € +" +iva+ "% =" +getPrecioNeto()+ "€" ;
    }
}
