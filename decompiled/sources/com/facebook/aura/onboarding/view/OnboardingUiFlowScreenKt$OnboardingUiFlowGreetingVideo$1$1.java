package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.onboarding.OnboardingGreetingVideo;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchVideoPlayer $player;
    public final /* synthetic */ OnboardingGreetingVideo $video;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1(HatchVideoPlayer hatchVideoPlayer, OnboardingGreetingVideo onboardingGreetingVideo) {
        super(1);
        this.$player = hatchVideoPlayer;
        this.$video = onboardingGreetingVideo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.aura.common.video.HatchVideoPlayer$Listener, com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1$listener$1] */
    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final OnboardingGreetingVideo onboardingGreetingVideo = this.$video;
        final ?? r2 = new HatchVideoPlayer.Listener() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1$listener$1
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
                onboardingGreetingVideo.onFailed();
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
        return new C78g() { // from class: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchVideoPlayer.removeListener(r2);
            }
        };
    }
}
