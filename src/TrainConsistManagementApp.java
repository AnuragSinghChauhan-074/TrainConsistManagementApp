import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> bogieIds = new ArrayList<>();

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            bogieIds.add(sc.nextLine());
        }

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("No bogies available. Cannot perform search.");
        }

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
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