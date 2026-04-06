import java.util.*;

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Rectangular bogie cannot carry Petroleum"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " → " + shape);

            } catch (CargoSafetyException e) {
                System.out.println("ERROR: " + e.getMessage());

            } finally {
                System.out.println("Assignment attempt completed for " + shape);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC15 ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");   // valid
        b2.assignCargo("Petroleum");   // invalid
        b2.assignCargo("Coal");        // valid

        System.out.println("Program continues...");
    }
}