package X;

/* renamed from: X.1Yw, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Yw implements C3UH {
    public final float A00;
    public final long A01;
    public final boolean A02;

    @Override // X.C3UH
    public final C1Z3 create(C0dy c0dy) {
        return new C1Z8(c0dy, new C1DN() { // from class: X.1Yz
            @Override // X.C1DN
            public final long AO0() {
                return this.A00.A01;
            }
        }, this.A00, this.A02);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1Yw) {
            C1Yw c1Yw = (C1Yw) obj;
            if (this.A02 == c1Yw.A02 && C1DG.A08(this.A00, c1Yw.A00)) {
                long j = this.A01;
                long j2 = c1Yw.A01;
                long j3 = B6A.A01;
                return AnonymousClass002.A1M((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            }
        }
        return false;
    }

    @Override // X.C3UH
    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(C0KA.A02(this.A02), this.A00) * 31;
        long j = this.A01;
        long j2 = B6A.A01;
        return AnonymousClass006.A05(j, iA02);
    }

    public C1Yw(float f, long j, boolean z) {
        this.A02 = z;
        this.A00 = f;
        this.A01 = j;
    }

    @Override // X.InterfaceC05011Yg
    public final /* synthetic */ InterfaceC05111Yt rememberUpdatedInstance(C0dy c0dy, BFM bfm, int i) {
        bfm.AgE(1257603829);
        C1Z0 c1z0 = C1Z0.A00;
        AnonymousClass002.A19(bfm);
        return c1z0;
    }
}
