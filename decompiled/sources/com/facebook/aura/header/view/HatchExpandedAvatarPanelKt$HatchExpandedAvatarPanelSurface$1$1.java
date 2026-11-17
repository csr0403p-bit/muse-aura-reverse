package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1BO;
import com.facebook.aura.header.api.AvatarFullScreen;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$1$1 extends AbstractC7559F3s implements Function0<Float> {
    public final /* synthetic */ AvatarFullScreen $fullScreen;
    public final /* synthetic */ Function0<Float> $panelBottomPx;
    public final /* synthetic */ C1BO<Float> $stretch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExpandedAvatarPanelKt$HatchExpandedAvatarPanelSurface$1$1(Function0<Float> function0, C1BO<Float> c1bo, AvatarFullScreen avatarFullScreen) {
        super(0);
        this.$panelBottomPx = function0;
        this.$stretch = c1bo;
        this.$fullScreen = avatarFullScreen;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(HatchExpandedAvatarPanelKt.stretchedPanelBottom(AnonymousClass003.A04(this.$panelBottomPx), C1BO.A01(this.$stretch), this.$fullScreen));
    }
}
