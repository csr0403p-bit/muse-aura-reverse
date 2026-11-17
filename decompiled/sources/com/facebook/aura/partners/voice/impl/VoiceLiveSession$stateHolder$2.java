package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceLiveSession$stateHolder$2 extends AbstractC7559F3s implements Function0<VoiceCallStateHolder> {
    public final /* synthetic */ VoiceLiveSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceLiveSession$stateHolder$2(VoiceLiveSession voiceLiveSession) {
        super(0);
        this.this$0 = voiceLiveSession;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceCallStateHolder invoke() {
        return VoiceCallStateHolder.Companion.getInstance(this.this$0.userSession);
    }
}
