package androidx.credentials.exceptions;

/* loaded from: classes5.dex */
public abstract class CreateCredentialException extends Exception {
    public final CharSequence errorMessage;
    public final String type;

    public CreateCredentialException(CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION";
        this.errorMessage = charSequence;
    }
}
