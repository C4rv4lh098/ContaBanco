package dio.webapi.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("Ocampo %s é obrigatório!", campo);
    }
}
