package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$13$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $keepFrameOnPause;
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;
    public final /* synthetic */ AtomicInteger $sourceReleaseCount;
    public final /* synthetic */ MutableState<Boolean> $sourceReleased$delegate;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$13$1(boolean z, AtomicInteger atomicInteger, HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$keepFrameOnPause = z;
        this.$sourceReleaseCount = atomicInteger;
        this.$videoPlayer = hatchVideoPlayer;
        this.$renderedFirstFrame = mutableState;
        this.$sourceReleased$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$keepFrameOnPause || MutableState.A0A((MutableState) this.$sourceReleased$delegate)) {
            return;
        }
        this.$sourceReleaseCount.incrementAndGet();
        this.$videoPlayer.clearMediaItems();
        MutableState.A09(false, this.$renderedFirstFrame);
        MutableState.A09(true, this.$sourceReleased$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
