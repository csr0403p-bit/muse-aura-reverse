package X;

/* renamed from: X.B9g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2187B9g implements AutoCloseable, Dg3 {
    public final /* synthetic */ AbstractC2185B9e A00;
    public final /* synthetic */ C2186B9f A01;
    public final /* synthetic */ F2N A02;
    public final /* synthetic */ B9Z<?> A03;

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C7384Etj.A0Y(enumC3085Bxl, 1);
        boolean z = false;
        B9Z<?> b9z = this.A03;
        if (enumC3085Bxl.A01().A00(EnumC10573Huf.A06) && this.A00.A00) {
            z = true;
        }
        b9z.A02(z);
        if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
            b9z.A01();
            this.A02.A05(this);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/B9Z<*>;LX/B9e;LX/B9f;LX/F2N;)V */
    public C2187B9g(AbstractC2185B9e abstractC2185B9e, C2186B9f c2186B9f, F2N f2n, B9Z b9z) {
        this.A03 = b9z;
        this.A00 = abstractC2185B9e;
        this.A01 = c2186B9f;
        this.A02 = f2n;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A02.A05(this);
    }
}
