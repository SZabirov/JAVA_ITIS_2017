public class Main {
    public static void main(String[] args) {
        open(0, "");
    }

    static void open(int i, String flavour) {
        if (i == 0){
            System.out.println("Пшшшш. Газ. вода открыта");
        }
        if (i == 1){
            System.out.println("Пшшшшшш!!! Банка открыта, почти ничего не разлилось:)");
        }
        if (i == 2){
            System.out.println("Сок со вкусом " + flavour + " открыт!");
        }
    }
}










