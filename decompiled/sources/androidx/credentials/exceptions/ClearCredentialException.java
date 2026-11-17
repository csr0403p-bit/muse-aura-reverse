package androidx.credentials.exceptions;

/* loaded from: classes5.dex */
public abstract class ClearCredentialException extends Exception {
    public final CharSequence errorMessage;
    public final String type;

    public ClearCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = str;
        this.errorMessage = charSequence;
    }
}
