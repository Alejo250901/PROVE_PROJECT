/*import java.util.Scanner;*/

public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", true);
        Libro libro2 = new Libro();
        libro2.setTitulo("Don Quijote de la Mancha");
        libro2.setAutor("Miguel de Cervantes");
        libro2.setDisponible(true);
        System.out.println("\n--- Catálogo de Libros ---");
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();

        System.out.println("\n--- Préstamo y Devolución ---");
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Medellín", 150, 200);
        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("AV456");
        vuelo2.setOrigen("Cali");
        vuelo2.setDestino("Cartagena");
        vuelo2.setCapacidad(180);
        vuelo2.setOcupacion(190); 

        System.out.println("\n---Información de Vuelos ---");
        vuelo1.mostrarInformacion();
        System.out.println();
        vuelo2.mostrarInformacion();

        System.out.println("\n--- Embarque de Pasajeros ---");
        vuelo1.embarcar(30);
        vuelo1.embarcar(25);
        vuelo1.desembarcar(15);
        vuelo1.desembarcar(20);

        System.out.println("\n--- Estado final del vuelo 1 ---");    




       /* Punto p1 = new Punto ();
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.modulo();
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        p1. setX(2);
        p1. setY(3);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        p1.modulo();
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Punto p2 = new Punto (2,3);
        System.out.println(p2.getX());
        System.out.println(p2.getY());


        
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
      
        System.out.println("De qué número quieres la tabla?");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("Tabla del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        sc.close();

        
    
        }
       for (int fila = 1; fila <= 4; fila++){
        for (int col = 1; col <= 4; col++){
            System.out.print("* ");
        }
        System.out.println();
       }
      for (int i = 1; i <= 10; i++){
        if (i==5) break;
        System.out.println(i);
      }
      for (int i = 1; i<=10;i++){
        if (i % 2 == 0) continue;
        System.out.println(i);
      }
     int contador = 1;
     while (contador <= 5){
        System.out.println("Vuelta número " + contador);
        contador++;
     }
    Scanner sc = new Scanner (System.in);
    int edad = -1;
    while (edad < 0 || edad > 120){
        System.out.println("Ingresa tu edad (0-120): ");
        edad = sc.nextInt();
        if (edad < 0 || edad > 120){
            System.out.println("Edad invalida, intenta de nuevo.");

        }
    Scanner sc = new Scanner (System.in);
    int opcion;

    do {
        System.out.println("\nMenú");
        System.out.println("1. Saludar");
        System.out.println("2. Despedirse");
        System.out.println("3. Quedarse");
        System.out.println("Opción ");
        opcion = sc.nextInt();
        
        
        switch (opcion){
            case 1:
                System.out.print("Hola");
                break;
            case 2:
                System.out.print("Chao");
                break;
            case 3:
                System.out.print("Quedate por favor");
                break;
            default:
                System.out.println("Opción invalida");

    
            }
    } while (opcion != 0);
    System.out.println("Programa finalizado");
    
   int [] notas = new int[5];

   notas [0]=85;
   notas [1]=90;
   notas [2]=78;
   notas [3]=92;
   notas [4]=88;

   int [] edades = {18,20, 22, 19, 21};
   System.out.println(notas[0]);

   for (int i=0; i < notas.length; i++){
    System.out.println("Nota " + (i+1) + ": " + notas [i]);
   
    for (int nota : notas){
        System.out.println(nota);
    
    }*/
   /* 
    Scanner sc = new Scanner (System.in);
    System.out.print("¿Cuántos estudiantes hay? ");
    int n = sc.nextInt();

    double[] notas = new double [n];
    double suma = 0;

    for (int i = 0; i < n; i++){
        System.out.print("Nota del estudiante " + (i +1) + ": ");
        notas [i] = sc.nextDouble();
        suma += notas [i];

        double promedio = suma / n;
        System.out.println("Promedio del grupo: " + promedio);
    
        sc.close();
    }*/
    
   }
    } 

        
        

