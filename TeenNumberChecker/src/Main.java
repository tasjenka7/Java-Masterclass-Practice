public class Main {

    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(15));
        System.out.println(TeenNumberChecker.isTeen(19));
        System.out.println(TeenNumberChecker.isTeen(269));

        System.out.println("===================--");

        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println(TeenNumberChecker.hasTeen(12,15,17));
    }

}
