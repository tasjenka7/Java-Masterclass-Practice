public class Main {

    public static void main(String[] args) {

        System.out.println(LeapYear.isLeapYear(2012));

        System.out.println("Not leap:");
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2600));

        System.out.println("Leap:");
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));

        System.out.println("Corner cases:");
        System.out.println(LeapYear.isLeapYear(-2522));
        System.out.println(LeapYear.isLeapYear(0));
        System.out.println(LeapYear.isLeapYear(10000));
        System.out.println(LeapYear.isLeapYear(40000));






    }

}
