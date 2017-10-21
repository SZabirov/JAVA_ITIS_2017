public class Juice extends Drink {

    String flavour;

    @Override
    void open() {
        System.out.println("Сок со вкусом " + flavour + " открыт!");
    }

    void cool(int temperature){
        super.temperature = temperature;
    }
}








