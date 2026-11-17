package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$16$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $lifecycleResumed$delegate;
    public final /* synthetic */ boolean $playWhenReady;
    public final /* synthetic */ boolean $rewindOnPause;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$16$1(boolean z, HatchVideoPlayer hatchVideoPlayer, boolean z2, MutableState<Boolean> mutableState) {
        super(1);
        this.$playWhenReady = z;
        this.$videoPlayer = hatchVideoPlayer;
        this.$rewindOnPause = z2;
        this.$lifecycleResumed$delegate = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78g invoke(X.C0Yr r3) {
        /*
            r2 = this;
            boolean r0 = r2.$playWhenReady
            if (r0 == 0) goto Ld
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r2.$lifecycleResumed$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            r1 = 1
            if (r0 != 0) goto Le
        Ld:
            r1 = 0
        Le:
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r2.$videoPlayer
            r0.setPlayWhenReadyFlag(r1)
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r2.$videoPlayer
            boolean r0 = r0.isReady()
            if (r0 == 0) goto L22
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r2.$videoPlayer
            if (r1 == 0) goto L28
            r0.play()
        L22:
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$16$1$invoke$$inlined$onDispose$1 r0 = new com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$16$1$invoke$$inlined$onDispose$1
            r0.<init>()
            return r0
        L28:
            r0.pause()
            boolean r0 = r2.$rewindOnPause
            if (r0 == 0) goto L22
            boolean r0 = r2.$playWhenReady
            if (r0 != 0) goto L22
            com.facebook.aura.common.video.HatchVideoPlayer r2 = r2.$videoPlayer
            r0 = 0
            r2.seekTo(r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$16$1.invoke(X.0Yr):X.78g");
    }
}
