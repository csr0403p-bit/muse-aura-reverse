package X;

import androidx.compose.ui.Alignment;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;

/* loaded from: classes4.dex */
public abstract class ANR {
    public static final long A00 = 2147483648L | (AuraImpressionTimeTracker.UNKNOWN_TIME << 32);

    public static final ANU A00(APu aPu, APt aPt) {
        return new ANU(aPu, aPt, new ANS(BUR.A00(0), true), 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x02c0, code lost:
    
        r6.add(r1.getValue());
     */
    /* JADX WARN: Incorrect types in method signature: <S:Ljava/lang/Object;>(LX/AOP<TS;>;LX/BRg;LX/G0U<-LX/ANi<TS;>;LX/ANU;>;Landroidx/compose/ui/Alignment;LX/G0U<-TS;+Ljava/lang/Object;>;LX/G2j<-LX/06c;-TS;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.AOP r22, X.BFM r23, androidx.compose.ui.Alignment r24, X.BRg r25, X.G0U r26, X.G0U r27, X.G2j r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ANR.A01(X.AOP, X.BFM, androidx.compose.ui.Alignment, X.BRg, X.G0U, X.G0U, X.G2j, int, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: <S:Ljava/lang/Object;>(TS;LX/BRg;LX/G0U<-LX/ANi<TS;>;LX/ANU;>;Landroidx/compose/ui/Alignment;Ljava/lang/String;LX/G0U<-TS;+Ljava/lang/Object;>;LX/G2j<-LX/06c;-TS;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(BFM bfm, Alignment alignment, BRg bRg, Object obj, String str, G0U g0u, G0U g0u2, G2j g2j, int i, int i2) {
        BRg bRg2 = bRg;
        G0U g0u3 = g0u;
        Alignment alignment2 = alignment;
        String str2 = str;
        G0U g0u4 = g0u2;
        bfm.AgG(1501828832);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(obj, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u3);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, alignment2);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str2);
        }
        int i7 = i2 & 32;
        int iA0Y = 196608;
        if (i7 != 0) {
            iA05 |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u4);
            iA05 |= iA0Y;
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 599187, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = BUT.A00(0);
                    bfm.Ai0(objAaT);
                }
                g0u3 = (G0U) objAaT;
            }
            if (i5 != 0) {
                alignment2 = C2VU.A0E;
            }
            if (i6 != 0) {
                str2 = "AnimatedContent";
            }
            if (i7 != 0) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = BUT.A00(1);
                    bfm.Ai0(objAaT2);
                }
                g0u4 = (G0U) objAaT2;
            }
            A01(AOR.A04(bfm, obj, str2, (iA05 & 14) | ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), bfm, alignment2, bRg2, g0u3, g0u4, g2j, AnonymousClass004.A03(iA05 >> 3, iA05 & 8176), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BRg bRg3 = bRg2;
            Alignment alignment3 = alignment2;
            bBbAAc.A06 = new ANP(alignment3, bRg3, obj, str2, g0u3, g0u4, g2j, i, i2);
        }
    }
}
