package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.audio.AudioStatus;
import com.facebook.aura.audio.HatchAudioPlaybackState;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAudioPlayerRepository $audioRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$6$1(HatchAudioPlayerRepository hatchAudioPlayerRepository) {
        super(0);
        this.$audioRepository = hatchAudioPlayerRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchAudioPlaybackState value = this.$audioRepository.playbackState.getValue();
        AudioStatus audioStatus = value != null ? value.status : null;
        AudioStatus audioStatus2 = AudioStatus.PLAYING;
        HatchAudioPlayerRepository hatchAudioPlayerRepository = this.$audioRepository;
        if (audioStatus == audioStatus2) {
            hatchAudioPlayerRepository.dismissMiniPlayer();
        } else {
            hatchAudioPlayerRepository.stop();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
