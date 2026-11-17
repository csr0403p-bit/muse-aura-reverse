package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraNavDisplayKt$AuraNavDisplayContent$modalFlowSceneStrategy$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ OverlaySceneStrategy<AuraNavKey> $overlaySceneStrategy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraNavDisplayKt$AuraNavDisplayContent$modalFlowSceneStrategy$1$1(OverlaySceneStrategy<AuraNavKey> overlaySceneStrategy) {
        super(0);
        this.$overlaySceneStrategy = overlaySceneStrategy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$overlaySceneStrategy.isOverlayOnBackStack);
    }
}
