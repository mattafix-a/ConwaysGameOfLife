public class Field {
    private int sizeRow;
    private int sizeCol;
    private char[][] arrayField = new char[sizeRow + 1][sizeCol + 1];

    public int getSizeRow() {
        return sizeRow;
    }

    public void setSizeRow(int sizeRow) {
        this.sizeRow = sizeRow;
    }

    public int getSizeCol() {
        return sizeCol;
    }

    public void setSizeCol(int sizeCol) {
        this.sizeCol = sizeCol;
    }

    public void createField(){
        for (int i = 0; i < sizeRow; ++i) {
            for (int j = 0; j < sizeCol; ++j) {
                if (i == 0 || i == sizeRow - 1) {
                    arrayField[sizeRow][sizeCol] = '-';
                }
                if (j == 0 || j == sizeCol - 1) {
                    arrayField[sizeRow][sizeCol] = '|';
                }
            }
        }
        for (int i = 0; i < sizeRow; ++i) {
            for (int j = 0; j < sizeCol; ++j) {
                System.out.print(arrayField[i][j]);
            }
            System.out.println();
        }
        System.out.println("Error");
    }
}