package com.facebook.aura.confidentialvm.view.setup;

import X.C78g;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSetupAnimationState;

/* loaded from: classes.dex */
public final class ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ MutableState $setupAnimationSuppression$delegate$inlined;

    public ConfidentialVmEncryptionOnboardingScreenKt$ConfidentialVmEncryptionOnboardingScreen$2$1$invoke$$inlined$onDispose$1(MutableState mutableState) {
        this.$setupAnimationSuppression$delegate$inlined = mutableState;
    }

    @Override // X.C78g
    public void dispose() {
        Object value = this.$setupAnimationSuppression$delegate$inlined.getValue();
        if (value != null) {
            HatchSetupAnimationState.INSTANCE.releaseSuppression(value);
        }
    }
}
