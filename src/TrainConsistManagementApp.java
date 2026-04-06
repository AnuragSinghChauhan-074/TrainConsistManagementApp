public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ================= UC16 =================
        System.out.println("\n=== UC16: Bubble Sort ===");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // Bubble Sort
        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("\nAfter Sorting: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\nProgram continues...");

        // ================= UC17 =================
        System.out.println("\n=== UC17: Sort Bogie Names ===");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Before Sorting: " + java.util.Arrays.toString(bogies));

        java.util.Arrays.sort(bogies);

        System.out.println("After Sorting: " + java.util.Arrays.toString(bogies));

        System.out.println("Program continues...");
    }
}