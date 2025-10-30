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

        // Criando a Matriz da translação com coordenadas homogeneas.
        double matrizT[][] = {
                {1, 0, dx},
                {0, 1, dy},
                {0, 0,  1}
        };

        //Transladando o vetor.
        double vetorT[] = new double[3];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                vetorT[i] += matrizT[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado.
        System.out.println("Vetor v Transladado por (" + dx + ", " + dy + ")");
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

        // Criando a Matriz da translação com coordenadas homogeneas.
        double matrizT[][] = {
                {1, 0, 0, dx},
                {0, 1, 0, dy},
                {0, 0, 1, dz},
                {0, 0, 0,  1}
        };

        //Transladando o vetor.
        double vetorT[] = new double[4];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                vetorT[i] += matrizT[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
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

        // Criando a Matriz da Rotação com coordenadas homogeneas.
        double cosAng = Math.cos(Math.toRadians(ang));
        double senAng = Math.sin(Math.toRadians(ang));
        double matrizR[][] = {
                {cosAng, -senAng, 0},
                {senAng, cosAng,  0},
                {0,        0,     1}
        };

        //Rotacionando o vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.printf("Vetor v rotacionado no eixo x por um angulo de %.0f°%n", ang);
        System.out.printf("v = (%.3f, %.3f)%n", vetorR[0], vetorR[1]);
    }

    public void rotation3DX(double vetor[], float ang) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação com coordenadas homogeneas.
        double cosAng = Math.cos(Math.toRadians(ang));
        double senAng = Math.sin(Math.toRadians(ang));
        double matrizR[][] = {
                {1,    0,       0,    0},
                {0, cosAng,  -senAng, 0},
                {0, senAng,   cosAng, 0},
                {0,    0,       0,    1}
        };

        //Rotacionando o vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.printf("Vetor v rotacionado no eixo x por um angulo de %.0f°%n", ang);
        System.out.printf("v = (%.0f, %.3f, %.3f)%n", vetorR[0], vetorR[1], vetorR[2]);
    }

    public void rotation3DY(double vetor[], float ang) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação com coordenadas homogeneas.
        double cosAng = Math.cos(Math.toRadians(ang));
        double senAng = Math.sin(Math.toRadians(ang));
        double matrizR[][] = {
                {cosAng, 0, -senAng, 0},
                {  0,    1,    0,    0},
                {senAng, 0,  cosAng, 0},
                {0,      0,    0,    1}
        };

        //Rotacionando o vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.printf("Vetor v rotacionado no eixo x por um angulo de %.0f°%n", ang);
        System.out.printf("v = (%.3f, %.0f, %.3f)%n", vetorR[0], vetorR[1], vetorR[2]);
    }

    public void rotation3DZ(double vetor[], float ang) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Rotação com coordenadas homogeneas.
        double cosAng = Math.cos(Math.toRadians(ang));
        double senAng = Math.sin(Math.toRadians(ang));
        double matrizR[][] = {
                {cosAng, -senAng, 0, 0},
                {senAng,  cosAng, 0, 0},
                {  0,        0,   1, 0},
                {  0,        0,   0, 1}
        };

        //Rotacionando o vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.printf("Vetor v rotacionado no eixo x por um angulo de %.0f°%n", ang);
        System.out.printf("v = (%.3f, %.3f, %.0f)%n", vetorR[0], vetorR[1], vetorR[2]);
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
        // Criando a Matriz da Reflexão com coordenadas homogeneas.
        double matrizR[][] = {
                {1,  0, 0},
                {0, -1, 0},
                {0,  0, 1}
        };

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Reflexão em R² do vetor v em torno do eixo x ");
        System.out.println("v = ("+vetorR[0]+", "+vetorR[1]+")");
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

        // Criando a Matriz da Reflexão com coordenadas homogeneas.
        double matrizR[][] = {
                {-1, 0, 0},
                { 0, 1, 0},
                { 0, 0, 1}
        };

        //Reflexão do vetor.
        double vetorR[] = new double[3];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Reflexão em R² do vetor v em torno do eixo y ");
        System.out.println("v = ("+vetorR[0]+", "+vetorR[1]+")");
    }

    public void reflexion3DX(double vetor[]) {

        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão com coordenadas homogeneas.
        double matrizR[][] = {
                {1,  0, 0, 0},
                {0, -1, 0, 0},
                {0, 0, -1, 0},
                {0, 0,  0, 1}
        };

        //Reflexão do vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Reflexão em R³ do vetor v em torno do eixo x ");
        System.out.println("v = ("+vetorR[0]+", "+vetorR[1]+", "+vetorR[2]+")");
    }

    public void reflexion3DY(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão com coordenadas homogeneas.
        double matrizR[][] = {
                {-1, 0, 0, 0},
                {0,  1, 0, 0},
                {0, 0, -1, 0},
                {0, 0,  0, 1}
        };

        //Reflexão do vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Reflexão em R³ do vetor v em torno do eixo y");
        System.out.println("v = ("+vetorR[0]+", "+vetorR[1]+", "+vetorR[2]+")");
    }

    public void reflexion3DZ(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Reflexão com coordenadas homogeneas.
        double matrizR[][] = {
                {-1, 0, 0, 0},
                {0, -1, 0, 0},
                {0,  0, 1, 0},
                {0,  0, 0, 1}
        };

        //Reflexão do vetor.
        double vetorR[] = new double[4];
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR.length; j++) {
                vetorR[i] += matrizR[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Reflexão em R³ do vetor v em torno do eixo z");
        System.out.println("v = ("+vetorR[0]+", "+vetorR[1]+", "+vetorR[2]+")");
    }

    // Projeção

    public void projection2DX(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];
        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Projeção com coordenadas homogeneas.
        double matrizP[][] = {
                {1, 0, 0} ,
                {0, 0, 0} ,
                {0, 0, 1}
        };

        //Projeção do vetor.
        double vetorP[] = new double[3];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                vetorP[i] += matrizP[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Projeção em R² do vetor v sobre o eixo x");
        System.out.println("v = (" + vetorP[0] + ", "+vetorP[1]+")");

    }

    public void projection2DY(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Projeção com coordenadas homogeneas.
        double matrizP[][] = {
                {0, 0, 0} ,
                {0, 1, 0} ,
                {0, 0, 1}
        };

        //Projeção do vetor.
        double vetorP[] = new double[3];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                vetorP[i] += matrizP[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Projeção em R² do vetor v sobre o eixo y");
        System.out.println("v = (" + vetorP[0] + ", "+vetorP[1]+")");
    }

    public void projection3DX(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];
        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Projeção com coordenadas homogeneas.
        double matrizP[][] = {
                {1, 0, 0, 0} ,
                {0, 0, 0, 0} ,
                {0, 0, 0, 0} ,
                {0, 0, 0, 1}
        };

        //Projeção do vetor.
        double vetorP[] = new double[4];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                vetorP[i] += matrizP[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Projeção em R³ do vetor v sobre o eixo x");
        System.out.println("v = (" + vetorP[0] + ", "+vetorP[1]+ ", "+vetorP[2]+")");
    }

    public void projection3DY(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Projeção com coordenadas homogeneas.
        double matrizP[][] = {
                {0, 0, 0, 0} ,
                {0, 1, 0, 0} ,
                {0, 0, 0, 0} ,
                {0, 0, 0, 1}
        };

        //Projeção do vetor.
        double vetorP[] = new double[4];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                vetorP[i] += matrizP[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Projeção em R³ do vetor v sobre o eixo y");
        System.out.println("v = (" + vetorP[0] + ", "+vetorP[1]+ ", "+vetorP[2]+")");
    }

    public void projection3DZ(double vetor[]) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[4][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz da Projeção com coordenadas homogeneas.
        double matrizP[][] = {
                {0, 0, 0, 0} ,
                {0, 0, 0, 0} ,
                {0, 0, 1, 0} ,
                {0, 0, 0, 1}
        };

        //Projeção do vetor.
        double vetorP[] = new double[4];
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {
                vetorP[i] += matrizP[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Projeção em R³ do vetor v sobre o eixo z");
        System.out.println("v = (" + vetorP[0] + ", "+vetorP[1]+ ", "+vetorP[2]+")");
    }

    // Cisalhamento (apenas em 2D)

    public void shearing(double vetor[], double kx, double ky) {
        // Transformando o vetor do parametro em uma matriz/vetor coluna.
        double vetorColuna[][] = new double[3][1];

        for (int i = 0; i <= vetor.length; i++) {
            if (i == vetor.length) {
                vetorColuna[i][0] = 1;
            } else {
                vetorColuna[i][0] = vetor[i];
            }
        }

        // Criando a Matriz do Cisalhamento com coordenadas homogeneas.
        double matrizC[][] = {
                {1, kx, 0},
                {ky, 1, 0},
                {0,  0, 1}
        };

        //Cisalhamento do vetor.
        double vetorP[] = new double[4];
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                vetorP[i] += matrizC[i][j] * vetorColuna[j][0];
            }
        }
        //Imprimindo o resultado
        System.out.println("Cisalhamento em R² do vetor v");
        System.out.printf("v = (%.0f, %.0f)", vetorP[0], vetorP[1]);
    }
}