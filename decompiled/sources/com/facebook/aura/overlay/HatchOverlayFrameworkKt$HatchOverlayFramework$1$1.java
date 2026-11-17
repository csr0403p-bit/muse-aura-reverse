package com.facebook.aura.overlay;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.ui.HatchSetupAnimationState;

/* loaded from: classes.dex */
public final class HatchOverlayFrameworkKt$HatchOverlayFramework$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isBlocked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchOverlayFrameworkKt$HatchOverlayFramework$1$1(boolean z) {
        super(1);
        this.$isBlocked = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Object objSuppress = this.$isBlocked ? HatchSetupAnimationState.INSTANCE.suppress() : null;
        return new C78g() { // from class: com.facebook.aura.overlay.HatchOverlayFrameworkKt$HatchOverlayFramework$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                Object obj = objSuppress;
                if (obj != null) {
                    HatchSetupAnimationState.INSTANCE.releaseSuppression(obj);
                }
            }
        };
    }
}
