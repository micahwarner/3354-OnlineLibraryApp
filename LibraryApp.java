import java.util.HashMap;
import java.util.Map;

public class LibraryApp {
    // Placeholder data structures to store users and books
    private Map<String, String> users; // Username -> Password
    private Map<String, Boolean> books; // Book ID -> Availability

    public LibraryApp() {
        // Initialize data structures
        users = new HashMap<>();
        books = new HashMap<>();
        // Add sample users and books
        users.put("user1", "password1");
        users.put("user2", "password2");
        books.put("12345", true); // Book is available
        books.put("54321", false); // Book is already checked out
    }

    // Method to authenticate user
    public boolean authenticateUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    // Method to borrow a book
    public boolean borrowBook(String bookId) {
        if (books.containsKey(bookId) && books.get(bookId)) {
            books.put(bookId, false); // Mark the book as checked out
            return true; // Successfully borrowed
        }
        return false; // Book not found or already checked out
    }

}
