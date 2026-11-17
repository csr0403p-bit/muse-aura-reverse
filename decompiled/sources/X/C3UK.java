package X;

import kotlin.Unit;

/* renamed from: X.3UK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3UK extends Ab8<C3UL> {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;
    public final G0U<ASF, Unit> A05;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A02;
        float f2 = this.A03;
        float f3 = this.A01;
        float f4 = this.A00;
        boolean z = this.A04;
        C3UL c3ul = new C3UL();
        c3ul.A02 = f;
        c3ul.A03 = f2;
        c3ul.A01 = f3;
        c3ul.A00 = f4;
        c3ul.A04 = z;
        return c3ul;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        C3UK c3uk = obj instanceof C3UK ? (C3UK) obj : null;
        return c3uk != null && C1DG.A08(this.A02, c3uk.A02) && C1DG.A08(this.A03, c3uk.A03) && C1DG.A08(this.A01, c3uk.A01) && C1DG.A08(this.A00, c3uk.A00) && this.A04 == c3uk.A04;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(Float.floatToIntBits(this.A02) * 31, this.A03), this.A01), this.A00), this.A04);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A05.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C3UL c3ul = (C3UL) abstractC1439Aj8;
        c3ul.A02 = this.A02;
        c3ul.A03 = this.A03;
        c3ul.A01 = this.A01;
        c3ul.A00 = this.A00;
        c3ul.A04 = this.A04;
    }

    /* JADX WARN: Incorrect types in method signature: (FFFFZLX/G0U<-LX/ASF;Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3UK(X.G0U r3, float r4, float r5, float r6, float r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A02 = r4
            r2.A03 = r5
            r2.A01 = r6
            r2.A00 = r7
            r2.A04 = r8
            r2.A05 = r3
            r3 = 0
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1b
            boolean r0 = java.lang.Float.isNaN(r4)
            r2 = 0
            if (r0 == 0) goto L1c
        L1b:
            r2 = 1
        L1c:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L27
            boolean r1 = java.lang.Float.isNaN(r5)
            r0 = 0
            if (r1 == 0) goto L28
        L27:
            r0 = 1
        L28:
            r2 = r2 & r0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L34
            boolean r1 = java.lang.Float.isNaN(r6)
            r0 = 0
            if (r1 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r2 = r2 & r0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L40
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto L45
        L40:
            r0 = r2 & 1
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.String r1 = "Padding must be non-negative"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UK.<init>(X.G0U, float, float, float, float, boolean):void");
    }
}
