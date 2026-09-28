// Héctor = 6 letras → 5 + 6 = 11%
public class ComisionPersonalizada implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 0.11;
    }
}
