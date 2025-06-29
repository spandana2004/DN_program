
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

interface UserService {
    void sendEmail(String email);
}

public class UserServiceTest {
    @Test
    public void testSendEmailCalledWithSpecificArgument() {
        // Create a mock object
        UserService mockUserService = mock(UserService.class);
        
        // Call method with specific argument
        mockUserService.sendEmail("test@example.com");
        
        // Verify the interaction
        verify(mockUserService).sendEmail("test@example.com");
    }
}
