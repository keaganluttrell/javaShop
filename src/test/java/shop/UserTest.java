package shop;

import org.junit.jupiter.api.Test;
import java.util.Date;


//import java.util.Arrays;
//import java.util.List;
//import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.assertNotNull;

//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class UserTest {
    @Test
    public void shouldCreateANewUserWithParams() {
        // setup
        String expectedUserId = "001";
        String expectedPassword = "pwd";
        String expectedLoginStatus = "active";
        User expectedUser = new User("001", "pwd", "active");

        // execute
        String userId = expectedUser.getUserId();
        String password = expectedUser.getPassword();
        String loginStatus = expectedUser.getLoginStatus();

        // assert
        assertEquals(expectedUserId, userId);
        assertEquals(expectedPassword, password);
        assertEquals(expectedLoginStatus, loginStatus);

        // teardown
    }

    @Test
    public void shouldLogUserInWhenUserIsCreated() {
        // setup
        User expectedUser = new User("001", "pwd", "active");

        // execute
        boolean actualLogin = expectedUser.verifyLogin();

        // assert
        assertTrue(actualLogin);
    }

    @Test
    public void shouldProperlyVerifyIfUserIsLoggedIn() {

        // setup
        User expectedLoggedInUser = new User("001", "pwd", "active");
        User expectedLoggedInUser2 = new User("002", "pwd", "active");
        User expectedLoggedInUser3 = new User("003", "pwd", "active");

        expectedLoggedInUser.setLoginStatus("logged out");
        expectedLoggedInUser2.setLoginStatus("away");
        expectedLoggedInUser3.setLoginStatus("busy");


        //execute
        boolean actualLogin = expectedLoggedInUser.verifyLogin();
        boolean actualLogin2 = expectedLoggedInUser2.verifyLogin();
        boolean actualLogin3 = expectedLoggedInUser3.verifyLogin();

        // assert
        assertFalse(actualLogin);
        assertTrue(actualLogin2);
        assertTrue(actualLogin3);
    }

    @Test
    public void shouldBeAbleToAccessRegisterDate() {
        Date expectedDate = new Date();
        User expectedUser = new User("001", "pwd", "active", expectedDate);

        Date actualDate = expectedUser.getRegisterDate();
        boolean areDatesSame = actualDate.compareTo(expectedDate) == 0;
        assertTrue(areDatesSame);
    }

    @Test void shouldBeAbleToResetPassword() {
        User expectedNewUser = new User("001", "pwd", "active");
        String expectedNewPassword = "newPwd";
        expectedNewUser.setPassword(expectedNewPassword);

        String actualNewPassword = expectedNewUser.getPassword();

        assertEquals(expectedNewPassword, actualNewPassword, "Password should be reset to new value");
    }


}
