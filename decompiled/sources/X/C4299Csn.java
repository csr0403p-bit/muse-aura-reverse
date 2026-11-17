package X;

import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.NoCredentialException;

/* renamed from: X.Csn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4299Csn {
    public static final GetCredentialException A00(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new NoCredentialException("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL", str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new GetCredentialInterruptedException("android.credentials.GetCredentialException.TYPE_INTERRUPTED", str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new GetCredentialCancellationException("android.credentials.GetCredentialException.TYPE_USER_CANCELED", str2);
            }
        }
        return BV6.A0T(str2);
    }
}
