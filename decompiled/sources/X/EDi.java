package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class EDi implements InterfaceC6536EDr {
    public final ED8 A00;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDT A01;

    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public EDi(EDT edt) {
        C7384Etj.A0Y(edt, 0);
        this.A01 = edt;
        this.A00 = ((EE6) edt).getStore("version");
    }

    @Override // X.InterfaceC6536EDr
    public final /* bridge */ /* synthetic */ void onPathRequested(EDW edw, EE9 ee9, File file) {
        C7384Etj.A0Y(null, 1);
        throw F60.createAndThrow();
    }
}
