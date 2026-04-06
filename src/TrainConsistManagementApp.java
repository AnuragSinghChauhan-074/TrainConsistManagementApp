import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] bogieIds = {"BG101","BG205","BG309","BG412","BG550"};

        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(key);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + key);
        } else {
            System.out.println("Bogie Not Found");
        }

        sc.close();
    }
}