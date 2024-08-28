public class bucleArrayNumeros {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            suma += numero;

            System.out.println("Indice: " + i + ", numero: " + numero + ", suma acumulada: " + suma) ;
        }

        System.out.println("La suma total es: " + suma);
    }

}