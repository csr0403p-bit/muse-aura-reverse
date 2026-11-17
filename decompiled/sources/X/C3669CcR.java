package X;

/* renamed from: X.CcR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3669CcR {
    public final C3704Cd2 A00;
    public final C3555CTs A01;

    public C3669CcR(C3555CTs c3555CTs) {
        C3704Cd2 c3704Cd2;
        synchronized (CcT.class) {
            C3677Ccb c3677Ccb = new C3677Ccb();
            C3683Cch c3683Cch = CcT.A00;
            if (c3683Cch == null) {
                c3683Cch = new C3683Cch();
                CcT.A00 = c3683Cch;
            }
            c3704Cd2 = (C3704Cd2) c3683Cch.A00(c3677Ccb);
        }
        this.A01 = c3555CTs;
        this.A00 = c3704Cd2;
    }
}
