/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenuf1;

import java.util.Scanner;

/**
 *
 * @author david.vilanva
 */
public class EXAMENUF1 {

    public static Scanner lector = new Scanner(System.in);

    //idSabata, nom, idMarca, idCategoria, talla, idColor, preu
    public static String[][] sabates = {
        {"1", "PRECISION 6", "1", "1", "45", "1", "74.95"},
        {"2", "AIR PEGASUS 39", "1", "1", "44", "2", "70.95"},
        {"3", "METCOM 8 UNISEX", "1", "3", "40", "4", "74.95"},
        {"4", "TERREX SWIFT SOLO 2 UNISEX", "2", "2", "39", "1", "65.55"},
        {"5", "AIR MAX IMPACT", "3", "1", "45", "3", "69.95"},
        {"6", "TREK WP", "3", "2", "40", "3", "70.25"},
        {"7", "REACT PEGASUS", "1", "3", "41", "2", "55.95"},
        {"8", "RENEW RUN", "3", "1", "40", "1", "74.95"},
        {"9", "FUTURE MATCH", "2", "2", "39", "4", "84.95"},
        {"10", "PHANTOM GX", "1", "3", "43", "2", "59.95"},
        {"11", "SAVELOS", "2", "2", "45", "4", "74.95"}
    };
    //idCategoria, nomCategoria
    public static String[][] categories = {{"1", "Baloncesto"}, {"2", "Football"}, {"3", "Tenis"}};
    //idMarca, nomMarca
    public static String[][] marques = {{"1", "Nike"}, {"2", "Adidas"}, {"3", "Puma"}};
    //idColor, nomColor
    public static String[][] colors = {{"1", "Blanc"}, {"2", "Vermell"}, {"3", "Negre"}, {"4", "Blau"}};

    public static int opcio;

    public static int idSabata;

    Double preuDouble;

    String preu;

