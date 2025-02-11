package academy.devdojo.maratona.java.introducao.Aulas08;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias
        int[][] dias = new int[3][3]; //Ctrl + d = duplica linha
        dias[0][0] = 31;
        dias[0][1] = 6;
        dias[0][2] = 27;

        dias[1][0] = 13;
        dias[1][1] = 5;
        dias[1][2] = 29;

        dias[2][0] = 3;
        dias[2][1] = 21;
        dias[2][2] = 8;

        for(int i = 0; i < dias.length; i++) {
            for(int j = 0; j < dias[0].length ; j++) {
                System.out.println(dias[i][j]);
                    }
                }
        for (int[] arrBase:dias){
            for(int num:arrBase){
                System.out.println(num);
            }
        }
            }

    }

