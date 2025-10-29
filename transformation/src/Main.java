public class Main {
    public static void main(String[] args) {
        Tranformations t = new Tranformations();

        //Exemplo 01: Translação em 2D.

//        double vetor[] = new double[2];
//        vetor[0] = 2;
//        vetor[1] = 3;
//
//        System.out.println("Vetor v = ("+vetor[0]+", "+vetor[1]+")");
//        t.translate2D(vetor, 2, 2);

        //Exemplo 02: Translação em 2D:

//        double vetor[] = new double[3];
//        vetor[0] = 5;
//        vetor[1] = 7;
//        vetor[2] = 1;
//
//        System.out.println("Vetor v = (" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ")");
//        t.translate3D(vetor, 6, 1, 4);

        //Exemplo 03: Rotação em 2D:
        double vetor[] = new double[2];
        vetor[0] = 3;
        vetor[1] = -4;

        System.out.println("Vetor v = ("+vetor[0]+", "+vetor[1]+")");
        t.rotation2D(vetor, 30);
    }
}
