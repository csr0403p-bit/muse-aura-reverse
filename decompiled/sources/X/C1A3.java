package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1A3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1A3 {
    public static final long A00;

    public static final int A00(C3TQ c3tq, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int[] iArr = {i7, i3, i4, C3WD.A01(f, i6, 0)};
        int i9 = 0;
        do {
            i5 = Math.max(i5, iArr[i9]);
            i9++;
        } while (i9 < 4);
        C1DP c1dp = (C1DP) c3tq;
        float f3 = c1dp.A03 * f2;
        return Math.max(Constraints.A02(j), Math.max(i, Math.max(i2, Ab3.A01(AnonymousClass003.A01(f, f3, Math.max(f3, i6 / 2.0f)) + i5 + (c1dp.A00 * f2)))) + i8);
    }

    static {
        long j = AbstractC10405HbM.A06;
        C19U.A05(j);
        A00 = C19U.A04(j & 1095216660480L, C1809ArT.A00(j) / 2.0f);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0W<-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZFLX/G0U<-LX/AWA;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/3TQ;LX/BFM;II)V */
    public static final void A02(C3TQ c3tq, BFM bfm, BRg bRg, G0U g0u, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, G0V g0v8, G0W g0w, float f, int i, int i2, boolean z) {
        bfm.AgG(1408290209);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v2);
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
        int iA0T = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0T(bfm, g0u) : i2;
        if ((i2 & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0v7);
        }
        if ((i2 & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0v8);
        }
        if ((i2 & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, c3tq);
        }
        if ((iA0d & 306783379) == 306783378 && (iA0T & 1171) == 1170 && bfm.AKh()) {
            bfm.Afo();
        } else {
            boolean zA1M = AnonymousClass004.A1M(iA0T) | AnonymousClass004.A1F(iA0T) | AnonymousClass007.A1G(iA0d) | AnonymousClass004.A1O(1879048192, iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new C3TT(c3tq, g0u, f, z);
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
            AnonymousClass003.A13(bfm, g0v7, iA0T >> 3);
            bfm.AgE(250370369);
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
            bfm.AgE(250379492);
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
            bfm.AgE(250410106);
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
            bfm.AgE(250422072);
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
            BS0 bs0 = BRg.A00;
            BRg bRg6 = AbstractC046219w.A01;
            BRg bRgA0A = C10G.A0A(bs0, 24.0f, Float.NaN);
            C1AC c1ac = C2VU.A04;
            BRg bRgA016 = C10G.A01(c1ac, bRgA0A, false);
            if (g0v5 != null) {
                fA01 = 0.0f;
            }
            BRg bRgA0C3 = C3U4.A0C(bRgA016, fA01, 0.0f, g0v6 == null ? fA00 : 0.0f, 0.0f);
            bfm.AgE(250444361);
            if (g0w != null) {
                AnonymousClass001.A1G(C1Z4.A00(bs0, "Hint").then(bRgA0C3), bfm, g0w, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            BBI.A0R(bbi, false);
            BRg bRgThen3 = C1Z4.A00(bs0, "TextField").then(bRgA0C3);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, true);
            int iA0D5 = AnonymousClass001.A0D(bbi);
            AKQ akqA046 = BBI.A04(bbi);
            BRg bRgA017 = AxM.A01(bfm, bRgThen3);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v9);
            BPg.A02(bfm, akqA046, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D5)) {
                AnonymousClass006.A1U(g0v10, bfm, iA0D5);
            }
            BPg.A02(bfm, bRgA017, g0v11);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0d >> 3, true);
            bfm.AgE(250455481);
            if (g0v2 != null) {
                BRg bRgA003 = C1Z4.A00(C10G.A01(c1ac, C10G.A0A(bs0, AnonymousClass003.A01(f, 24.0f, 16.0f), Float.NaN), false), "Label");
                InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment, false);
                int iA0D6 = AnonymousClass001.A0D(bbi);
                AKQ akqA047 = BBI.A04(bbi);
                BRg bRgA018 = AxM.A01(bfm, bRgA003);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA013, g0v9);
                BPg.A02(bfm, akqA047, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D6)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D6);
                }
                BPg.A02(bfm, bRgA018, g0v11);
                AnonymousClass004.A1C(bbi, bfm, g0v2, iA0d >> 9, true);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(250473414);
            if (g0v8 != null) {
                BRg bRgA0D = C3U4.A0D(C10G.A01(c1ac, C10G.A0A(C1Z4.A00(bs0, "Supporting"), 16.0f, Float.NaN), false), new C1DP(16.0f, 4.0f, 16.0f, 0.0f));
                InterfaceC1380AiA interfaceC1380AiAA014 = C3Ue.A01(alignment, false);
                int iA0D7 = AnonymousClass001.A0D(bbi);
                AKQ akqA048 = BBI.A04(bbi);
                BRg bRgA019 = AxM.A01(bfm, bRgA0D);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA014, g0v9);
                BPg.A02(bfm, akqA048, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D7)) {
                    AnonymousClass006.A1U(g0v10, bfm, iA0D7);
                }
                BPg.A02(bfm, bRgA019, g0v11);
                AnonymousClass004.A1C(bbi, bfm, g0v8, iA0T >> 6, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1A2(c3tq, bRg, g0u, g0v, g0v2, g0v3, g0v4, g0v5, g0v6, g0v7, g0v8, g0w, f, i, i2, z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/G0U<-LX/ArO;Lkotlin/Unit;>;LX/BRg;ZZLX/Arm;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/19h;LX/AuJ;LX/BGr;ZIILX/AWd;LX/1DM;LX/19x;LX/BFM;IIII)V */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013f  */
    /* JADX WARN: Type inference failed for: r0v79, types: [androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC1072AWd r74, X.C2257BGr r75, X.AuJ r76, X.C046319x r77, X.BFM r78, X.BRg r79, X.C1DM r80, X.C1822Arm r81, X.C1805ArO r82, X.C19h r83, X.G0U r84, X.G0V r85, X.G0V r86, X.G0V r87, X.G0V r88, X.G0V r89, X.G0V r90, X.G0V r91, int r92, int r93, int r94, int r95, int r96, int r97, boolean r98, boolean r99, boolean r100, boolean r101) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1A3.A01(X.AWd, X.BGr, X.AuJ, X.19x, X.BFM, X.BRg, X.1DM, X.Arm, X.ArO, X.19h, X.G0U, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, int, int, int, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}
