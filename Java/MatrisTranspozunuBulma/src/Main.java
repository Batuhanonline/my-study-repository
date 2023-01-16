public class Main {
    public static void main(String[] args) {
        int[][] matris = {{2, 3, 4},
                {5, 6, 4}};

        System.out.println("Matris: ");
        for (int[] row: matris){
            for (int col: row){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze: ");
        for (int i = 0; i < matris[0].length; i++){
            System.out.println(matris[0][i] + " " + matris[1][i]);
        }

    }
}