package functional_programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        Main01 main01 = new Main01();

        List<Integer> entersList;
        entersList = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Double> doublesList;
        doublesList = Arrays.asList(1.5, 4.3, 1.3, 4.9, 5.0, 6.9);
        //  enters.forEach(System.out::println);
        //utilizando el metodo de referencia
//        enters.forEach(e -> System.out.println(e));

        //ex01
        System.out.println("exercise 01:");
        main01.exerciseUno(entersList);

        // ex02
        System.out.println("exercise 02:");
        main01.exerciseDos(doublesList);
    }

    //1. Escriu un programa que donada una col·lecció d’enters, els imprimeixi per pantalla  en una sola línia i separant-los per un guió. Usa el mètode forEach de la col·lecció.
    void exerciseUno(List<Integer> numEnteros) {
//        numEnteros.forEach(System.out::println);
        numEnteros.forEach(e -> System.out.print(e + "-"));
    }

    //2. Fes servir el mètode Math.pow per a imprimir per pantalla el contingut d’un col·lecció elevada al quadrat. Usa el mètode forEach de la col·lecció. Ús de Math.pow,
    //Math.pow(3, 2) //Retorna 3 elevat a 2 (=9)
    //Math.pow(6, 2) //Retorna 6 elevat a 2 (=36)

    void exerciseDos(List<Double> numeros) {
        numeros.forEach(num -> {
            Double resultado = Math.pow(num, 2);
            System.out.println(resultado);
        });
    }

    //ex05
    //alumneStream.forEach(a -> System.out.println(a.getNom() + " " + a.getCognoms() + ": " + a.getCicle()));/
}
