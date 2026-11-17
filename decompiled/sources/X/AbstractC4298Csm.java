package X;

import android.content.Intent;
import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialException;

/* renamed from: X.Csm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4298Csm {
    public static final C4381Cug A00(Intent intent) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", GetCredentialResponse.class);
        if (getCredentialResponse == null) {
            return null;
        }
        Credential credential = getCredentialResponse.getCredential();
        C7384Etj.A0U(credential);
        return new C4381Cug(AbstractC4300Cso.A00(credential));
    }

    public static final GetCredentialException A01(Intent intent) {
        android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
        if (getCredentialException == null) {
            return null;
        }
        String type = getCredentialException.getType();
        C7384Etj.A0U(type);
        return AbstractC4410CvW.A00(getCredentialException.getMessage(), type);
    }
}
