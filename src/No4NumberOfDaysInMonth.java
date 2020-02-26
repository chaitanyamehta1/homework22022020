// Number of Days in Month

/* please change parameters in the main method to run and test the
programme. */

public class No4NumberOfDaysInMonth {


    public static void main(String[] args) {

        isLeapYear(2021);
        getDaysInMonth(2, 1);
    }

    public static void isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            switch (year % 4) {
                case 0:
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is a Leap year ," + true);
                        } else
                            System.out.println(year + " is not a Leap year, " + false);
                    } else
                        System.out.println(year + " is a Leap year, " + true);
                    break;
                default:
                    System.out.println(year + " is not a leap year, " + false);
                    break;
            }
        } else
            System.out.println(false + ", Invalid input");
    }

    public static void getDaysInMonth(int month, int year) {

        int numDays = 0;
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {

            switch (month) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    numDays = 30;
                    break;

                case 2:
                    if (((year % 4 == 0) &&
                            !(year % 100 == 0))
                            || (year % 400 == 0))
                        numDays = 29;
                    else
                        numDays = 28;
                    break;

                default:
                    System.out.println("-1, Invalid request");
                    break;
            }
        }else System.out.println("-1, Invalid request" );

        System.out.println("Number of days in the month = " + numDays);

}

}
