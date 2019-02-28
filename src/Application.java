import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Field field = new Field();
        Dot dot = new Dot();
        System.out.println("Введите количество строк игрового поля:");
        field.setSizeRow(sc.nextInt());
        System.out.println("Введите количество столбцов игрового поля:");
        field.setSizeCol(sc.nextInt());
        field.createField();
    }
}
