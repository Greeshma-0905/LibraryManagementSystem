package Main;
import Service.LibraryService;
import Model.Book;
import Model.Member;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== LIBRARY MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Add Member");
            System.out.println("6. View Members");
            System.out.println("7. Update Member");
            System.out.println("8. Delete Member");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Is the Book Available? (true/false): ");
                    boolean available = scanner.nextBoolean();
                    libraryService.addBook(new Book(bookId, title, author, available));
                    break;

                case 2:
                    libraryService.viewBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to Update: ");
                    int updateBookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Is Available? (true/false): ");
                    boolean newAvailable = scanner.nextBoolean();
                    libraryService.updateBook(updateBookId, newTitle, newAuthor, newAvailable);
                    break;

                case 4:
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteBookId = scanner.nextInt();
                    libraryService.deleteBook(deleteBookId);
                    break;

                case 5:
                    System.out.print("Enter Member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Member Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Member Email: ");
                    String email = scanner.nextLine();
                    libraryService.addMember(new Member(memberId, name, email));
                    break;

                case 6:
                    libraryService.viewMembers();
                    break;

                case 7:
                    System.out.print("Enter Member ID to Update: ");
                    int updateMemberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();
                    libraryService.updateMember(updateMemberId, newName, newEmail);
                    break;

                case 8:
                    System.out.print("Enter Member ID to Delete: ");
                    int deleteMemberId = scanner.nextInt();
                    libraryService.deleteMember(deleteMemberId);
                    break;

                case 9:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
    

