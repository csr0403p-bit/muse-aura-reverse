package X;

/* renamed from: X.BSq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2290BSq implements Dg3, C2Kw {
    public final int $t;
    public final Object A00;

    public C2290BSq(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        boolean z;
        switch (this.$t) {
            case 0:
                AbstractC1718Ap2 abstractC1718Ap2 = (AbstractC1718Ap2) this.A00;
                if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
                    abstractC1718Ap2.A0C();
                    break;
                }
                break;
            case 1:
                C9nm c9nm = (C9nm) this.A00;
                c9nm.A01 = enumC3085Bxl.A01();
                C9nm.A00(c9nm);
                break;
            case 2:
                A6Q a6q = (A6Q) this.A00;
                C7384Etj.A0Y(enumC3085Bxl, 2);
                if (enumC3085Bxl != EnumC3085Bxl.ON_START) {
                    z = enumC3085Bxl != EnumC3085Bxl.ON_STOP;
                }
                a6q.A02 = z;
                break;
            default:
                C7384Etj.A0Y(enumC3085Bxl, 1);
                if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
                    ((AFR) this.A00).A00();
                    break;
                }
                break;
        }
    }
}
