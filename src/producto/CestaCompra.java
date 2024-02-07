package producto;

import java.util.List;

public abstract class CestaCompra implements Comprable{

    private double presupuesto;

    private List<CestaCompra> objetos;

    public CestaCompra(double presupuesto, List<CestaCompra> objetos) {
        this.presupuesto = presupuesto;
        this.objetos = objetos;
    }

    public void getCesta (){

    }

    @Override
    public boolean hayUnidades(int cantidad) throws NoHayExistenciasException {
        return false;
    }

    @Override
    public void cogerUnidad() {

    }

    @Override
    public double getPrecioVenta() {
        return getPrecioVenta();
    }

    public void imprimir(){

        System.out.println("Cesta de la compra");
        System.out.println(List());
        System.out.println("Suma:");
        System.out.println("Restante:");

    }

}
