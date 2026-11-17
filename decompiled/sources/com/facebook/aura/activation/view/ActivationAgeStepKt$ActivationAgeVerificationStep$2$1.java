package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.perf.HatchActivationQplLogger;

/* loaded from: classes2.dex */
public final class ActivationAgeStepKt$ActivationAgeVerificationStep$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $hasAgeStep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationAgeStepKt$ActivationAgeVerificationStep$2$1(boolean z) {
        super(1);
        this.$hasAgeStep = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$hasAgeStep) {
            HatchActivationQplLogger.INSTANCE.annotateAgeConfirmation(AgeCheckFunnelLogging.INSTANCE.qplAnnotations());
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.ActivationAgeStepKt$ActivationAgeVerificationStep$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
