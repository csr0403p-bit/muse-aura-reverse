package X;

/* renamed from: X.8sK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sK extends C06G {
    public final AnonymousClass962 A00;
    public final float A01;
    public final float A02;
    public final C8sL A03;
    public final C8sM A04;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8sK() {
        long j = 0;
        this(new C8sL(1023, j, j, j, j, j, j, false), new AnonymousClass962(null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 268435455, 0L, 0L, 0L, 0L, 0L, 0L), new C8sM(127, j, j), 24.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8sK) {
                C8sK c8sK = (C8sK) obj;
                if (!C1DG.A08(this.A02, c8sK.A02) || Float.compare(this.A01, c8sK.A01) != 0 || !C7384Etj.areEqual(this.A03, c8sK.A03) || !C7384Etj.areEqual(this.A00, c8sK.A00) || !C7384Etj.areEqual(this.A04, c8sK.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A03, AnonymousClass005.A02(C8j4.A04(this.A02), this.A01))));
    }

    public C8sK(C8sL c8sL, AnonymousClass962 anonymousClass962, C8sM c8sM, float f) {
        this.A02 = f;
        this.A01 = 1.0f;
        this.A03 = c8sL;
        this.A00 = anonymousClass962;
        this.A04 = c8sM;
    }
}
