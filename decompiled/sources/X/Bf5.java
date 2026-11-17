package X;

import android.util.Size;

/* loaded from: classes5.dex */
public final class Bf5 implements BgN, Bg5 {
    public final C2582Bee A00;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r2 == 2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2605BfM A00() {
        /*
            r5 = this;
            X.Bee r5 = r5.A00
            X.BdI<java.lang.Integer> r1 = X.Bf6.A01
            r0 = 0
            java.lang.Object r2 = r5.Abk(r1)     // Catch: java.lang.IllegalArgumentException -> L11
            if (r2 == 0) goto L11
            X.BdI<java.lang.Integer> r1 = X.InterfaceC2490BcH.A01
            r5.ANl(r1, r2)
            goto L32
        L11:
            X.BfM r1 = X.C2605BfM.$redex_init_class
            X.BdI<java.lang.Integer> r1 = X.Bf6.A09
            r2 = 0
            java.lang.Object r2 = r5.Abk(r1)     // Catch: java.lang.IllegalArgumentException -> L1a
        L1a:
            java.lang.Integer r1 = X.BV4.A0W()
            boolean r1 = X.C6xC.A00(r2, r1)
            X.BdI<java.lang.Integer> r2 = X.InterfaceC2490BcH.A01
            if (r1 == 0) goto L46
            r1 = 4101(0x1005, float:5.747E-42)
            X.BV6.A11(r2, r5, r1)
            X.BdI<X.Bcd> r2 = X.InterfaceC2490BcH.A00
            X.Bcd r1 = X.C2507Bcd.A08
            r5.ANl(r2, r1)
        L32:
            X.Beg r2 = X.C2584Beg.A02(r5)
            X.Bf6 r1 = new X.Bf6
            r1.<init>(r2)
            X.AbstractC2552Bdd.A00(r1)
            X.BfM r4 = new X.BfM
            r4.<init>(r1)
            X.BdI<android.util.Size> r1 = X.InterfaceC2551Bdc.A08
            goto L4c
        L46:
            r1 = 256(0x100, float:3.59E-43)
            X.BV6.A11(r2, r5, r1)
            goto L32
        L4c:
            java.lang.Object r0 = r5.Abk(r1)     // Catch: java.lang.IllegalArgumentException -> L50
        L50:
            android.util.Size r0 = (android.util.Size) r0
            if (r0 == 0) goto L5a
            android.util.Rational r0 = X.BV8.A0Y(r0)
            r4.A00 = r0
        L5a:
            X.BdI<java.util.concurrent.Executor> r0 = X.InterfaceC2570Bdz.A00
            java.util.concurrent.Executor r1 = X.BpJ.A00()
            java.lang.Object r1 = r5.Abk(r0)     // Catch: java.lang.IllegalArgumentException -> L64
        L64:
            java.lang.String r0 = "The IO executor can't be null"
            X.BeS.A03(r1, r0)
            X.BdI<java.lang.Integer> r1 = X.Bf6.A03
            java.util.TreeMap<X.BdI<?>, java.util.Map<X.BY1, java.lang.Object>> r0 = r5.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L8a
            java.lang.Object r3 = r5.Abk(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L9b
            int r2 = r3.intValue()
            r1 = 3
            if (r2 == 0) goto L8a
            r0 = 1
            if (r2 == r0) goto L8a
            if (r2 == r1) goto L8b
            r0 = 2
            if (r2 != r0) goto L9b
        L8a:
            return r4
        L8b:
            X.BdI<X.BlA> r0 = X.Bf6.A0C
            java.lang.Object r0 = r5.Abk(r0)     // Catch: java.lang.IllegalArgumentException -> L94
            if (r0 == 0) goto L94
            return r4
        L94:
            java.lang.String r0 = "The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L9b:
            java.lang.String r0 = "The flash mode is not allowed to set: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0O(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bf5.A00():X.BfM");
    }

    @Override // X.BgG
    public final C2582Bee AHr() {
        return this.A00;
    }

    @Override // X.BgN
    public final /* bridge */ /* synthetic */ BfN AMK() {
        return new Bf6(C2584Beg.A02(this.A00));
    }

    @Override // X.Bg5
    @Deprecated
    public final /* bridge */ /* synthetic */ void Aew(Size size) {
        this.A00.ANl(InterfaceC2551Bdc.A08, size);
    }

    @Override // X.Bg5
    public final /* bridge */ /* synthetic */ void Aex(int i) {
        BV6.A11(InterfaceC2551Bdc.A09, this.A00, i);
    }

    public Bf5(C2582Bee c2582Bee) {
        this.A00 = c2582Bee;
        AbstractC2531BdI<Class<?>> abstractC2531BdI = BdG.A00;
        try {
            Object objAbk = c2582Bee.Abk(abstractC2531BdI);
            if (objAbk != null && !objAbk.equals(C2605BfM.class)) {
                throw BV5.A0P(objAbk, ": ", C3cG.A0f(this, "Invalid target class configuration for "));
            }
        } catch (IllegalArgumentException unused) {
        }
        this.A00.ANl(BfN.A01, EnumC2489BcG.IMAGE_CAPTURE);
        C2582Bee c2582Bee2 = this.A00;
        c2582Bee2.ANl(abstractC2531BdI, C2605BfM.class);
        AbstractC2531BdI<String> abstractC2531BdI2 = BdG.A01;
        try {
            if (c2582Bee2.Abk(abstractC2531BdI2) != null) {
                return;
            }
        } catch (IllegalArgumentException unused2) {
        }
        BV8.A1F(abstractC2531BdI2, c2582Bee2, C2605BfM.class);
    }

    public Bf5() {
        this(C2582Bee.A00());
    }
}
