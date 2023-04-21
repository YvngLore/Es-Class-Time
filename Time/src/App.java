public class App {
    public static void main(String[] args) throws Exception {
        Time t1 = new Time(12,45,51);
        Time t2 = new Time(3600);
        Time t3 = new Time(238596);
        Time t4 = new Time(12,76,3);

        t1.addSecondi(10);
        System.out.println(t2.toString());
        System.out.println(t1.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
    }
}
