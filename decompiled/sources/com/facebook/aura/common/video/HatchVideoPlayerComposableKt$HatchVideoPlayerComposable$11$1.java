package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$11$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<Boolean> $currentPlayWhenReady$delegate;
    public final /* synthetic */ MutableState<Boolean> $lifecycleResumed$delegate;
    public final /* synthetic */ MutableState<Boolean> $readPlayPauseLabel$delegate;
    public final /* synthetic */ MutableState<Boolean> $showPlayIcon$delegate;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;
    public final /* synthetic */ MutableState<Boolean> $wasPlayingBeforePause$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$11$1(HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$videoPlayer = hatchVideoPlayer;
        this.$lifecycleResumed$delegate = mutableState;
        this.$wasPlayingBeforePause$delegate = mutableState2;
        this.$currentPlayWhenReady$delegate = c1bo;
        this.$showPlayIcon$delegate = mutableState3;
        this.$readPlayPauseLabel$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$lifecycleResumed$delegate);
        boolean z = MutableState.A0A((MutableState) this.$wasPlayingBeforePause$delegate) && C1BO.A0F(this.$currentPlayWhenReady$delegate);
        this.$videoPlayer.setPlayWhenReadyFlag(z);
        if (z) {
            this.$videoPlayer.resume();
            MutableState.A09(false, this.$showPlayIcon$delegate);
            MutableState.A09(false, this.$readPlayPauseLabel$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
