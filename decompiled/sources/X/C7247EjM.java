package X;

/* renamed from: X.EjM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7247EjM implements Dg3 {
    public final /* synthetic */ C7240EjB A00;

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        int iA0E = AnonymousClass001.A0E(enumC3085Bxl, 1);
        if (iA0E == 4) {
            C7240EjB c7240EjB = this.A00;
            if (c7240EjB.A05) {
                return;
            }
            C7240EjB.A02(c7240EjB);
            c7240EjB.A04 = true;
            return;
        }
        if (iA0E == 1) {
            C7240EjB c7240EjB2 = this.A00;
            if (c7240EjB2.A04) {
                c7240EjB2.A04 = false;
                C7240EjB.A01(c7240EjB2);
            }
        }
    }

    public C7247EjM(C7240EjB c7240EjB) {
        this.A00 = c7240EjB;
    }
}
