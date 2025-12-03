package lr4;

public class Example7 {
    public static void main(String[] args) {
         int rows = 9;
         int cols = 9;

         int [][] array = new int [rows][cols];
         int num = 1;

         for (int i = 0; i < rows; i++) {
             if (i % 2 == 0) {
                 for (int j = 0; j < cols; j++) {
                     array[i][j] = num++;
                 }
             } else {
                 for (int j = cols - 1; j >= 0; j--) {
                     array[i][j] = num++;
                 }
             }
         }
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 System.out.printf("%3d ", array[i][j]);
             }
             System.out.println();
        }
    }
}
/* 7. Напишите программу, в которой создается двумерный числовой массив
 и этот массив заполняется «змейкой»:
сначала первая строка (слева направо),
затем последний столбец (сверху вниз),
вторая строка (справа налево) и так далее, как показано на рисунке */