
import java.util.Random;

public class CovidNinteenProgram {
   public static void main(String[] args) {
      Random random = new Random();
      int[][] patientData = new int[12][];

      int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

      for (int month = 0; month < 12; month++) {
         patientData[month] = new int[daysInMonth[month]];

         for (int day = 0; day < daysInMonth[month]; day++) {
            int patientCount = random.nextInt(501);
            patientData[month][day] = patientCount;
         }
      }

      // for (int month = 0; month < 12; month++) {
      // String monthName = getMonthName(month + 1);
      // System.out.println("Patient data for " + monthName + ":");
      // for (int day = 0; day < patientData[month].length; day++) {
      // System.out.println("Day " + (day + 1) + ": " + patientData[month][day] + "
      // patients");
      // }
      // System.out.println();
      // }

      // I. Print the number of patients recorded on the following dates
      System.out.println("\nFor I Question ======================================\n");
      printPatientsOnDates(patientData, "2021-01-17");
      printPatientsOnDates(patientData, "2021-03-26");
      printPatientsOnDates(patientData, "2021-05-01");
      printPatientsOnDates(patientData, "2021-07-21");
      printPatientsOnDates(patientData, "2021-11-30");

      // II. Modify the array by entering the correct data.
      System.out.println("\nFor II Question =====================================\n");

      System.out.println("\tExisting values for the dates ===============\n");
      printPatientsOnDates(patientData, "2021-02-16");
      printPatientsOnDates(patientData, "2021-06-05");
      printPatientsOnDates(patientData, "2021-09-09");
      printPatientsOnDates(patientData, "2021-10-01");
      printPatientsOnDates(patientData, "2021-12-25");

      updatePatientData(patientData, "2021-02-16", 78);
      updatePatientData(patientData, "2021-06-05", 202);
      updatePatientData(patientData, "2021-09-09", 181);
      updatePatientData(patientData, "2021-10-01", 178);
      updatePatientData(patientData, "2021-12-25", 84);

      System.out.println("\n\tUpdated values for the dates ================\n");
      printPatientsOnDates(patientData, "2021-02-16");
      printPatientsOnDates(patientData, "2021-06-05");
      printPatientsOnDates(patientData, "2021-09-09");
      printPatientsOnDates(patientData, "2021-10-01");
      printPatientsOnDates(patientData, "2021-12-25");

      // III. Print the patient report in the first 10 days of 2021
      System.out.println("\nFor III Question ====================================\n");
      printPatientReport(patientData, 2021, 1, 1, 10);

      /// IV. Total number of patients reported in the first week of 2021
      System.out.println("\nFor IV Question ====================================\n");
      int totalPatients = calculateTotalPatients(patientData, 2021, 1, 1, 7);
      System.out.println("\tTotal patients reported in the first week of 2021\t: " + totalPatients + " patients");

      // V. Total patient count reported in the first 10 days of March
      System.out.println("\nFor V Question ====================================\n");
      int totalPatientsMarch = calculateTotalPatients(patientData, 2021, 3, 1, 10);
      System.out
            .println("\tTotal patients reported in the first 10 days of March\t: " + totalPatientsMarch + " patients");

      // VI. Total patients for the last 10 days of October
      System.out.println("\nFor VI Question ====================================\n");
      int last10DaysOfOctober = calculateTotalPatients(patientData, 2021, 10, daysInMonth[9] - 9, 10);
      System.out
            .println(
                  "\tTotal patients reported in the last 10 days of October\t: " + last10DaysOfOctober + " patients");

      // VII. Total patients for June
      System.out.println("\nFor VII Question ====================================\n");
      int totalPatientsForJune = calculateTotalPatients(patientData, 2021, 6, 1, daysInMonth[5]);
      System.out.println("\tTotal patients reported in June\t\t\t\t: " + totalPatientsForJune + " patients");

      // VIII. Number of days in which more than 100 patients reported in January
      System.out.println("\nFor VIII Question ====================================\n");
      int daysWithMoreThan100Patients = countDaysWithPatients(patientData, 2021, 1, 100);
      System.out.println("\tNumber of days in January with more than 100 patients\t: " + daysWithMoreThan100Patients);

      // IX. Number of patients reported on the first day of each month with the
      // month's name
      System.out.println("\nFor IX Question ====================================\n");
      printPatientsOnFirstDay(patientData);

      // X. number of patients reported on the last day of each month with the month's
      // name
      System.out.println("\nFor X Question ====================================\n");
      printPatientsOnLastDay(patientData);

      // XI. Total number of patients reported on the first 10 days of each month
      System.out.println("\nFor XI Question ====================================\n");
      printTotalPatientsFirst10Days(patientData);

      // XII. Average number of patients reported on the 15th of every month
      System.out.println("\nFor XII Question ====================================\n");
      double averagePatientsOn15th = calculateAveragePatientsOn15th(patientData);
      System.out.println(
            "\tAverage patients reported on the 15th of every month\t: " + averagePatientsOn15th + " patients");

      // XIII. Total number of patients reported in 2021
      System.out.println("\nFor XIII Question ====================================\n");
      int totalPatients2021 = calculateTotalPatients(patientData);
      System.out.println("\tTotal patients reported in 2021\t\t\t\t: " + totalPatients2021 + " patients");

      // XIV. Find the average number of patients reported in one day in 2021
      System.out.println("\nFor XIV Question ====================================\n");
      double averagePatientsOneDay = calculateAveragePatientsOneDay(patientData);
      System.out.println("\tAverage patients reported in one day in 2021\t\t: " + averagePatientsOneDay + " patients");

      // XV. Find the first date of patients reported more than 200
      System.out.println("\nFor XV Question ====================================\n");
      String firstDateMoreThan200 = findFirstDateMoreThan200(patientData);
      System.out.println("\tFirst date with patients reported more than 200\t\t: " + firstDateMoreThan200);

      // XVI. Count the number of days in which more than 200 patients were reported
      System.out.println("\nFor XVI Question ====================================\n");
      int daysMoreThan200 = countDaysMoreThan200(patientData);
      System.out.println("\tNumber of days with more than 200 patients reported\t: " + daysMoreThan200);

      // XVII. Total number of patients reported in each month
      System.out.println("\nFor XVII Question ====================================\n");
      printTotalPatientsPerMonth(patientData);

      // XVIII. Total number of patients reported in each month
      System.out.println("\nFor XVIII Question ====================================\n");
      printDaysMoreThan200PerMonth(patientData);

      // XIX. Find highest number of patients reported in April
      System.out.println("\nFor XIX Question ====================================\n");
      int highestPatientsApril = findHighestPatientsApril(patientData);
      System.out.println("\tHighest number of patients reported in April\t\t: " + highestPatientsApril);

      // XX. Which month has the highest number of patients count in 2021?
      System.out.println("\nFor XX Question ====================================\n");
      highestNumberOfPatientCountMonth(patientData);

      // XXI. Which month has the minimum number of patients count in 2021?
      System.out.println("\nFor XXI Question ====================================\n");
      minimumNumberOfPatientCountMonth(patientData);

      // XXII. Find the number of days that have passed to the highest number of
      // patients reported
      System.out.println("\nFor XXII Question ====================================\n");
      int daysPassedToHighestCount = numberofDaysPassedForHighestNum(patientData);
      System.out
            .println(
                  "\tNumber of days passed to the highest number of patients reported\t: " + daysPassedToHighestCount);

      // XXIII. Print the highest number of patients reported in each month with the
      // name of the month
      System.out.println("\nFor XXIII Question ====================================\n");
      printHighestPatientsPerMonth(patientData);

      // XXIV. Print the minimum number of patients reported in each month with the
      // name of the month
      System.out.println("\nFor XXIV Question ====================================\n");
      printMinimumPatientsPerMonth(patientData);

      // XXV. The number of patients reported in November in descending order
      System.out.println("\nFor XXV Question ====================================\n");
      printPatientsInNovemberDescending(patientData);

      // XXVI. Print the number of patients reported in August in ascending order with
      // date
      System.out.println("\nFor XXVI Question ====================================\n");
      printPatientsInAugustAscending(patientData);

      // XXVII. Print the total number of patients reported in each month in
      // descending order with the name of month
      System.out.println("\nFor XXVII Question ====================================\n");
      printTotalPatientsPerMonthDescending(patientData);

      // XXVIII. Print the table showing patient count reports for each day of the
      // month
      System.out.println("\nFor XXVIII Question ====================================\n");
      printPatientCountTable(patientData);

      // XXIX. Add the Total and average of each month to the above report.
      System.out.println("\nFor XXIX Question ====================================\n");
      printPatientFinalCountTable(patientData);

   }

