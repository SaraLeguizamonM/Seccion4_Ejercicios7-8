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

        String[][] catTrans = transpose(cat);
        System.out.println(" ");
        for (int i = 0; i < catTrans.length; i++) {
            for (int j = 0; j < catTrans[i].length; j++){
                System.out.printf(catTrans[i][j]);
            }
            System.out.println();
        }

    }


    public static String[][] transpose(String[][] rotate){
        int n = rotate.length;
        String[][] trans = new String[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                trans[j][i] = rotate[i][j];
            }
        }
        return trans;
    }
    
}