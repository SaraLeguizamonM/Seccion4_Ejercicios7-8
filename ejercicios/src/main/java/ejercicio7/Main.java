package ejercicio7;

public class Main {
    public static void main(String[] args) {
        String[][] cat = { // ñato - Matrix 11x11
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
        System.out.println("Normal - photo"); // print original photo
        System.out.println(" ");
        for (int i = 0; i < cat.length; i++) { 
            for (int j = 0; j < cat[i].length; j++){
                System.out.printf(cat[i][j]); // print each element
            }
            System.out.println();
        }


        String[][] catRotate = rotate(cat); // call rotate method
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Rotate - photo"); // print rotated photo
        System.out.println(" ");
        for (int i = 0; i < catRotate.length; i++) {
            for (int j = 0; j < catRotate[i].length; j++){
                System.out.printf(catRotate[i][j]); // print each element
            }
            System.out.println();
        }

        String[][] catFlip = flip(cat); // call flip method
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Flip vertical - photo"); // print flipped photo
        System.out.println(" ");
        for (int i = 0; i < catFlip.length; i++) {
            for (int j = 0; j < catFlip[i].length; j++){
                System.out.printf(catFlip[i][j]); // print each element
            }
            System.out.println();
        }

        String[][] catTrans = transpose(cat); // call transpose method
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Transpose - photo"); // print transposed photo
        System.out.println(" ");
        for (int i = 0; i < catTrans.length; i++) {
            for (int j = 0; j < catTrans[i].length; j++){
                System.out.printf(catTrans[i][j]); // print each element
            }
            System.out.println();
        }
    }

    // Method to rotate the matrix 90 degrees 

    public static String[][] rotate(String[][] catRotate){ // rotate method
        int n = catRotate.length;
        String[][] rotate = new String[n][n]; // new matrix to store rotated values
        for (int i = 0; i < n; i++){ 
            for (int j = 0; j < n; j++){
                rotate[j*-1+catRotate.length-1][i] = catRotate[i][j]; // rotate logic and assign to new matrix 
            }
        }
        return rotate;
    }

    // Method to flip the matrix vertically

    public static String[][] flip(String[][] catFlip){ // flip method
        int n = catFlip.length;
        String[][] flip = new String[n][n]; // new matrix to store flipped values
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                flip[i*-1+catFlip.length-1][j] = catFlip[i][j]; // flip logic and assign to new matrix - invert rows

            }
        }
        return flip;
    }

    // Method to transpose the matrix

    public static String[][] transpose(String[][] catTrans){ // transpose method
        int n = catTrans.length;
        String[][] trans = new String[n][n]; // new matrix to store transposed values
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                trans[j][i] = catTrans[i][j]; // transpose logic and assign to new matrix - swap rows and columns
            }
        }
        return trans;
    }

}