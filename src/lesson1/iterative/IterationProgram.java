package lesson1.iterative;

public class IterationProgram {

    public static void main(String[] args) {

        System.out.println("Executing WHILE loop");

        //Bucle WHILE
        int x = 0;
        while(x < 100) {
            System.out.println("x: " + x);
            x+=10;
        }

        System.out.println("Executing FOR loop");
        //Bucle FOR
        for(int y = 0; y < 100; y+=10) {
            System.out.println("y: " + y);
        }

        System.out.println("Executing DO-WHILE loop");
        //Bucle DO-WHILE
        int z = 0;
        do {
            System.out.println("z: " + z);
            z+=10;
        } while(z < 100);

        //Bucle FOR-EACH -> Para estructuras de datos
    }
}
