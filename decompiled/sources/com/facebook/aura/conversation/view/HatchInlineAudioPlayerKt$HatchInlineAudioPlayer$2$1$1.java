package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAudioPlayerRepository $service;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$2$1$1(Map<String, String> map, HatchAudioPlayerRepository hatchAudioPlayerRepository) {
        super(0);
        this.$threadLogMetadata = map;
        this.$service = hatchAudioPlayerRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInlineAudioPlayerKt.logAudioControlClick(HatchComponent.AUDIO_REWIND_BUTTON, this.$threadLogMetadata);
        this.$service.skipBackward();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
