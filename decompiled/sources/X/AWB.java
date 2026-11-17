package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AWB {
    public static final InterfaceC2178B0w A00(AST ast, float f) {
        int iA08 = C8j3.A08(f) * 2;
        InterfaceC2178B0w interfaceC2178B0wA01 = AWE.A01;
        InterfaceC1327AhE interfaceC1327AhEA01 = AWE.A00;
        C1325AhC c1325AhC = AWE.A02;
        if (interfaceC2178B0wA01 == null || interfaceC1327AhEA01 == null || iA08 > ((B1T) interfaceC2178B0wA01).A00.getWidth() || iA08 > ((B1T) interfaceC2178B0wA01).A00.getHeight()) {
            interfaceC2178B0wA01 = B10.A01(HDi.A0I, iA08, iA08, 1);
            AWE.A01 = interfaceC2178B0wA01;
            interfaceC1327AhEA01 = AbstractC1290Aga.A01(interfaceC2178B0wA01);
            AWE.A00 = interfaceC1327AhEA01;
        }
        if (c1325AhC == null) {
            c1325AhC = new C1325AhC();
            AWE.A02 = c1325AhC;
        }
        EnumC1820Arj layoutDirection = ast.A00.getLayoutDirection();
        Bitmap bitmap = ((B1T) interfaceC2178B0wA01).A00;
        long jA0P = (C8j3.A0P(bitmap.getWidth()) << 32) | (C8j3.A0P(bitmap.getHeight()) & 4294967295L);
        AW9 aw9 = c1325AhC.A02;
        AXN axn = aw9.A02;
        EnumC1820Arj enumC1820Arj = aw9.A03;
        InterfaceC1327AhE interfaceC1327AhE = aw9.A01;
        long j = aw9.A00;
        aw9.A02 = ast;
        aw9.A03 = layoutDirection;
        aw9.A01 = interfaceC1327AhEA01;
        aw9.A00 = jA0P;
        interfaceC1327AhEA01.Ac2();
        long j2 = B6A.A01;
        long jAKb = c1325AhC.AKb();
        C16a c16a = C16a.A00;
        c1325AhC.A9g(null, c16a, 1.0f, 0, j2, 0L, jAKb);
        long j3 = 4278190080L << 32;
        long jA0O = C8j3.A0O(f);
        ART.A03(null, c1325AhC, 0.0f, 120, j3, 0L, jA0O);
        c1325AhC.A9N(null, c16a, f, 1.0f, 3, j3, jA0O);
        interfaceC1327AhEA01.Abc();
        aw9.A02 = axn;
        aw9.A03 = enumC1820Arj;
        aw9.A01 = interfaceC1327AhE;
        aw9.A00 = j;
        return interfaceC2178B0wA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(final X.InterfaceC2267BNn r19, X.BFM r20, final X.BRg r21, final java.lang.Integer r22, final float r23, final int r24, final int r25, long r26, final boolean r28, final boolean r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWB.A02(X.BNn, X.BFM, X.BRg, java.lang.Integer, float, int, int, long, boolean, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BNn;Landroidx/compose/ui/Alignment;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(InterfaceC2267BNn interfaceC2267BNn, BFM bfm, Alignment alignment, G0V g0v, int i) {
        bfm.AgG(-1090171650);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC2267BNn, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, alignment);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            boolean zA1C = AnonymousClass003.A1C(iA05);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A65(interfaceC2267BNn))) {
                z = true;
            }
            boolean z2 = zA1C | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new AWC(interfaceC2267BNn, alignment);
                BBI.A0T(bfm, objAaT);
            }
            AYW.A01(bfm, (AWC) objAaT, new C11N(false, false), null, g0v, ((iA05 << 3) & 7168) | 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(interfaceC2267BNn, alignment, g0v, i, 4);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;ZLX/BFM;I)V */
    public static final void A03(BRg bRg, final boolean z, final Function0 function0, BFM bfm, int i) {
        bfm.AgG(2111672474);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            C01N.A07(bfm, AxM.A02(C10G.A0C(bRg, 25.0f, 25.0f), AbstractC2139Az7.A00, new G0W() { // from class: X.1BU
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final Function0 function02 = function0;
                    final boolean z2 = z;
                    BRg bRg2 = (BRg) obj;
                    BFM bfm2 = (BFM) obj2;
                    bfm2.AgE(-196777734);
                    final long j = ((C1BT) bfm2.A6v(C1BR.A00)).A01;
                    boolean zA1U = AnonymousClass004.A1U(bfm2, function02, bfm2.A64(j), z2);
                    Object objAaT = bfm2.AaT();
                    if (zA1U || objAaT == C78N.A00) {
                        objAaT = new G0U() { // from class: X.1BV
                            @Override // X.G0U
                            public final Object invoke(Object obj4) {
                                long j2 = j;
                                AST ast = (AST) obj4;
                                return ast.A01(new BTV(function02, AWB.A00(ast, AnonymousClass003.A03(ast.A00.AKb()) / 2.0f), AnonymousClass002.A0S(j2), 2, z2));
                            }
                        };
                        bfm2.Ai0(objAaT);
                    }
                    BRg bRgA02 = AEk.A02(bRg2, (G0U) objAaT);
                    AnonymousClass002.A19(bfm2);
                    return bRgA02;
                }
            }));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTK(bRg, function0, i, 2, z);
        }
    }
}
