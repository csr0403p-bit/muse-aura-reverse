package X;

import java.util.Map;

/* renamed from: X.Ahr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1365Ahr implements AXY, C3Su {
    public final /* synthetic */ C1369Ahv A00;
    public final /* synthetic */ C1364Ahq A01;

    public C1365Ahr(C1369Ahv c1369Ahv) {
        this.A00 = c1369Ahv;
        this.A01 = c1369Ahv.A0C;
    }

    @Override // X.AXN
    public final float AEm() {
        return this.A01.A00;
    }

    @Override // X.C0dm
    public final float AFo() {
        return this.A01.A01;
    }

    @Override // X.C3TF
    public final boolean AOh() {
        return this.A01.AOh();
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APV(Map map, G0U g0u, int i, int i2) {
        return this.A01.APV(map, g0u, i, i2);
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Map<LX/Ak0;Ljava/lang/Integer;>;LX/G0U<-LX/Amr;Lkotlin/Unit;>;LX/G0U<-LX/AYU;Lkotlin/Unit;>;)LX/Abi; */
    @Override // X.AXY
    public final InterfaceC1134Abi APW(Map map, G0U g0u, G0U g0u2, int i, int i2) {
        return this.A01.APW(map, g0u, g0u2, i, i2);
    }

    @Override // X.AXN
    public final int Abr(float f) {
        return ASU.A01(this.A01, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    @Override // X.C3Su
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C3TG> AgZ(java.lang.Object r10, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r11) {
        /*
            r9 = this;
            X.Ahv r5 = r9.A00
            X.AHu<java.lang.Object, X.AjM> r8 = r5.A09
            java.lang.Object r2 = r8.A05(r10)
            X.AjM r2 = (X.C1453AjM) r2
            if (r2 == 0) goto L27
            X.AjM r0 = r5.A0D
            X.Ahu<X.AjM> r0 = r0.A0e
            X.AHm<T> r0 = r0.A00
            java.util.List r0 = r0.A08()
            int r1 = r0.indexOf(r2)
            int r0 = r5.A01
            if (r1 >= r0) goto L27
            X.AjS r0 = r2.A0d
            X.AjN r0 = r0.A0G
            java.util.List r0 = r0.A0c()
        L26:
            return r0
        L27:
            X.AHm<java.lang.Object> r2 = r5.A0A
            int r1 = r2.A00
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r1 < r0) goto Ldc
            java.lang.Object r7 = r8.A05(r10)
            int r0 = r2.A00
            int r1 = r5.A00
            if (r0 != r1) goto Ld3
            r2.A0G(r10)
        L3e:
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            X.AHu<java.lang.Object, X.AjM> r6 = r5.A08
            boolean r0 = r6.A06(r10)
            if (r0 != 0) goto Lb2
            if (r7 != 0) goto L7d
            X.C1369Ahv.A08(r5, r10, r11, r4)
            X.AfC r1 = X.C1369Ahv.A00(r5, r10)
            X.AHu<java.lang.Object, X.AfC> r0 = r5.A06
            r0.A0E(r10, r1)
        L5a:
            java.lang.Object r0 = r6.A05(r10)
            X.AjM r0 = (X.C1453AjM) r0
            if (r0 == 0) goto Ld9
            X.AjS r0 = r0.A0d
            X.AjN r0 = r0.A0G
            java.util.List r0 = r0.A0c()
            int r2 = r0.size()
        L6e:
            if (r4 >= r2) goto L26
            java.lang.Object r1 = r0.get(r4)
            X.AjN r1 = (X.C1454AjN) r1
            X.AjS r1 = r1.A0T
            r1.A08 = r3
            int r4 = r4 + 1
            goto L6e
        L7d:
            X.AjM r2 = r5.A0D
            X.Ahu<X.AjM> r0 = r2.A0e
            X.AHm<T> r9 = r0.A00
            java.util.List r0 = r9.A08()
            int r1 = r0.indexOf(r7)
            java.util.List r0 = r9.A08()
            int r0 = r0.size()
            X.C1369Ahv.A05(r5, r1, r0)
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A02 = r0
            r8.A0B(r10)
            r6.A0E(r10, r7)
            X.AHu<java.lang.Object, X.AfC> r1 = r5.A06
            X.AfC r0 = X.C1369Ahv.A00(r5, r10)
            r1.A0E(r10, r0)
            X.AjX r0 = r2.A0D
            if (r0 == 0) goto Lb2
            r5.A0A()
        Lb2:
            java.lang.Object r2 = r6.A05(r10)
            X.AjM r2 = (X.C1453AjM) r2
            if (r2 == 0) goto L5a
            X.AHu<X.AjM, X.Ai1> r0 = r5.A07
            java.lang.Object r1 = r0.A05(r2)
            X.Ai1 r1 = (X.C1375Ai1) r1
            if (r1 == 0) goto L5a
            boolean r0 = r1.A06
            if (r0 != r3) goto Lcb
            X.C1369Ahv.A06(r5, r2, r10, r11, r4)
        Lcb:
            X.Aht r0 = r1.A01
            if (r0 == 0) goto L5a
            X.C1369Ahv.A03(r1, r5, r3)
            goto L5a
        Ld3:
            T[] r0 = r2.A01
            r0[r1] = r10
            goto L3e
        Ld9:
            X.AGi r0 = X.C0881AGi.A00
            return r0
        Ldc:
            java.lang.String r0 = "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365Ahr.AgZ(java.lang.Object, X.G0V):java.util.List");
    }

    @Override // X.C0dm
    public final float Agw(long j) {
        return AbstractC1499Ak6.A00(this.A01, j);
    }

    @Override // X.AXN
    public final float Agx(float f) {
        return f / this.A01.A00;
    }

    @Override // X.AXN
    public final float Agy(int i) {
        return i / this.A01.A00;
    }

    @Override // X.AXN
    public final long Agz(long j) {
        return ASU.A02(this.A01, j);
    }

    @Override // X.AXN
    public final float Ah3(long j) {
        return ASU.A00(j, this.A01);
    }

    @Override // X.AXN
    public final float Ah4(float f) {
        return f * this.A01.A00;
    }

    @Override // X.AXN
    public final long Ah6(long j) {
        return ASU.A03(this.A01, j);
    }

    @Override // X.C0dm
    public final long Ah7(float f) {
        return AbstractC1499Ak6.A01(this.A01, f);
    }

    @Override // X.AXN
    public final long Ah8(float f) {
        return AXN.A02(this.A01, f);
    }

    @Override // X.AXN
    public final long Ah9(int i) {
        return AXN.A03(this.A01, i);
    }

    @Override // X.C3TF
    public final EnumC1820Arj getLayoutDirection() {
        return this.A01.A02;
    }
}
