package sparc.pitch.exception;

/**
 * User: Dayel Ostraco
 * Date: 8/1/12
 * Time: 10:39 PM
 */
public class RestException extends Exception {

    private static final long serialVersionUID = 2L;

    public RestException(final Throwable cause) {
        super(cause);
    }

    public RestException(final String reason) {
        super(reason);
    }

    public RestException(final String reason, final Throwable cause) {
        super(reason, cause);
    }
}