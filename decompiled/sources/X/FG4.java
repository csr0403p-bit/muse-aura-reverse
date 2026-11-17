package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class FG4 implements FG3 {
    public C0918AHu<Object, Long> A00;
    public FG1 A01;
    public List<InterfaceC7812FFt<?>> A02;
    public final C7825FGg A03;
    public final InterfaceC7833FGo<Object, Object, Object> A04;
    public final Object A05;
    public final FG7 A06;
    public final Object A07;

    public final void A02(FG6 fg6, Object obj, Object obj2, Object obj3) {
        C0917AHt<FG4> c0917AHt;
        FCN fcnA00;
        C0938AIr c0938AIr;
        boolean zA04 = A04();
        this.A01 = fg6.A01;
        FGB fgb = fg6.A03;
        if (fgb != null) {
            C7825FGg c7825FGg = this.A03;
            C0917AHt<C7825FGg> c0917AHt2 = fgb.A00;
            if (c0917AHt2 != null) {
                c0917AHt2.A0C(c7825FGg);
            }
            C0917AHt<C7825FGg> c0917AHt3 = fgb.A01;
            if (c0917AHt3 != null) {
                c0917AHt3.A0C(c7825FGg);
            }
            FCA fca = fgb.A04;
            F8I f8i = fgb.A02;
            if (!fgb.A06.A01 || fca == null || f8i == null) {
                fcnA00 = AbstractC7757FDj.A00();
                c0938AIr = fcnA00.A02;
                fcnA00.A02 = null;
                try {
                    this.A04.Ahc(fg6.A00, this, obj, this.A05, obj2, obj3);
                } finally {
                }
            } else {
                AbstractC8162FXe.A02("EvaluationContext can only be overridden from the UI Thread");
                FCA fca2 = f8i.A00;
                f8i.A00 = fca;
                try {
                    fcnA00 = AbstractC7757FDj.A00();
                    c0938AIr = fcnA00.A02;
                    fcnA00.A02 = null;
                    try {
                        this.A04.Ahc(fg6.A00, this, obj, this.A05, obj2, obj3);
                    } finally {
                    }
                } finally {
                    AbstractC8162FXe.A02("EvaluationContext can only be overridden from the UI Thread");
                    f8i.A00 = fca2;
                }
            }
        } else {
            this.A04.Ahc(fg6.A00, this, obj, this.A05, obj2, obj3);
        }
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        if (!zA04 || (c0917AHt = this.A06.A00) == null) {
            return;
        }
        c0917AHt.A0C(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A05(X.FG4 r9, X.FG6 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r8 = this;
            r1 = 1
            X.C7384Etj.A0Y(r9, r1)
            X.FGB r3 = r10.A03
            if (r3 != 0) goto L13
            X.FGo<java.lang.Object, java.lang.Object, java.lang.Object> r2 = r8.A04
            java.lang.Object r1 = r9.A05
            java.lang.Object r0 = r8.A05
            boolean r1 = r2.Afc(r1, r0, r11, r12)
        L12:
            return r1
        L13:
            X.FGg r6 = r8.A03
            X.FDy<java.lang.Integer> r7 = X.AbstractC7752FDe.A01
            java.lang.Object r4 = r7.A01()
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto L26
            int r0 = r4.intValue()
            r2 = 0
            if (r0 == r1) goto L2e
        L26:
            r2 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A02(r0)
        L2e:
            X.FGo<java.lang.Object, java.lang.Object, java.lang.Object> r5 = r8.A04     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = r9.A05     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r8.A05     // Catch: java.lang.Throwable -> L77
            boolean r0 = r5.Afc(r1, r0, r11, r12)     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L3d
            r7.A02(r4)
        L3d:
            if (r0 != 0) goto L6f
            X.AHt<X.FGg> r0 = r3.A00
            if (r0 == 0) goto L4b
            boolean r0 = r0.A05(r6)
            if (r0 != 0) goto L4b
        L49:
            r1 = 0
            return r1
        L4b:
            X.FCA r4 = r3.A03
            if (r4 == 0) goto L49
            X.FG5 r3 = r3.A05
            if (r3 == 0) goto L49
            X.AHu<X.FGg, long[]> r0 = r3.A03
            if (r0 == 0) goto L49
            java.lang.Object r2 = r0.A05(r6)
            long[] r2 = (long[]) r2
            if (r2 == 0) goto L49
            int r1 = r3.A02
            int r0 = r4.A00
            if (r1 == r0) goto L6b
            boolean r0 = X.AbstractC7726FCc.A00(r4, r2)
            if (r0 == 0) goto L6f
        L6b:
            r3.A00(r6, r2)
            goto L49
        L6f:
            r1 = 1
            boolean r0 = r5 instanceof X.C7894FJo
            if (r0 == 0) goto L12
            boolean r0 = X.FFH.A00
            return r1
        L77:
            r0 = move-exception
            if (r2 == 0) goto L7d
            r7.A02(r4)
        L7d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FG4.A05(X.FG4, X.FG6, java.lang.Object, java.lang.Object):boolean");
    }

    public final void A01(FG4 fg4) {
        List<InterfaceC7812FFt<?>> list = this.A02;
        if (list != null) {
            fg4.A02 = list;
            fg4.A00 = this.A00;
            FG7 fg7 = fg4.A06;
            if (fg4.A04()) {
                C0917AHt<FG4> c0917AHt = fg7.A00;
                if (c0917AHt == null) {
                    c0917AHt = new C0917AHt<>(6);
                    fg7.A00 = c0917AHt;
                }
                c0917AHt.A0B(fg4);
            }
        }
    }

    public final void A03(FG1 fg1) {
        List<InterfaceC7812FFt<?>> list = this.A02;
        if (list != null) {
            this.A04.getDescription();
            FG4 fg4 = fg1.A00;
            fg1.A00 = this;
            C0918AHu<Object, Long> c0918AHu = this.A00;
            if (c0918AHu != null) {
                c0918AHu.A0D();
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).ANz(fg1);
                }
                fg1.A00 = fg4;
            } catch (Throwable th) {
                this.A00 = null;
                fg1.A00 = fg4;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04() {
        /*
            r1 = this;
            java.util.List<X.FFt<?>> r0 = r1.A02
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FG4.A04():boolean");
    }

    /* JADX WARN: Incorrect return type in method signature: <R:Ljava/lang/Object;>(LX/FFt<TR;>;)TR; */
    @Override // X.FG3
    public final void AiD(InterfaceC7812FFt interfaceC7812FFt) {
        FG1 fg1 = this.A01;
        if (fg1 == null) {
            throw BV5.A0U("useContinuation called outside of a bind/unbind call on ", this.A04.getDescription());
        }
        FG4 fg4 = fg1.A00;
        fg1.A00 = this;
        try {
            interfaceC7812FFt.ANz(fg1);
            fg1.A00 = fg4;
            List<InterfaceC7812FFt<?>> listA0h = this.A02;
            if (listA0h == null) {
                listA0h = C3cG.A0h();
            }
            if (listA0h == null) {
                this.A02 = listA0h;
            }
            listA0h.add(interfaceC7812FFt);
        } catch (Throwable th) {
            fg1.A00 = fg4;
            throw th;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG7;LX/FGg;LX/FGo<Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;>;Ljava/lang/Object;)V */
    public FG4(C7825FGg c7825FGg, FG7 fg7, InterfaceC7833FGo interfaceC7833FGo, Object obj) {
        this.A06 = fg7;
        this.A03 = c7825FGg;
        this.A04 = interfaceC7833FGo;
        this.A05 = obj;
        this.A07 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public final Object A00(FG6 fg6, Object obj, Object obj2) {
        C0918AHu<C7825FGg, long[]> c0918AHu;
        int i;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        boolean zA04 = A04();
        this.A01 = fg6.A01;
        C0918AHu<Object, Long> c0918AHu2 = this.A00;
        if (c0918AHu2 != null) {
            c0918AHu2.A0D();
        }
        try {
            FGB fgb = fg6.A03;
            if (fgb != null) {
                C7825FGg c7825FGg = this.A03;
                if (fgb.A03 == null) {
                    c10543HqvA0z.element = this.A04.A59(fg6.A00, this, obj, this.A05, obj2);
                } else {
                    FH1 fh1 = c7825FGg.A01;
                    if ((fh1 instanceof C7768FDx) && ((i = ((C7768FDx) fh1).A00.A05) == 13656 || i == 13914 || i == 16529)) {
                        if (i != 13656 && i != 13914 && i != 16529) {
                            throw AnonymousClass005.A0c(i);
                        }
                        C0917AHt<C7825FGg> c0917AHtA02 = fgb.A01;
                        if (c0917AHtA02 == null) {
                            c0917AHtA02 = C0917AHt.A02();
                        }
                        fgb.A01 = c0917AHtA02;
                        c0917AHtA02.A0B(c7825FGg);
                    }
                    FG5 fg5 = fgb.A05;
                    C0938AIr c0938AIr = new C0938AIr((fg5 == null || (c0918AHu = fg5.A03) == null) ? null : c0918AHu.A05(c7825FGg));
                    FCN fcnA00 = AbstractC7757FDj.A00();
                    C0938AIr c0938AIr2 = fcnA00.A02;
                    fcnA00.A02 = c0938AIr;
                    try {
                        int i2 = fcnA00.A00;
                        fcnA00.A00 = 4;
                        try {
                            c10543HqvA0z.element = this.A04.A59(fg6.A00, this, obj, this.A05, obj2);
                            fcnA00.A02 = c0938AIr2;
                            long[] jArrA01 = c0938AIr.A01();
                            if (jArrA01 != null) {
                                C0917AHt<C7825FGg> c0917AHtA022 = fgb.A00;
                                if (c0917AHtA022 == null) {
                                    c0917AHtA022 = C0917AHt.A02();
                                }
                                fgb.A00 = c0917AHtA022;
                                c0917AHtA022.A0B(c7825FGg);
                            }
                            if (fg5 != null) {
                                fg5.A00(c7825FGg, jArrA01);
                            }
                        } finally {
                            fcnA00.A00 = i2;
                        }
                    } catch (Throwable th) {
                        fcnA00.A02 = c0938AIr2;
                        throw th;
                    }
                }
            } else {
                c10543HqvA0z.element = this.A04.A59(fg6.A00, this, obj, this.A05, obj2);
            }
            this.A01 = null;
            if (!zA04 && A04()) {
                FG7 fg7 = this.A06;
                if (A04()) {
                    C0917AHt<FG4> c0917AHt = fg7.A00;
                    if (c0917AHt == null) {
                        c0917AHt = new C0917AHt<>(6);
                        fg7.A00 = c0917AHt;
                    }
                    c0917AHt.A0B(this);
                }
            }
            return c10543HqvA0z.element;
        } catch (Throwable th2) {
            this.A00 = null;
            this.A01 = null;
            throw th2;
        }
    }
}
