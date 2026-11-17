package androidx.credentials.exceptions.publickeycredential;

import X.C60O;
import androidx.credentials.exceptions.GetCredentialException;

/* loaded from: classes5.dex */
public abstract class GetPublicKeyCredentialException extends GetCredentialException {
    public final String type;

    public GetPublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (str.length() <= 0) {
            throw C60O.A0i("type must not be empty");
        }
    }
}
