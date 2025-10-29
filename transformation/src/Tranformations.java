public class Tranformations {

    // Translação
    public void translate2D(double vetor[], double dx, double dy) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da translação.
        double matrizT[][] = new double[3][3];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                if (i == 0 && j == 2) {
                    matrizT[i][j] = dx;
                } else if (i == 1 && j == 2) {
                    matrizT[i][j] = dy;
                } else if (i == j){
                    matrizT[i][j] = 1;
                } else {
                    matrizT[i][j] = 0;
                }
            }
        }

        //Transladando o vetor.
        double vetorT[] = new double[3];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                vetorT[i] += matrizT[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Transladado por (" + dx+", "+dy+")");
        System.out.println("v = ("+vetorT[0]+", "+vetorT[1]+")");
    }

    public void translate3D(double vetor[], double dx, double dy, double dz) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da translação.
        double matrizT[][] = new double[4][4];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                if (i == 0 && j == 3) {
                    matrizT[i][j] = dx;
                } else if (i == 1 && j == 3) {
                    matrizT[i][j] = dy;
                } else if (i == 2 && j == 3) {
                    matrizT[i][j] = dz;
                } else if (i == j){
                    matrizT[i][j] = 1;
                } else {
                    matrizT[i][j] = 0;
                }
            }
        }

        //Transladando o vetor.
        double vetorT[] = new double[4];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                vetorT[i] += matrizT[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Transladado por (" + dx+", "+dy+", "+dz+")");
        System.out.println("v = ("+vetorT[0]+", "+vetorT[1]+", "+vetorT[2]+")");

    }

    // Rotação
    public void rotation2D(double vetor[], float ang) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = Math.cos(Math.toRadians(ang));
        matrizR[0][1] = -Math.sin(Math.toRadians(ang));
        matrizR[0][2] = 0;
        matrizR[1][0] = Math.sin(Math.toRadians(ang));
        matrizR[1][1] = Math.cos(Math.toRadians(ang));
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = 1;

        //Rotacionando o vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Rotacionado por um angulo de "+ ang + "°");
        System.out.printf("v = (%.3f, %.3f)%n", vetorR[0], vetorR[1]);
    }

    public void rotation3DX(double vetor[], float ang) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = 1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = Math.cos(Math.toRadians(ang));
        matrizR[1][2] = -Math.sin(Math.toRadians(ang));
        matrizR[2][0] = 0;
        matrizR[2][1] = Math.sin(Math.toRadians(ang));
        matrizR[2][2] = Math.cos(Math.toRadians(ang));

        //Rotacionando o vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Rotacionado por um angulo de "+ ang + "°");
        System.out.printf("v = (%1f, %.3f, %.3f)%n", vetorR[0], vetorR[1], vetorR[2]);
    }

    public void rotation3DY(double vetor[], float ang) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = Math.cos(Math.toRadians(ang));
        matrizR[0][1] = 0;
        matrizR[0][2] = -Math.sin(Math.toRadians(ang));
        matrizR[1][0] = 0;
        matrizR[1][1] = 1;
        matrizR[1][2] = 0;
        matrizR[2][0] = Math.sin(Math.toRadians(ang));;
        matrizR[2][1] = 0;
        matrizR[2][2] = Math.cos(Math.toRadians(ang));

        //Rotacionando o vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Rotacionado por um angulo de "+ ang + "°");
        System.out.printf("v = (%.3f, %1f, %.3f)%n", vetorR[0], vetorR[1], vetorR[2]);
    }

    public void rotation3DZ(double vetor[], float ang) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = Math.cos(Math.toRadians(ang));
        matrizR[0][1] = -Math.sin(Math.toRadians(ang));
        matrizR[0][2] = 0;
        matrizR[1][0] = Math.sin(Math.toRadians(ang));
        matrizR[1][1] = Math.cos(Math.toRadians(ang));
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = 1;

        //Rotacionando o vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Vetor v Rotacionado por um angulo de "+ ang + "°");
        System.out.printf("v = (%.3f, %.3f, %1f)%n", vetorR[0], vetorR[1], vetorR[2]);
    }

    // Reflexão
    public void reflexion2DX(double vetor[]) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = 1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = -1;
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = 1;

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Reflexão do vetor v em torno do eixo x ");
        System.out.println("v = ("+vetorR[0]+", "+vetor[1]+")");
    }

    public void reflexion2DY(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = -1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = 1;
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = 1;

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Reflexão do vetor v em torno do eixo y ");
        System.out.println("v = ("+vetorR[0]+", "+vetor[1]+")");
    }

    public void reflexion3DX(double vetor[]) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = 1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = -1;
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = -1;

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Reflexão do vetor v em torno do eixo x ");
        System.out.println("v = ("+vetorR[0]+", "+vetor[1]+", "+vetorR[2]+")");
    }

    public void reflexion3DY(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = -1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = 1;
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = -1;

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Reflexão do vetor v em torno do eixo y");
        System.out.println("v = ("+vetorR[0]+", "+vetor[1]+", "+vetorR[2]+")");
    }

    public void reflexion3DZ(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão.
        double matrizR[][] = new double[3][3];
        matrizR[0][0] = -1;
        matrizR[0][1] = 0;
        matrizR[0][2] = 0;
        matrizR[1][0] = 0;
        matrizR[1][1] = -1;
        matrizR[1][2] = 0;
        matrizR[2][0] = 0;
        matrizR[2][1] = 0;
        matrizR[2][2] = 1;

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }

        System.out.println("Reflexão do vetor v em torno do eixo z");
        System.out.println("v = ("+vetorR[0]+", "+vetor[1]+", "+vetorR[2]+")");
    }

    // Projeção

    public void projection2DX(double vetor[]) {

    }

    public void projection2DY(double vetor[]) {

    }

    public void projection3DX(double vetor[]) {

    }

    public void projection3DY(double vetor[]) {

    }

    public void projection3DZ(double vetor[]) {

    }

    // Cisalhamento (apenas em 2D)

    public void shearing(double vetor[], double kx, double ky) {

    }

}