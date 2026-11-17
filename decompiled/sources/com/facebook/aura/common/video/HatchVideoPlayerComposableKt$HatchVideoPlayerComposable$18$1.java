package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$18$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnPlayerResourcesActiveChanged$delegate;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$18$1(C1BO<? extends G0U<? super Boolean, Unit>> c1bo, HatchVideoPlayer hatchVideoPlayer) {
        super(1);
        this.$currentOnPlayerResourcesActiveChanged$delegate = c1bo;
        this.$videoPlayer = hatchVideoPlayer;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AnonymousClass001.A1K(true, C1BO.A0B(this.$currentOnPlayerResourcesActiveChanged$delegate));
        final HatchVideoPlayer hatchVideoPlayer = this.$videoPlayer;
        final C1BO<G0U<Boolean, Unit>> c1bo = this.$currentOnPlayerResourcesActiveChanged$delegate;
        return new C78g() { // from class: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$18$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchVideoPlayer.stop();
                hatchVideoPlayer.clearMediaItems();
                hatchVideoPlayer.cleanUp();
                AnonymousClass001.A1K(false, C1BO.A0B(c1bo));
            }
        };
    }
}
