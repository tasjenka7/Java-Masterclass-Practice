package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
     //   porsche.model = "Carrera"; // we can do it if its public in Car class
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }
}
