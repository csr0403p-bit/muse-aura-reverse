package com.facebook.aura.browsertask.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgentComputerTerminalStateKt {
    public static final void AgentComputerTerminalScreen(final AgentComputerTerminalOutcome agentComputerTerminalOutcome, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        AnonymousClass003.A0u(agentComputerTerminalOutcome, function0);
        bfm.AgG(1811633524);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentComputerTerminalOutcome, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AnonymousClass002.A0x(bfm, AuraThemeMode.DARK, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerTerminalStateKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    return AgentComputerTerminalStateKt.AgentComputerTerminalScreen$lambda$0(agentComputerTerminalOutcome, function0, bRg2, (BFM) obj, AnonymousClass001.A0F(obj2));
                }
            }, 1779542625), 390);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerTerminalStateKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AgentComputerTerminalOutcome agentComputerTerminalOutcome2 = agentComputerTerminalOutcome;
                    Function0 function02 = function0;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    AgentComputerTerminalStateKt.AgentComputerTerminalScreen(agentComputerTerminalOutcome2, function02, bRg3, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskDisplayStatus.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskDisplayStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskDisplayStatus.WAITING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserTaskDisplayStatus.NEEDS_YOU, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Unit AgentComputerTerminalScreen$lambda$0(AgentComputerTerminalOutcome agentComputerTerminalOutcome, Function0 function0, BRg bRg, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AgentComputerSystemBarsEffectKt.DarkAgentComputerSystemBarsEffect(bfm, 0);
            AgentComputerTerminalState(agentComputerTerminalOutcome, function0, bRg, null, bfm, AgentComputerTerminalOutcome.$stable, 8);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AgentComputerTerminalState(final com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, X.BRg r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BFM r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerTerminalStateKt.AgentComputerTerminalState(com.facebook.aura.browsertask.view.AgentComputerTerminalOutcome, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final Unit AgentComputerTerminalState$lambda$1(Function0 function0, int i, C1DG c1dg, C1DG c1dg2, BFM bfm, int i2) {
        int iA04 = (i2 & 6) == 0 ? i2 | AnonymousClass004.A04(bfm, c1dg.A00) : i2;
        if ((i2 & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, c1dg2.A00);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C10G.A01, 0.0f, c1dg.A00, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i3 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, interfaceC1380AiAA00, akqA04, g0v);
            Integer numValueOf = Integer.valueOf(i3);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v2 = C1515AkP.A03;
            BPg.A02(bfm, numValueOf, g0v2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90l.A00.AiP(bs0, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgAiP.then(c1062ATq);
            Alignment alignment = C2VU.A09;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            BPg.A02(bfm, akqA042, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            BRg bRgA02 = C11U.A02(bs0, 64.0f);
            AuraColors auraColors = AuraColorsKt.auraColorsDark;
            BRg bRgA00 = C1b8.A00(bRgA02, 0.1f, auraColors.secondaryText);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
            BPg.A02(bfm, akqA043, g0vA0t);
            AnonymousClass003.A15(g0u, g0v2, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, 0), AuraIconSize.SMALL_MEDIUM, null, auraColors.primaryText, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120196);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            float f = AuraDimensKt.SpacingMedium;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, 0.0f, 0.0f, c1dg2.A00 + f), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerTerminalScreen$lambda$1(AgentComputerTerminalOutcome agentComputerTerminalOutcome, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AgentComputerTerminalScreen(agentComputerTerminalOutcome, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerTerminalState$lambda$2(AgentComputerTerminalOutcome agentComputerTerminalOutcome, Function0 function0, BRg bRg, Function0 function02, int i, int i2, BFM bfm, int i3) {
        AgentComputerTerminalState(agentComputerTerminalOutcome, function0, bRg, function02, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
