package com.facebook.aura.graduation;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;

/* loaded from: classes4.dex */
public final class GraduationStoryPlayerKt$GraduationStoryPlayer$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isInClosingLoop$delegate;
    public final /* synthetic */ Long $loopStartTimeMs;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationStoryPlayerKt$GraduationStoryPlayer$3$1(HatchVideoPlayer hatchVideoPlayer, Long l, MutableState<Boolean> mutableState) {
        super(1);
        this.$player = hatchVideoPlayer;
        this.$loopStartTimeMs = l;
        this.$isInClosingLoop$delegate = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.aura.common.video.HatchVideoPlayer$Listener, com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$3$1$listener$1] */
    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Long l = this.$loopStartTimeMs;
        final HatchVideoPlayer hatchVideoPlayer = this.$player;
        final MutableState<Boolean> mutableState = this.$isInClosingLoop$delegate;
        final ?? r2 = new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$3$1$listener$1
            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onIsPlayingChanged(boolean z) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
                Long l2;
                C7384Etj.A0Y(playerState, 0);
                if (playerState != HatchVideoPlayer.PlayerState.ENDED || (l2 = l) == null) {
                    return;
                }
                long jLongValue = l2.longValue();
                long duration = hatchVideoPlayer.getDuration();
                if (duration <= 0 || jLongValue >= duration) {
                    return;
                }
                MutableState.A09(true, mutableState);
                hatchVideoPlayer.seekTo(jLongValue);
                hatchVideoPlayer.play();
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onPlayerError(Exception exc) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onInitialTextureUpdate() {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onRenderedFirstFrame() {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onVideoSizeChanged(int i, int i2) {
            }
        };
        hatchVideoPlayer.addListener(r2);
        final HatchVideoPlayer hatchVideoPlayer2 = this.$player;
        return new C78g() { // from class: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchVideoPlayer2.removeListener(r2);
            }
        };
    }
}
