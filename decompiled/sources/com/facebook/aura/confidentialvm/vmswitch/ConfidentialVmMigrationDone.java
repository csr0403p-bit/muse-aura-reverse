package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDone extends C06G {
    public final List<String> channelIds;
    public final List<String> connectorIds;
    public final boolean isConfidentialVm;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmMigrationDone) {
                ConfidentialVmMigrationDone confidentialVmMigrationDone = (ConfidentialVmMigrationDone) obj;
                if (this.isConfidentialVm != confidentialVmMigrationDone.isConfidentialVm || !C7384Etj.areEqual(this.connectorIds, confidentialVmMigrationDone.connectorIds) || !C7384Etj.areEqual(this.channelIds, confidentialVmMigrationDone.channelIds)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfidentialVmMigrationDone copy$default(ConfidentialVmMigrationDone confidentialVmMigrationDone, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confidentialVmMigrationDone.isConfidentialVm;
        }
        if ((i & 2) != 0) {
            list = confidentialVmMigrationDone.connectorIds;
        }
        if ((i & 4) != 0) {
            list2 = confidentialVmMigrationDone.channelIds;
        }
        return confidentialVmMigrationDone.copy(z, list, list2);
    }

    public final boolean component1() {
        return this.isConfidentialVm;
    }

    public final List<String> component2() {
        return this.connectorIds;
    }

    public final List<String> component3() {
        return this.channelIds;
    }

    public final List<String> getChannelIds() {
        return this.channelIds;
    }

    public final List<String> getConnectorIds() {
        return this.connectorIds;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.channelIds, AnonymousClass005.A0F(this.connectorIds, C0KA.A02(this.isConfidentialVm)));
    }

    public final boolean isConfidentialVm() {
        return this.isConfidentialVm;
    }

    public ConfidentialVmMigrationDone(boolean z, List<String> list, List<String> list2) {
        AnonymousClass003.A0x(list, list2);
        this.isConfidentialVm = z;
        this.connectorIds = list;
        this.channelIds = list2;
    }

    public final ConfidentialVmMigrationDone copy(boolean z, List<String> list, List<String> list2) {
        AnonymousClass003.A0x(list, list2);
        return new ConfidentialVmMigrationDone(z, list, list2);
    }

    public String toString() {
        return super.toString();
    }
}
