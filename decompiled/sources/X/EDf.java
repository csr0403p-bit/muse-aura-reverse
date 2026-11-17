package X;

import java.io.File;

/* loaded from: classes5.dex */
public final class EDf implements InterfaceC6536EDr {
    public InterfaceC6544EDz A00;
    public final ED8 A01;

    /* JADX INFO: Incorrect field signature: TT; */
    public final EDT A02;

    /* JADX WARN: Incorrect types in method signature: (TT;LX/EDz;)V */
    public EDf(InterfaceC6544EDz interfaceC6544EDz, EDT edt) {
        C7384Etj.A0Y(edt, 0);
        this.A02 = edt;
        this.A00 = interfaceC6544EDz;
        this.A01 = ((EE6) edt).getStore("stale_removal");
    }

    @Override // X.InterfaceC6536EDr
    public final /* bridge */ /* synthetic */ void onPathRequested(EDW edw, EE9 ee9, File file) {
        C6533EDj c6533EDj = (C6533EDj) ee9;
        AnonymousClass005.A0x(edw, c6533EDj, file);
        this.A02.getExecutor(BYM.A02).execute(new RunnableC6532EDe(edw, this, c6533EDj, file));
    }
}
