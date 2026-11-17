package androidx.credentials.exceptions.publickeycredential;

import X.Cw0;
import X.FGI;

/* loaded from: classes5.dex */
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public final Cw0 domError;

    public GetPublicKeyCredentialDomException(Cw0 cw0, CharSequence charSequence) {
        super(FGI.A0M("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/", cw0.A00), charSequence);
        this.domError = cw0;
    }
}
