package sparc.pitch.exception;

/**
 * User: Dayel Ostraco
 * Date: 8/1/12
 * Time: 10:39 PM
 */
public class DataAccessException extends Exception {

    private static final long serialVersionUID = 1L;

    public DataAccessException(final Throwable cause) {
        super(cause);
    }

    public DataAccessException(final String reason) {
        super(reason);
    }

    public DataAccessException(final String reason, final Throwable cause) {
        super(reason, cause);
    }
}