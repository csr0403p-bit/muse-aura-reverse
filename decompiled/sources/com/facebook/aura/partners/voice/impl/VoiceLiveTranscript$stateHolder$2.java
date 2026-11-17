package com.facebook.aura.partners.voice.impl;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceLiveTranscript$stateHolder$2 extends AbstractC7559F3s implements Function0<VoiceCallStateHolder> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceLiveTranscript$stateHolder$2(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceCallStateHolder invoke() {
        return VoiceCallStateHolder.Companion.getInstance(this.$userSession);
    }
}
