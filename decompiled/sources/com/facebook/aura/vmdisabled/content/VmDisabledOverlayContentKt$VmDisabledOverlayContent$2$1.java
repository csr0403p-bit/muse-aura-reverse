package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.ui.HatchSetupAnimationState;

/* loaded from: classes.dex */
public final class VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1 INSTANCE = new VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1();

    public VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1() {
        super(1);
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final Object objSuppress = HatchSetupAnimationState.INSTANCE.suppress();
        return new C78g() { // from class: com.facebook.aura.vmdisabled.content.VmDisabledOverlayContentKt$VmDisabledOverlayContent$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchSetupAnimationState.INSTANCE.releaseSuppression(objSuppress);
            }
        };
    }
}
