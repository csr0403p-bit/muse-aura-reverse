package X;

import kotlin.Unit;

/* renamed from: X.19W, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C19W {
    /* JADX WARN: Incorrect types in method signature: (JLX/Arm;Ljava/lang/Float;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(BFM bfm, C1822Arm c1822Arm, Float f, final G0V g0v, final int i, final int i2, final long j) {
        final Float f2;
        final C1822Arm c1822Arm2 = c1822Arm;
        bfm.AgG(2064632657);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, c1822Arm2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0M |= 384;
        } else if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0f(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0M), bfm, iA0M)) {
            if (i3 != 0) {
                c1822Arm2 = null;
            }
            f2 = i4 == 0 ? f : null;
            B1U b1uA00 = B1V.A00(bfm, new C3bY(f2, g0v, 1, j), -650790565);
            if (c1822Arm2 != null) {
                bfm.AgE(-162880673);
                C17y.A00(c1822Arm2, b1uA00, bfm, ((iA0M >> 3) & 14) | 48);
            } else {
                bfm.AgE(-162879037);
                AnonymousClass001.A1B(b1uA00, bfm, 6);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
            f2 = f;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.19c
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    long j2 = j;
                    C1822Arm c1822Arm3 = c1822Arm2;
                    Float f3 = f2;
                    G0V g0v2 = g0v;
                    int i5 = i;
                    C19W.A02((BFM) obj, c1822Arm3, f3, g0v2, AnonymousClass011.A00(i5), i2, j2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Object A00(C3Tr c3Tr) {
        C19g c19g;
        Object objAIX = c3Tr.AIX();
        if (!(objAIX instanceof C19g) || (c19g = (C19g) objAIX) == null) {
            return null;
        }
        return ((C1AE) c19g).A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final X.C0dy r40, final X.C3TQ r41, final androidx.compose.material.TextFieldColors r42, X.BFM r43, final X.C1DM r44, final X.C19h r45, final java.lang.Integer r46, final java.lang.String r47, final X.G0V r48, final X.G0V r49, final X.G0V r50, final X.G0V r51, final X.G0V r52, final X.G0V r53, final int r54, final int r55, final boolean r56, final boolean r57, final boolean r58) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19W.A01(X.0dy, X.3TQ, androidx.compose.material.TextFieldColors, X.BFM, X.1DM, X.19h, java.lang.Integer, java.lang.String, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, int, int, boolean, boolean, boolean):void");
    }
}
