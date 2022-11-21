package subsistema2cep;

public class CepApi {
    public static Object get;
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperaEstado(String cep) {
        return "SP";
    }
}
