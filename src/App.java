import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        System.out.println("Hello, World!");
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int x = 10;
        x += 5;
        x -= 3;
        x *= 2;
        x /= 4;
        x++;
        x--;
 
        int edad = 20;
        System.out.println(edad == 20);
        System.out.println(edad != 20);
        System.out.println(edad > 18);
        System.out.println(edad < 25);
        System.out.println(edad >= 20);
        System.out.println(edad <= 20);

        boolean mayorDeEdad = edad >= 18;
        boolean tieneCarnet = true;
        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println(!mayorDeEdad);

        */
        /* 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.print("Hola, " + nombre + ", Tienes " + edad + " años.");

        sc.close();
        */

        /* 
        Scanner sc = new Scanner(System.in);
        
        System.out.print("base ");
        double base = sc.nextDouble();

        System.out.print("altura ");
        double altura = sc.nextDouble();

        double area = (base * altura)/2;


        System.out.print("El área del triángulo es: " + area);
        

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.print("Tu promedio es: " + promedio);

        sc.close();

        if (promedio >= 3.0) {
            System.out.println("Excelente");

        }else if (promedio >= 2.0) {
            System.out.println("Bueno");
        } else if (promedio >= 1.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

         Scanner sc = new Scanner(System.in);

         System.out.println("Dame el radio del círculo: ");
         double radio = sc.nextDouble();
         Double Resultado =  (Math.PI * radio * radio);
         System.out.println("El área del círculo es: " + Resultado);

         
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el lado del cuadrado: ");
        double lado = sc.nextDouble();
        Double Resultado = (lado * lado);
        System.out.println("El área del cuadrado es: " + Resultado);
        

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos años tienes?: ");
        int edad = sc.nextInt();
        
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println(mensaje);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Número de día?: ");
        int dia = sc.nextInt();
        String diaSemana;
        switch (dia) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;  
            case 3:
                diaSemana = "Miércoles";
                break;  
            case 4:
                diaSemana = "Jueves";
                break;  
            case 5:
                diaSemana = "Viernes";
                break;  
            case 6:
                diaSemana = "Sábado";
                break;  
            case 7:
                diaSemana = "Domingo";
                break;     
            default: 
                diaSemana = "Día no válido";
            
            
            }
                
        System.out.println("El día de la semana es: " + diaSemana);  
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Número 1: ");
        double a = sc.nextDouble();

        System.out.print("Operación (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Número 2: ");
        double b = sc.nextDouble();

        double resultado;
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } 
                else {
                    System.out.println("Error: División por cero");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida");
                return;
        }
        System.out.println("Resultado: " + resultado);
        sc.close();
        
        
       for (int i = 0; i <= 20; i+=2) {
        if (i % 2 == 0) {

            System.out.println("Iteración " + i);
        }  
    */  
        System.out.println("De qué número quieres la tabla?");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        sc.close();
        }
    }   

    }
        
        

