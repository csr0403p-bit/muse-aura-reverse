package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoPlaybackControls$onSeekFinished$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ C00s $currentPositionMs$delegate;
    public final /* synthetic */ C00s $durationMs$delegate;
    public final /* synthetic */ MutableState<Boolean> $isSeeking$delegate;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$VideoPlaybackControls$onSeekFinished$1$1(HatchVideoPlayer hatchVideoPlayer, C00s c00s, C00s c00s2, MutableState<Boolean> mutableState) {
        super(1);
        this.$player = hatchVideoPlayer;
        this.$durationMs$delegate = c00s;
        this.$currentPositionMs$delegate = c00s2;
        this.$isSeeking$delegate = mutableState;
    }

    public final void invoke(float f) {
        HatchVideoPlayer hatchVideoPlayer = this.$player;
        C00s c00s = this.$durationMs$delegate;
        float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        hatchVideoPlayer.seekTo((long) (c00s.AHH() * f));
        this.$currentPositionMs$delegate.Adh((long) (f * this.$durationMs$delegate.AHH()));
        MutableState.A09(false, this.$isSeeking$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
