package home_work_6.exceptions;

public class Authentication {

    public static void main(String[] args) {

        System.out.println(auth("login1", "password1", "confirPassword"));
        System.out.println(auth("login1", "Anastasia", "Anastasia"));

    }

    public static boolean auth(String login, String password, String confirPassword) {

        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Anastasia!!! Your login is wrong " + login);
            }
            if (password.length() >= 20 || !password.equals(confirPassword)) {
                throw new WrongPasswordException("Anastasia!!! Your password is wrong " + "'" +
                        password + "'" + " != "
                        + "'" + confirPassword + "'");
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
            return false;
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}