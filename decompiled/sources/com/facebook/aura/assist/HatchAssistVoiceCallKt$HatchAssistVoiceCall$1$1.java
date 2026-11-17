package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;

/* loaded from: classes.dex */
public final class HatchAssistVoiceCallKt$HatchAssistVoiceCall$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ VoiceCallStateHolder $holder;
    public final /* synthetic */ Object $owner;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$holder.registerCompactPresentation(this.$owner);
        final VoiceCallStateHolder voiceCallStateHolder = this.$holder;
        final Object obj = this.$owner;
        return new InterfaceC06807bD() { // from class: com.facebook.aura.assist.HatchAssistVoiceCallKt$HatchAssistVoiceCall$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                voiceCallStateHolder.unregisterCompactPresentation(obj);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistVoiceCallKt$HatchAssistVoiceCall$1$1(VoiceCallStateHolder voiceCallStateHolder, Object obj) {
        super(1);
        this.$holder = voiceCallStateHolder;
        this.$owner = obj;
    }
}
