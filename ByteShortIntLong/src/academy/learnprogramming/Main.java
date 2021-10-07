package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        /* Int part */
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647; // we can use to read easier

        /* Byte part */

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        /*Short part */
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        /* long part */
        long myLongValue = 100L; //l or L to indicate it is long, 2^32
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_342L; // without L it treats him as int and shows error
        System.out.println(bigLongLiteralValue);

        short bitShortLiteralValue = 32767;

        /* Arithmetics and casting */ //Java is using int as default
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        /* Challenge */
        byte myChallengeByteNumber = 101;
        short myChallengeShortNumber = 25968;
        int myChallengeIntNumber = 826957;
      //  long myChallengeLongNumber = (long)(50000 + 10 * (myChallengeByteNumber + myChallengeShortNumber + myChallengeIntNumber));
        long longTotal = 50000L + 10L +
                (myChallengeByteNumber + myChallengeShortNumber + myChallengeIntNumber);
        System.out.println(longTotal);
    }
}