    public static void main(String[] args) {
        System.out.println("Selecciona una opció: ");
        System.out.println("1. Gestionar Sabates");
        System.out.println("2. Llistats de sabates");
        System.out.println("0. Sortir");
        System.out.println("");
        while (!lector.hasNextInt()) {
            System.out.println("Selecciona una opció: ");
            System.out.println("1. Gestionar Sabates");
            System.out.println("2. Llistats de sabates");
            System.out.println("0. Sortir");
            System.out.println("");
            lector.nextLine();
        }
        opcio = lector.nextInt();

        do {

        switch (opcio) {
            case 1:

                System.out.println("Submenú Gestionar Sabates: ");
                System.out.println("1. Afegir sabates");
                System.out.println("2. Llistar sabates");
                System.out.println("3. Eliminar sabates");
                System.out.println("4. Modificar sabates");
                System.out.println("0. Sortir");
                System.out.println("");
                while (!lector.hasNextInt()) {
                    System.out.println("Submenú Gestionar Sabates: ");
                    System.out.println("1. Afegir sabates");
                    System.out.println("2. Llistar sabates");
                    System.out.println("3. Eliminar sabates");
                    System.out.println("4. Modificar sabates");
                    System.out.println("0. Sortir");
                    System.out.println("");
                    lector.nextLine();
                }
                opcio = lector.nextInt();

                switch (opcio) {
                    case 1:

                        //creem un array per introduïr les dades de la sabata
                        String[] sabata = new String[7];

                        lector.nextLine();

                        System.out.println("Donam el nom de l'article");
                        sabata[1] = lector.nextLine();

                        System.out.println("Selecciona una marca");

                        //Llistem les marques
                        System.out.printf("%-4s %15s\n", "id", "Marca");
                        System.out.printf("%20s\n", "--------------------");
                        for (int i = 0; i < marques.length; i++) {
                            System.out.printf("%-4s %15s\n", marques[i][0], marques[i][1]);
                        }

                        //s'hauria de comproivar id valid                        
                        sabata[2] = lector.nextLine();

                        System.out.println("A quina categoria pertany?");

                        //Llistem les categories
                        System.out.printf("%-4s %15s\n", "id", "Categoria");
                        System.out.printf("%20s\n", "--------------------");
                        for (int i = 0; i < categories.length; i++) {
                            System.out.printf("%-4s %15s\n", categories[i][0], categories[i][1]);
                        }

                        //s'hauria de comproivar id valid                        
                        sabata[3] = lector.nextLine();

                        //talla
                        System.out.println("Donam la talla");
                        sabata[4] = lector.nextLine();

                        System.out.println("Donam el nom el color");

                        //Llistem els colors
                        System.out.printf("%-4s %15s\n", "id", "Color");
                        System.out.printf("%20s\n", "--------------------");
                        for (int i = 0; i < colors.length; i++) {
                            System.out.printf("%-4s %15s\n", colors[i][0], colors[i][1]);
                        }

                        sabata[5] = lector.nextLine();

                        System.out.println("Donam el preu de l'article");
                        // while (!lector.hasNextDouble()) {
                        while (!lector.hasNextLine()) {

                            System.out.println("Donam el preu de l'article");
                            System.out.println("");
//                                lector.nextDouble();
                            lector.nextLine();
                        }

                        // String preu = lector.nextDouble();
                        sabata[6] = lector.nextLine(); //després ho intento passar a double amb un parseString...

                        System.out.println("A quina categoria pertany?");

                        //posició sabata FER-HO AL FINAL EN EL MOMENT D'AGREGAR LA SABATA
                        if (sabates.length == 0) {
                            sabata[0] = "0";
                        } else {
                            sabata[0] = String.valueOf(Integer.parseInt(sabates[sabates.length - 1][0]) + 1);
                        }

                        String[][] aux;

                        //creem un nou array amb una posició més
                        aux = new String[sabates.length][sabates[0].length];

                        //copiem tots els valors
                        for (int i = 0; i < sabates.length; i++) {
                            for (int j = 0; j < sabates[0].length; j++) {
                                aux[i][j] = sabates[i][j];

                            }
                        }
                        //afegim al final
                        aux[aux.length - 1][0] = sabata[0];
                        aux[aux.length - 1][1] = sabata[1];
                        aux[aux.length - 1][2] = sabata[2];
                        aux[aux.length - 1][3] = sabata[3];
                        aux[aux.length - 1][4] = sabata[4];
                        aux[aux.length - 1][5] = sabata[5];
                        aux[aux.length - 1][6] = sabata[6];

                        //assignem valors
                        sabates = aux;

                        //ARA TORNRIA A MOSTRAR EL MENÚ PRINCIPAL PERÒ NO HO FARE PERQUÈ NO PODEM UTILITZAR MÈTODES (LListere directament el resultat)
                        System.out.println("Resultat: ");

                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                        }

                        break;

                    case 2:

                        System.out.println("Llistar totes les sabates: ");

                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            String marca = "";
                            String categoria = "";
                            String color = "";

                            for (int j = 0; j < marques.length; j++) {
                                if (sabates[i][2] == marques[j][0]) {
                                    marca = marques[j][1];
                                }
                            }

                            for (int k = 0; k < categories.length; k++) {
                                if (sabates[i][3] == categories[k][0]) {
                                    categoria = categories[k][1];
                                }
                            }

                            for (int l = 0; l < colors.length; l++) {
                                if (sabates[i][5] == colors[l][0]) {
                                    color = colors[l][1];
                                }
                            }

                            System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], marca, categoria, sabates[i][4], color, sabates[i][6]);
                        }

                        break;

