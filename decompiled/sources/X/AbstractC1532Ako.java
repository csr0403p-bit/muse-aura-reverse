package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ako, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1532Ako {
    public static final G0U<View, Unit> A00 = new BUU(14);

    public static final <T extends View> Function0<C1453AjM> A01(G0U<? super Context, ? extends T> g0u, BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        Context contextA01 = AKO.A01(bbi);
        BBM bbmA5U = bfm.A5U();
        AFx aFx = (AFx) AKO.A07(AG8.A00, bbi);
        View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
        boolean zA1V = AnonymousClass002.A1V(bfm, view, AnonymousClass005.A1Y(bfm, bbmA5U, aFx, bfm.A67(contextA01), (((i & 14) ^ 6) > 4 && bfm.A65(g0u)) || (i & 6) == 4), bfm.A63(iA0J));
        Object objAaT = bfm.AaT();
        if (zA1V || objAaT == C78N.A00) {
            objAaT = new C1533Akp(contextA01, view, bbmA5U, aFx, g0u, iA0J);
            BBI.A0O(bbi, objAaT);
        }
        return (Function0) objAaT;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroid/view/View;>(LX/G0U<-Landroid/content/Context;+TT;>;LX/BRg;LX/G0U<-TT;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(BFM bfm, BRg bRg, G0U g0u, G0U g0u2, int i, int i2) {
        BRg bRg2 = bRg;
        G0U g0u3 = g0u2;
        bfm.AgG(-1783766393);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u3 = A00;
            }
            A03(bfm, bRg2, g0u, null, A00, g0u3, (iA0T & 14) | 3072 | (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (57344 & (iA0T << 6)), 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c7(bRg2, g0u, g0u3, i, i2, 0);
        }
    }

    public static final <T extends View> C1534Akq<T> A00(C1453AjM c1453AjM) {
        C1634An9 c1634An9 = c1453AjM.A0H;
        if (c1634An9 != null) {
            return (C1534Akq) c1634An9;
        }
        throw C3cG.A0Q("Required value was null.");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroid/view/View;>(LX/G0U<-Landroid/content/Context;+TT;>;LX/BRg;LX/G0U<-TT;Lkotlin/Unit;>;LX/G0U<-TT;Lkotlin/Unit;>;LX/G0U<-TT;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A03(BFM bfm, BRg bRg, G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, int i, int i2) {
        BRg bRg2 = bRg;
        G0U g0u5 = g0u2;
        G0U g0u6 = g0u3;
        G0U g0u7 = g0u4;
        bfm.AgG(-180024211);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u5);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u6);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u7);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u5 = null;
            }
            if (i5 != 0) {
                g0u6 = A00;
            }
            if (i6 != 0) {
                g0u7 = A00;
            }
            BBI bbi = (BBI) bfm;
            int i7 = 32;
            int iA02 = C3cG.A02(bbi.A06);
            BRg bRgA01 = AxM.A01(bfm, bRg2.then(C1526Akf.A00).then(C1524Akd.A00).then(C1525Ake.A00).then(Aeq.A00));
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, bbi);
            AKQ akqA04 = BBI.A04(bbi);
            C1HY c1hy = (C1HY) AKO.A07(AIC.A00, bbi);
            A6I a6i = (A6I) AKO.A07(AIB.A00, bbi);
            if (g0u5 != null) {
                bfm.AgE(1313917368);
                Function0<C1453AjM> function0A01 = A01(g0u, bfm, iA0T & 14);
                if (bbi.A0V instanceof C1376Ai2) {
                    AnonymousClass005.A0n(bfm, bbi, function0A01);
                    BPg.A02(bfm, akqA04, C1515AkP.A06);
                    BPg.A00(bfm, bRgA01, 35);
                    BPg.A00(bfm, axnA04, 36);
                    BPg.A00(bfm, c1hy, 37);
                    BPg.A00(bfm, a6i, 38);
                    BPg.A00(bfm, enumC1820Arj, 39);
                    AnonymousClass002.A0w(bfm, iA02);
                    BPg.A00(bfm, g0u5, 30);
                    BPg.A00(bfm, g0u7, 31);
                    BPg.A00(bfm, g0u6, i7);
                    BBI.A0R(bbi, true);
                    BBI.A0R(bbi, false);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(1314774735);
            Function0<C1453AjM> function0A012 = A01(g0u, bfm, iA0T & 14);
            if (bbi.A0V instanceof C1376Ai2) {
                bfm.AgB();
                if (bbi.A0M) {
                    bfm.A7w(function0A012);
                } else {
                    bfm.AiE();
                }
                BPg.A02(bfm, akqA04, C1515AkP.A06);
                BPg.A00(bfm, bRgA01, 35);
                BPg.A00(bfm, axnA04, 36);
                BPg.A00(bfm, c1hy, 37);
                BPg.A00(bfm, a6i, 38);
                BPg.A00(bfm, enumC1820Arj, 39);
                AnonymousClass002.A0w(bfm, iA02);
                BPg.A00(bfm, g0u7, 33);
                i7 = 34;
                BPg.A00(bfm, g0u6, i7);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3cB(g0u, g0u7, g0u5, g0u6, bRg2, i, i2, 1);
        }
    }
}
