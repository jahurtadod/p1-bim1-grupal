package feature_2;

import core.EBook;

public class AuthorizationManager {
    private Boolean access = false;
    private String token;
    private EBook ebook;

    public AuthorizationManager(Boolean access, String token, EBook ebook) {
        this.access = access;
        this.token = token;
        this.ebook = ebook;
    }

    public Boolean verifyAccess() {
        // Validamos el token
        return access;
    }

}
