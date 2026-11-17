package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$onclick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$onclick$1$1(HatchVideoPlayer hatchVideoPlayer) {
        super(0);
        this.$videoPlayer = hatchVideoPlayer;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean zIsPlaying = this.$videoPlayer.isPlaying();
        HatchVideoPlayer hatchVideoPlayer = this.$videoPlayer;
        if (zIsPlaying) {
            hatchVideoPlayer.pause();
        } else {
            hatchVideoPlayer.play();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
