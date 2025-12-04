import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Questão 5:
        double matriz5[][] = {
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 0, 0}
        };
        pageRank(matriz5);

        //Questão 6:
//        double matriz6[][] = {
//                {0, 1, 1, 0},
//                {0, 0, 1, 0},
//                {1, 0, 0, 1},
//                {1, 0, 0, 0}
//        };
//        pageRank(matriz6);

        //Questão 7:
//        double matriz7[][] = {
//                {0, 1, 1, 1, 0},
//                {1, 0, 0, 0, 1},
//                {0, 0, 0, 0, 1},
//                {0, 1, 0, 0, 0},
//                {0, 1, 1, 0, 0}
//        };
//        pageRank(matriz7);

        //Questão 8:
//        double matriz8[][] = {
//                {0, 1, 1, 0, 1, 1, 0, 0, 0, 1},
//                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
//                {0, 1, 1, 0, 0, 1, 1, 0, 0, 1},
//                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
//                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
//                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
//                {0, 1, 1, 0, 0, 1, 0, 1, 0, 1},
//                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
//        };
//        pageRank(matriz8);
    }

    public static void pageRank(double matriz[][]) {
        int quantSites = matriz.length;

        //Formula ak = ((A^t * A) * ak-1) / ||(A^t * A) * ak - 1||
        double matrizT[][] = new double[quantSites][quantSites];

        // Transposta A^t
        for (int i = 0; i < quantSites; i++) {
            for (int j = 0; j < quantSites; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        // A^t * A
        double matrizR[][] = new double[quantSites][quantSites];
        for (int i = 0; i < quantSites; i++) {
            for (int j = 0; j < quantSites; j++) {
                for (int k = 0; k < quantSites; k++) {
                    matrizR[i][j] += matrizT[i][k] * matriz[k][j];
                }
            }
        }

        double a[] = new double[quantSites];
        // calcular valores de a;
        for (int i = 0; i < quantSites; i++) {
            for (int j = 0; j < quantSites; j++) {
                a[i] += matriz[j][i];
            }
        }

        // norma inicial
        double normaIni = 0;
        for (int i = 0; i < quantSites; i++) {
            normaIni += Math.pow(a[i], 2);
        }

        // calcula da norma * o vetor autoridade inicial
        for (int i = 0; i < quantSites; i++) {
            a[i] = a[i]/Math.sqrt(normaIni);
        }


        int ix = 1;
        while (ix <= quantSites) {
            // calcula (A^t) * ak
            double soma[] = new double[quantSites];
            for (int i = 0; i < quantSites; i++) {
                for (int j = 0; j < quantSites; j++) {
                    soma[i] += matrizR[i][j] * a[j];
                }
            }

            for (int i = 0; i < quantSites; i++) {
                a[i] = soma[i];
            }

            // norma
            double norma = 0;
            for (int i = 0; i < quantSites; i++) {
                norma += Math.pow(a[i], 2);
            }

            // calcula da norma * o vetor autoridade
            for (int i = 0; i < quantSites; i++) {
                a[i] = a[i]/Math.sqrt(norma);
            }
            ix++;
        }

        // verificar os sites mais importantes
        List<Double> sites = new ArrayList<>();
        System.out.println("Valores dos sites");
        for (int i = 0; i < quantSites; i++) {
            System.out.printf("Site %d - %.5f%n", i+1,a[i]);
            sites.add(a[i]);
        }
        
        Collections.sort(sites);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Valores dos sites em ordem decrescente:");
        for (int i = quantSites - 1; i >= 0; i--) {
            System.out.printf("%.5f%n", sites.get(i));
        }
    }
}