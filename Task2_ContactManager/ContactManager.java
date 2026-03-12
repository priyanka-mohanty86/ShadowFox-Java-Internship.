import java.util.ArrayList;
import java.util.Scanner;

class Contact {

    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class ContactManager {

    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(name, phone, email));

                    System.out.println("Contact added successfully!");
                    break;

                case 2:

                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {

                        System.out.println("\nContact List:");

                        for (int i = 0; i < contacts.size(); i++) {

                            Contact c = contacts.get(i);

                            System.out.println((i + 1) + ". " + c.name + " | " + c.phone + " | " + c.email);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter contact number to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex > 0 && updateIndex <= contacts.size()) {

                        Contact c = contacts.get(updateIndex - 1);

                        System.out.print("Enter new name: ");
                        c.name = sc.nextLine();

                        System.out.print("Enter new phone: ");
                        c.phone = sc.nextLine();

                        System.out.print("Enter new email: ");
                        c.email = sc.nextLine();

                        System.out.println("Contact updated successfully!");
                    } else {

                        System.out.println("Invalid contact number.");
                    }

                    break;

                case 4:

                    System.out.print("Enter contact number to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex > 0 && deleteIndex <= contacts.size()) {

                        contacts.remove(deleteIndex - 1);

                        System.out.println("Contact deleted successfully!");
                    } else {

                        System.out.println("Invalid contact number.");
                    }

                    break;

                case 5:

                    System.out.println("Program closed.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid option.");
            }
        }
    }
}