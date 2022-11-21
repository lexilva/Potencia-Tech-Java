import facade.Facade;
import singleton.LazyHolder;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import strategy.*;

public class Test {
    public static void main(String[] args) {

        //Testes relacionados ao Design Patterns Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println( lazy );
        lazy = SingletonLazy.getInstancia();
        System.out.println( lazy );

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println( eager );
        eager = SingletonEager.getInstancia();
        System.out.println( eager );

        LazyHolder lazyHolder = LazyHolder.getInstancia();
        System.out.println( lazyHolder );
        lazyHolder = LazyHolder.getInstancia();
        System.out.println( lazyHolder );

        // Testes relacionados à Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento( normal );
        robo.mover();
        robo.mover();
        robo.setComportamento( defensivo );
        robo.mover();
        robo.setComportamento( agressivo );
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migraCliente( "Venilton", "14801788" );
    }

}
