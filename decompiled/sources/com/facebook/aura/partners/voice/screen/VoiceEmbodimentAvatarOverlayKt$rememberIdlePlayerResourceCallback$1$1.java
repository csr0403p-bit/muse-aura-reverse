package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentAvatarOverlayKt$rememberIdlePlayerResourceCallback$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEmbodimentAvatarOverlayKt$rememberIdlePlayerResourceCallback$1$1(VoiceCallStateHolder voiceCallStateHolder, Object obj) {
        super(1);
        this.$stateHolder = voiceCallStateHolder;
        this.$owner = obj;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.$stateHolder.setEmbodimentIdlePlayerMounted(this.$owner, z);
    }
}