                    case 3:


                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                        }

                        System.out.println("Introdueix l'id de la sabata a eliminar: ");
                        while (!lector.hasNextInt()) {
                            System.out.println("Introdueix l'id de la sabata a eliminar: ");
                            lector.next(); 
                        }
                        idSabata = lector.nextInt();

                        //creem un nou array amb 1 posició menys
                        aux = new String[sabates.length - 1][sabates[0].length];

                        //copiem tots els elements menys la que eliminem
                        for (int i = 0, j = 0; i < sabates.length; i++) {
                            if (Integer.parseInt(sabates[i][0]) != idSabata) {
                                for (int k = 0; k < sabates[0].length; k++) {
                                    aux[j][k] = sabates[i][k];
                                }
                                j++;
                            }
                        }

                        //intercanviem valors
                        sabates = aux;

                        
                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                        }

                        break;

                    case 4:

                    System.out.println("Modificar Sabata, indica l'id de la sabata ");

                    System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                    for (int i = 0; i < sabates.length; i++) {
                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);

                    }

                    System.out.println("Introdueix l'id de la sabata a modificar: ");
                    while (!lector.hasNextInt()) {
                        System.out.println("Entrada no vàlida. Introdueix l'id de la sabata a modificar: ");
                        lector.next();
                    }
                    
                    int idSabata = lector.nextInt();
                    lector.nextLine(); // netejar el buffer
            
                    while (idSabata < 0 || idSabata >= sabates.length) {
                        System.out.println("Número fora de rang. Per favor, intenta-ho de nou.");
                        while (!lector.hasNextInt()) {
                            System.out.println("Entrada no vàlida. Introdueix l'id de la sabata a modificar: ");
                            lector.next();
                        }
                        idSabata = lector.nextInt() -1; //EN CAS QUE LE BUSQUEM PER POSICIÓ A PARTIR DEL ID
                        lector.nextLine(); // netejar el buffer
                    }
            
                    // Modificar les dades de la sabata
                    System.out.println("Modificant la sabata amb ID: " + idSabata);
            
                    System.out.println("Introdueix el nou nom de l'article (actual: " + sabates[idSabata][1] + "): ");
                    sabates[idSabata][1] = lector.nextLine();
            
                    System.out.println("Selecciona una nova marca (actual: " + sabates[idSabata][2] + "):");
                    System.out.printf("%-4s %15s\n", "id", "Marca");
                    System.out.printf("%20s\n", "--------------------");
                    for (int i = 0; i < marques.length; i++) {
                        System.out.printf("%-4s %15s\n", marques[i][0], marques[i][1]);
                    }
                    sabates[idSabata][2] = lector.nextLine();
            
                    System.out.println("A quina categoria pertany? (actual: " + sabates[idSabata][3] + "):");
                    System.out.printf("%-4s %15s\n", "id", "Categoria");
                    System.out.printf("%20s\n", "--------------------");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.printf("%-4s %15s\n", categories[i][0], categories[i][1]);
                    }
                    sabates[idSabata][3] = lector.nextLine();
            
                    System.out.println("Introdueix la nova talla (actual: " + sabates[idSabata][4] + "): ");
                    sabates[idSabata][4] = lector.nextLine();
            
                    System.out.println("Selecciona un nou color (actual: " + sabates[idSabata][5] + "):");
                    System.out.printf("%-4s %15s\n", "id", "Color");
                    System.out.printf("%20s\n", "--------------------");
                    for (int i = 0; i < colors.length; i++) {
                        System.out.printf("%-4s %15s\n", colors[i][0], colors[i][1]);
                    }
                    sabates[idSabata][5] = lector.nextLine();
            
                    System.out.println("Introdueix el nou preu de l'article (actual: " + sabates[idSabata][6] + "): ");
                    while (!lector.hasNextDouble()) {
                        System.out.println("Entrada no vàlida. Introdueix el nou preu de l'article: ");
                        lector.next();
                    }
                    sabates[idSabata][6] = String.valueOf(lector.nextDouble());
            
                    // Mostrar resultat de la modificació
                    System.out.println("Resultat de la modificació:");
                    System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                    for (int i = 0; i < sabates.length; i++) {
                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                    }

                        break;

                    case 0:
                        System.out.println("Tornant al menú principal");
                        break;
                    default:
                        System.out.println("Opció incorrecta...");

                }

            case 2:

                System.out.println("Submenú Llistar Sabates: ");
                System.out.println("1. LListar per marca");
                System.out.println("2. Listar (ni nke ni puma)");
                System.out.println("3. Adidas color usuari");
                System.out.println("4. La sabata més barata");
                System.out.println("0. Sortir");
                System.out.println("");
                while (!lector.hasNextInt()) {
                    System.out.println("Submenú Listar Sabates: ");
                    System.out.println("1. LListar per marca");
                    System.out.println("2. Listar (ni nke ni puma)");
                    System.out.println("3. Adidas color usuari");
                    System.out.println("4. La sabata més barata");
                    System.out.println("0. Sortir");
                    System.out.println("");
                    lector.nextLine();
                }
                opcio = lector.nextInt();

                System.out.println("MENU LLISTAR SABATES: ");

                switch (opcio) {

                    case 1:

                        for (int i = 0; i < marques.length; i++) {
                            System.out.println(marques[i][0] + ". " + marques[i][1]);
                        }
                        System.out.println("Introdueix la marca de la sabata a llistar: ");

                        while (!lector.hasNextInt()) {
                            System.out.println("Entrada no vàlida, introdueixi l'id de la marca: ");
                            lector.next(); // Limpiar la entrada no válida
                        }
                        
                        int marcaSeleccionada = lector.nextInt();
                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            if (Integer.parseInt(sabates[i][2]) ==  marcaSeleccionada) {
                        String marca = "";
                        String categoria = "";
                        String color = "";

                        for (int j = 0; j < marques.length; j++) {
                            if (sabates[i][2] == marques[j][0]) {
                                marca = marques[j][1];
                            }
                        }

                        for (int k = 0; k < categories.length; k++) {
                            if (sabates[i][3] == categories[k][0]) {
                                categoria = categories[k][1];
                            }
                        }

                        for (int l = 0; l < colors.length; l++) {
                            if (sabates[i][5] == colors[l][0]) {
                                color = colors[l][1];
                            }
                        }

                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], marca, categoria, sabates[i][4], color, sabates[i][6]);
                    }
                }
                        break;

                    case 2:

                        System.out.println("Sabates que no són ni nike ni puma: ");

                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            if (!sabates[i][2].equals("1") && !sabates[i][2].equals("3")) {
                                System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                            }
                        }

                        break;

                    case 3:

                        System.out.println("Tria el color de la sabata adidas: ");

                        lector.nextLine();
                        //Llistem els colors
                        System.out.printf("%-4s %15s\n", "id", "Color");
                        System.out.printf("%20s\n", "--------------------");
                        for (int i = 0; i < colors.length; i++) {
                                System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                            }

                        lector.nextLine();
                            String idColor = lector.nextLine();

                            System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                            for (int i = 0; i < sabates.length; i++) {
                                if (sabates[i][5].equals(idColor)) {
                                    System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                                }
                            }

                            break;

                        
                        case 4:

                        System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", "id", "Nom", "marca", "categoria", "talla", "color", "preu");
                        for (int i = 0; i < sabates.length; i++) {
                            if (Double.parseDouble(sabates[i][6]) < Double.parseDouble(sabates[1][6]) || Double.parseDouble(sabates[i][6]) < Double.parseDouble(sabates[2][6])) //i anar fent o comprovar la posicio de cada sabata amb un for {
                            {
                                System.out.printf("%4s %25s %8s %10s %6s %15s %15s \n", sabates[i][0], sabates[i][1], sabates[i][2], sabates[i][3], sabates[i][4], sabates[i][5], sabates[i][6]);
                            }

                        }

                        break;

                        case 0:
                        
                        System.out.println("Tornant al menú pricipal");
                        break;

                    default:
                        System.out.println("Opció incorrecta...");
                }
                

                case 0:
                System.out.println("Adéu!");

                break;

                    default:
                        System.out.println("Opció incorrecta...");
                }

            } while (opcio != 0);
        }
        

    }