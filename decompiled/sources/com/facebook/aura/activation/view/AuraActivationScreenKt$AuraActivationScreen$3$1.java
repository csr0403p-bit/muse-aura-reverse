package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.activation.model.ActivationStepLogging;

/* loaded from: classes2.dex */
public final class AuraActivationScreenKt$AuraActivationScreen$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $activationStep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationScreenKt$AuraActivationScreen$3$1(String str) {
        super(1);
        this.$activationStep = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$activationStep;
        if (str != null) {
            ActivationStepLogging.INSTANCE.onStepShown(str);
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraActivationScreenKt$AuraActivationScreen$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
