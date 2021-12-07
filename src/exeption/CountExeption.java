package exeption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountExeption {

    public void input() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String o = null;

        try {
            o = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}




