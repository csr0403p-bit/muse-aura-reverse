package androidx.credentials.exceptions;

import X.C60O;

/* loaded from: classes5.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    public final String type;

    public GetCredentialCustomException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (str.length() <= 0) {
            throw C60O.A0i("type must not be empty");
        }
    }
}
