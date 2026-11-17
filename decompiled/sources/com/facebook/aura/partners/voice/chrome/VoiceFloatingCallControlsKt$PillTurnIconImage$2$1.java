package com.facebook.aura.partners.voice.chrome;

import X.ATD;
import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$PillTurnIconImage$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ VoiceCallSlotAnimation $animation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(ATD.A03(1.0f - this.$animation.getWidthProgress(), 0.0f, 1.0f));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$PillTurnIconImage$2$1(VoiceCallSlotAnimation voiceCallSlotAnimation) {
        super(1);
        this.$animation = voiceCallSlotAnimation;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
