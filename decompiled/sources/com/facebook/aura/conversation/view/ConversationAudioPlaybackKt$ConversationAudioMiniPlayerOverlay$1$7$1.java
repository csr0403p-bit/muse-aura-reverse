package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.audio.HatchAudioItem;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAudioPlaybackState $audioState;
    public final /* synthetic */ G0V<String, String, Unit> $onJumpToAudioSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$7$1(HatchAudioPlaybackState hatchAudioPlaybackState, G0V<? super String, ? super String, Unit> g0v) {
        super(0);
        this.$audioState = hatchAudioPlaybackState;
        this.$onJumpToAudioSource = g0v;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchAudioItem hatchAudioItem;
        HatchAudioPlaybackState hatchAudioPlaybackState = this.$audioState;
        if (hatchAudioPlaybackState == null || (hatchAudioItem = hatchAudioPlaybackState.item) == null) {
            return;
        }
        G0V<String, String, Unit> g0v = this.$onJumpToAudioSource;
        String str = hatchAudioItem.sourceMessageId;
        if (str == null || g0v == null) {
            return;
        }
        g0v.invoke(str, hatchAudioItem.sourceSessionId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
