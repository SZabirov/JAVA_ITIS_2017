public class TestMain {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.flavour = "Яблочный";

        Soda soda = new Soda();

        Waiter waiter = new Waiter();
        waiter.serve(juice);
        waiter.serve(soda);

        Drink drink = new Drink();

//        Juice juice = new Juice();
//        juice.cool(10);
//        System.out.println(juice.temperature);
    }
}
