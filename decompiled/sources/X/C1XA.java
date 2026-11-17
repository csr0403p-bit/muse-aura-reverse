package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DatePickerKt$DatePickerContent$1$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XA {
    public static final C3TQ A01 = new C1DP(0.0f, 0.0f, 12.0f, 12.0f);
    public static final C3TQ A02 = new C1DP(24.0f, 16.0f, 12.0f, 0.0f);
    public static final C3TQ A00 = new C1DP(24.0f, 0.0f, 12.0f, 12.0f);

    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C1Wz r41, X.C1X9 r42, X.InterfaceC04801Xj r43, X.C1XY r44, X.BFM r45, java.lang.Long r46, java.lang.Long r47, X.G0U r48, int r49, long r50) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XA.A04(X.1Wz, X.1X9, X.1Xj, X.1XY, X.BFM, java.lang.Long, java.lang.Long, X.G0U, int, long):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/0z3;LX/BRg;LX/1X9;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/1Wz;LX/BFM;II)V */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1Wz r15, X.C1X9 r16, X.C0z3 r17, X.BFM r18, X.BRg r19, X.G0V r20, X.G0V r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XA.A01(X.1Wz, X.1X9, X.0z3, X.BFM, X.BRg, X.G0V, X.G0V, int, int, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A0C(Function0 function0, BRg bRg, boolean z, G0V g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(409654418);
        int iA0T = (i2 & 1) != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i2 & 2) != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i2 & 8) != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((iA0T & 1171) == 1170 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3 = C1D8.A00;
            long jA0I = AnonymousClass006.A0I(bfm);
            long j = B6A.A07;
            C04791Xh c04791XhA00 = AbstractC04851Xo.A00(AnonymousClass006.A0J(bfm));
            long j2 = j;
            long j3 = j;
            if (j == 16) {
                j2 = c04791XhA00.A00;
            }
            if (jA0I == 16) {
                jA0I = c04791XhA00.A01;
            }
            if (j == 16) {
                j3 = c04791XhA00.A02;
            }
            if (j == 16) {
                j = c04791XhA00.A03;
            }
            AbstractC04841Xn.A01(null, null, null, new C04791Xh(j2, jA0I, j3, j), null, bfm, bRg2, c1d3, function0, B1V.A00(bfm, new C8794Fku(g0v, z), 1899012021), (iA0T & 14) | 807075840 | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 388, false);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C0xm(function0, bRg2, z, g0v, i, i2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;LX/BFM;I)V */
    public static final void A00(LazyListState lazyListState, C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BFM bfm, Long l, G0U g0u, G0U g0u2, ADq aDq, int i) {
        bfm.AgG(-1994757941);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, abstractC04741Xc);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, aDq);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, c1x9, 2097152, i) ? 1 : 0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, interfaceC04801Xj);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, c1Wz);
        }
        if ((38347923 & iA0d) == 38347922 && bfm.AKh()) {
            bfm.Afo();
        } else {
            C1XX c1xxA02 = abstractC04741Xc.A02();
            boolean zA65 = bfm.A65(aDq);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = C1Y1.A00((C1Y1) abstractC04741Xc, LocalDate.of(aDq.A00, 1, 1));
                bfm.Ai0(objAaT);
            }
            C0yq.A01(C1A1.A00(bfm, C1XJ.A03), B1V.A00(bfm, new C1Y6(lazyListState, c1Wz, c1x9, interfaceC04801Xj, c1xxA02, abstractC04741Xc, (C1XY) objAaT, l, g0u, aDq), 1504086906), bfm, 48);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, abstractC04741Xc, aDq, AnonymousClass004.A1F(iA0d), AnonymousClass004.A1M(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1Y || objAaT2 == C78N.A00) {
                objAaT2 = new C05403bm(lazyListState, abstractC04741Xc, g0u2, aDq, null, 1);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, lazyListState);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XK(lazyListState, c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, l, g0u, g0u2, aDq, i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;JILX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;LX/BFM;I)V */
    public static final void A02(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BFM bfm, Long l, G0U g0u, G0U g0u2, ADq aDq, int i, int i2, long j) {
        bfm.AgG(-895379221);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, l) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, abstractC04741Xc);
        }
        if ((1572864 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, aDq);
        }
        if ((12582912 & i2) == 0) {
            iA0d |= AnonymousClass004.A1R(bfm, c1x9, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, i2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, interfaceC04801Xj);
        }
        if ((805306368 & i2) == 0) {
            iA0d |= AnonymousClass004.A0m(bfm, c1Wz);
        }
        if ((306783379 & iA0d) == 306783378 && bfm.AKh()) {
            bfm.Afo();
        } else {
            int i3 = -AnonymousClass002.A0Y(bfm).Abr(48.0f);
            C04811Xk c04811Xk = new C04811Xk(i);
            BRg bRgA01 = ARD.A01(BRg.A00, new C05433bp(16), false);
            boolean zA63 = bfm.A63(i3);
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = new BUW(i3, 2);
                bfm.Ai0(objAaT);
            }
            ANR.A02(bfm, null, bRgA01, c04811Xk, "DatePickerDisplayModeAnimation", (G0U) objAaT, null, B1V.A00(bfm, new C1XG(c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, l, g0u, g0u2, aDq, j), -459778869), ((iA0d >> 6) & 14) | 1597440, 40);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XN(c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, l, g0u, g0u2, aDq, i, i2, j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Long;JLX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Long;Lkotlin/Unit;>;LX/1Xc;LX/ADq;LX/1X9;LX/1Xj;LX/1Wz;LX/BFM;I)V */
    public static final void A03(C1Wz c1Wz, C1X9 c1x9, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BFM bfm, Long l, G0U g0u, G0U g0u2, ADq aDq, int i, long j) {
        bfm.AgG(-434467002);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, l) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, abstractC04741Xc);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, aDq);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, c1x9, 2097152, i) ? 1 : 0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, interfaceC04801Xj);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, c1Wz);
        }
        if ((38347923 & iA0d) == 38347922 && bfm.AKh()) {
            bfm.Afo();
        } else {
            C1XY c1xyA04 = abstractC04741Xc.A04(j);
            int i2 = (((c1xyA04.A03 - aDq.A00) * 12) + c1xyA04.A01) - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            LazyListState lazyListStateA00 = AZ3.A00(i2, 0, bfm, 0, 2);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zA1W = AnonymousClass003.A1W(lazyListStateA00, bfm, i2);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new DatePickerKt$DatePickerContent$1$1(lazyListStateA00, i2, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, numValueOf);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = ((C066978i) AnonymousClass007.A0V(bfm, objAaT2, obj)).A00;
            MutableState mutableState = (MutableState) AFz.A02(bfm, null, new C05443bq(4), new Object[0], 6);
            Locale localeA00 = C1X3.A00(bfm);
            BS0 bs0 = BRg.A00;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA00, akqA04, g0v);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, i3)) {
                AnonymousClass006.A1U(g0v2, bfm, i3);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            BRg bRgA0B = C3U4.A0B(bs0, 12.0f, 0.0f);
            boolean zADO = lazyListStateA00.ADO();
            boolean zADN = lazyListStateA00.ADN();
            boolean zA0A = MutableState.A0A(mutableState);
            String strA00 = C1Y3.A00("yMMMM", localeA00, ((C04731Xb) c1x9).A00, Long.valueOf(j).longValue());
            if (strA00 == null) {
                strA00 = "-";
            }
            boolean zA1N = AnonymousClass003.A1N(bfm, c3ux, lazyListStateA00);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new C05523by(0, lazyListStateA00, c3ux);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            boolean zA1N2 = AnonymousClass003.A1N(bfm, c3ux, lazyListStateA00);
            Object objAaT4 = bfm.AaT();
            if (zA1N2 || objAaT4 == obj) {
                objAaT4 = new C05523by(1, lazyListStateA00, c3ux);
                bfm.Ai0(objAaT4);
            }
            Function0 function03 = (Function0) objAaT4;
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new C05453br(mutableState, 1);
                bfm.Ai0(objAaT5);
            }
            int i4 = iA0d & 234881024;
            A08(c1Wz, bfm, bRgA0B, strA00, function02, function03, (Function0) objAaT5, i4 | 6, zADO, zADN, zA0A);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA042, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D)) {
                AnonymousClass006.A1U(g0v2, bfm, iA0D);
            }
            BPg.A02(bfm, bRgA012, g0v3);
            BRg bRgA0B2 = C3U4.A0B(bs0, 12.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA043, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D2)) {
                AnonymousClass006.A1U(g0v2, bfm, iA0D2);
            }
            BPg.A02(bfm, bRgA013, g0v3);
            A06(c1Wz, abstractC04741Xc, bfm, ((iA0d >> 24) & 14) | ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            A00(lazyListStateA00, c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, bfm, l, g0u, g0u2, aDq, AnonymousClass005.A06(iA0d, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i4);
            BBI.A0R(bbi, true);
            AbstractC04661Bq.A08(AbstractC1011APs.A01(null, 15).A00(AbstractC1011APs.A03(0.6f, 1)), AbstractC1011APs.A0B(null, 15).A00(AbstractC1011APs.A0E(C1003AOr.A00(null))), bfm, C11U.A00(bs0), null, B1V.A00(bfm, new C1XB(lazyListStateA00, c1Wz, interfaceC04801Xj, abstractC04741Xc, c1xyA04, mutableState, aDq, c3ux, j), 1193716082), 200112, 16, MutableState.A0A(mutableState));
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3cC(c1Wz, c1x9, interfaceC04801Xj, abstractC04741Xc, l, g0u, g0u2, aDq, i, j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;JLX/G0U<-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Xj;LX/1Xc;LX/ADq;LX/1Wz;LX/BFM;I)V */
    public static final void A05(C1Wz c1Wz, InterfaceC04801Xj interfaceC04801Xj, AbstractC04741Xc abstractC04741Xc, BFM bfm, BRg bRg, G0U g0u, ADq aDq, int i, long j) {
        bfm.AgG(-1286899812);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, interfaceC04801Xj);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, abstractC04741Xc);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, aDq);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1Wz);
        }
        if ((599187 & iA0d) == 599186 && bfm.AKh()) {
            bfm.Afo();
        } else {
            C0yq.A01(C1A1.A00(bfm, C1XJ.A0G), B1V.A00(bfm, new C1XD(c1Wz, interfaceC04801Xj, abstractC04741Xc, bRg, g0u, aDq, j), 1301915789), bfm, 48);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XP(c1Wz, interfaceC04801Xj, abstractC04741Xc, bRg, g0u, aDq, i, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(C1Wz c1Wz, AbstractC04741Xc abstractC04741Xc, BFM bfm, int i) {
        bfm.AgG(-1849465391);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1Wz) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, abstractC04741Xc);
        }
        if ((iA0d & 19) == 18 && bfm.AKh()) {
            bfm.Afo();
        } else {
            C1Y1 c1y1 = (C1Y1) abstractC04741Xc;
            int i2 = c1y1.A00;
            List<HxE<String, String>> list = c1y1.A01;
            ArrayList arrayList = new ArrayList();
            int i3 = i2 - 1;
            int size = list.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(list.get(i4));
            }
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(list.get(i5));
            }
            C1822Arm c1822ArmA00 = C1A1.A00(bfm, C1XJ.A0M);
            BS0 bs0 = BRg.A00;
            BRg bRgA0R = AnonymousClass001.A0R(AnonymousClass001.A0V(bs0, 48.0f));
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A04, bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA0b, akqA04, g0v);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, i6)) {
                AnonymousClass006.A1U(g0v2, bfm, i6);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            bfm.AgE(396197267);
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                HxE hxE = (HxE) arrayList.get(i7);
                boolean zA65 = bfm.A65(hxE);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new C05463bs(hxE, 14);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0C = C10G.A0C(AnonymousClass001.A0X(bs0, objAaT), 48.0f, 48.0f);
                Alignment alignment = C2VU.A09;
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                BPg.A02(bfm, akqA042, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D)) {
                    AnonymousClass006.A1U(g0v2, bfm, iA0D);
                }
                BPg.A02(bfm, bRgA012, g0v3);
                C0yq.A00(bfm, C10G.A02(alignment, bs0, false), c1822ArmA00, null, null, null, C1YL.A00(), null, (String) hxE.second, null, 0, 0, 0, 48, 0, 65016, c1Wz.A0M, 0L, 0L, 0L, false);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c0(c1Wz, abstractC04741Xc, i, 0);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Wz;LX/Arm;FLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A07(C1Wz c1Wz, BFM bfm, BRg bRg, C1822Arm c1822Arm, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, float f, int i) {
        bfm.AgG(1507356255);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1Wz);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, c1822Arm);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0A(bfm, f);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0v4);
        }
        if ((4793491 & iA0d) == 4793490 && bfm.AKh()) {
            bfm.Afo();
        } else {
            BRg bRgA01 = C1b8.A01(ARD.A01(C10G.A0F(bRg, 360.0f, Float.NaN, Float.NaN, Float.NaN), new C05433bp(14), false), c1Wz.A00);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, interfaceC1380AiAA0U, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v5 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0J)) {
                AnonymousClass006.A1U(g0v5, bfm, iA0J);
            }
            AnonymousClass001.A16(bfm, bRgA012);
            A0B(bfm, BRg.A00, g0v, B1V.A00(bfm, new C0c1(c1Wz, c1822Arm, g0v2, g0v3, g0v), -229007058), f, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196614 | (57344 & (iA0d >> 6)), c1Wz.A0J, c1Wz.A0C);
            AnonymousClass005.A0q(bbi, bfm, g0v4, iA0d >> 21);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XS(c1Wz, bRg, c1822Arm, g0v, g0v2, g0v3, g0v4, f, i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/1Wz;LX/BFM;I)V */
    public static final void A08(C1Wz c1Wz, BFM bfm, BRg bRg, String str, Function0 function0, Function0 function02, Function0 function03, int i, boolean z, boolean z2, boolean z3) {
        bfm.AgG(-773929258);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function02);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function03);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, c1Wz);
        }
        if ((38347923 & iA0d) == 38347922 && bfm.AKh()) {
            bfm.Afo();
        } else {
            BRg bRgA05 = C10G.A05(AnonymousClass001.A0R(bRg), 56.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(z3 ? AcQ.A01 : AcQ.A03, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA05);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass003.A0o(bfm, interfaceC1380AiAA00, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0J)) {
                AnonymousClass006.A1U(g0v, bfm, iA0J);
            }
            AnonymousClass001.A16(bfm, bRgA01);
            AnonymousClass003.A0m(bfm, AnonymousClass003.A0T(C1AZ.A00, c1Wz.A0D), new C0xh(str, function03, function02, function0, z3, z2, z), -962805198);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XV(c1Wz, bRg, str, function0, function02, function03, i, z, z2, z3);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLjava/lang/String;LX/1Wz;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A09(C1Wz c1Wz, BFM bfm, BRg bRg, String str, Function0 function0, G0V g0v, int i, boolean z, boolean z2, boolean z3) {
        bfm.AgG(238547184);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1Wz);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0v);
        }
        if ((4793491 & iA0d) == 4793490 && bfm.AKh()) {
            bfm.Afo();
        } else {
            boolean zA1Q = AnonymousClass002.A1Q(iA0d & 896, 256) | AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = (!z2 || z) ? null : C0M7.A00(1.0f, c1Wz.A0L);
                bfm.Ai0(objAaT);
            }
            C1DH c1dh = (C1DH) objAaT;
            boolean zA1H = AnonymousClass007.A1H(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1H || objAaT2 == C78N.A00) {
                objAaT2 = new C3cE(str, 6);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg, objAaT2, true);
            C1DE c1deA00 = C1AH.A00(bfm, C1XJ.A0J);
            long j = z ? z3 ? c1Wz.A0G : c1Wz.A08 : B6A.A06;
            C28s c28s = C2HU.A01;
            long jA03 = C1BO.A03(C19f.A00(new ASj(c28s, 100, 0), bfm, 0, 12, j));
            long jA032 = C1BO.A03(C19f.A00(new ASj(c28s, 100, 0), bfm, 0, 12, z ? z3 ? c1Wz.A0H : c1Wz.A09 : z2 ? c1Wz.A01 : z3 ? c1Wz.A0N : c1Wz.A0A));
            B1U b1uA00 = B1V.A00(bfm, new C05473bt(g0v, 6), -1573188346);
            AKH<C1DG> akh = C11R.A00;
            float fA00 = C1DG.A00(bfm, akh) + 0.0f;
            AKT.A02(bfm, B1V.A00(bfm, new C0uz(c1dh, bRgA0Y, c1deA00, function0, b1uA00, fA00, jA03, z, z3), -1164547968), new AKJ[]{AnonymousClass003.A0T(C1AZ.A00, jA032), C1DG.A02(akh, fA00)}, 56);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XT(c1Wz, bRg, str, function0, g0v, i, z, z2, z3);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZZZZLjava/lang/String;LX/1Wz;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.C1Wz r24, X.BFM r25, X.BRg r26, java.lang.String r27, kotlin.jvm.functions.Function0 r28, X.G0V r29, int r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XA.A0A(X.1Wz, X.BFM, X.BRg, java.lang.String, kotlin.jvm.functions.Function0, X.G0V, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;JJFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A0B(BFM bfm, BRg bRg, G0V g0v, G0V g0v2, float f, int i, long j, long j2) {
        bfm.AgG(-996037719);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0P(bfm, j2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v2);
        }
        if ((74899 & iA0d) == 74898 && bfm.AKh()) {
            bfm.Afo();
        } else {
            BRg bRgA0V = BRg.A00;
            if (g0v != null) {
                bRgA0V = AnonymousClass001.A0V(bRgA0V, f);
            }
            BRg bRgThen = AnonymousClass001.A0R(bRg).then(bRgA0V);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A03, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, interfaceC1380AiAA00, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v3 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0J)) {
                AnonymousClass006.A1U(g0v3, bfm, iA0J);
            }
            AnonymousClass001.A16(bfm, bRgA01);
            bfm.AgE(594325590);
            if (g0v != null) {
                C0y1.A00(bfm, C1A1.A00(bfm, C1XJ.A0C), B1V.A00(bfm, new C05473bt(g0v, 4), 1936268514), ((iA0d >> 6) & 14) | 384, j);
            }
            BBI.A0R(bbi, false);
            AnonymousClass001.A14(bfm, AnonymousClass003.A0T(C1AZ.A00, j2), g0v2, iA0d >> 12);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1XW(bRg, g0v, g0v2, f, i, j, j2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ILX/G0U<-LX/1Xk;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A0D(G0U g0u, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        Function0 function0;
        G0V<BFM, Integer, Unit> g0v;
        bfm.AgG(1393846115);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((iA0d & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            if (AnonymousClass002.A1Q(i, 0)) {
                bfm.AgE(-411219388);
                z = (iA0d & 896) == 256;
                Object objAaT = bfm.AaT();
                if (z || objAaT == C78N.A00) {
                    objAaT = new C05453br(g0u, 2);
                    bfm.Ai0(objAaT);
                }
                function0 = (Function0) objAaT;
                g0v = AbstractC04761Xe.A00;
            } else {
                bfm.AgE(-410937381);
                z = (iA0d & 896) == 256;
                Object objAaT2 = bfm.AaT();
                if (z || objAaT2 == C78N.A00) {
                    objAaT2 = new C05453br(g0u, 3);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                g0v = AbstractC04761Xe.A01;
            }
            C0xj.A00(null, null, bfm, bRg, function0, g0v, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608, 28, false);
            AnonymousClass001.A1D(bfm);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c2(g0u, i2, bRg, i, 0);
        }
    }
}
