package X;

/* renamed from: X.FEm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7782FEm {
    public final FEI<?, ?> A00;
    public final FDW A01;

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FEI<**>;)V */
    public C7782FEm(FEI fei, FDW fdw) {
        C7384Etj.A0Y(fdw, 0);
        this.A01 = fdw;
        this.A00 = fei;
    }

    public final boolean A00(C7782FEm c7782FEm) {
        C7384Etj.A0Y(c7782FEm, 0);
        return Ht0.A00(this.A01, c7782FEm.A01) && this.A00.A00 == c7782FEm.A00.A00;
    }
}
