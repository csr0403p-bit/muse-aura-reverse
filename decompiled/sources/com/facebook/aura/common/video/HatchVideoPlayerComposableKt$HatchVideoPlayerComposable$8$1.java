package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$8$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $enableAudio;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$8$1(boolean z, HatchVideoPlayer hatchVideoPlayer) {
        super(1);
        this.$enableAudio = z;
        this.$videoPlayer = hatchVideoPlayer;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        boolean z = this.$enableAudio;
        HatchVideoPlayer hatchVideoPlayer = this.$videoPlayer;
        if (z) {
            hatchVideoPlayer.enableAudio();
        } else {
            hatchVideoPlayer.disableAudio();
        }
        return new C78g() { // from class: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$8$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
