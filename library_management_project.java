import java.util.Scanner;

public class library_management_project {

    static Scanner in = new Scanner(System.in);
    static final int MAX = 20;

    static int[] bookId = new int[MAX];
    static String[] title = new String[MAX];
    static String[] author = new String[MAX];
    static int[] quantity = new int[MAX];
    static int[] issued = new int[MAX];
    static int bookCount = 0;   // abhi kitni books hain (agli khaali jagah bhi yehi hai)

    // ===== main =====
    public static void main(String[] args) {

        System.out.println("Pehle 2 books ka data enter karein:");
        for (int i = 0; i < 2; i++) {
            addBook();          // wahi function jo menu mein bhi chalega
        }

        int choice;
        do {
            showMenu();
            choice = readInt("");

            switch (choice) {
                case 1: addBook();        break;
                case 2: displayAll();     break;
                case 3: searchById();     break;
                case 4: issueBook();      break;
                case 5: returnBook();     break;
                case 6: showOutOfStock(); break;
                case 7: deleteBook();     break;
                case 8: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice, dobara try karein.");
            }
        } while (choice != 8);
    }

    // ===== Menu =====
    static void showMenu() {
        System.out.println("\n==== Library Management System ====");
        System.out.println("press (1) Add a new book");
        System.out.println("press (2) Display all books");
        System.out.println("press (3) Search a book by [id]");
        System.out.println("press (4) Issue a book");
        System.out.println("press (5) Return a book");
        System.out.println("press (6) Show books which are out of stock");
        System.out.println("press (7) Delete a book");
        System.out.println("press (8) Exit");
        System.out.print("Enter choice: ");
    }

    // ===== Helper methods (input nahi lete, sirf parameter) =====
    static boolean isFull() {
        return bookCount == MAX;
    }

    static int findBookIndex(int id) {
        for (int i = 0; i < bookCount; i++) {
            if (bookId[i] == id) return i;
        }
        return -1;   // nahi mila
    }

    static int getAvailable(int index) {
        return quantity[index] - issued[index];
    }

    static void printBook(int i) {
        System.out.printf("%-6d %-20s %-15s %-6d %-7d %-9d%n",
                bookId[i], title[i], author[i], quantity[i], issued[i], getAvailable(i));
    }

    // Number lene ka safe tareeqa: galat input (text) par crash nahi hoga
    // Ye nextLine() use karta hai, is liye newline bug bhi nahi aata
    static int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(in.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Sirf number likhein!");
            }
        }
    }

    // ===== 1. Add book =====
    static void addBook() {
        if (isFull()) {
            System.out.println("Library full hai, aur book add nahi ho sakti.");
            return;
        }

        int id;
        while (true) {
            id = readInt("Enter book id: ");
            if (id <= 0) {
                System.out.println("ID positive honi chahiye.");
            } else if (findBookIndex(id) != -1) {
                System.out.println("Ye ID pehle se maujood hai.");
            } else {
                break;   // ID theek hai
            }
        }

        System.out.print("Enter book title: ");
        String t = in.nextLine();

        System.out.print("Enter author name: ");
        String a = in.nextLine();

        int q;
        do {
            q = readInt("Enter quantity: ");
            if (q < 1) System.out.println("Quantity kam se kam 1 honi chahiye.");
        } while (q < 1);

        bookId[bookCount] = id;
        title[bookCount] = t;
        author[bookCount] = a;
        quantity[bookCount] = q;
        issued[bookCount] = 0;   // nayi book, koi copy issue nahi
        bookCount++;

        System.out.println("Book add ho gayi!");
    }

    // ===== 2. Display all =====
    static void displayAll() {
        if (bookCount == 0) {
            System.out.println("Library mein koi book nahi hai.");
            return;
        }
        System.out.printf("%-6s %-20s %-15s %-6s %-7s %-9s%n",
                "ID", "Title", "Author", "Total", "Issued", "Available");
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < bookCount; i++) {
            printBook(i);
        }
    }

    // ===== 3. Search by id =====
    static void searchById() {
        int id = readInt("Enter book id to search: ");
        int index = findBookIndex(id);

        if (index == -1) {
            System.out.println("Book nahi mili.");
        } else {
            System.out.printf("%-6s %-20s %-15s %-6s %-7s %-9s%n",
                    "ID", "Title", "Author", "Total", "Issued", "Available");
            printBook(index);
        }
    }

    // ===== 4. Issue book =====
    static void issueBook() {
        int id = readInt("Enter book id to issue: ");
        int index = findBookIndex(id);

        if (index == -1) {
            System.out.println("Book nahi mili.");
        } else if (getAvailable(index) == 0) {
            System.out.println("Is book ki koi copy available nahi hai.");
        } else {
            issued[index]++;
            System.out.println("Book issue ho gayi. Ab available copies: " + getAvailable(index));
        }
    }

    // ===== 5. Return book =====
    static void returnBook() {
        int id = readInt("Enter book id to return: ");
        int index = findBookIndex(id);

        if (index == -1) {
            System.out.println("Book nahi mili.");
        } else if (issued[index] == 0) {
            System.out.println("Is book ki koi copy issue hi nahi hui, return kaise hogi?");
        } else {
            issued[index]--;
            System.out.println("Book return ho gayi. Ab available copies: " + getAvailable(index));
        }
    }

    // ===== 6. Out of stock =====
    static void showOutOfStock() {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (getAvailable(i) == 0) {
                if (!found) {
                    System.out.println("Out of stock books:");
                    found = true;
                }
                printBook(i);
            }
        }
        if (!found) {
            System.out.println("Saari books available hain.");
        }
    }

    // ===== 7. Delete book =====
    static void deleteBook() {
        int id = readInt("Enter book id to delete: ");
        int index = findBookIndex(id);

        if (index == -1) {
            System.out.println("Book nahi mili.");
            return;
        }
        if (issued[index] > 0) {
            System.out.println("Delete nahi ho sakti: " + issued[index] + " copy/copies issue hain.");
            return;
        }

        // Baad wale sab elements ko ek jagah left shift karo
        for (int i = index; i < bookCount - 1; i++) {
            bookId[i] = bookId[i + 1];
            title[i] = title[i + 1];
            author[i] = author[i + 1];
            quantity[i] = quantity[i + 1];
            issued[i] = issued[i + 1];
        }
        bookCount--;
        System.out.println("Book delete ho gayi.");
    }
}