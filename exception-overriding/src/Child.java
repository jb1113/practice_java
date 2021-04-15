import java.io.IOException;

public class Child extends Parent {

    @Override
    void exceptionMethod() throws IOException {
        System.out.println("Child override method");
    }
}
