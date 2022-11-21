package singleton;

/*
 * Singleton "Preguiçoso"
 *  @author lexilva
 * */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
