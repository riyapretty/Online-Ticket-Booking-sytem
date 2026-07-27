import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] name = new String[10];
        String[] ticket = new String[10];
        int count = 0, choice;

        do {

            System.out.println("\n1.Book Ticket");
            System.out.println("2.View Ticket");
            System.out.println("3.Exit");

            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    name[count] = scanner.nextLine();

                    System.out.print("Enter Ticket Type (Movie/Bus/Train): ");
                    ticket[count] = scanner.nextLine();

                    count++;

                    System.out.println("Ticket Booked Successfully!");
                    break;

                case 2:

                    System.out.println("\nBooked Tickets:");

                    for (int i = 0; i < count; i++) {
                        System.out.println((i + 1) + ". " + name[i] + " - " + ticket[i]);
                    }

                    break;

                case 3:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        scanner.close();
    }
}