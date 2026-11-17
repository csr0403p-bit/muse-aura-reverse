package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$15$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $playWhenReady;
    public final /* synthetic */ MutableState<Boolean> $wasPlayingBeforePause$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$15$1(boolean z, MutableState<Boolean> mutableState) {
        super(1);
        this.$playWhenReady = z;
        this.$wasPlayingBeforePause$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState.A09(this.$playWhenReady, this.$wasPlayingBeforePause$delegate);
        return new C78g() { // from class: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$15$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
