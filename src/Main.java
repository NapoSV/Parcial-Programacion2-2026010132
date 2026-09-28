public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Hector Napoleon Lopez Ruiz", 10000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
