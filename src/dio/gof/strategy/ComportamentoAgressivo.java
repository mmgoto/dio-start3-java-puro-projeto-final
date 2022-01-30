package dio.gof.strategy;

/**
 *
 * @author ma_ma
 */
public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
    
}
