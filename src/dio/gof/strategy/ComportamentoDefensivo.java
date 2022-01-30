package dio.gof.strategy;

/**
 *
 * @author ma_ma
 */
public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
    
}
