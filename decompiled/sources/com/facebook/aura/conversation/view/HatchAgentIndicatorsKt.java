package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AYD;
import X.AbstractC1046ASq;
import X.AbstractC1052ASw;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C1041ASi;
import X.C1049ASt;
import X.C10G;
import X.C1116Aaf;
import X.C11U;
import X.C1515AkP;
import X.C1AC;
import X.C1BO;
import X.C1D8;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3Ue;
import X.C78N;
import X.C79;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAgentIndicatorsKt {
    public static final float BOUNCE_HEIGHT = -6.0f;
    public static final int BOUNCE_MS = 300;
    public static final int CYCLE_MS = 1950;
    public static final int DOT_COUNT = 3;
    public static final int PAUSE_MS = 250;
    public static final int PULSE_MS = 250;
    public static final int STAGGER_MS = 150;
    public static final int TAIL_MS = 300;

    /* renamed from: HatchStreamingCursor-KTwxG1Y, reason: not valid java name */
    public static final void m526HatchStreamingCursorKTwxG1Y(long j, String str, BRg bRg, BFM bfm, int i, int i2) {
        Integer num;
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(1474924566);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0M |= 384;
        } else if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 147, 146), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long jA08 = C06G.A08(bfm);
            C1049ASt c1049AStA01 = AbstractC1046ASq.A01(bfm);
            bfm.AgE(63320887);
            C1BO[] c1boArr = new C1BO[3];
            int i4 = 0;
            do {
                int i5 = i4 * 150;
                int i6 = i5 + 300;
                int i7 = i5 + 600;
                boolean zA1S = AnonymousClass002.A1S(bfm, i7, bfm.A63(i5), bfm.A63(i6));
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new HatchAgentIndicatorsKt$HatchStreamingCursor$offsets$1$1$1(i5, i6, i7);
                    bfm.Ai0(objAaT);
                }
                C1116Aaf c1116AafA00 = AbstractC1052ASw.A00((G0U) objAaT);
                num = C79.A00;
                c1boArr[i4] = AbstractC1046ASq.A00(new C1041ASi(c1116AafA00, num, 0L), c1049AStA01, bfm, 0.0f, 0.0f);
                i4++;
            } while (i4 < 3);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            bfm.AgE(63347306);
            C1BO[] c1boArr2 = new C1BO[3];
            int i8 = 0;
            do {
                int i9 = i8 * 150;
                int i10 = i9 + 850;
                int i11 = i9 + 1100;
                int i12 = i9 + 1350;
                boolean zA1S2 = AnonymousClass002.A1S(bfm, i12, bfm.A63(i10), bfm.A63(i11));
                Object objAaT2 = bfm.AaT();
                if (zA1S2 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchAgentIndicatorsKt$HatchStreamingCursor$alphas$1$1$1(i10, i11, i12);
                    bfm.Ai0(objAaT2);
                }
                c1boArr2[i8] = AbstractC1046ASq.A00(new C1041ASi(AbstractC1052ASw.A00((G0U) objAaT2), num, 0L), c1049AStA01, bfm, 1.0f, 1.0f);
                i8++;
            } while (i8 < 3);
            BBI.A0R(bbi, false);
            String strA08 = C1BO.A08(HatchConversationHistorySidePanelKt.rememberAgentNameState(bfm, 0));
            if (str == null) {
                bfm.AgE(63378753);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f121075);
            } else {
                bfm.AgE(63378257);
                BBI.A0R(bbi, false);
                strA0s = str;
            }
            String strA0w = AnonymousClass006.A0w(bfm, strA08, strA0s, R.string._name_removed__res_0x7f120237);
            BRg bRgA01 = C11U.A01(C10G.A0A(C10G.A0D(bRg2, HatchMessageBubbleKt.BubbleMinWidth, Float.NaN), HatchMessageBubbleKt.BubbleMinHeight, Float.NaN), AnonymousClass002.A0d(bfm).bubbleCornerRadius);
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgA01, c1dm, j);
            boolean zA65 = bfm.A65(strA0w);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchAgentIndicatorsKt$HatchStreamingCursor$1$1(strA0w);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA03, objAaT3, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            long j2 = bbi.A06;
            int i13 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i13);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C9m9 c9m9A00 = AcQ.A00(6.0f);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0b, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            bfm.AgE(642933707);
            int i14 = 0;
            do {
                BRg bRgA07 = C10G.A07(bs0, 8.0f);
                boolean zA1a = AnonymousClass001.A1a(bfm.A67(c1boArr), bfm, i14);
                Object objAaT4 = bfm.AaT();
                if (zA1a || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchAgentIndicatorsKt$HatchStreamingCursor$2$1$1$1(c1boArr, i14);
                    bfm.Ai0(objAaT4);
                }
                BRg bRgA032 = AYD.A03(bRgA07, (G0U) objAaT4);
                boolean zA1a2 = AnonymousClass001.A1a(bfm.A67(c1boArr2), bfm, i14);
                Object objAaT5 = bfm.AaT();
                if (zA1a2 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchAgentIndicatorsKt$HatchStreamingCursor$2$1$2$1(c1boArr2, i14);
                    bfm.Ai0(objAaT5);
                }
                C3Ue.A04(C1b8.A03(C11U.A03(AnonymousClass001.A0W(bRgA032, objAaT5), C1D8.A00), c1dm, jA08), bfm, 0);
                i14++;
            } while (i14 < 3);
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAgentIndicatorsKt$HatchStreamingCursor$3(j, str, bRg2, i, i2);
        }
    }
}
