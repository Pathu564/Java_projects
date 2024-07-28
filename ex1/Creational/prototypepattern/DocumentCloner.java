package Creational.prototypepattern;

import java.util.Scanner;

// Client code to demonstrate the Prototype pattern
public class DocumentCloner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create original documents
        DocumentPrototype reportTemplate = new Report("Annual Report for 2024");
        DocumentPrototype letterTemplate = new Letter("Dear John, Thank you for your purchase.");

        // Get user choice
        System.out.println("Choose a document type to clone:");
        System.out.println("1. Report");
        System.out.println("2. Letter");
        System.out.print("Enter choice (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        DocumentPrototype clonedDocument = null;
        switch (choice) {
            case 1:
                clonedDocument = reportTemplate.clone();
                break;
            case 2:
                clonedDocument = letterTemplate.clone();
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter new content for the cloned document: ");
        String newContent = scanner.nextLine();

        if (clonedDocument instanceof Report) {
            clonedDocument = new Report(newContent);
        } else if (clonedDocument instanceof Letter) {
            clonedDocument = new Letter(newContent);
        }

        // Display the cloned document content
        System.out.println("\nCloned Document:");
        clonedDocument.showContent();

        scanner.close();
    }
}
