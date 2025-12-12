public class Main {
    public static void main(String[] args) {

        int[][] photo = {
                { 1, 1 , 0 , 0 , 1 , 1 },
                { 0 , 1 , 0 , 0 , 1 , 1 },
                { 0 , 1 , 0 , 0 , 1 , 1 },
                { 1 , 0 , 0 , 0 , 0 , 1 },
                { 1 , 1 , 0 , 0 , 1 , 0 },
                { 1 , 1 , 0 , 0 , 1 , 1 },

        };

        int[][] kernel = { // efect 3D
                { -2 , -1 , 0},
                { -1 , 1 , 1 },
                { 0 , 1 , 2 },
        };

        int[][] convolution = convolution(photo, kernel);
        for (int i = 0; i < convolution.length; i++) {
            for (int j = 0; j < convolution.length; j++){
                System.out.printf(convolution[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] convolution(int[][] photo, int[][] kernel) {
        int exit;
        int tempK;
        int tempL;
        int[][] photoNew = new int[(photo.length - kernel.length) + 1][(photo.length - kernel.length) + 1];
        for (int i = 0; i < photoNew.length; i++) {
            for (int j = 0; j < photoNew.length; j++) {
                exit = 0;
                tempK = 0;
                tempL = 0;
                for (int k = i; k < i + 3; k++){
                    for (int l = j; l < j + 3; l++){
                        exit += photo[k][l] * kernel[tempK][tempL];
                        tempL += 1;
                    }
                    tempK += 1;
                }
                photoNew[i][j] = exit;
            }
        }
        return photoNew;
    }
}