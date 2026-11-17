package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$1$1 extends C7438Evz implements G0U<VoiceStillHandoffEvent, Unit> {
    public VoiceEmbodimentAvatarOverlayKt$VoiceCallAvatarMedia$8$1$1(Object obj) {
        super(1, obj, VoiceCallViewModel.class, "onStillHandoffEvent", "onStillHandoffEvent(Lcom/facebook/aura/partners/voice/intf/VoiceStillHandoffEvent;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceStillHandoffEvent voiceStillHandoffEvent) {
        ((VoiceCallViewModel) AnonymousClass006.A0o(voiceStillHandoffEvent, this)).onStillHandoffEvent(voiceStillHandoffEvent);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceStillHandoffEvent voiceStillHandoffEvent) {
        invoke2(voiceStillHandoffEvent);
        return Unit.INSTANCE;
    }
}
