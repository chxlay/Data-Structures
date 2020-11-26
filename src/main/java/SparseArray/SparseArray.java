package SparseArray;

/**
 * @author Alay
 * @create 2020-01-07 23:16
 */
public class SparseArray {

    /**
     * 二维数组转稀疏数组
     *
     * @param array
     * @return
     */
    public static int[][] array2SparseArr(int[][] array) {
        //得到二维数组的有效数值个数
        int count = 0;
        for (int[] row : array) {
            for (int data : row) {
                if (data > 0) {
                    count++;
                }
            }
        }
        int sparseArray[][] = new int[count + 1][3];
        //稀疏数组第一行记录 二维数组的布局和有效数字个数
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = count;

        //记录第几个非零的数据
        int spIndex = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    //记录二维数组的索引和数组
                    sparseArray[spIndex][0] = i;
                    sparseArray[spIndex][1] = j;
                    sparseArray[spIndex][2] = array[i][j];
                    spIndex++;
                }
            }
        }
        return sparseArray;
    }

    /**
     * 将稀疏数组恢复为二维数组
     *
     * @param sparseArr
     * @return
     */
    public static int[][] sparseArr2Array(int[][] sparseArr) {
        int row = sparseArr[0][0];
        int col = sparseArr[0][1];
        //创建二维数组
        int array[][] = new int[row][col];
        for (int i = 1; i < sparseArr.length; i++) {
            int rowIndex = sparseArr[i][0];
            int colIndex = sparseArr[i][1];
            int value = sparseArr[i][2];
            array[rowIndex][colIndex] = value;
        }
        return array;
    }

    /**
     * 打印二维数组
     *
     * @param chessArray
     */
    public static void print(int[][] chessArray) {
        //打印原始数组
        for (int[] rows : chessArray) {
            for (int data : rows) {
                System.err.printf("%d\t", data);
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        //创建一个棋盘二维数组 11* 11
        //0表示无子，1表示黑子，2表示蓝子
        int chessArray[][] = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        //打印二维数组
        System.out.println("===================这是原始的二维数组=====================");
        SparseArray.print(chessArray);

        int[][] sparseArr = SparseArray.array2SparseArr(chessArray);

        System.out.println("===================这是转换后的稀疏数组=====================");
        //打印稀疏数组
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }

        System.out.println("===================这是恢复后的二维数组=====================");
        //稀疏数组恢复二维数组
        int[][] array = SparseArray.sparseArr2Array(sparseArr);
        //打印恢复后的二维数组
        SparseArray.print(array);
    }

}