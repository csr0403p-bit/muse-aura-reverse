package androidx.credentials.exceptions.publickeycredential;

/* loaded from: classes5.dex */
public abstract class SignalCredentialStateException extends Exception {
    public final String type;

    public SignalCredentialStateException(CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = "androidx.credentials.SignalCredentialStateException.TYPE_PROVIDER_CONFIGURATION";
    }
}
