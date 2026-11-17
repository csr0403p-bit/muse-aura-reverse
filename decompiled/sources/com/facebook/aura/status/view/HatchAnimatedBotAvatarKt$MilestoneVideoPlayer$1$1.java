package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.F1F;
import X.G0U;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $currentIsPlaying$delegate;
    public final /* synthetic */ Function0<Unit> $onFirstPlayDone;
    public final /* synthetic */ Function0<Unit> $onStarted;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1(HatchVideoPlayer hatchVideoPlayer, Function0<Unit> function0, Function0<Unit> function02, C1BO<Boolean> c1bo) {
        super(1);
        this.$player = hatchVideoPlayer;
        this.$onStarted = function0;
        this.$onFirstPlayDone = function02;
        this.$currentIsPlaying$delegate = c1bo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.aura.common.video.HatchVideoPlayer$Listener, com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1$listener$1] */
    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final F1F f1f = new F1F();
        final F1F f1f2 = new F1F();
        final Function0<Unit> function0 = this.$onStarted;
        final Function0<Unit> function02 = this.$onFirstPlayDone;
        final HatchVideoPlayer hatchVideoPlayer = this.$player;
        final C1BO<Boolean> c1bo = this.$currentIsPlaying$delegate;
        final ?? r2 = new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1$listener$1
            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onIsPlayingChanged(boolean z) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
                C7384Etj.A0Y(playerState, 0);
                F1F f1f3 = f1f;
                if (!f1f3.element && playerState == HatchVideoPlayer.PlayerState.READY) {
                    f1f3.element = true;
                    function0.invoke();
                }
                if (playerState == HatchVideoPlayer.PlayerState.ENDED) {
                    F1F f1f4 = f1f2;
                    if (!f1f4.element) {
                        f1f4.element = true;
                        function02.invoke();
                    }
                    hatchVideoPlayer.seekTo(0L);
                    if (C1BO.A0F(c1bo)) {
                        hatchVideoPlayer.play();
                    }
                }
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
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchVideoPlayer2.removeListener(r2);
            }
        };
    }
}
