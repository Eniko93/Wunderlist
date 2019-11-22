package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.ForgotPasswordPage;
import page.objects.HomePage;
import page.objects.SignInPage;
import page.objects.SignUpPage;
import utils.URLs;

/**
 * This test class includes the following test scenarios:
 * <p>
 * Invalid sign in
 * Validation test for email and password field
 * Go to sign up page
 * Go to forgot password page
 */

public class SignInTests extends BaseTest {
    @Test(description = "Invalid sign in")
    public void invalidSignIn() {
        driver.get(URLs.SIGN_IN_URL);

        new SignInPage(driver)
                .fillInEmail("hello@world.com")
                .fillInPassword("123456")
                .submit();

        Assert.assertEquals(new SignInPage(driver).getMessageText(), "The email or password you entered was incorrect. Please try again.");
    }

    @Test(description = "Validation test for email and password field")
    public void validationTest() {
        SignInPage signInPage = new HomePage(driver)
                .goToSignInPage()
                .fillInEmail("hello")
                .submit();

        Assert.assertFalse(signInPage.isEmailAddressValid());

        signInPage
                .fillInEmail("hello@world.com!")
                .submit();

        Assert.assertFalse(signInPage.isEmailAddressValid());

        signInPage
                .fillInEmail("valid@email.form")
                .fillInPassword("")
                .submit();

        Assert.assertFalse(signInPage.isPasswordValid());
    }

    @Test(description = "Go to sign up page")
    public void goToSignUpPage() {
        driver.get(URLs.SIGN_UP_URL);

        Assert.assertEquals(new SignUpPage(driver).getHeaderText(), "Get Wunderlist for Free");
    }

    @Test(description = "Go to forgot password page")
    public void goForgotPasswordPage() {
        driver.get(URLs.FORGOT_PASSWORD_URL);

        Assert.assertEquals(new ForgotPasswordPage(driver).getHeaderText(), "Forgot your password?");
    }
}
