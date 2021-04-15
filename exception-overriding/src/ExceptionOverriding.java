import java.io.IOException;

public class ExceptionOverriding {

    public static void main(String[] args) throws IOException {

        Child child = new Child();
        child.exceptionMethod();
    }
}
