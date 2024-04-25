
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        String Nombre = "";
        String Telefono = "";
        int CantContactos = 0;

        Scanner scan = new Scanner(System.in);
        // Creamos un ArrayList para almacenar los contactos
        ArrayList<String> listaContactos = new ArrayList<>();

        int Opc = 0;
        do {
            System.out.println("\t Ingrese una opcion");
            System.out.println("\n");
            System.out.println("1 Agregar un nuevo contacto");
            System.out.println("2 Mostrar Lista de contactos");
            System.out.println("3 Buscar contacto por nombre");
            System.out.println("4 Ordenar por Burbuja a partir de los nombres");
            System.out.println("5 Ordenar por Inserción a partir de los números Telefónicos");
            System.out.println("6 Salir");

            Opc = scan.nextInt();

            switch (Opc) {

                case 1:
                    System.out.println("Ingrese la cantidad de contactos a guardar");
                    CantContactos = scan.nextInt();
                    if (CantContactos > 0) {
                        for (int i = 0; i < CantContactos; i++) {
                            scan.nextLine();

                            System.out.println("Ingrese el nombre del contacto: " + (i + 1));
                            Nombre = scan.nextLine();
                            while (Nombre.equals("")) {
                                System.out.println("Digite el nombre del empleado");
                                Nombre = scan.nextLine();

                            }

                            System.out.println("Ingrese el numero de contacto: " + (i + 1));
                            Telefono = scan.nextLine();
                            while (Telefono.equals("")) {
                                System.out.println("Digite el numero  de contacto");
                                Telefono = scan.nextLine();

                            }

                            // Agregamos el contacto a la lista
                            listaContactos.add("Nombre: " + Nombre + ", Telefono: " + Telefono);
                        }
                    }
                    break;

                case 2:
                    System.out.println("La lista de contactos es:");

                    // Mostramos la lista de contactos
                    for (String contacto : listaContactos) {
                        System.out.println(contacto);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del contacto que desea buscar:");
                    String nombreBuscado = scan.next();
                    boolean encontrado = false;

                    // PARA BUSCAR EL CONTACTO POR NOMBRE
                    for (String contacto : listaContactos) {
                        if (contacto.contains(nombreBuscado)) {
                            System.out.println("Contacto encontrado: " + contacto);
                            encontrado = true;
                            break;
                        }
                    }

                    //CONDICION PARA SABER SI EL CONTACTO EXISTE O NO
                    if (!encontrado) {
                        System.out.println("No se encontró ningún contacto con ese nombre.");
                    }

                    break;

                case 4:
                    // Ordenar por Burbuja a partir de los nombres
                    System.out.println("La lista de contactos ordenada a partir de los nombres:");
                    for (int i = 0; i < listaContactos.size() - 1; i++) {
                        for (int j = 0; j < listaContactos.size() - i - 1; j++) {
                            // Obtener el nombre del primer contacto
                            String nombre1 = listaContactos.get(j).split(",")[0];
                            // Obtener el nombre del segundo contacto
                            String nombre2 = listaContactos.get(j + 1).split(",")[0];
                            // Comparar los nombres y intercambiar si están en el orden incorrecto
                            if (nombre1.compareTo(nombre2) > 0) {
                                // Intercambiar los elementos
                                String temp = listaContactos.get(j);
                                listaContactos.set(j, listaContactos.get(j + 1));
                                listaContactos.set(j + 1, temp);
                            }
                        }
                    }
                    // Mostrar la lista de contactos ordenada
                    System.out.println("La lista de contactos ordenada a partir de los nombres es:");
                    for (String contacto : listaContactos) {
                        System.out.println(contacto);
                    }
                    break;

                case 5:
                    System.out.println("Ordenar por Insercion a partir de los numeros Telefonicos");
                    
                    break;

                case 6:
                    System.out.println("SALIR");
                    break;

                default:
                    System.out.println("Opcion Invalida");

            }
        } while (Opc != 6);
    }

}
