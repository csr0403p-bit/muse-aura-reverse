package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.AjV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1462AjV {
    /* JADX WARN: Incorrect types in method signature: (LX/1Z3;JJLX/G0U<-LX/2LD;Lkotlin/Unit;>;)LX/Aj4; */
    public static final C1458AjR A01(C1Z3 c1z3, G0U g0u, long j, long j2) {
        long j3 = j2;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1z3);
        int i = c1453AjMA04.A02;
        C1457AjQ c1457AjQ = ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjMA04)).A12;
        C1466AjZ c1466AjZ = c1457AjQ.A08;
        if (j2 == 0) {
            j3 = j;
        }
        Ab2<C1458AjR> ab2 = c1466AjZ.A06;
        C1458AjR c1458AjR = new C1458AjR(c1z3, c1466AjZ, g0u, i, j, j3);
        C1458AjR c1458AjRA04 = ab2.A04(i);
        if (c1458AjRA04 == null) {
            ab2.A0B(i, c1458AjR);
            c1458AjRA04 = c1458AjR;
        }
        C1458AjR c1458AjR2 = c1458AjRA04;
        if (c1458AjR2 != c1458AjR) {
            while (c1458AjR2.A04 != null) {
                c1458AjR2 = c1458AjR2.A04;
                C7384Etj.A0X(c1458AjR2);
            }
            c1458AjR2.A04 = c1458AjR;
        }
        if (AbstractC1414Aij.A04(((AbstractC1439Aj8) c1z3).node).A0L) {
            c1457AjQ.A07.A01(i, true);
        }
        c1457AjQ.A01 = true;
        C1457AjQ.A03(c1457AjQ);
        return c1458AjR;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;JJLX/G0U<-LX/2LD;Lkotlin/Unit;>;)LX/BRg; */
    public static final BRg A00(BRg bRg, G0U g0u, long j, long j2) {
        return bRg.then(new C1469Ajc(g0u, j, j2));
    }
}
