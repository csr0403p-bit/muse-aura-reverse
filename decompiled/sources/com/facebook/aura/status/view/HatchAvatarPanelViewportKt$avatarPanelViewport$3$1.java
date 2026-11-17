package com.facebook.aura.status.view;

import X.ART;
import X.AT3;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.header.api.AvatarFullScreen;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarPanelViewportKt$avatarPanelViewport$3$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $backdrop;
    public final /* synthetic */ AvatarFullScreen $fullScreen;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        AvatarFullScreen avatarFullScreen = this.$fullScreen;
        if (avatarFullScreen == null || !avatarFullScreen.getActive()) {
            return;
        }
        ART.A03(null, at3, 0.0f, 126, this.$backdrop, 0L, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPanelViewportKt$avatarPanelViewport$3$1(AvatarFullScreen avatarFullScreen, long j) {
        super(1);
        this.$fullScreen = avatarFullScreen;
        this.$backdrop = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
