public class ErrorCodeException extends Exception {

    private final int ERR_CODE;

    ErrorCodeException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    ErrorCodeException(String msg) {
        this(msg, 100);
    }

    public int getErrCode() {
        return ERR_CODE;
    }
}
