package X;

import kotlin.Unit;

/* renamed from: X.Al4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1541Al4 extends AbstractC1439Aj8 implements InterfaceC1332AhJ, InterfaceC1451AjK, InterfaceC2269BPv {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public long A04;
    public C1DM A05;
    public C1542Al5 A06;
    public C1543Al6 A07;
    public AXN A08;
    public G0U<? super InterfaceC2269BPv, Unit> A09;
    public boolean A0A;

    public static final void A00(C1541Al4 c1541Al4) {
        c1541Al4.A07 = null;
        c1541Al4.A06 = null;
        AaD.A00(c1541Al4);
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        this.A0A = false;
        A00(this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agy(int i) {
        return i / AEm();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1541Al4)) {
                C1541Al4 c1541Al4 = (C1541Al4) obj;
                if (this.A00 == c1541Al4.A00 && C7384Etj.areEqual(this.A05, c1541Al4.A05) && this.A09 == c1541Al4.A09 && this.A01 == c1541Al4.A01 && this.A04 == c1541Al4.A04) {
                    long j = this.A03;
                    long j2 = c1541Al4.A03;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A02 != c1541Al4.A02) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AXN
    public final float AEm() {
        AXN axn = this.A08;
        if (axn != null) {
            return axn.AEm();
        }
        return 1.0f;
    }

    @Override // X.C0dm
    public final float AFo() {
        AXN axn = this.A08;
        if (axn != null) {
            return axn.AFo();
        }
        return 1.0f;
    }

    @Override // X.BPo
    public final void Ad4(long j) {
        if (j == 16) {
            j = B6A.A01;
        }
        long j2 = this.A03;
        long j3 = B6A.A01;
        if (j2 != j) {
            this.A03 = j;
            A00(this);
        }
    }

    @Override // X.BPo
    public final void AeL(float f) {
        if (this.A01 != f) {
            this.A01 = f;
            A00(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // X.InterfaceC1332AhJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(X.C16Z r17) {
        /*
            r16 = this;
            r2 = r16
            boolean r0 = r2.A0A
            if (r0 != 0) goto L3e
            r0 = 1
            r2.A0A = r0
            r0 = 0
            r2.AeL(r0)
            r5 = 0
            long r3 = r2.A04
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L1a
            r2.A04 = r5
            X.AaD.A00(r2)
        L1a:
            long r0 = X.B6A.A01
            r2.Ad4(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2c
            r2.A00 = r1
            A00(r2)
        L2c:
            r1 = 3
            int r0 = r2.A02
            if (r0 == r1) goto L36
            r2.A02 = r1
            A00(r2)
        L36:
            r0 = 7
            X.BUc r0 = X.C2328BUc.A00(r2, r0)
            X.AbstractC1441AjA.A00(r2, r0)
        L3e:
            X.Al6 r5 = r2.A07
            X.Al5 r11 = r2.A06
            r8 = 0
            float r9 = r2.A01
            float r0 = r2.AEm()
            float r9 = r9 / r0
            r10 = 0
            float r0 = r2.AEm()
            float r10 = r10 / r0
            long r0 = r2.A04
            float r6 = X.AnonymousClass001.A00(r0)
            float r0 = r2.AEm()
            float r6 = r6 / r0
            long r3 = r2.A04
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r1 = X.AnonymousClass001.A01(r3, r0)
            float r0 = r2.AEm()
            float r1 = r1 / r0
            long r13 = X.AnonymousClass005.A0M(r6, r1)
            if (r11 == 0) goto Lba
            if (r5 == 0) goto Lba
            float r0 = r5.A01
            boolean r0 = X.C1DG.A08(r0, r9)
            if (r0 == 0) goto Lba
            float r0 = r5.A02
            boolean r0 = X.C1DG.A08(r0, r10)
            if (r0 == 0) goto Lba
            long r3 = r5.A04
            long r0 = r2.A03
            long r6 = X.B6A.A01
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto Lba
            X.1EQ r0 = r5.A06
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 == 0) goto Lba
            float r1 = r5.A00
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Lba
            int r1 = r5.A03
            int r0 = r2.A02
            if (r1 != r0) goto Lba
            long r0 = r5.A05
            int r3 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r3 != 0) goto Lba
        La9:
            r12 = r17
            long r13 = r12.AKb()
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = r8
            r11.m10drawx_KDEd0(r12, r13, r15, r16)
            r12.A9O()
            return
        Lba:
            long r15 = r2.A03
            float r11 = r2.A00
            int r12 = r2.A02
            r3 = 16
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 != 0) goto Lc8
            long r15 = X.B6A.A01
        Lc8:
            X.Al6 r7 = new X.Al6
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            r2.A07 = r7
            X.ASQ r0 = X.AbstractC1414Aij.A02(r2)
            X.ASS r1 = r0.AKX()
            X.1DM r0 = r2.A05
            X.Al8 r1 = (X.C1545Al8) r1
            X.Al5 r11 = new X.Al5
            r11.<init>(r0, r1, r7)
            r2.A06 = r11
            goto La9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1541Al4.draw(X.16Z):void");
    }

    public final int hashCode() {
        int iA06 = AnonymousClass006.A06(this.A04, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A09, AnonymousClass005.A0F(this.A05, C8j4.A04(this.A00))), this.A01), 0.0f));
        long j = this.A03;
        long j2 = B6A.A01;
        return (AnonymousClass006.A06(j, iA06) * 31) + this.A02;
    }

    @Override // X.AbstractC1439Aj8
    /* renamed from: onDensityChange */
    public final void onViewConfigurationChange() {
        if (this.isAttached) {
            AXN axnA08 = AbstractC1414Aij.A08(this);
            if (C7384Etj.areEqual(this.A08, axnA08)) {
                return;
            }
            this.A08 = axnA08;
            this.A0A = false;
            A00(this);
        }
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // X.AXN
    public final /* synthetic */ int Abr(float f) {
        return ASU.A01(this, f);
    }

    @Override // X.C0dm
    public final /* synthetic */ float Agw(long j) {
        return AbstractC1499Ak6.A00(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Agx(float f) {
        return f / AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Agz(long j) {
        return ASU.A02(this, j);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah3(long j) {
        return ASU.A00(j, this);
    }

    @Override // X.AXN
    public final /* synthetic */ float Ah4(float f) {
        return f * AEm();
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah6(long j) {
        return ASU.A03(this, j);
    }

    @Override // X.C0dm
    public final /* synthetic */ long Ah7(float f) {
        return AbstractC1499Ak6.A01(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah8(float f) {
        return AXN.A02(this, f);
    }

    @Override // X.AXN
    public final /* synthetic */ long Ah9(int i) {
        return AXN.A03(this, i);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AXN axnA08 = AbstractC1414Aij.A08(this);
        if (C7384Etj.areEqual(this.A08, axnA08)) {
            return;
        }
        this.A08 = axnA08;
        this.A0A = false;
        A00(this);
    }
}
