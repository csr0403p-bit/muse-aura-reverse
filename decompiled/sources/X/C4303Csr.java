package X;

import android.credentials.GetCredentialException;
import android.credentials.PrepareGetCredentialResponse;
import android.os.OutcomeReceiver;

/* renamed from: X.Csr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4303Csr implements OutcomeReceiver<PrepareGetCredentialResponse, GetCredentialException> {
    public final /* synthetic */ InterfaceC4370CuQ<C4314CtC, androidx.credentials.exceptions.GetCredentialException> A00;
    public final /* synthetic */ C4301Csp A01;

    public C4303Csr(InterfaceC4370CuQ<C4314CtC, androidx.credentials.exceptions.GetCredentialException> interfaceC4370CuQ, C4301Csp c4301Csp) {
        this.A00 = interfaceC4370CuQ;
        this.A01 = c4301Csp;
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onError(Throwable th) {
        GetCredentialException getCredentialException = (GetCredentialException) th;
        C7384Etj.A0Y(getCredentialException, 0);
        this.A00.AT2(C4301Csp.A03(getCredentialException));
    }

    @Override // android.os.OutcomeReceiver
    public final /* bridge */ /* synthetic */ void onResult(PrepareGetCredentialResponse prepareGetCredentialResponse) {
        PrepareGetCredentialResponse prepareGetCredentialResponse2 = prepareGetCredentialResponse;
        C7384Etj.A0Y(prepareGetCredentialResponse2, 0);
        this.A00.onResult(C4301Csp.A02(prepareGetCredentialResponse2));
    }
}
