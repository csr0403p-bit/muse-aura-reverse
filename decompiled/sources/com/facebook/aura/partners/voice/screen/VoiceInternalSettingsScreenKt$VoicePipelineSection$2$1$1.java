package com.facebook.aura.partners.voice.screen;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
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
import X.C1822Arm;
import X.C1AC;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.api.VoicePipelineProfileState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ String $selectedLabel;
    public final /* synthetic */ VoicePipelineProfileState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$1(boolean z, MutableState<Boolean> mutableState, VoicePipelineProfileState voicePipelineProfileState, String str) {
        super(3);
        this.$enabled = z;
        this.$expanded$delegate = mutableState;
        this.$state = voicePipelineProfileState;
        this.$selectedLabel = str;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        AKH<AuraColors> akh;
        long jA0L;
        C7384Etj.A0Y(interfaceC05151eP, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = AnonymousClass006.A0O(C10G.A02);
            boolean z = this.$enabled;
            C1YD c1yd = new C1YD(0);
            MutableState<Boolean> mutableState = this.$expanded$delegate;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$1$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA0O, c1yd, null, (Function0) objAaT, z);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA04, f, f2);
            C9m9 c9m9A00 = AcQ.A00(f2);
            C1AC c1ac = C2VU.A04;
            VoicePipelineProfileState voicePipelineProfileState = this.$state;
            String str = this.$selectedLabel;
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
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            if (voicePipelineProfileState != null && voicePipelineProfileState.selectedProfileId != null) {
                bfm.AgE(-1636784297);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = C06G.A0L(bfm, akh);
            } else {
                bfm.AgE(-1636785992);
                akh = AuraColorsKt.LocalAuraColors;
                jA0L = AnonymousClass001.A0f(bfm, akh).tertiaryText;
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, true), jA0L, c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            if (voicePipelineProfileState != null && voicePipelineProfileState.modified) {
                bfm.AgE(799501892);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120683), null, AnonymousClass001.A0f(bfm, akh).tertiaryText, C06G.A0T(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(799807862);
                BBI.A0R(bbi, false);
            }
            AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0S(bs0), BOf.A00(bfm, R.drawable.chevron_up_down_wght400_outline_24, 0), AuraIconSize.MEDIUM, null, C06G.A0H(bfm, akh), null, bfm, (AVy.$stable << 3) | 3462, 32);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
