package peaksoft;

import java.util.LinkedList;

public class Car implements AutoCloseable {


    @Override
    public void close() throws Exception {
        System.out.println("Машина жабылып жатат");
    }

    public void drive() {
        System.out.println("Машина журуп жатат");
    }
}
