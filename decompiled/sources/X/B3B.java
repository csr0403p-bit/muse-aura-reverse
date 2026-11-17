package X;

import android.graphics.Matrix;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class B3B {
    /* JADX WARN: Incorrect types in method signature: (LX/Eap;Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;LX/BRg;ZZZLX/B3A;ZLX/FiM;Landroidx/compose/ui/Alignment;LX/ARL;ZLjava/util/Map<Ljava/lang/String;+Landroid/graphics/Typeface;>;LX/BFM;III)V */
    public static final void A00(BFM bfm, Alignment alignment, BRg bRg, ARL arl, C6837Eap c6837Eap, B3A b3a, C8661FiM c8661FiM, Map map, Function0 function0, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Alignment alignment2 = alignment;
        BRg bRg2 = bRg;
        ARL arl2 = arl;
        B3A b3a2 = b3a;
        C8661FiM c8661FiM2 = c8661FiM;
        Map map2 = map;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(185150686);
        if ((i3 & 4) != 0) {
            bRg2 = BRg.A00;
        }
        boolean zA1K = C3cG.A1K(i3 & 8, z);
        boolean zA1S = C3cI.A1S(i3, z2);
        boolean zA1R = AnonymousClass002.A1R(i3, z3);
        if ((i3 & 64) != 0) {
            b3a2 = B3A.AUTOMATIC;
        }
        boolean zA1N = C3cH.A1N(i3, z4);
        if ((i3 & 256) != 0) {
            c8661FiM2 = null;
        }
        if ((i3 & 512) != 0) {
            alignment2 = C2VU.A09;
        }
        if ((i3 & 1024) != 0) {
            arl2 = B18.A02;
        }
        boolean zA1Q = C60Q.A1Q(i3 & 2048, z5);
        if ((i3 & 4096) != 0) {
            map2 = null;
        }
        bfm.AgF(-3687241);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = new C8659FiK();
            BBI.A0T(bfm, objAaT);
        }
        BBI bbi = (BBI) bfm;
        BBI.A0R(bbi, false);
        C8659FiK c8659FiK = (C8659FiK) objAaT;
        bfm.AgF(-3687241);
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = new Matrix();
            bfm.Ai0(objAaT2);
        }
        BBI.A0R(bbi, false);
        Matrix matrix = (Matrix) objAaT2;
        bfm.AgF(-3687241);
        Object objAaT3 = bfm.AaT();
        if (objAaT3 == obj) {
            objAaT3 = AbstractC1798ArH.A03();
            BBI.A0O(bbi, objAaT3);
        }
        BBI.A0R(bbi, false);
        MutableState mutableState = (MutableState) objAaT3;
        bfm.AgF(185151463);
        if (c6837Eap != null && c6837Eap.A00() != 0.0f) {
            BBI.A0R(bbi, false);
            float fA00 = AbstractC8712FjD.A00();
            C0zJ.A00(C10G.A0C(bRg2, c6837Eap.A05.width() / fA00, c6837Eap.A05.height() / fA00), new C8660FiL(matrix, mutableState, alignment2, arl2, c6837Eap, c8659FiK, b3a2, c8661FiM2, map2, function0, zA1R, zA1K, zA1S, zA1N, zA1Q), bfm, 0);
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new C2346BUu(alignment2, bRg2, arl2, c6837Eap, b3a2, c8661FiM2, map2, function0, i, i2, i3, 1, zA1K, zA1S, zA1R, zA1N, zA1Q);
                return;
            }
            return;
        }
        BBb bBbA0L = AnonymousClass001.A0L(bfm, bbi);
        if (bBbA0L != null) {
            bBbA0L.A06 = new C2346BUu(alignment2, bRg2, arl2, c6837Eap, b3a2, c8661FiM2, map2, function0, i, i2, i3, 0, zA1K, zA1S, zA1R, zA1N, zA1Q);
        }
        C3Ue.A04(bRg2, bfm, (i >> 6) & 14);
    }
}
