package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.ccv.relay.HatchCcvPresentationScope;

/* loaded from: classes4.dex */
public final class ActivationAgeStepKt$CardAgeStep$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public static final ActivationAgeStepKt$CardAgeStep$1$1 INSTANCE = new ActivationAgeStepKt$CardAgeStep$1$1();

    public ActivationAgeStepKt$CardAgeStep$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchCcvPresentationScope.Presentation presentationBind = HatchCcvPresentationScope.INSTANCE.bind();
        return new C78g() { // from class: com.facebook.aura.activation.view.ActivationAgeStepKt$CardAgeStep$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                HatchCcvPresentationScope.INSTANCE.release(presentationBind);
            }
        };
    }
}
