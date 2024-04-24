public class Main {
    public static void main(String[] args) {

        MyLog.getInstance().log("[WARNING] Mensagem de aviso", MyLog.LogLevel.WARNING);
        MyLog.getInstance().log("[ERROR] Mensagem de erro", MyLog.LogLevel.ERROR);
        MyLog.getInstance().log("[MESSAGE] Mensagem Informativa", MyLog.LogLevel.INFO);

    }
}