   // method for print patients on dates with month name
   public static void printPatientsOnDates(int[][] patientData, String date) {
      String[] parts = date.split("-");
      int month = Integer.parseInt(parts[1]) - 1;
      int day = Integer.parseInt(parts[2]) - 1;
      int patients = patientData[month][day];
      String monthName = getMonthName(month + 1);
      System.out.println(
            "\tPatients recorded on " + date + " (" + monthName + " " + (day + 1) + ")\t: " + patients + " patients");
   }

   // method for update patient data
   public static void updatePatientData(int[][] patientData, String date, int newPatients) {
      String[] parts = date.split("-");
      int month = Integer.parseInt(parts[1]) - 1;
      int day = Integer.parseInt(parts[2]) - 1;
      patientData[month][day] = newPatients;
   }

   // method for get the month name
   public static String getMonthName(int monthNumber) {
      String[] months = { "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December" };
      return months[monthNumber - 1];
   }

   // method for print patient report
   public static void printPatientReport(int[][] patientData, int year, int startMonth, int startDay, int days) {
      for (int day = startDay; day <= Math.min(startDay + days - 1, patientData[startMonth - 1].length); day++) {
         String date = year + "-" + (startMonth < 10 ? "0" + startMonth : startMonth) + "-"
               + (day < 10 ? "0" + day : day);
         int patients = patientData[startMonth - 1][day - 1];
         String monthName = getMonthName(startMonth);
         System.out
               .println(
                     "\tPatients recorded on " + date + " (" + monthName + " " + day + ")\t: " + patients
                           + " patients");
      }
   }

