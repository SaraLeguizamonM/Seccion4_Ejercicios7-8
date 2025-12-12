package ejercicio8;
public class Main {
    public static void main(String[] args) {

        int[][] photo = { // photo 6x6
                { 1, 1 , 0 , 0 , 1 , 1 },
                { 0 , 1 , 0 , 0 , 1 , 1 },
                { 0 , 1 , 0 , 0 , 1 , 1 },
                { 1 , 0 , 0 , 0 , 0 , 1 },
                { 1 , 1 , 0 , 0 , 1 , 0 },
                { 1 , 1 , 0 , 0 , 1 , 1 },

        };

        System.out.println("Photo");
        System.out.println(" ");
        for (int i = 0; i < photo.length; i++) { // print original photo
            for (int j = 0; j < photo[i].length; j++) {
                System.out.printf(photo[i][j] + " ");  // print each element
            }
            System.out.println();
        }

        int[][] kernel = { // efect 3D
                { -2 , -1 , 0},
                { -1 , 1 , 1 },
                { 0 , 1 , 2 },
        };

        System.out.println(" ");
        System.out.println("Aplicador de Kernel");
        System.out.println(" ");
        int[][] convolution = convolution(photo, kernel); // call convolution method
        for (int i = 0; i < convolution.length; i++) {
            for (int j = 0; j < convolution.length; j++){
                System.out.printf(convolution[i][j]+" "); // print each element
            }
            System.out.println();
        }

    }

    // convolution method
    public static int[][] convolution(int[][] photo, int[][] kernel) {
        int exit;
        int tempK;
        int tempL;
        int[][] photoNew = new int[(photo.length - kernel.length) + 1][(photo.length - kernel.length) + 1]; // new matrix size calculation
        for (int i = 0; i < photoNew.length; i++) {
            for (int j = 0; j < photoNew.length; j++) { 
                exit = 0;
                tempK = 0;
                for (int k = i; k < i + 3; k++){ // kernel rows and columns
                    tempL = 0;
                    for (int l = j; l < j + 3; l++){ // kernel rows and columns
                        exit += photo[k][l] * kernel[tempK][tempL]; // convolution operation
                        tempL += 1; // move to next column in kernel
                    }
                    tempK += 1; // move to next row in kernel
                }
                photoNew[i][j] = exit; // assign convolution result to new matrix
            }
        }
        return photoNew;
    }
}