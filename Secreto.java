public class Secreto {
    public static void main(String[] args) {
        System.out.println("¡BIENBENIDO AL JUEGO DEL NÚMERO SECRETO!");

        int numeroSecreto = (int)(Math.random() * 100) + 1;
        int intentos = Integer.MAX_VALUE;

        for (int i = 0; i < intentos; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Introduce un número entre 1 y 100: Llevas " + (i + 1) + " intentos");
            int numero = Integer.parseInt(System.console().readLine());
            if (numero == numeroSecreto) {
                System.out.println("--------------------------------------------");
                System.out.println("¡Enhorabuena! Has acertado el número secreto: " + numeroSecreto);
                if (i == 0) {
                    System.out.println("¡Y has acertado a la primera!");
                } else if (i < 5) {
                    System.out.println("¡Y has acertado en menos de 5 intentos!");
                } else {
                    System.out.println("¡Y has acertado en " + (i + 1) + " intentos! ¡Patético!");
                } break;
            } else if (numero < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else {
                System.out.println("El número secreto es menor");
            }
        }
    }
}