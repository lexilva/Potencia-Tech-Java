package singleton;

/*
 * Singleton "Lazy Holder"
 * @see <a href="https://stackoverflow.com/a/24018148">Refência</a>
 *  @author lexilva
 * */
public class LazyHolder {
    private static class InstaceHolder {
        public static LazyHolder instacia = new LazyHolder();
    }

    private LazyHolder() {
        super();
    }

    public static LazyHolder getInstancia() {
        return InstaceHolder.instacia;
    }
}
