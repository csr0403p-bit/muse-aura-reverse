package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class VoiceCallConnectionTracker$embodimentVisibility$2 extends C7438Evz implements G0U<VoiceEmbodimentTransition, Unit> {
    public VoiceCallConnectionTracker$embodimentVisibility$2(Object obj) {
        super(1, obj, VoiceCallConnectionTracker.class, "logEmbodimentTransition", "logEmbodimentTransition(Lcom/facebook/aura/partners/voice/session/impl/VoiceEmbodimentTransition;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceEmbodimentTransition voiceEmbodimentTransition) {
        ((VoiceCallConnectionTracker) AnonymousClass006.A0o(voiceEmbodimentTransition, this)).logEmbodimentTransition(voiceEmbodimentTransition);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceEmbodimentTransition voiceEmbodimentTransition) {
        invoke2(voiceEmbodimentTransition);
        return Unit.INSTANCE;
    }
}
