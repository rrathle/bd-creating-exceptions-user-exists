package main;

/**
 * Custom exception for when we try to create a new user but one with
 * duplicate fields already exists.
 */
public class UserExistsException extends Exception {
    private static final long serialVersionUID = -2279423540751615544L;
    private String email;

    public UserExistsException() {
        //implement this method
        super();
    }

    public UserExistsException(String message) {
        //implement this method
        super(message);
    }

    public UserExistsException(String message, Throwable e) {
        //implement this method
        super(message,e);
    }

    public UserExistsException(Throwable e) {
        //implement this method
        super(e);
    }
    public String getEmail() {
        return email;
    }
}
