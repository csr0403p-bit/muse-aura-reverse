package com.facebook.aura.partners.voice.intf;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceCallStateHolder$embodimentMedia$1 extends AbstractC7559F3s implements G0U<VoiceCallSurfaceState, VoiceEmbodimentMedia> {
    public static final VoiceCallStateHolder$embodimentMedia$1 INSTANCE = new VoiceCallStateHolder$embodimentMedia$1();

    public VoiceCallStateHolder$embodimentMedia$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ VoiceEmbodimentMedia invoke(VoiceCallSurfaceState voiceCallSurfaceState) {
        VoiceCallSurfaceState voiceCallSurfaceState2 = voiceCallSurfaceState;
        C7384Etj.A0Y(voiceCallSurfaceState2, 0);
        return VoiceCallStateKt.getEmbodimentMedia(voiceCallSurfaceState2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final VoiceEmbodimentMedia invoke2(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        return VoiceCallStateKt.getEmbodimentMedia(voiceCallSurfaceState);
    }
}
