import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryAppTest {
    private LibraryApp libraryApp;

    @BeforeEach
    public void setUp() {
        libraryApp = new LibraryApp();
    }

    @Test
    public void testUserAuthenticationWithValidCredentials() {
        assertTrue(libraryApp.authenticateUser("user1", "password1"));
    }

    @Test
    public void testUserAuthenticationWithInvalidCredentials() {
        assertFalse(libraryApp.authenticateUser("user1", "wrong_password"));
    }

    @Test
    public void testBorrowingAvailableBook() {
        assertTrue(libraryApp.borrowBook("12345"));
    }

    @Test
    public void testBorrowingAlreadyCheckedOutBook() {
        assertFalse(libraryApp.borrowBook("54321"));
    }
}
