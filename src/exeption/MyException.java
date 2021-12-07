package exeption;

import java.io.IOException;

public class MyException extends Throwable {

    void input() throws IOException{
        throw new IOException("DAnger");
    }
}
