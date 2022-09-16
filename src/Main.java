public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 0, 0, 1, 5, 7, 0, 9, 0},
                {0, 0, 6, 2, 0, 0, 0, 5, 0},
                {0, 0, 0, 3, 9, 0, 0, 0, 0},
                {0, 8, 0, 6, 7, 0, 0, 3, 1},
                {0, 5, 0, 0, 0, 0, 0, 0, 9},
                {6, 0, 3, 0, 0, 9, 0, 2, 0},
                {3, 0, 0, 4, 1, 0, 0, 0, 0},
                {0, 0, 9, 0, 6, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 7, 4},
        };
        getSolve(matrix);
        printMatrix(matrix);
    }
    static boolean isPresent(int number, int[] array){
        boolean res=false;
        for (int j : array) {
            if (j == number) {
                res = true;
                break;
            }
        }
        return res;
    }
    static int[] getArrayUniqueValues(int[] arrayValuesLines, int[] arrayValuesSubmatrix){
        int[] resultLine={0,0,0,0,0,0,0,0,0};
        int counter =0;

        for (int i = 0; i <resultLine.length ; i++) {
            for (int valuesSubmatrix : arrayValuesSubmatrix) {
                if ((valuesSubmatrix != 0) && (!isPresent(valuesSubmatrix, resultLine))) {
                    resultLine[counter] = valuesSubmatrix;
                    counter++;
                }
            }
            for (int arrayValuesLine : arrayValuesLines) {
                if ((arrayValuesLine != 0) && (!isPresent(arrayValuesLine, resultLine))) {
                    resultLine[counter] = arrayValuesLine;
                    counter++;
                }
            }
        }
        return resultLine;
    }
    static int getCountsEmptyCells(int[][] matrix){
        int count=0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == 0) count++;
            }
        }
        return count;
    }
    static void getSolve(int[][] matrix) {
        while (getCountsEmptyCells(matrix)>0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 0) {
                        int[] numbers = getRemainNumbers(getNumbersSubmatrix(matrix, i, j), getNumbersLines(matrix, i, j));
                        if (getCountRemainNumbers(numbers) == 1) {
                            matrix[i][j] = findValueByLine(numbers);
                        }
                    }
                }
            }
        }
    }
    static int findValueByLine(int[] numbersLine) {
        int number = 0;
        for (int j : numbersLine) {
            if (j > 0) {
                number = j;
                break;
            }
        }
        return number;
    }
    static int getCountRemainNumbers(int[] remainNumbers){
        int count=0;
        for (int remainNumber : remainNumbers) {
            if (remainNumber != 0) {
                count++;
            }
        }
        return count;
    }
    static int[] getRemainNumbers(int[] subMatrixNumbers, int[] linesNumbers){
        int[] set ={1,2,3,4,5,6,7,8,9};
        int[] numbers=getArrayUniqueValues(linesNumbers,subMatrixNumbers);
        for (int i = 0; i < set.length; i++) {
            for (int number : numbers) {
                if (set[i] == number) {
                    set[i] = 0;
                    break;
                }
            }
        }
        return set;
    }
    static int[] getNumbersSubmatrix(int[][] matrix, int row, int column){
        int[] remainNumbers= {0,0,0,0,0,0,0,0,0};
        int counter=0;
        int borderSubmatrixRowMin=0,borderSubmatrixRowMax=0;
        int borderSubmatrixColumnMin=0,borderSubmatrixColumnMax=0;
        switch (row){
            case 0,1,2 -> {
                borderSubmatrixRowMin=0; borderSubmatrixRowMax=3;
            }
            case 3,4,5 -> {
                borderSubmatrixRowMin=3; borderSubmatrixRowMax=6;
            }
            case 6,7,8 -> {
                borderSubmatrixRowMin=6; borderSubmatrixRowMax=9;
            }
        }
        switch (column){
            case 0,1,2 -> {
                borderSubmatrixColumnMin=0; borderSubmatrixColumnMax=3;
            }
            case 3,4,5 -> {
                borderSubmatrixColumnMin=3; borderSubmatrixColumnMax=6;
            }
            case 6,7,8 -> {
                borderSubmatrixColumnMin=6; borderSubmatrixColumnMax=9;
            }
        }
        for (int i = borderSubmatrixRowMin; i < borderSubmatrixRowMax ; i++) {
            for (int j = borderSubmatrixColumnMin; j < borderSubmatrixColumnMax; j++) {
                if(matrix[i][j]>0){
                    remainNumbers[counter]=matrix[i][j];
                    counter++;
                }
            }
        }
        return remainNumbers;
    }
    static int[] getNumbersLines(int[][] matrix, int row, int column){
        int[] columnLine = {0,0,0,0,0,0,0,0,0};
        int[] rowLine= matrix[row];
        int counter=0;
        for (int i = 0; i < matrix[row].length ; i++) {
            columnLine[counter]=matrix[i][column];
            counter++;
        }
        return getArrayUniqueValues(rowLine,columnLine);
    }
    static void printMatrix(int[][] matrix){
        System.out.println();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}