package X;

import com.facebook.rendercore.RenderTreeNode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FGD extends FGS {
    public boolean A00;
    public final C1523Akc A01;
    public final C7783FEo A02;
    public final FGB A03;
    public final FGB A04;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[LOOP:0: B:7:0x0022->B:8:0x0024, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A02(X.FGW r13, com.facebook.rendercore.RenderTreeNode r14, X.FCA r15) {
        /*
            r12 = this;
            r1 = r14
            X.FGT<?> r11 = r14.A07
            long r2 = r11.A0J()
            r8 = r12
            X.AXI<X.FGF> r0 = r12.A08
            java.lang.Object r10 = r0.A05(r2)
            X.FGF r10 = (X.FGF) r10
            if (r10 != 0) goto L38
            r12.A0R(r14)
            r6 = 1
        L16:
            r5 = 0
        L17:
            X.F0C r4 = r14.A09
            java.lang.Object r0 = r4.getValue()
            int r3 = X.AbstractC7607F5u.A0G(r0)
            r2 = 0
        L22:
            if (r2 >= r3) goto L53
            java.lang.Object r0 = r4.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            com.facebook.rendercore.RenderTreeNode r0 = (com.facebook.rendercore.RenderTreeNode) r0
            boolean r0 = r12.A02(r13, r0, r15)
            r5 = r5 | r0
            int r2 = r2 + 1
            goto L22
        L38:
            r6 = 0
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            X.F0C r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            int r2 = X.AbstractC7607F5u.A0G(r0)
            X.F0C r0 = r14.A09
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AbstractC7607F5u.A0G(r0)
            r5 = 1
            if (r2 != r0) goto L17
            goto L16
        L53:
            if (r10 == 0) goto L86
            java.lang.Object r13 = r10.A05
            com.facebook.rendercore.RenderTreeNode r0 = r10.A01
            X.FGT<?> r12 = r0.A07
            java.lang.Object r14 = r0.A08
            r10.A01 = r1
            if (r5 != 0) goto L75
            java.lang.Object r0 = r1.A08
            boolean r0 = r8.A0T(r12, r11, r14, r0)
            if (r0 != 0) goto L75
            r6 = 0
            boolean r0 = r10.A02
            if (r0 != 0) goto L71
            r8.A0O(r10)
        L71:
            r0 = 1
            r10.A02 = r0
            goto L7e
        L75:
            r6 = 1
            java.lang.Object r15 = r1.A08     // Catch: java.lang.Throwable -> L84
            X.AHt<java.lang.Object> r9 = X.HsU.A00     // Catch: java.lang.Throwable -> L84
            r8.A0L(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L84
            goto L71
        L7e:
            X.FGa r0 = r8.A00     // Catch: java.lang.Throwable -> L84
            r8.A0N(r0, r10, r1)     // Catch: java.lang.Throwable -> L84
            return r6
        L84:
            r0 = move-exception
            throw r0
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGD.A02(X.FGW, com.facebook.rendercore.RenderTreeNode, X.FCA):boolean");
    }

    @Override // X.FGS
    public final void A0P(FGW fgw) {
        C7384Etj.A0Y(fgw, 0);
        boolean zA0A = FBA.A0A(Hkz.A00(fgw));
        FGD fgd = FER.A00;
        FER.A00 = this;
        FGB fgb = this.A03;
        boolean z = fgb.A06.A03;
        try {
            if (!zA0A || z) {
                super.A0P(fgw);
            } else {
                F0C f0c = fgw.A02.A09;
                int iA0G = AbstractC7607F5u.A0G(f0c.getValue());
                for (int i = 0; i < iA0G; i++) {
                    A02(fgw, (RenderTreeNode) ((List) f0c.getValue()).get(i), fgb.A03);
                }
            }
        } finally {
            FER.A00 = fgd;
            if (fgd != null && z && this.A01.A01 != 0) {
                fgd.A00();
            }
            this.A01.A04();
        }
    }

    @Override // X.FGS
    public final void A0Q(FGW fgw, int i) {
        C7384Etj.A0Y(fgw, 0);
        if (!this.A03.A06.A03) {
            super.A0Q(fgw, i);
            return;
        }
        FGF fgfA05 = this.A08.A05(AbstractC7607F5u.A0M(fgw.A04[i]));
        int iA0G = fgfA05 != null ? AbstractC7607F5u.A0G(fgfA05.A01.A09.getValue()) : -1;
        super.A0Q(fgw, i);
        if (fgfA05 != null) {
            C1523Akc c1523Akc = this.A01;
            RenderTreeNode renderTreeNode = fgfA05.A01;
            if (c1523Akc.A03(AbstractC7607F5u.A0M(renderTreeNode)) || iA0G == AbstractC7607F5u.A0G(renderTreeNode.A09.getValue())) {
                return;
            }
            A01(fgfA05);
        }
    }

    @Override // X.FGS
    public final void A0R(RenderTreeNode renderTreeNode) {
        FG5 fg5;
        C7384Etj.A0Y(renderTreeNode, 0);
        FGB fgb = this.A03;
        FCA fca = fgb.A03;
        if (fca != null) {
            fg5 = new FG5(null, null, fca.A00);
            fgb.A05 = fg5;
        } else {
            fg5 = null;
        }
        super.A0R(renderTreeNode);
        fgb.A05 = null;
        if (fg5 != null && fca != null) {
            FGF fgfA05 = this.A08.A05(AbstractC7607F5u.A0M(renderTreeNode));
            C7384Etj.A0Z(fgfA05, "null cannot be cast to non-null type com.instagram.common.bloks.signals.BloksMountItem");
            FGK fgk = (FGK) fgfA05;
            C0938AIr c0938AIr = fg5.A01;
            fgk.A02 = c0938AIr != null ? c0938AIr.A01() : null;
            fgk.A01 = fg5.A00;
            fgk.A00 = fca.A00;
        }
        if (fgb.A06.A03) {
            C1523Akc c1523Akc = this.A01;
            long jA0M = AbstractC7607F5u.A0M(renderTreeNode);
            c1523Akc.A02[C1523Akc.A01(c1523Akc, jA0M)] = jA0M;
            RenderTreeNode renderTreeNode2 = renderTreeNode.A06;
            if (renderTreeNode2 != null) {
                FGF fgfA052 = this.A08.A05(AbstractC7607F5u.A0M(renderTreeNode2));
                if (fgfA052 != null) {
                    A01(fgfA052);
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FGt;LX/FGB;LX/FEo;Lkotlin/jvm/functions/Function0<+LX/FH3;>;)V */
    public FGD(AbstractC7837FGt abstractC7837FGt, C7783FEo c7783FEo, FGB fgb, Function0 function0) {
        super(c7783FEo, abstractC7837FGt, FGM.A00, fgb, function0);
        this.A03 = fgb;
        this.A02 = c7783FEo;
        this.A04 = fgb;
        long[] jArr = AbstractC1521Aka.A00;
        C1523Akc c1523Akc = new C1523Akc();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        C1523Akc.A02(c1523Akc, 6);
        this.A01 = c1523Akc;
    }

    private final void A00() {
        RenderTreeNode renderTreeNode = super.A04;
        if (renderTreeNode != null) {
            FGF fgfA05 = this.A08.A05(AbstractC7607F5u.A0M(renderTreeNode));
            if (fgfA05 != null) {
                A01(fgfA05);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[PHI: r6
  0x0073: PHI (r6v2 X.AHt) = (r6v1 X.AHt), (r6v4 X.AHt) binds: [B:13:0x0040, B:24:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(X.FGF r20) {
        /*
            r19 = this;
            r9 = r19
            r7 = r20
            X.Akc r8 = r9.A01
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01
            long r0 = X.AbstractC7607F5u.A0M(r0)
            boolean r0 = r8.A03(r0)
            if (r0 == 0) goto L13
        L12:
            return
        L13:
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01
            X.FGT<?> r0 = r0.A07
            r20 = r0
            X.FGB r0 = r9.A03
            long r3 = r20.A0J()
            X.AHt<X.FGg> r1 = r0.A01
            r6 = 0
            if (r1 == 0) goto L8e
            int r0 = r1.A01
            if (r0 == 0) goto L8e
            java.lang.Object[] r15 = r1.A04
            long[] r14 = r1.A03
            int r0 = r14.length
            int r13 = r0 + (-2)
            if (r13 < 0) goto L8e
            r12 = 0
        L32:
            r18 = r14[r12]
            long r10 = X.C8j5.A0A(r18)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L73
            int r0 = X.C8j3.A0E(r12, r13)
            r11 = 8
            int r10 = 8 - r0
            r5 = 0
        L4b:
            if (r5 >= r10) goto L71
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            java.lang.Object r2 = X.C8j3.A11(r15, r12, r5)
            X.FGg r2 = (X.C7825FGg) r2
            long r0 = r2.A00
            int r16 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r16 != 0) goto L6c
            if (r6 != 0) goto L69
            X.AHt r6 = X.C0917AHt.A02()
        L69:
            r6.A0B(r2)
        L6c:
            long r18 = r18 >> r11
            int r5 = r5 + 1
            goto L4b
        L71:
            if (r10 != r11) goto L78
        L73:
            if (r12 == r13) goto L78
            int r12 = r12 + 1
            goto L32
        L78:
            if (r6 == 0) goto L8e
            X.FG6 r5 = r9.A0B     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r2 = r7.A05     // Catch: java.lang.Throwable -> Lb5
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r1 = r0.A08     // Catch: java.lang.Throwable -> Lb5
            X.FGm r0 = r7.A03     // Catch: java.lang.Throwable -> Lb5
            r10 = r20
            r11 = r6
            r12 = r0
            r13 = r5
            r14 = r2
            r15 = r1
            r10.A0N(r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lb5
        L8e:
            int r1 = X.C1523Akc.A01(r8, r3)
            long[] r0 = r8.A02
            r0[r1] = r3
            com.facebook.rendercore.RenderTreeNode r0 = r7.A01
            com.facebook.rendercore.RenderTreeNode r2 = r0.A06
            if (r2 == 0) goto L12
            long r0 = X.AbstractC7607F5u.A0M(r2)
            boolean r0 = r8.A03(r0)
            if (r0 != 0) goto L12
            long r1 = X.AbstractC7607F5u.A0M(r2)
            X.AXI<X.FGF> r0 = r9.A08
            java.lang.Object r7 = r0.A05(r1)
            X.FGF r7 = (X.FGF) r7
            if (r7 != 0) goto L13
            return
        Lb5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGD.A01(X.FGF):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    @Override // X.FGS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G() {
        /*
            r18 = this;
            X.FGD r11 = X.FER.A00
            r2 = r18
            X.FER.A00 = r18
            r0 = 1
            r2.A00 = r0
            super.A0G()
            X.FGB r1 = r2.A03
            r12 = 0
            r1.A03 = r12
            r1.A02 = r12
            r1.A04 = r12
            X.FCO r0 = X.FBI.A00
            r1.A06 = r0
            r1.A00 = r12
            r1.A01 = r12
            r0 = 0
            r2.A00 = r0
            X.FER.A00 = r11
            X.FEo r10 = r2.A02
            X.FDt r2 = r10.A01
            if (r2 == 0) goto L82
            X.FEM r1 = r10.A00
            if (r1 == 0) goto L82
            java.lang.String r0 = "ContinuationValueStore can only be cleared from the UI Thread"
            X.AbstractC8162FXe.A02(r0)
            X.AHr<java.lang.Object, java.lang.Object> r9 = r1.A00
            int r0 = r9.A01
            if (r0 == 0) goto L82
            X.AHu<java.lang.Object, X.FEp> r8 = r2.A01
            long[] r7 = r8.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L82
            r5 = 0
        L41:
            r17 = r7[r5]
            long r3 = X.C8j5.A0A(r17)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7d
            int r0 = X.C8j3.A0E(r5, r6)
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L5a:
            if (r2 >= r3) goto L7b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r17
            r13 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r1 = r5 << 3
            int r1 = r1 + r2
            java.lang.Object[] r0 = r8.A04
            r0 = r0[r1]
            boolean r0 = r9.A07(r0)
            if (r0 == 0) goto L76
            r8.A0A(r1)
        L76:
            long r17 = r17 >> r4
            int r2 = r2 + 1
            goto L5a
        L7b:
            if (r3 != r4) goto L82
        L7d:
            if (r5 == r6) goto L82
            int r5 = r5 + 1
            goto L41
        L82:
            r10.A00 = r12
            r10.A01 = r12
            if (r11 == 0) goto L8f
            boolean r0 = r11.A00
            if (r0 != 0) goto L8f
            r11.A00()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGD.A0G():void");
    }

    @Override // X.FGS
    public final void A0H() {
        FGD fgd = FER.A00;
        FER.A00 = this;
        try {
            super.A0H();
        } finally {
            FER.A00 = fgd;
            C1523Akc c1523Akc = this.A01;
            if (c1523Akc.A01 != 0 && fgd != null) {
                fgd.A00();
            }
            c1523Akc.A04();
        }
    }

    @Override // X.FGS
    public final boolean A0S() {
        FGW fgw = super.A03;
        if (fgw == null) {
            return super.A0S();
        }
        FCA fcaA0m = AbstractC7610F5x.A0m(Hkz.A00(fgw));
        if (fcaA0m == null) {
            return super.A0S();
        }
        if (this.A04.A00(this, fcaA0m).A01 != 0) {
            return true;
        }
        return super.A0S();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;LX/FGT<Ljava/lang/Object;>;LX/FGT<Ljava/lang/Object;>;Ljava/lang/Object;Ljava/lang/Object;LX/FGF;LX/AHs<LX/FGg;>;)V */
    @Override // X.FGS
    public final void A0L(AbstractC0916AHs abstractC0916AHs, FGF fgf, FGT fgt, FGT fgt2, Object obj, Object obj2, Object obj3) {
        FG5 fg5;
        AnonymousClass005.A0x(obj, fgt, fgt2);
        AnonymousClass003.A0z(fgf, abstractC0916AHs);
        FGB fgb = this.A03;
        FCA fca = fgb.A03;
        FGK fgk = (FGK) fgf;
        if (fca != null) {
            fg5 = new FG5(fgk.A01, fgk.A02, fgk.A00);
            fgb.A05 = fg5;
        } else {
            fg5 = null;
        }
        super.A0L(abstractC0916AHs, fgf, fgt, fgt2, obj, obj2, obj3);
        boolean z = fgb.A06.A03;
        if (z) {
            C1523Akc c1523Akc = this.A01;
            long jA0J = fgt.A0J();
            c1523Akc.A02[C1523Akc.A01(c1523Akc, jA0J)] = jA0J;
        }
        RenderTreeNode renderTreeNode = fgf.A01.A06;
        if (renderTreeNode != null && z) {
            FGF fgfA05 = this.A08.A05(AbstractC7607F5u.A0M(renderTreeNode));
            if (fgfA05 != null) {
                A01(fgfA05);
            }
        }
        fgb.A05 = null;
        if (fg5 == null || fca == null) {
            return;
        }
        C0938AIr c0938AIr = fg5.A01;
        fgk.A02 = c0938AIr != null ? c0938AIr.A01() : null;
        fgk.A01 = fg5.A00;
        fgk.A00 = fca.A00;
    }

    @Override // X.FGS
    public final boolean A0T(FGT<?> fgt, FGT<?> fgt2, Object obj, Object obj2) {
        boolean zA1Y = C60P.A1Y(fgt, fgt2);
        FCA fca = this.A03.A03;
        if (fca == null) {
            return super.A0T(fgt, fgt2, obj, obj2);
        }
        if (fgt != fgt2 || !F8G.A00(obj, obj2)) {
            return zA1Y;
        }
        FGF fgfA05 = this.A08.A05(fgt2.A0J());
        C7384Etj.A0Z(fgfA05, "null cannot be cast to non-null type com.instagram.common.bloks.signals.BloksMountItem");
        FGK fgk = (FGK) fgfA05;
        return (fca.A00 == fgk.A00 || AbstractC7726FCc.A00(fca, fgk.A02)) ? false : true;
    }
}
