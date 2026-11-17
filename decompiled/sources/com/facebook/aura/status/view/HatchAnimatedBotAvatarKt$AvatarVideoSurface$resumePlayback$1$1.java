package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.common.video.HatchVideoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$AvatarVideoSurface$resumePlayback$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $keepPlaying;
    public final /* synthetic */ HatchVideoPlayer $player;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$AvatarVideoSurface$resumePlayback$1$1(boolean z, HatchVideoPlayer hatchVideoPlayer) {
        super(0);
        this.$keepPlaying = z;
        this.$player = hatchVideoPlayer;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$keepPlaying) {
            this.$player.setPlayWhenReadyFlag(true);
            this.$player.play();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
