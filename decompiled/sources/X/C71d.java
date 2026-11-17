package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.71d, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C71d {
    /* JADX WARN: Incorrect types in method signature: (LX/76B;ILX/G0U<-LX/71a;Lkotlin/Unit;>;LX/BFM;II)V */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.BFM r11, X.C76B r12, final X.G0U r13, int r14, final int r15, final int r16) {
        /*
            r6 = r12
            r8 = r14
            r0 = 1060451148(0x3f35334c, float:0.707814)
            r11.AgG(r0)
            r10 = r16
            r3 = r16 & 1
            r9 = r15
            if (r3 == 0) goto Ld2
            r0 = r15 | 6
        L11:
            r1 = r15 & 48
            if (r1 != 0) goto L24
            r1 = r16 & 2
            if (r1 != 0) goto L21
            boolean r2 = r11.A63(r14)
            r1 = 32
            if (r2 != 0) goto L23
        L21:
            r1 = 16
        L23:
            r0 = r0 | r1
        L24:
            r1 = r15 & 384(0x180, float:5.38E-43)
            r7 = r13
            if (r1 != 0) goto L2e
            int r1 = X.AnonymousClass004.A0V(r11, r13)
            r0 = r0 | r1
        L2e:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L4b
            boolean r0 = r11.AKh()
            if (r0 == 0) goto L4b
            r11.Afo()
        L3d:
            X.BBb r0 = r11.AAc()
            if (r0 == 0) goto L4a
            X.71M r5 = new X.71M
            r5.<init>()
            r0.A06 = r5
        L4a:
            return
        L4b:
            r11.Afy()
            r0 = r15 & 1
            if (r0 == 0) goto Lab
            boolean r0 = r11.AEk()
            if (r0 != 0) goto Lab
            r11.Afo()
        L5b:
            r11.AAb()
            java.lang.Object r5 = r11.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L6b
            X.71f r5 = X.C71f.A00
            r11.Ai0(r5)
        L6b:
            X.EnQ r5 = (X.InterfaceC7353EnQ) r5
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            r4 = 1
            X.72t r3 = new X.72t
            r3.<init>(r8, r4)
            java.util.ArrayList r2 = X.C3cG.A0h()
            X.71Z r0 = new X.71Z
            r0.<init>(r2)
            r13.invoke(r0)
            r0 = 2
            X.8iA r1 = new X.8iA
            r1.<init>(r0, r3, r2)
            r0 = -1119459778(0xffffffffbd46663e, float:-0.04843735)
            X.B1U r3 = X.B1V.A01(r1, r0, r4)
            r0 = -683746039(0xffffffffd73edd09, float:-2.09856548E14)
            r11.AgF(r0)
            r0 = -548224868(0xffffffffdf52c09c, float:-1.518631E19)
            r11.AgF(r0)
            r2 = r11
            X.BBI r2 = (X.BBI) r2
            X.Ahw<?> r0 = r2.A0V
            boolean r0 = r0 instanceof X.C73Q
            if (r0 != 0) goto Lb4
            X.C00x.A00()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Lab:
            if (r3 == 0) goto Laf
            X.76C r6 = X.C76B.A00
        Laf:
            int r8 = X.C3cG.A01(r10, r14)
            goto L5b
        Lb4:
            X.C60R.A13(r11, r2, r5)
            r0 = 15
            X.C8i0.A00(r11, r6, r0)
            X.72r r1 = X.C059472r.A05(r8)
            r0 = 12
            X.C8i0.A00(r11, r1, r0)
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.invoke(r11, r0)
            X.AnonymousClass002.A10(r2, r4, r1)
            goto L3d
        Ld2:
            r0 = r15 & 6
            if (r0 != 0) goto Ldd
            int r0 = X.AnonymousClass004.A0d(r11, r12)
            r0 = r0 | r15
            goto L11
        Ldd:
            r0 = r15
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71d.A00(X.BFM, X.76B, X.G0U, int, int, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/72t;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(BFM bfm, C059672t c059672t, G0V g0v, int i, long j) {
        bfm.AgG(1266032519);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass002.A06(AnonymousClass004.A1Y(c059672t, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA0M & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            Long lValueOf = Long.valueOf(j);
            bfm.Ag8(1181514974, lValueOf);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C71e.A00;
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
            bfm.AgF(-683746039);
            int i2 = (((iA0M & 896) | 6) & 896) | 6;
            bfm.AgF(-548224868);
            BBI bbi = (BBI) bfm;
            if (!(bbi.A0V instanceof C73Q)) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            C60R.A13(bfm, bbi, function0);
            C8i0.A00(bfm, lValueOf, 13);
            C8i0.A00(bfm, c059672t, 14);
            AnonymousClass005.A0q(bbi, bfm, g0v, i2 >> 6);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iD(c059672t, g0v, i, j);
        }
    }
}
