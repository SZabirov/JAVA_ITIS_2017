public class IntArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 45, 768, 8};

        int sum = 0;

        //вычисляем сумму массива
        for (int i = 0; i < 5; i++){
            sum = sum + array[i];
            //аналогично: sum += array[i];
        }
        System.out.println(sum);
    }
}
