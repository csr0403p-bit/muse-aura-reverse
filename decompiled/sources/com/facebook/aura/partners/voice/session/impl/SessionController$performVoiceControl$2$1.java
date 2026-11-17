package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$performVoiceControl$2$1 extends AbstractC7559F3s implements Function0<VoiceControlHandler.Result> {
    public final /* synthetic */ Function0<VoiceControlHandler.Result> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SessionController$performVoiceControl$2$1(Function0<? extends VoiceControlHandler.Result> function0) {
        super(0);
        this.$action = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final VoiceControlHandler.Result invoke() {
        return this.$action.invoke();
    }
}
