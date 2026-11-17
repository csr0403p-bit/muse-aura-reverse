package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class BfA extends BfD {
    public static final Executor A07;
    public BgO A00;
    public BmM A01;
    public BjC A02;
    public BgX A03;
    public C2625Bfs A04;
    public BfK A05;
    public Executor A06;

    static {
        C2601Bez c2601Bez = AbstractC2600Bey.A02;
        A07 = BoS.A00();
    }

    public static void A00(BfA bfA) {
        C2625Bfs c2625Bfs = bfA.A04;
        if (c2625Bfs != null) {
            C2625Bfs.A00(c2625Bfs);
            bfA.A04 = null;
        }
        BjC bjC = bfA.A02;
        if (bjC != null) {
            bjC.A02();
            bfA.A02 = null;
        }
        BfK bfK = bfA.A05;
        if (bfK != null) {
            bfK.A03();
            bfA.A05 = null;
        }
        bfA.A01 = null;
    }

    public final void A0X(BgO bgO) {
        Integer num;
        Executor executor = A07;
        BoT.A00();
        if (bgO == null) {
            this.A00 = null;
            num = C79.A01;
        } else {
            this.A00 = bgO;
            this.A06 = executor;
            AbstractC2481Bc8 abstractC2481Bc8 = super.A04;
            if (abstractC2481Bc8 != null && ((C2492BcJ) abstractC2481Bc8).A01 != null) {
                A02(this, (C2593Beq) super.A05, abstractC2481Bc8);
                A0N();
            }
            num = C79.A00;
        }
        this.A07 = num;
        A0O();
    }

    public final String toString() {
        return FGI.A0M("Preview:", A0I());
    }

    public static void A01(BfA bfA) {
        InterfaceC2610Bfb interfaceC2610BfbA0B = bfA.A0B();
        BfK bfK = bfA.A05;
        if (interfaceC2610BfbA0B == null || bfK == null) {
            return;
        }
        BoT.A01(new RunnableC2629Bfw(bfK, bfA.A09(interfaceC2610BfbA0B, bfA.A0W(interfaceC2610BfbA0B)), InterfaceC2586Bei.A00(InterfaceC2551Bdc.A00, ((BfD) bfA).A05, -1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(final X.BfA r16, X.C2593Beq r17, X.AbstractC2481Bc8 r18) {
        /*
            X.BoT.A00()
            r2 = r16
            X.Bfb r3 = r2.A0B()
            r3.getClass()
            A00(r2)
            X.BfK r0 = r2.A05
            boolean r1 = X.AnonymousClass002.A1Y(r0)
            r0 = 0
            X.BeS.A07(r1, r0)
            android.graphics.Matrix r8 = r2.A00
            boolean r15 = r3.AG8()
            r10 = r18
            r1 = r10
            X.BcJ r1 = (X.C2492BcJ) r1
            android.util.Size r4 = r1.A01
            android.graphics.Rect r9 = r2.A01
            if (r9 != 0) goto L30
            if (r4 == 0) goto Lf2
            android.graphics.Rect r9 = X.BfD.A08(r4)
        L30:
            r9.getClass()
            boolean r0 = r2.A0W(r3)
            int r13 = r2.A09(r3, r0)
            X.BfN<?> r6 = r2.A05
            r5 = -1
            X.BdI<java.lang.Integer> r0 = X.InterfaceC2551Bdc.A00
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r6.Abl(r0, r5)
            int r14 = X.AnonymousClass001.A0F(r0)
            if (r15 == 0) goto L56
            boolean r0 = r2.A0W(r3)
            r16 = 1
            if (r0 != 0) goto L58
        L56:
            r16 = 0
        L58:
            r11 = 1
            r12 = 34
            X.BfK r7 = new X.BfK
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.A05 = r7
            X.Bfz r6 = new X.Bfz
            r6.<init>()
            X.BoT.A00()
            X.BfK.A00(r7)
            java.util.Set<java.lang.Runnable> r0 = r7.A0C
            r0.add(r6)
            X.BfK r0 = r2.A05
            X.BmM r0 = r0.A02(r3)
            r2.A01 = r0
            X.BjC r0 = r0.A07
            r2.A02 = r0
            X.BgO r0 = r2.A00
            if (r0 == 0) goto L99
            A01(r2)
            X.BgO r7 = r2.A00
            r7.getClass()
            X.BmM r6 = r2.A01
            r6.getClass()
            java.util.concurrent.Executor r3 = r2.A06
            X.Bfy r0 = new X.Bfy
            r0.<init>()
            r3.execute(r0)
        L99:
            r8 = r17
            X.BgX r6 = X.BgX.A00(r4, r8)
            android.util.Range<java.lang.Integer> r7 = r1.A00
            X.Bgc r4 = r6.A04
            X.BdI<android.util.Range<java.lang.Integer>> r3 = X.C2646Bgd.A09
            X.Bef r0 = r4.A02
            r0.ANl(r3, r7)
            X.BdI<java.lang.Integer> r3 = X.BfN.A05
            r0 = 0
            int r0 = X.InterfaceC2586Bei.A00(r3, r8, r0)
            if (r0 == 0) goto Lb6
            X.InterfaceC2583Bef.A00(r4, r3, r0)
        Lb6:
            X.Beh r0 = r1.A03
            if (r0 == 0) goto Lbd
            r4.A02(r0)
        Lbd:
            X.BgO r0 = r2.A00
            if (r0 == 0) goto Ld4
            X.BjC r4 = r2.A02
            X.Bcd r3 = r1.A02
            X.BfN<?> r1 = r2.A05
            X.BdI<java.lang.Integer> r0 = X.InterfaceC2551Bdc.A04
            java.lang.Object r0 = r1.Abl(r0, r5)
            int r0 = X.AnonymousClass001.A0F(r0)
            r6.A03(r3, r4, r0)
        Ld4:
            X.Bfs r0 = r2.A04
            if (r0 == 0) goto Ldd
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            r0.set(r11)
        Ldd:
            r0 = 3
            X.F4v r1 = new X.F4v
            r1.<init>(r2, r0)
            X.Bfs r0 = new X.Bfs
            r0.<init>(r1)
            r2.A04 = r0
            r6.A02 = r0
            r2.A03 = r6
            X.AbstractC2390BYs.A01(r2, r6)
            return
        Lf2:
            r9 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BfA.A02(X.BfA, X.Beq, X.Bc8):void");
    }
}
