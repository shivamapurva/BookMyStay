


    /**
     * Book My Stay Application - Use Case 2
     * Demonstrates abstraction, inheritance, polymorphism,
     * and static availability handling.
     *
     * @author YourName
     * @version 1.0
     */

// Abstract Room class
    abstract class Room {
        private String roomType;
        private int beds;
        private double price;

        public Room(String roomType, int beds, double price) {
            this.roomType = roomType;
            this.beds = beds;
            this.price = price;
        }

        public String getRoomType() { return roomType; }
        public int getBeds() { return beds; }
        public double getPrice() { return price; }

        public abstract void displayDetails();
    }

    // Single Room
    class SingleRoom extends Room {
        public SingleRoom() {
            super("Single Room", 1, 2000);
        }

        public void displayDetails() {
            System.out.println("Room Type: " + getRoomType());
            System.out.println("Beds: " + getBeds());
            System.out.println("Price: ₹" + getPrice());
        }
    }

    // Double Room
    class DoubleRoom extends Room {
        public DoubleRoom() {
            super("Double Room", 2, 3500);
        }

        public void displayDetails() {
            System.out.println("Room Type: " + getRoomType());
            System.out.println("Beds: " + getBeds());
            System.out.println("Price: ₹" + getPrice());
        }
    }

    // Suite Room
    class SuiteRoom extends Room {
        public SuiteRoom() {
            super("Suite Room", 3, 6000);
        }

        public void displayDetails() {
            System.out.println("Room Type: " + getRoomType());
            System.out.println("Beds: " + getBeds());
            System.out.println("Price: ₹" + getPrice());
        }
    }

    // Main Application Class (only public class)
    public class BookMyStay {

        public static void main(String[] args) {

            // Polymorphic references
            Room single = new SingleRoom();
            Room doubleRoom = new DoubleRoom();
            Room suite = new SuiteRoom();

            // Static availability
            int singleAvailable = 5;
            int doubleAvailable = 3;
            int suiteAvailable = 2;

            System.out.println("===== Room Availability =====");

            System.out.println("\n--- Single Room ---");
            single.displayDetails();
            System.out.println("Available: " + singleAvailable);

            System.out.println("\n--- Double Room ---");
            doubleRoom.displayDetails();
            System.out.println("Available: " + doubleAvailable);

            System.out.println("\n--- Suite Room ---");
            suite.displayDetails();
            System.out.println("Available: " + suiteAvailable);

            System.out.println("\nThank you for using Book My Stay!");
        }
    }


