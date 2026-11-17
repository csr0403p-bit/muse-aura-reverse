package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ int $greetingDelayMs;
    public final /* synthetic */ G0U<Integer, Unit> $onSetGreetingDelayMs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1(int i, G0U<? super Integer, Unit> g0u) {
        super(3);
        this.$greetingDelayMs = i;
        this.$onSetGreetingDelayMs = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        C7384Etj.A0Y(interfaceC05151eP, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = AnonymousClass006.A0O(C10G.A02);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0O, f, f2);
            C9m9 c9m9A00 = AcQ.A00(f2);
            C1AC c1ac = C2VU.A04;
            int i2 = this.$greetingDelayMs;
            G0U<Integer, Unit> g0u = this.$onSetGreetingDelayMs;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strGreetingDelayValueLabel = VoiceInternalSettingsScreenKt.greetingDelayValueLabel(i2, bfm, 0);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(strGreetingDelayValueLabel, c90m.AiP(bs0, 1.0f, true), C06G.A0C(bfm), c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120664);
            boolean zA1N = AnonymousClass002.A1N(i2);
            boolean zA1W = AnonymousClass003.A1W(g0u, bfm, i2);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1$1$1$1(g0u, i2);
                bfm.Ai0(objAaT);
            }
            VoiceInternalSettingsScreenKt.GreetingDelayStepButton("\u2212", strA01, zA1N, (Function0) objAaT, null, bfm, 6, 16);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120665);
            boolean z = false;
            if (i2 < 5000) {
                z = true;
            }
            boolean zA1W2 = AnonymousClass003.A1W(g0u, bfm, i2);
            Object objAaT2 = bfm.AaT();
            if (zA1W2 || objAaT2 == C78N.A00) {
                objAaT2 = new VoiceInternalSettingsScreenKt$GreetingDelaySection$1$1$1$2$1(g0u, i2);
                bfm.Ai0(objAaT2);
            }
            VoiceInternalSettingsScreenKt.GreetingDelayStepButton("+", strA012, z, (Function0) objAaT2, null, bfm, 6, 16);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
