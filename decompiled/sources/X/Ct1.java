package X;

import androidx.credentials.exceptions.GetCredentialException;

/* loaded from: classes5.dex */
public final class Ct1 implements InterfaceC4370CuQ<C4314CtC, GetCredentialException> {
    public final /* synthetic */ Hm1<C4314CtC> A00;

    @Override // X.InterfaceC4370CuQ
    public final /* bridge */ /* synthetic */ void onResult(C4314CtC c4314CtC) {
        C7384Etj.A0Y(c4314CtC, 0);
        Hm1<C4314CtC> hm1 = this.A00;
        if (hm1.isActive()) {
            hm1.resumeWith(c4314CtC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ct1(Hm1<? super C4314CtC> hm1) {
        this.A00 = hm1;
    }

    @Override // X.InterfaceC4370CuQ
    public final /* bridge */ /* synthetic */ void AT2(GetCredentialException getCredentialException) {
        GetCredentialException getCredentialException2 = getCredentialException;
        C7384Etj.A0Y(getCredentialException2, 0);
        Hm1<C4314CtC> hm1 = this.A00;
        if (hm1.isActive()) {
            BV7.A1K(getCredentialException2, hm1);
        }
    }
}
