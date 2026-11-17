package com.facebook.aura.partners.voice.intf;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class VoiceCallStateHolder$embodimentAvailable$1 extends AbstractC7559F3s implements G0U<VoiceCallSurfaceState, Boolean> {
    public static final VoiceCallStateHolder$embodimentAvailable$1 INSTANCE = new VoiceCallStateHolder$embodimentAvailable$1();

    public VoiceCallStateHolder$embodimentAvailable$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(VoiceCallSurfaceState voiceCallSurfaceState) {
        C7384Etj.A0Y(voiceCallSurfaceState, 0);
        return Boolean.valueOf(VoiceCallStateKt.getEmbodimentAvailable(voiceCallSurfaceState));
    }
}
