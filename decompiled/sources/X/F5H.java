package X;

import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.android.gms.common.api.ApiException;

/* loaded from: classes5.dex */
public final class F5H implements CSP {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F5H(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        GetCredentialException getCredentialExceptionA00;
        int i;
        int i2 = this.$t;
        Object obj = this.A00;
        CancellationSignal cancellationSignal = (CancellationSignal) this.A01;
        C7384Etj.A0Y(exc, 2);
        boolean z = exc instanceof ApiException;
        if (i2 != 0) {
            getCredentialExceptionA00 = C4299Csn.A00((z && C60Q.A1W(C4292Cse.A02, ((ApiException) exc).mStatus.A00)) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS", BV5.A0n("During get sign-in intent, failure response from one tap: ", exc));
            i = 14;
        } else {
            getCredentialExceptionA00 = C4299Csn.A00((z && C60Q.A1W(C4292Cse.A02, ((ApiException) exc).mStatus.A00)) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS", BV5.A0n("During begin sign in, failure response from one tap: ", exc));
            i = 9;
        }
        C7593F5g.A00(cancellationSignal, getCredentialExceptionA00, obj, i);
    }
}
