package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Robo;

/**
 *
 * @author ma_ma
 */
public class Main {

    public static void main(String[] args) {

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();


         //Facade
         Facade facade = new Facade();
         facade.migrarCliente("Michael Jéguirsom", "123456789");
        
        
        
        
        
    }

}
