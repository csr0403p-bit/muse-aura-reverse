package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.video.HatchVideoPlayer;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarVideoSurface$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $heldLoopStart$delegate;
    public final /* synthetic */ boolean $holdsLoopStart;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$AvatarVideoSurface$2$1(boolean z, HatchVideoPlayer hatchVideoPlayer, MutableState<Boolean> mutableState) {
        super(1);
        this.$holdsLoopStart = z;
        this.$player = hatchVideoPlayer;
        this.$heldLoopStart$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$holdsLoopStart && MutableState.A0A((MutableState) this.$heldLoopStart$delegate)) {
            this.$player.seekTo(0L);
        }
        MutableState.A09(this.$holdsLoopStart, this.$heldLoopStart$delegate);
        return new C78g() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
