package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC07499Wh {
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/1EQ;LX/9Wi;LX/BRg;LX/G0W<-LX/1eP;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BRg bRg, C1EQ c1eq, C07509Wi c07509Wi, Function0 function0, G0W g0w, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(625192576);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, c1eq);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, c07509Wi);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(C0v5.A04(C1b8.A02(C11U.A01(bRg2.then(C10G.A00), c07509Wi.A02), c1eq, C1OM.A00), C3cG.A0A(0), null, function0, true), c07509Wi.A03, c07509Wi.A04);
            int i4 = ((iA0T >> 3) & 7168) | 48;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A09, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C0z7.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2344BUs(function0, bRg2, g0w, c1eq, c07509Wi, i, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.BFM r21, X.BRg r22, X.InterfaceC07569Wo r23, X.C07399Vr r24, X.C07509Wi r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC07499Wh.A01(X.BFM, X.BRg, X.9Wo, X.9Vr, X.9Wi, int, int):void");
    }

    public static final void A02(BFM bfm, BRg bRg, C07509Wi c07509Wi, String str, int i, int i2, long j) {
        BRg bRg2 = bRg;
        bfm.AgG(1763916940);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c07509Wi);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC1727ApL.A02(null, bfm, bRg2, null, C1822Arm.A00(null, c07509Wi.A09, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, j, 0L, 0L, 0L), str, null, 2, 1, 0, (iA0d & 14) | 1597440 | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 936, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C07519Wj(bRg2, c07509Wi, str, i, i2, j);
        }
    }

    public static final void A03(BFM bfm, C07509Wi c07509Wi, int i) {
        bfm.AgG(-1541529779);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07509Wi) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            A05(bfm, c07509Wi, "place_actions_call_glyph", B1V.A00(bfm, new BUZ(c07509Wi, 11), -1791970105), new C0O4(), (iA0d & 14) | 432);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2330BUe(c07509Wi, i, 5);
        }
    }

    public static final void A04(BFM bfm, C07509Wi c07509Wi, int i, int i2) {
        bfm.AgG(-818326970);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, c07509Wi);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            AKH<AXN> akh = Am0.A04;
            AnonymousClass003.A0m(bfm, akh.A04(new ATH(AKO.A04(akh, (BBI) bfm).AEm(), 1.0f)), new C2330BUe(c07509Wi, i, 6), -1357785722);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C07529Wk(c07509Wi, i, i2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9Wi;Ljava/lang/String;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0W<-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Ljava/lang/Boolean;>;LX/BFM;I)V */
    public static final void A05(BFM bfm, C07509Wi c07509Wi, String str, G0V g0v, G0W g0w, int i) {
        bfm.AgG(-254717188);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07509Wi) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(BRg.A00, c07509Wi.A01), str);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            int i2 = iA0d >> 6;
            if (AnonymousClass001.A1X(g0w.invoke(C10G.A01, bfm, Integer.valueOf((i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6)))) {
                bfm.AgE(-430640736);
            } else {
                bfm.AgE(-430663800);
                AnonymousClass003.A13(bfm, g0v, i2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8sQ(c07509Wi, str, g0v, g0w, i);
        }
    }
}
