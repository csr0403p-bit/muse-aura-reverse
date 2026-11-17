package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAudioPlayerRepository $audioRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationAudioPlaybackKt$ConversationAudioMiniPlayerOverlay$1$5$1(HatchAudioPlayerRepository hatchAudioPlayerRepository) {
        super(0);
        this.$audioRepository = hatchAudioPlayerRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.AUDIO_FORWARD_BUTTON, null, AnonymousClass006.A10(HatchMetadataKey.PLAYER_TYPE.getValue(), "mini_player"), null);
        this.$audioRepository.skipForward();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
