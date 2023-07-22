package edu.ejercicioclase;

import java.util.Scanner;

public class clsEjerciciosClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCirculo(scanner);
                    break;
                case 2:
                    calcularCircunferenciaCirculo(scanner);
                    break;
                case 3:
                    calcularVolumenCubo(scanner);
                    break;
                case 4:
                    calcularAreaPiramideCuadrada(scanner);
                    break;
                case 5:
                    calcularVolumenPiramideCuadrada(scanner);
                    break;
                case 6:
                    calcularAreaTriangulo(scanner);
                    break;
                case 7:
                    calcularVolumenPrismaRectangular(scanner);
                    break;
                case 8:
                    calcularAreaParalelogramo(scanner);
                    break;
                case 9:
                    calcularVolumenCilindro(scanner);
                    break;
                case 10:
                    calcularAreaEsfera(scanner);
                    break;
                case 0:
                    System.out.println("Gracias por usar la calculadora. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Elija una opción:");
        System.out.println("1. Área de un círculo");
        System.out.println("2. Circunferencia de un círculo");
        System.out.println("3. Volumen de un cubo");
        System.out.println("4. Área de una pirámide cuadrada");
        System.out.println("5. Volumen de una pirámide cuadrada");
        System.out.println("6. Área de un triángulo");
        System.out.println("7. Volumen de un prisma rectangular");
        System.out.println("8. Área de un paralelogramo");
        System.out.println("9. Volumen de un cilindro");
        System.out.println("10. Área de una esfera");
        System.out.println("0. Salir");
    }

    public static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + area);
    }

    public static void calcularCircunferenciaCirculo(Scanner scanner) {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia del círculo es: " + circunferencia);
    }

    public static void calcularVolumenCubo(Scanner scanner) {
        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();
        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }

    public static void calcularAreaPiramideCuadrada(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área de la pirámide cuadrada es: " + area);
    }

    public static void calcularVolumenPiramideCuadrada(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = scanner.nextDouble();
        double volumen = (base * altura) / 3;
        System.out.println("El volumen de la pirámide cuadrada es: " + volumen);
    }

    public static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public static void calcularVolumenPrismaRectangular(Scanner scanner) {
        System.out.print("Ingrese el área de la base del prisma rectangular: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Ingrese la altura del prisma rectangular: ");
        double altura = scanner.nextDouble();
        double volumen = areaBase * altura;
        System.out.println("El volumen del prisma rectangular es: " + volumen);
    }

    public static void calcularAreaParalelogramo(Scanner scanner) {
        System.out.print("Ingrese la longitud de la base del paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del paralelogramo es: " + area);
    }

    public static void calcularVolumenCilindro(Scanner scanner) {
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = scanner.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static void calcularAreaEsfera(Scanner scanner) {
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double area = 4 * Math.PI * radio * radio;
        System.out.println("El área de la esfera es: " + area);
    }
}