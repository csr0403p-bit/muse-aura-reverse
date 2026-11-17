package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass003;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationCheckpoint;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmMigrationOperationKt {
    public static final String upgradePushDropReason(ConfidentialVmMigrationCheckpoint confidentialVmMigrationCheckpoint, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        if (confidentialVmMigrationCheckpoint == null || !str.equals(confidentialVmMigrationCheckpoint.oldEnvId)) {
            return "no_cvm_migration";
        }
        ConfidentialVmMigrationCheckpoint.Phase phase = confidentialVmMigrationCheckpoint.phase;
        if (phase != ConfidentialVmMigrationCheckpoint.Phase.PREPARED && phase != ConfidentialVmMigrationCheckpoint.Phase.STARTED) {
            return "no_cvm_migration";
        }
        if (!str2.equalsIgnoreCase(confidentialVmMigrationCheckpoint.newCvmEnvId)) {
            return "cvm_env_id_mismatch";
        }
        if (phase != ConfidentialVmMigrationCheckpoint.Phase.STARTED) {
            return "cvm_transfer_not_started";
        }
        return null;
    }
}
