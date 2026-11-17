package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$12$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $keepFrameOnPause;
    public final /* synthetic */ MutableState<Boolean> $lifecycleResumed$delegate;
    public final /* synthetic */ MutableState<Boolean> $readPlayPauseLabel$delegate;
    public final /* synthetic */ MutableState<Boolean> $showPlayIcon$delegate;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;
    public final /* synthetic */ MutableState<Boolean> $wasPlayingBeforePause$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$12$1(boolean z, HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$keepFrameOnPause = z;
        this.$videoPlayer = hatchVideoPlayer;
        this.$lifecycleResumed$delegate = mutableState;
        this.$wasPlayingBeforePause$delegate = mutableState2;
        this.$showPlayIcon$delegate = mutableState3;
        this.$readPlayPauseLabel$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$keepFrameOnPause) {
            return;
        }
        MutableState.A09(false, this.$lifecycleResumed$delegate);
        MutableState.A09(this.$videoPlayer.isPlaying(), this.$wasPlayingBeforePause$delegate);
        this.$videoPlayer.stop();
        MutableState.A09(true, this.$showPlayIcon$delegate);
        MutableState.A09(true, this.$readPlayPauseLabel$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
