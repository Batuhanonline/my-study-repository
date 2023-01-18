import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MineSweeper {

    String[][] mineSweeper;
    int[] mine;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int row, col;
    boolean isWin = false;

    MineSweeper(int row, int col){
        this.col = col;
        this.row = row;
        this.mineSweeper = new String[row][col];

        for (String[] r : mineSweeper) {
            Arrays.fill(r, "- ");
        }

        this.mine = new int[((row*col) / 4) + 1];

        for (int i = 0; i <= ((row*col) / 4); i++){
            this.mine[i] = randomMine(this.mine, (col*row));
        }

    }

    int randomMine(int[] mine, int range){
        int isMine = random.nextInt(range);
        while (isThere(mine, isMine)){
            isMine = random.nextInt(range);
        }
        return isMine;
    }

    boolean isThere(int[] mine, int num){
        for (int j : mine)
            if (j == num) {
                return true;
            }
        return false;
    }

    boolean isThere(String[][] mine, String str){
        for (String[] col: mine){
            for (String row: col){
                if (row.equals(str)){
                    return false;
                }
            }
        }
        return true;
    }

    String control(int col, int row){
        int cont = 0;
        //sol
        if (isThere(this.mine, (this.row * (row - 1) + col - 2))){
            cont++;
        }
        //sağ
        if (isThere(this.mine, (this.row * (row - 1) + col))){
            cont++;
        }
        //üst
        if (isThere(this.mine, (this.row * (row - 2) + col - 2))){
            cont++;
        }
        //alt
        if (isThere(this.mine, (this.row * (row ) + col - 2))){
            cont++;
        }
        //üst - sol
        if (isThere(this.mine, (this.row * (row - 2) + col - 2))){
            cont++;
        }
        //alt - sol
        if (isThere(this.mine, (this.row * (row) + col - 2))){
            cont++;
        }
        //üst - sağ
        if (isThere(this.mine, (this.row * (row - 2) + col))){
            cont++;
        }
        //alt sağ
        if (isThere(this.mine, (this.row * (row) + col))){
            cont++;
        }
        return String.valueOf(cont);
    }

    void run(){
        System.out.println(Arrays.toString(mine));
        int selectCol, selectRow;
        while (!this.isWin){

            for (String[] r : mineSweeper) {
                for (String s : r) {
                    System.out.print(s);
                }
                System.out.println();
            }

            System.out.print("Satır giriniz: ");
            selectRow = scanner.nextInt();
            System.out.print("Sütun giriniz: ");
            selectCol = scanner.nextInt();
            System.out.println("=================");


            if (isThere(this.mine, (((selectRow - 1)*(this.row -1)) + selectCol - 1))){
                System.out.println("Oyunu kaybettiniz.");
                this.isWin = true;
                break;
            } else {
                this.mineSweeper[selectRow - 1][selectCol - 1] = control(selectRow, selectCol);
            }

            if (isThere(this.mineSweeper, "- ")){
                System.out.println("Tebrikler oyunu kazandınız.");
                break;
            }
        }
    }


}
