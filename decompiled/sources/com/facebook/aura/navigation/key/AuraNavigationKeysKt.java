package com.facebook.aura.navigation.key;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;

/* loaded from: classes.dex */
public abstract class AuraNavigationKeysKt {
    public static final boolean isConfidentialVmCredentialFlowKey(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return (auraNavKey instanceof ConfidentialVmRegisterPinScreenKey) || (auraNavKey instanceof ConfidentialVmLoginScreenKey) || (auraNavKey instanceof ConfidentialVmSetupLoginScreenKey);
    }

    public static final boolean isConfidentialVmSwitchFlowKey(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof ConfidentialVmSwitchFlowKey;
    }

    public static final boolean isTabNavKey(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof AuraTabRootNavKey;
    }

    public static final boolean isGateSettingsEscape(AuraNavKey auraNavKey) {
        return (auraNavKey instanceof ActivationSettingsScreenKey) || (auraNavKey instanceof ManageAccountSettingsScreenKey) || (auraNavKey instanceof ActivationBugReportScreenKey) || (auraNavKey instanceof AuraBugReportScreenKey) || (auraNavKey instanceof AuraBugReportDiagnosticLogsScreenKey) || (auraNavKey instanceof ActivationHelpSupportSettingsScreenKey) || (auraNavKey instanceof ActivationDataPrivacySettingsScreenKey) || (auraNavKey instanceof ActivationLegalSafetySettingsScreenKey) || (auraNavKey instanceof ContactSupportScreenKey);
    }
}
