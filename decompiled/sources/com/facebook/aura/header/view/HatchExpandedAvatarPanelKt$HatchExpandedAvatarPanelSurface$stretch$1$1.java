package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import com.facebook.aura.header.api.AvatarFullScreen;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$stretch$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AvatarFullScreen $fullScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$stretch$1$1(AvatarFullScreen avatarFullScreen) {
        super(0);
        this.$fullScreen = avatarFullScreen;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        AvatarFullScreen avatarFullScreen = this.$fullScreen;
        return Float.valueOf(Math.min(avatarFullScreen != null ? avatarFullScreen.getEdgeProgress() : 0.0f, 0.0f));
    }
}