   // method for calculate total patients based on given condition
   public static int calculateTotalPatients(int[][] patientData, int year, int startMonth, int startDay, int days) {
      int totalPatients = 0;
      for (int day = startDay; day <= Math.min(startDay + days - 1, patientData[startMonth - 1].length); day++) {
         totalPatients += patientData[startMonth - 1][day - 1];
      }
      return totalPatients;
   }

   // method for count patients based on given condition
   public static int countDaysWithPatients(int[][] patientData, int year, int month, int threshold) {
      int count = 0;
      for (int day = 0; day < patientData[month - 1].length; day++) {
         if (patientData[month - 1][day] > threshold) {
            count++;
         }
      }
      return count;
   }

   // method for print patient on first day
   public static void printPatientsOnFirstDay(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int patientsFirstDay = patientData[month][0];
         String monthName = getMonthName(month + 1);
         System.out
               .println(
                     "\tPatients reported on the first day of " + monthName + "\t\t: " + patientsFirstDay
                           + " patients");
      }
   }

   // method for print patient on last day
   public static void printPatientsOnLastDay(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int lastDayIndex = patientData[month].length - 1;
         int patientsLastDay = patientData[month][lastDayIndex];
         String monthName = getMonthName(month + 1);
         System.out.println(
               "\tPatients reported on the last day of " + monthName + "\t\t: " + patientsLastDay + " patients");
      }
   }

   // method for total number of patients reported on the first 10 days of each
   // month
   public static void printTotalPatientsFirst10Days(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int totalPatientsFirst10Days = 0;
         for (int day = 0; day < Math.min(10, patientData[month].length); day++) {
            totalPatientsFirst10Days += patientData[month][day];
         }
         String monthName = getMonthName(month + 1);
         System.out.printf("\tTotal patients reported on the first 10 days of %-10s: %d patients%n", monthName,
               totalPatientsFirst10Days);
      }
   }

   // method for find average patients on 15th
   public static double calculateAveragePatientsOn15th(int[][] patientData) {
      int totalPatientsOn15th = 0;
      for (int month = 0; month < 12; month++) {
         if (patientData[month].length >= 15) {
            totalPatientsOn15th += patientData[month][14]; // Index 14 corresponds to the 15th day
         }
      }
      return (double) totalPatientsOn15th / 12; // 12 months
   }

   // method for cal total number of patients
   public static int calculateTotalPatients(int[][] patientData) {
      int totalPatients = 0;
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            totalPatients += patientData[month][day];
         }
      }
      return totalPatients;
   }

   // method to find average number of patients reported in one day in 2021.
   public static double calculateAveragePatientsOneDay(int[][] patientData) {
      int totalPatients = 0;
      int totalDays = 0;
      for (int month = 0; month < 12; month++) {
         totalPatients += sumArray(patientData[month]);
         totalDays += patientData[month].length;
      }
      return (double) totalPatients / totalDays;
   }

   public static int sumArray(int[] array) {
      int sum = 0;
      for (int value : array) {
         sum += value;
      }
      return sum;
   }

   // find the first day that found more than 200 patients
   public static String findFirstDateMoreThan200(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] > 200) {
               return formatDate(month + 1, day + 1);
            }
         }
      }
      return "No date found with patients reported more than 200.";
   }

   public static String formatDate(int month, int day) {
      return String.format("%04d-%02d-%02d", 2021, month, day);
   }

   // method to count number of days in which more than 200 patients were reported.
   public static int countDaysMoreThan200(int[][] patientData) {
      int count = 0;
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] > 200) {
               count++;
            }
         }
      }
      return count;
   }

   // method to print total patients per month
   public static void printTotalPatientsPerMonth(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int totalPatientsMonth = sumArray(patientData[month]);
         String monthName = getMonthName(month + 1);
         System.out.printf("\t%-10s\t: %d patients%n", monthName, totalPatientsMonth);
      }
   }

   public static int sumForMonthArray(int[] array) {
      int sum = 0;
      for (int value : array) {
         sum += value;
      }
      return sum;
   }

   // method to count number of patients reported in more than 200 of each month
   public static void printDaysMoreThan200PerMonth(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int daysMoreThan200 = countDaysMoreThan200(patientData[month]);
         String monthName = getMonthName(month + 1);
         System.out.printf("\t%-10s\t: %d days%n", monthName, daysMoreThan200);

      }
   }

   public static int countDaysMoreThan200(int[] array) {
      int count = 0;
      for (int value : array) {
         if (value > 200) {
            count++;
         }
      }
      return count;
   }

   // method to to highest number of patients count in April
   public static int findHighestPatientsApril(int[][] patientData) {
      int highestCount = 0;
      for (int day = 0; day < patientData[3].length; day++) { // April is index 3
         if (patientData[3][day] > highestCount) {
            highestCount = patientData[3][day];
         }
      }
      return highestCount;
   }

   // method to find month has the highest number of patients count in 2021?
   public static void highestNumberOfPatientCountMonth(int[][] patientData) {
      int highestCount = 0;
      String monthWithHighestCount = "";
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] > highestCount) {
               highestCount = patientData[month][day];
               monthWithHighestCount = getMonthName(month + 1);
            }
         }
      }
      System.out.println("\tMonth with the highest number of patients in 2021\t: " + monthWithHighestCount);
   }

   // method to find month has the minimum number of patients count in 2021?
   public static void minimumNumberOfPatientCountMonth(int[][] patientData) {
      int lowestCount = Integer.MAX_VALUE;
      String monthWithLowestCount = "";
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] < lowestCount) {
               lowestCount = patientData[month][day];
               monthWithLowestCount = getMonthName(month + 1);
            }
         }
      }
      System.out.println("\tMonth with the minimum number of patients in 2021\t: " + monthWithLowestCount);
   }

   // method to count number of days that have passed to the highest number of
   // patients reported.
   public static int numberofDaysPassedForHighestNum(int[][] patientData) {
      int highestCount = 0;
      int dayWithHighestCount = 0;
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] > highestCount) {
               highestCount = patientData[month][day];
               dayWithHighestCount = day + 1; // Adding 1 because days are 1-based
            }
         }
      }

      int daysPassedToHighestCount = dayWithHighestCount - 1;
      return daysPassedToHighestCount;
   }

   // method to print number of patients reported in each month with the name of
   // the month
   public static void printHighestPatientsPerMonth(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int highestCount = 0;
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] > highestCount) {
               highestCount = patientData[month][day];
            }
         }
         String monthName = getMonthName(month + 1);
         System.out.printf("\t%-10s\t: %d patients%n", monthName, highestCount);

      }
   }

   // method to Print the minimum number of patients reported in each month with
   // the name of the month
   public static void printMinimumPatientsPerMonth(int[][] patientData) {
      for (int month = 0; month < 12; month++) {
         int minCount = Integer.MAX_VALUE;
         for (int day = 0; day < patientData[month].length; day++) {
            if (patientData[month][day] < minCount) {
               minCount = patientData[month][day];
            }
         }
         String monthName = getMonthName(month + 1);
         System.out.printf("\t%-10s\t: %d patients%n", monthName, minCount);

      }
   }

   // method to Print the number of patients reported in November in descending
   // order
   public static void printPatientsInNovemberDescending(int[][] patientData) {
      int[] novemberCounts = patientData[10];

      Integer[] days = new Integer[novemberCounts.length];
      for (int i = 0; i < novemberCounts.length; i++) {
         days[i] = i + 1;
      }

      for (int i = 0; i < novemberCounts.length - 1; i++) {
         for (int j = 0; j < novemberCounts.length - i - 1; j++) {
            if (novemberCounts[j] < novemberCounts[j + 1]) {

               int tempCount = novemberCounts[j];
               novemberCounts[j] = novemberCounts[j + 1];
               novemberCounts[j + 1] = tempCount;

               int tempDay = days[j];
               days[j] = days[j + 1];
               days[j + 1] = tempDay;
            }
         }
      }

      for (int i = 0; i < novemberCounts.length; i++) {
         if (novemberCounts[i] > 0) {
            System.out.println("\t2021-11-" + days[i] + "\t: " + novemberCounts[i] + " patients");
         }
      }
   }

   // method to Print the number of patients reported in August in ascending order
   // with date
   public static void printPatientsInAugustAscending(int[][] patientData) {
      int[] augustCounts = patientData[7];

      Integer[] days = new Integer[augustCounts.length];
      for (int i = 0; i < augustCounts.length; i++) {
         days[i] = i + 1;
      }

      for (int i = 0; i < augustCounts.length - 1; i++) {
         for (int j = 0; j < augustCounts.length - i - 1; j++) {
            if (augustCounts[j] > augustCounts[j + 1]) {

               int tempCount = augustCounts[j];
               augustCounts[j] = augustCounts[j + 1];
               augustCounts[j + 1] = tempCount;

               int tempDay = days[j];
               days[j] = days[j + 1];
               days[j + 1] = tempDay;
            }
         }
      }

      for (int i = 0; i < augustCounts.length; i++) {
         if (augustCounts[i] > 0) {
            System.out.println("\t2021-08-" + days[i] + "\t: " + augustCounts[i] + " patients");
         }
      }
   }

   // methods to print t the total number of patients reported in each month in
   // descending order with the name of month
   public static void printTotalPatientsPerMonthDescending(int[][] patientData) {

      int[] totalPatientsPerMonth = new int[12];
      for (int month = 0; month < 12; month++) {
         for (int day = 0; day < patientData[month].length; day++) {
            totalPatientsPerMonth[month] += patientData[month][day];
         }
      }

      sortTotalPatientsDescending(totalPatientsPerMonth);

      for (int i = 0; i < totalPatientsPerMonth.length; i++) {
         String monthName = getMonthName(i + 1);
         System.out.printf("\t%-10s\t: %d patients%n", monthName, totalPatientsPerMonth[i]);

      }
   }

   public static void sortTotalPatientsDescending(int[] totalPatients) {
      for (int i = 0; i < totalPatients.length - 1; i++) {
         for (int j = 0; j < totalPatients.length - i - 1; j++) {
            if (totalPatients[j] < totalPatients[j + 1]) {

               int tempPatients = totalPatients[j];
               totalPatients[j] = totalPatients[j + 1];
               totalPatients[j + 1] = tempPatients;
            }
         }
      }
   }

   // methods to create the table
   public static void printPatientCountTable(int[][] patientData) {

      System.out.println("\t\t\t\t\t+------------------------------------------------------------------+");
      System.out.println("\t\t\t\t\t|                     Covid-19 Patients in 2021                    |");
      System.out.println("\t\t\t\t\t+------------------------------------------------------------------+\n\n");

      System.out.print("       ");
      for (int month = 0; month < 12; month++) {
         System.out.printf("%12s", getMonthName(month + 1));
      }
      System.out.println("\n");

      int maxDaysInMonth = getMaxDaysInMonth(patientData);

      for (int day = 0; day < maxDaysInMonth; day++) {
         System.out.printf("%4d ", day + 1);

         for (int month = 0; month < 12; month++) {
            if (day < patientData[month].length) {
               System.out.printf("%12d", patientData[month][day]);
            } else {
               System.out.print("            ");
            }
         }

         System.out.println();
      }
   }

   // methods to create the final report
   public static void printPatientFinalCountTable(int[][] patientData) {
      System.out.println("\t\t\t\t\t+------------------------------------------------------------------+");
      System.out.println("\t\t\t\t\t|              Covid-19 Patients Final Report in 2021              |");
      System.out.println("\t\t\t\t\t+------------------------------------------------------------------+\n\n");

      System.out.print("       ");
      for (int month = 0; month < 12; month++) {
         System.out.printf("%12s", getMonthName(month + 1));
      }
      System.out.println("\n");

      int maxDaysInMonth = getMaxDaysInMonth(patientData);

      int[] monthlyTotal = new int[12];
      double[] monthlyAverage = new double[12];

      for (int day = 0; day < maxDaysInMonth; day++) {
         System.out.printf("%4d ", day + 1);

         for (int month = 0; month < 12; month++) {
            if (day < patientData[month].length) {
               int patientCount = patientData[month][day];
               System.out.printf("%12d", patientCount);

               monthlyTotal[month] += patientCount;
            } else {
               System.out.print("            ");
            }
         }

         System.out.println();
      }

      System.out.print("\nTotal");
      for (int month = 0; month < 12; month++) {
         System.out.printf("%12d", monthlyTotal[month]);
      }

      System.out.print("\nAverage");
      for (int month = 0; month < 12; month++) {
         monthlyAverage[month] = (double) monthlyTotal[month] / getMaxDaysInMonth(patientData);
         System.out.printf("%12.2f", monthlyAverage[month]);
      }
   }

   public static int getMaxDaysInMonth(int[][] patientData) {
      int maxDays = 0;
      for (int month = 0; month < 12; month++) {
         maxDays = Math.max(maxDays, patientData[month].length);
      }
      return maxDays;
   }

}
