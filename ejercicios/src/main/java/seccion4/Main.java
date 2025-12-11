package seccion4;

public class Main {
    public static void main(String[] args) {
        String[][] cat = { // ñato
                {"11","11","11","11","11","11","11","11","11","11","11"},
                {"11","11","00","11","11","11","00","11","11","11","11"},
                {"11","11","00","00","11","00","00","11","11","11","11"},
                {"11","00","00","00","00","00","00","00","11","11","11"},
                {"11","11","00","00","00","00","00","11","11","00","11"},
                {"11","11","11","00","00","00","11","11","00","11","11"},
                {"11","11","11","00","00","00","00","11","00","11","11"},
                {"11","11","11","00","00","00","00","11","11","00","11"},
                {"11","11","11","00","00","00","00","00","11","00","11"},
                {"11","11","00","00","00","00","00","00","00","11","11"},
                {"11","11","11","11","11","11","11","11","11","11","11"},
        };
        for (int i = 0; i < cat.length; i++) {
            for (int j = 0; j < cat[i].length; j++){
                System.out.printf(cat[i][j]);
            }
            System.out.println();
        }

        String[][] catRotate = rotate(cat);
        System.out.println(" ");
        for (int i = 0; i < catRotate.length; i++) {
            for (int j = 0; j < catRotate[i].length; j++){
                System.out.printf(catRotate[i][j]);
            }
            System.out.println();
        }

        String[][] catTrans = transpose(cat);
        System.out.println(" ");
        for (int i = 0; i < catTrans.length; i++) {
            for (int j = 0; j < catTrans[i].length; j++){
                System.out.printf(catTrans[i][j]);
            }
            System.out.println();
        }



    }

    public static String[][] rotate(String[][] catRotate){
        int n = catRotate.length;
        String[][] rotate = new String[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                rotate[j*-1+catRotate.length-1][i] = catRotate[i][j];
            }
        }
        return rotate;
    }


    public static String[][] transpose(String[][] catTrans){
        int n = catTrans.length;
        String[][] trans = new String[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                trans[j][i] = catTrans[i][j];
            }
        }
        return trans;
    }

}