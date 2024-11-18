package Övningar.TestDrivenDevelopment;

public class Password {

    public boolean check(String password) {

        //Check length
        if (password.length() < 8) {
            return false;
        }


        //Check at least 1 digit and 1 special character
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
            }

            if (!Character.isLetterOrDigit(password.charAt(i))) {
                hasSpecialCharacter = true;
            }

            if (hasDigit && hasSpecialCharacter){
                break;
            }

        }
        return hasDigit && hasSpecialCharacter;
    }
}

