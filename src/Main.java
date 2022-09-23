public class Main {

    public static void main(String[] args) {
        int numeroIf = -5;

        if (numeroIf > 0) {
            System.out.println("Es postivo");
        } else if (numeroIf == 0) {
            System.out.println("Es cero");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }


        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 3;

        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 5; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("es otro");
        }
    }


}