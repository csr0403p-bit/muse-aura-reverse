package libraries.passwordencryption.model;

import X.EnumC7395EuY;

/* loaded from: classes5.dex */
public final class PasswordEncryptionException extends Exception {
    public final Exception ex;
    public final EnumC7395EuY exceptionType;

    public PasswordEncryptionException(Exception exc, EnumC7395EuY enumC7395EuY) {
        super(exc);
        this.ex = exc;
        this.exceptionType = enumC7395EuY;
    }
}
