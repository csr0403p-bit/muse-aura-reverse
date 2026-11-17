package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$EmbodimentActivityVideo$resumePlayback$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $keepPlayingOnPause;
    public final /* synthetic */ boolean $playWhenReady;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$EmbodimentActivityVideo$resumePlayback$1$1(boolean z, boolean z2, HatchVideoPlayer hatchVideoPlayer) {
        super(0);
        this.$playWhenReady = z;
        this.$keepPlayingOnPause = z2;
        this.$player = hatchVideoPlayer;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$playWhenReady && this.$keepPlayingOnPause) {
            this.$player.setPlayWhenReadyFlag(true);
            this.$player.play();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
