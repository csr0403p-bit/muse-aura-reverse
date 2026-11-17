package X;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import android.util.Log;

/* renamed from: X.Csq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4302Csq implements OutcomeReceiver<GetCredentialResponse, GetCredentialException> {
    public final /* synthetic */ InterfaceC4370CuQ<C4381Cug, androidx.credentials.exceptions.GetCredentialException> A00;
    public final /* synthetic */ C4301Csp A01;

    public C4302Csq(InterfaceC4370CuQ<C4381Cug, androidx.credentials.exceptions.GetCredentialException> interfaceC4370CuQ, C4301Csp c4301Csp) {
        this.A00 = interfaceC4370CuQ;
        this.A01 = c4301Csp;
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        C7384Etj.A0Y(getCredentialException, 0);
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        this.A00.AT2(C4301Csp.A03(getCredentialException));
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onResult(GetCredentialResponse getCredentialResponse) {
        GetCredentialResponse getCredentialResponse2 = getCredentialResponse;
        C7384Etj.A0Y(getCredentialResponse2, 0);
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        this.A00.onResult(C4301Csp.A01(getCredentialResponse2));
    }
}
