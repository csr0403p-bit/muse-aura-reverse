package X;

/* loaded from: classes5.dex */
public final class CFA implements InterfaceC3390CIx {
    public final /* synthetic */ CF9 A00;

    public CFA(CF9 cf9) {
        this.A00 = cf9;
    }

    @Override // X.CIz
    public final /* bridge */ /* synthetic */ void onStateUpdate(CJN cjn) {
        CJN cjn2 = cjn;
        C7384Etj.A0Y(cjn2, 0);
        C3381CIn c3381CIn = (C3381CIn) cjn2;
        this.A00.A02("State updated id: %d status: %d errorCode: %d", Integer.valueOf(c3381CIn.A00), Integer.valueOf(c3381CIn.A01), Integer.valueOf(c3381CIn.A02));
    }
}
