package X;

import androidx.credentials.exceptions.GetCredentialException;

/* renamed from: X.Csz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4311Csz implements InterfaceC4370CuQ<C4381Cug, GetCredentialException> {
    public final /* synthetic */ Hm1<C4381Cug> A00;

    @Override // X.InterfaceC4370CuQ
    public final /* bridge */ /* synthetic */ void onResult(C4381Cug c4381Cug) {
        C7384Etj.A0Y(c4381Cug, 0);
        Hm1<C4381Cug> hm1 = this.A00;
        if (hm1.isActive()) {
            hm1.resumeWith(c4381Cug);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4311Csz(Hm1<? super C4381Cug> hm1) {
        this.A00 = hm1;
    }

    @Override // X.InterfaceC4370CuQ
    public final /* bridge */ /* synthetic */ void AT2(GetCredentialException getCredentialException) {
        GetCredentialException getCredentialException2 = getCredentialException;
        C7384Etj.A0Y(getCredentialException2, 0);
        Hm1<C4381Cug> hm1 = this.A00;
        if (hm1.isActive()) {
            BV7.A1K(getCredentialException2, hm1);
        }
    }
}
