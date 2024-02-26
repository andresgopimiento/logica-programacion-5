import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("zanahoria", "carrot");
        diccionario.put("cebolla", "onion");
        diccionario.put("pimiento", "pepper");
        diccionario.put("aceituna", "olive");
        diccionario.put("pan", "bread");
        diccionario.put("queso", "cheese");
        diccionario.put("mantequilla", "butter");
        diccionario.put("huevo", "egg");
        diccionario.put("leche", "milk");
        diccionario.put("yogurt", "yogurt");
        diccionario.put("nueces", "nuts");
        diccionario.put("cacahuete", "peanut");
        diccionario.put("palta", "avocado");
        diccionario.put("pizza", "pizza");
        diccionario.put("pasta", "pasta");
        diccionario.put("pollo", "chicken");
        diccionario.put("cerdo", "pork");
        diccionario.put("res", "beef");
        diccionario.put("pescado", "fish");
        diccionario.put("atún", "tuna");
        diccionario.put("salmón", "salmon");
        diccionario.put("sandía", "watermelon");
        diccionario.put("melocotón", "peach");
        diccionario.put("cereza", "cherry");
        diccionario.put("fresa", "strawberry");
        diccionario.put("mango", "mango");
        diccionario.put("kiwi", "kiwi");
        diccionario.put("limón", "lemon");
        diccionario.put("lima", "lime");
        diccionario.put("naranja", "orange");
        diccionario.put("piña", "pineapple");
        diccionario.put("coco", "coconut");
        diccionario.put("almendras", "almonds");
        diccionario.put("avellanas", "walnuts");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("Hola, buen día. A continuación deberás traducir las palabras que aparezcan al inglés.");
        System.out.println("Pero antes, indícanos tu nombre: ");
        String nombre = scanner.nextLine();


        for (int i = 0; i < 5; i++) {
            String palabra = getRandomKey(diccionario, random);
            System.out.println(nombre + " traduce al inglés: " + palabra);
            String respuesta = scanner.nextLine();

            if (diccionario.get(palabra).equalsIgnoreCase(respuesta)) {
                correctas++;
                System.out.println("Correcto!");
            } else {
                incorrectas++;
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
            }
        }

        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
    }

    private static String getRandomKey(Map<String, String> map, Random random) {
        int index = random.nextInt(map.size());
        String key = null;
        int i = 0;

        for (String palabra : map.keySet()) {
            if (i == index) {
                key = palabra;
                break;
            }
            i++;
        }

        return key;
    }
}