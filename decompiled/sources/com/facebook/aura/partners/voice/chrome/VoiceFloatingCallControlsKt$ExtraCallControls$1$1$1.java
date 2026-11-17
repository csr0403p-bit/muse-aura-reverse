package com.facebook.aura.partners.voice.chrome;

import X.ARD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BHP;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1 extends AbstractC7559F3s implements G0W<VoiceCallControl, BFM, Integer, Unit> {
    public final /* synthetic */ List<BHP> $moveActions;
    public final /* synthetic */ G0U<VoiceCallControl, Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1(G0U<? super VoiceCallControl, Unit> g0u, List<BHP> list) {
        super(3);
        this.$onClick = g0u;
        this.$moveActions = list;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(VoiceCallControl voiceCallControl, BFM bfm, Integer num) {
        invoke(voiceCallControl, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(VoiceCallControl voiceCallControl, BFM bfm, int i) {
        C7384Etj.A0Y(voiceCallControl, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass005.A08(bfm, voiceCallControl);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            G0U<VoiceCallControl, Unit> g0u = this.$onClick;
            BS0 bs0 = BRg.A00;
            boolean zA67 = bfm.A67(this.$moveActions);
            List<BHP> list = this.$moveActions;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceFloatingCallControlsKt$ExtraCallControls$1$1$1$1$1(list);
                bfm.Ai0(objAaT);
            }
            VoiceFloatingCallControlsKt.VoiceCallControlButton(voiceCallControl, g0u, ARD.A01(bs0, (G0U) objAaT, false), null, bfm, i & 14, 8);
            return;
        }
        bfm.Afo();
    }
}
