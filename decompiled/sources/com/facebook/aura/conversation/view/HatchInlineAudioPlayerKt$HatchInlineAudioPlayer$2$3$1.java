package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ float $playbackRate;
    public final /* synthetic */ HatchAudioPlayerRepository $service;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineAudioPlayerKt$HatchInlineAudioPlayer$2$3$1(float f, Map<String, String> map, HatchAudioPlayerRepository hatchAudioPlayerRepository) {
        super(0);
        this.$playbackRate = f;
        this.$threadLogMetadata = map;
        this.$service = hatchAudioPlayerRepository;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        float fNextPlaybackSpeed = HatchInlineAudioPlayerKt.nextPlaybackSpeed(this.$playbackRate);
        HatchInlineAudioPlayerKt.logAudioSpeedClick(fNextPlaybackSpeed, this.$threadLogMetadata);
        this.$service.setPlaybackRate(fNextPlaybackSpeed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
