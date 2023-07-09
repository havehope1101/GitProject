package checkData;

import identity.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {

    public static boolean validateInput(String username, String password) {
//        int minUsernameLength = 4;
//        int maxUsernameLength = 20;
//        int minPasswordLength = 6;
//        int maxPasswordLength = 20;
//
//        boolean validUsername = username.length() >= minUsernameLength && username.length() <= maxUsernameLength;
//        boolean validPassword = password.length() >= minPasswordLength && password.length() <= maxPasswordLength;

         String regexUsername = "\\w{4,20}$";
         String regexPassword = "\\w{6,20}$";

        Pattern patternUsername = Pattern.compile(regexUsername);
        Pattern patterPassword = Pattern.compile(regexPassword);

        Matcher matcherUsername = patternUsername.matcher(username);
        Matcher matcherPassword = patterPassword.matcher(password);

        return matcherUsername.matches() && matcherPassword.matches();
    }

}
