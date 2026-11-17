package com.facebook.aura.partners.voice.screen;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$ResetVoiceOnboardingSection$1$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ String $label;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInternalSettingsScreenKt$ResetVoiceOnboardingSection$1$1(Function0<Unit> function0, String str) {
        super(3);
        this.$onClick = function0;
        this.$label = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA04 = C0v5.A04(AnonymousClass006.A0O(C10G.A02), new C1YD(0), null, this.$onClick, true);
            boolean zA65 = bfm.A65(this.$label);
            String str = this.$label;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new VoiceInternalSettingsScreenKt$ResetVoiceOnboardingSection$1$1$1$1(str);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0Y, f, f2);
            C9m9 c9m9A00 = AcQ.A00(f2);
            C1AC c1ac = C2VU.A04;
            String str2 = this.$label;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, i2);
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0S(bs0), BOf.A00(bfm, R.drawable.arrow_counter_clockwise_wght400_outline_24, 0), AuraIconSize.MEDIUM, null, AnonymousClass002.A0c(bfm).error, null, bfm, (AVy.$stable << 3) | 3462, 32);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
