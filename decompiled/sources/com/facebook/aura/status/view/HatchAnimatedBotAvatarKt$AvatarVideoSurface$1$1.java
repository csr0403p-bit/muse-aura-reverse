package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarVideoSurface$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnError$delegate;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAnimatedBotAvatarKt$AvatarVideoSurface$1$1(HatchVideoPlayer hatchVideoPlayer, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$player = hatchVideoPlayer;
        this.$currentOnError$delegate = c1bo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.aura.common.video.HatchVideoPlayer$Listener, com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$1$1$listener$1] */
    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final C1BO<Function0<Unit>> c1bo = this.$currentOnError$delegate;
        final ?? r2 = new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$1$1$listener$1
            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onIsPlayingChanged(boolean z) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onPlaybackStateChanged(HatchVideoPlayer.PlayerState playerState) {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onInitialTextureUpdate() {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public void onPlayerError(Exception exc) {
                C1BO.A0D(c1bo);
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onRenderedFirstFrame() {
            }

            @Override // com.facebook.aura.common.video.HatchVideoPlayer.Listener
            public /* bridge */ void onVideoSizeChanged(int i, int i2) {
            }
        };
        this.$player.addListener(r2);
        final HatchVideoPlayer hatchVideoPlayer = this.$player;
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchVideoPlayer.removeListener(r2);
            }
        };
    }
}
