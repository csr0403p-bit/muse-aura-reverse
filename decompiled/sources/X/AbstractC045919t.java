package X;

import androidx.compose.ui.Alignment;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.19t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC045919t {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0W<-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/3TQ;LX/BFM;II)V */
    public static final void A00(C3TQ c3tq, BFM bfm, BRg bRg, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, G0V g0v8, G0W g0w, float f, int i, int i2, boolean z) {
        int iA0f;
        bfm.AgG(-1830307184);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v4);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0v5);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0v6);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0v(bfm, z);
        }
        if ((805306368 & i) == 0) {
            iA0d |= AnonymousClass004.A0C(bfm, f);
        }
        if ((i2 & 6) == 0) {
            iA0f = i2 | (bfm.A67(g0v7) ? 4 : 2);
        } else {
            iA0f = i2;
        }
        if ((i2 & 48) == 0) {
            iA0f |= bfm.A67(g0v8) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            iA0f |= AnonymousClass004.A0f(bfm, c3tq);
        }
        if ((iA0d & 306783379) == 306783378 && (iA0f & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            boolean zA1O = AnonymousClass004.A1O(iA0d, 1879048192) | AnonymousClass007.A1G(iA0d) | AnonymousClass004.A1K(iA0f);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new C3TV(c3tq, f, z);
                bfm.Ai0(objAaT);
            }
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i3 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v9 = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, objAaT, akqA04, g0v9);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v10 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, i3)) {
                AnonymousClass006.A1U(g0v10, bfm, i3);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v11 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v11);
            AnonymousClass003.A13(bfm, g0v7, iA0f);
            bfm.AgE(1341517187);
            if (g0v3 != null) {
                BRg bRgThen = C1Z4.A00(BRg.A00, "Leading").then(AbstractC046219w.A01);
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A09, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgThen);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v9);
                BPg.A02(bfm, akqA042, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D);
                }
                BPg.A02(bfm, bRgA012, g0v11);
                AnonymousClass005.A0q(bbi, bfm, g0v3, iA0d >> 12);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(1341526310);
            if (g0v4 != null) {
                BRg bRgThen2 = C1Z4.A00(BRg.A00, "Trailing").then(AbstractC046219w.A01);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgThen2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v9);
                BPg.A02(bfm, akqA043, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D2)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D2);
                }
                BPg.A02(bfm, bRgA013, g0v11);
                AnonymousClass005.A0q(bbi, bfm, g0v4, iA0d >> 15);
            }
            BBI.A0R(bbi, false);
            float fA01 = C3U4.A01(c3tq, enumC1820ArjA0d);
            float fA00 = C3U4.A00(c3tq, enumC1820ArjA0d);
            if (g0v3 != null) {
                BRg bRg2 = AbstractC046219w.A01;
                fA01 -= 12.0f;
                if (fA01 < 0.0f) {
                    fA01 = 0.0f;
                }
            }
            if (g0v4 != null) {
                BRg bRg3 = AbstractC046219w.A01;
                fA00 -= 12.0f;
                if (fA00 < 0.0f) {
                    fA00 = 0.0f;
                }
            }
            bfm.AgE(1341556924);
            if (g0v5 != null) {
                BRg bRgA00 = C1Z4.A00(BRg.A00, "Prefix");
                BRg bRg4 = AbstractC046219w.A01;
                BRg bRgA0C = C3U4.A0C(C10G.A01(C2VU.A04, AnonymousClass001.A0U(bRgA00, 24.0f), false), fA01, 0.0f, 2.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v9);
                BPg.A02(bfm, akqA044, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D3)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D3);
                }
                BPg.A02(bfm, bRgA014, g0v11);
                AnonymousClass005.A0q(bbi, bfm, g0v5, iA0d >> 18);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(1341568890);
            if (g0v6 != null) {
                BRg bRgA002 = C1Z4.A00(BRg.A00, "Suffix");
                BRg bRg5 = AbstractC046219w.A01;
                BRg bRgA0C2 = C3U4.A0C(C10G.A01(C2VU.A04, AnonymousClass001.A0U(bRgA002, 24.0f), false), 2.0f, 0.0f, fA00, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c2 = AnonymousClass001.A0c(false);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0C2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c2, g0v9);
                BPg.A02(bfm, akqA045, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D4)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D4);
                }
                BPg.A02(bfm, bRgA015, g0v11);
                AnonymousClass005.A0q(bbi, bfm, g0v6, iA0d >> 21);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(1341581092);
            if (g0v2 != null) {
                BRg bRgA003 = C1Z4.A00(BRg.A00, "Label");
                BRg bRg6 = AbstractC046219w.A01;
                BRg bRgA0C3 = C3U4.A0C(C10G.A01(C2VU.A04, AnonymousClass001.A0U(bRgA003, AnonymousClass003.A01(f, 24.0f, 16.0f)), false), fA01, 0.0f, fA00, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c3 = AnonymousClass001.A0c(false);
                int iA0D5 = AnonymousClass001.A0D(bbi);
                AKQ akqA046 = BBI.A04(bbi);
                BRg bRgA016 = AxM.A01(bfm, bRgA0C3);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c3, g0v9);
                BPg.A02(bfm, akqA046, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D5)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D5);
                }
                BPg.A02(bfm, bRgA016, g0v11);
                AnonymousClass005.A0q(bbi, bfm, g0v2, iA0d >> 6);
            }
            BBI.A0R(bbi, false);
            BS0 bs0 = BRg.A00;
            BRg bRg7 = AbstractC046219w.A01;
            BRg bRgA0A = C10G.A0A(bs0, 24.0f, Float.NaN);
            C1AC c1ac = C2VU.A04;
            BRg bRgA017 = C10G.A01(c1ac, bRgA0A, false);
            if (g0v5 != null) {
                fA01 = 0.0f;
            }
            BRg bRgA0C4 = C3U4.A0C(bRgA017, fA01, 0.0f, g0v6 == null ? fA00 : 0.0f, 0.0f);
            bfm.AgE(1341611627);
            if (g0w != null) {
                AnonymousClass001.A1G(C1Z4.A00(bs0, "Hint").then(bRgA0C4), bfm, g0w, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            BBI.A0R(bbi, false);
            BRg bRgThen3 = C1Z4.A00(bs0, "TextField").then(bRgA0C4);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, true);
            int iA0D6 = AnonymousClass001.A0D(bbi);
            AKQ akqA047 = BBI.A04(bbi);
            BRg bRgA018 = AxM.A01(bfm, bRgThen3);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v9);
            BPg.A02(bfm, akqA047, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D6)) {
                AnonymousClass006.A1U(g0v10, bfm, iA0D6);
            }
            BPg.A02(bfm, bRgA018, g0v11);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0d >> 3, true);
            bfm.AgE(1341622624);
            if (g0v8 != null) {
                BRg bRgA0D = C3U4.A0D(C10G.A01(c1ac, C10G.A0A(C1Z4.A00(bs0, "Supporting"), 16.0f, Float.NaN), false), new C1DP(16.0f, 4.0f, 16.0f, 0.0f));
                InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment, false);
                int iA0D7 = AnonymousClass001.A0D(bbi);
                AKQ akqA048 = BBI.A04(bbi);
                BRg bRgA019 = AxM.A01(bfm, bRgA0D);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA013, g0v9);
                BPg.A02(bfm, akqA048, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D7)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D7);
                }
                BPg.A02(bfm, bRgA019, g0v11);
                AnonymousClass004.A1C(bbi, bfm, g0v8, iA0f >> 3, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C046019u(c3tq, bRg, g0v, g0v2, g0v3, g0v4, g0v5, g0v6, g0v7, g0v8, g0w, f, i, i2, z);
        }
    }
}
