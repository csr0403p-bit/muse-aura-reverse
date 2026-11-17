package com.facebook.aura.onboarding.view;

import X.ADq;
import X.AII;
import X.AIM;
import X.AKO;
import X.AKQ;
import X.ATD;
import X.AXN;
import X.AYD;
import X.AaC;
import X.AbstractC1798ArH;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BBP;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0zJ;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1958Aux;
import X.C1BO;
import X.C1YL;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C7BY;
import X.F60;
import X.G0U;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class OnboardingUiFlowTextRevealKt {
    /* renamed from: OnboardingUiFlowTextReveal-NpZTi58, reason: not valid java name */
    public static final void m1630OnboardingUiFlowTextRevealNpZTi58(String str, Function0<Float> function0, TextRevealTiming textRevealTiming, C1822Arm c1822Arm, long j, BRg bRg, boolean z, G0U<? super Integer, Unit> g0u, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        G0U<? super Integer, Unit> g0u2 = g0u;
        AnonymousClass005.A10(str, function0, textRevealTiming);
        C7384Etj.A0Y(c1822Arm, 3);
        bfm.AgG(2098151174);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, textRevealTiming);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1822Arm);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0Q(bfm, j);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0t = 1572864;
        if (i4 != 0) {
            iA0d |= iA0t;
        } else if ((i & 1572864) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, zA1K);
            iA0d |= iA0t;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u2);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u2 = (G0U) objAaT;
            }
            int i6 = iA0d & 14;
            int i7 = iA0d & 7168;
            boolean zA1Q = AnonymousClass002.A1Q(i7, 2048) | AnonymousClass003.A17(i6);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == C78N.A00) {
                objAaT2 = AbstractC1798ArH.A07(null, bfm);
            }
            MutableState mutableState = (MutableState) objAaT2;
            boolean zA19 = AnonymousClass003.A19(iA0d & 896) | AnonymousClass002.A1Q(i7, 2048) | AnonymousClass003.A17(i6) | AnonymousClass004.A1I(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA19 || objAaT3 == C78N.A00) {
                objAaT3 = new BBP(null, new OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$complete$2$1(mutableState, function0, textRevealTiming));
                BBI.A0T(bfm, objAaT3);
            }
            C1BO c1bo = (C1BO) objAaT3;
            boolean zA17 = AnonymousClass003.A17(i6);
            Object objAaT4 = bfm.AaT();
            if (zA17 || objAaT4 == C78N.A00) {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                AII aiiA17 = AIM.A17();
                int iFirst = characterInstance.first();
                int next = characterInstance.next();
                while (true) {
                    int i8 = next;
                    if (next == -1) {
                        break;
                    }
                    if (!C7BY.A0j(str.substring(iFirst, next))) {
                        aiiA17.add(ATD.A0C(iFirst, next));
                    }
                    next = characterInstance.next();
                    iFirst = i8;
                }
                objAaT4 = AIM.A18(aiiA17);
                bfm.Ai0(objAaT4);
            }
            List list = (List) objAaT4;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            boolean zA1B = AnonymousClass005.A1B(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA1B || objAaT5 == C78N.A00) {
                objAaT5 = new OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$2$1$1(zA1K);
                BBI.A0O(bbi, objAaT5);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT5, false);
            boolean zA65 = bfm.A65(c1bo);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == C78N.A00) {
                objAaT6 = new OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$2$2$1(c1bo);
                BBI.A0O(bbi, objAaT6);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA0Y, objAaT6);
            C1YL c1ylA0F = C3cH.A0F(3);
            boolean zA652 = bfm.A65(mutableState) | ((29360128 & iA0d) == 8388608);
            Object objAaT7 = bfm.AaT();
            if (zA652 || objAaT7 == C78N.A00) {
                objAaT7 = new OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$2$3$1(g0u2, mutableState);
                BBI.A0O(bbi, objAaT7);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0W, j, c1822Arm, null, null, c1ylA0F, false, 0, 0, 0, (G0U) objAaT7, null, null, bfm, ((iA0d >> 6) & 896) | i6 | i7, 0, 14256);
            if (C1BO.A0F(c1bo)) {
                bfm.AgE(-279002218);
            } else {
                bfm.AgE(-424646755);
                C1958Aux c1958Aux = (C1958Aux) mutableState.getValue();
                if (c1958Aux == null) {
                    bfm.AgE(-279147516);
                } else {
                    bfm.AgE(-279147515);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, -424646019);
                    while (itA0w.hasNext()) {
                        m1631UnfoldingCharacterFHprtrg(c1958Aux, (ADq) itA0w.next(), function0, textRevealTiming, j, null, bfm, AnonymousClass001.A0B(iA0d, AnonymousClass002.A08(iA0d << 3, 8)), 32);
                    }
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$3(str, function0, textRevealTiming, c1822Arm, j, bRg2, zA1K, g0u2, i, i2);
        }
    }

    /* renamed from: UnfoldingCharacter-FHprtrg, reason: not valid java name */
    public static final void m1631UnfoldingCharacterFHprtrg(C1958Aux c1958Aux, ADq aDq, Function0<Float> function0, TextRevealTiming textRevealTiming, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-539874194);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c1958Aux, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, aDq);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, textRevealTiming);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0Q(bfm, j);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, aDq, i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(c1958Aux)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = c1958Aux.A07(aDq.A00, aDq.A01 + 1).AD1();
                bfm.Ai0(objAaT);
            }
            AaC aaC = (AaC) objAaT;
            int i5 = aDq.A00;
            int iA09 = c1958Aux.A03.A09(i5);
            float fA00 = c1958Aux.A00(iA09);
            float fA01 = c1958Aux.A01(iA09);
            float f = c1958Aux.A09(i5) == C79.A01 ? fA01 - aaC.A02 : aaC.A01 - fA00;
            float f2 = fA01 - fA00;
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            float fA03 = ATD.A03(f / f2, 0.0f, 1.0f);
            float f3 = textRevealTiming.lineDurationMs;
            float f4 = f3 * 0.45f;
            float f5 = textRevealTiming.startMs + (iA09 * textRevealTiming.lineOffsetMs) + (fA03 * (f3 - f4));
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            boolean zA65 = bfm.A65(aaC);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new OnboardingUiFlowTextRevealKt$UnfoldingCharacter$1$1(aaC);
                BBI.A0O(bbi, objAaT2);
            }
            BRg bRgA0C = C10G.A0C(AYD.A03(bRg2, (G0U) objAaT2), axnA04.Agx(aaC.A02 - aaC.A01), axnA04.Agx(aaC.A00 - aaC.A03));
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = OnboardingUiFlowTextRevealKt$UnfoldingCharacter$4$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA0C, objAaT3);
            boolean zA1W = AnonymousClass002.A1W(bfm, aaC, AnonymousClass004.A1K(iA05) | bfm.A62(f5), bfm.A62(f4));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new OnboardingUiFlowTextRevealKt$UnfoldingCharacter$5$1(function0, f5, f4, aaC);
                BBI.A0O(bbi, objAaT4);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA0X, objAaT4);
            boolean zA1W2 = AnonymousClass002.A1W(bfm, aaC, i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(c1958Aux)), (iA05 & 57344) == 16384);
            Object objAaT5 = bfm.AaT();
            if (zA1W2 || objAaT5 == obj) {
                objAaT5 = new OnboardingUiFlowTextRevealKt$UnfoldingCharacter$6$1(c1958Aux, j, aaC);
                BBI.A0O(bbi, objAaT5);
            }
            C0zJ.A00(bRgA0W, (G0U) objAaT5, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new OnboardingUiFlowTextRevealKt$UnfoldingCharacter$7(c1958Aux, aDq, function0, textRevealTiming, j, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ C1958Aux access$OnboardingUiFlowTextReveal_NpZTi58$lambda$2(MutableState mutableState) {
        return (C1958Aux) mutableState.getValue();
    }
}
