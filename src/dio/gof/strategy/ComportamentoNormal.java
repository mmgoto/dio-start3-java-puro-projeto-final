package dio.gof.strategy;

/**
 *
 * @author ma_ma
 */
public class ComportamentoNormal implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
    
}
