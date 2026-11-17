package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.AuraNavigationKeysKt;

/* loaded from: classes.dex */
public final class ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$isSuppressed$1$1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
    public static final ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$isSuppressed$1$1 INSTANCE = new ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$isSuppressed$1$1();

    public ConfidentialVmSwitchSuppressionEffectKt$ConfidentialVmSwitchSuppressionEffect$isSuppressed$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return Boolean.valueOf(AuraNavigationKeysKt.isGateSettingsEscape(auraNavKey));
    }
}
