package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchSetupAnimationHostKt$HatchSetupAnimationHost$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isAvailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSetupAnimationHostKt$HatchSetupAnimationHost$3$1(boolean z) {
        super(1);
        this.$isAvailable = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchSetupAnimationState.INSTANCE.setHostRendering$fbandroid_express_aura_java_com_facebook_aura_ui_ui(this.$isAvailable);
        return new C78g() { // from class: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
