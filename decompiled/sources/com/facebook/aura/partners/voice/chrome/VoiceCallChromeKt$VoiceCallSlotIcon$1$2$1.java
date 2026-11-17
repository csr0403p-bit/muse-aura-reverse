package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import X.C1390AiL;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceCallChromeKt$VoiceCallSlotIcon$1$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ VoiceCallSlotAnimation $animation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float widthProgress = this.$animation.getWidthProgress();
        float f = widthProgress - 1.0f;
        c2av.AeW(120.0f * f);
        c2av.AeX(((1.0f - widthProgress) * 1.0638298f) + (widthProgress * 1.0f));
        c2av.AeY(((C1390AiL) c2av).A04);
        c2av.Af6(f * c2av.Ah4(VoiceCallChromeKt.HandsetToHangUpOffsetY));
        c2av.Acj(this.$animation.getHangUpFill());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallChromeKt$VoiceCallSlotIcon$1$2$1(VoiceCallSlotAnimation voiceCallSlotAnimation) {
        super(1);
        this.$animation = voiceCallSlotAnimation;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
