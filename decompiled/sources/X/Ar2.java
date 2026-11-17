package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class Ar2 {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0U<-LX/BNM;+LX/BNM;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(BFM bfm, BRg bRg, G0U g0u, G0V g0v, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(771959668);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C3cG.A08(AGG.A00, null);
                BBI.A0T(bfm, objAaT);
            }
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = C2298BSy.A00(objAaT, 13);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass003.A0m(bfm, AbstractC1087AXv.A01.A04(A00(bfm, (Function0) objAaT2, g0u, 0)), new C3bc(objAaT, bRg2, g0v, 0), -291176396);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTU(bRg2, g0u, g0v, i, i2, 2);
        }
    }

    public static final void A02(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2064964257);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            A01(bfm, bRg2, null, g0v, (iA0d & 14) | 48 | ((iA0d << 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTI(bRg2, i, g0v, i2, 3);
        }
    }

    public static final Ar6 A00(BFM bfm, Function0 function0, G0U g0u, int i) {
        if ((i & 2) != 0) {
            g0u = null;
        }
        BBI bbi = (BBI) bfm;
        View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
        boolean zA65 = bfm.A65(view);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new Ar6(view, function0, g0u);
            BBI.A0O(bbi, objAaT);
        }
        Ar6 ar6 = (Ar6) objAaT;
        boolean zA67 = bfm.A67(ar6);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = C2294BSu.A00(ar6, 18);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, ar6);
        return ar6;
    }
}
