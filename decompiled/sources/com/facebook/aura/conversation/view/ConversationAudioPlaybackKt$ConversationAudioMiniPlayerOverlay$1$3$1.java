package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.audio.AudioStatus;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConversationAudioPlayback $audio;
    public final /* synthetic */ HatchAudioPlaybackState $audioState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$3$1(HatchAudioPlaybackState hatchAudioPlaybackState, ConversationAudioPlayback conversationAudioPlayback) {
        super(0);
        this.$audioState = hatchAudioPlaybackState;
        this.$audio = conversationAudioPlayback;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CHAT;
        HatchSubsurface hatchSubsurface = HatchSubsurface.MESSAGE_LIST;
        HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
        HatchAudioPlaybackState hatchAudioPlaybackState = this.$audioState;
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, (hatchAudioPlaybackState != null ? hatchAudioPlaybackState.status : null) == AudioStatus.PLAYING ? HatchComponent.AUDIO_PAUSE_BUTTON : HatchComponent.AUDIO_PLAY_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.PLAYER_TYPE.getValue(), "mini_player"), null);
        this.$audio.viewModel.onMiniPlayerToggle();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
