package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneRecord extends C06G {
    public static final Companion Companion = new Companion();
    public final long completedAtMs;
    public final String destinationEnvId;
    public final boolean isConfidentialVm;
    public final String migrationId;

    public final class Companion {
        public final ConfidentialVmCheckpointStore<ConfidentialVmMigrationDoneRecord> store(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConfidentialVmCheckpointStore<>(str, "migration_done", ConfidentialVmMigrationDoneRecord$$serializer.INSTANCE);
        }

        public final C9hr<ConfidentialVmMigrationDoneRecord> serializer() {
            return ConfidentialVmMigrationDoneRecord$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmMigrationDoneRecord(String str, String str2, boolean z, long j) {
        C7384Etj.A0Y(str, 0);
        this.destinationEnvId = str;
        this.migrationId = str2;
        this.isConfidentialVm = z;
        this.completedAtMs = j;
    }

    public static /* synthetic */ ConfidentialVmMigrationDoneRecord copy$default(ConfidentialVmMigrationDoneRecord confidentialVmMigrationDoneRecord, String str, String str2, boolean z, long j, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        long j2 = j;
        if ((i & 1) != 0) {
            str3 = confidentialVmMigrationDoneRecord.destinationEnvId;
        }
        if ((i & 2) != 0) {
            str4 = confidentialVmMigrationDoneRecord.migrationId;
        }
        if ((i & 4) != 0) {
            z2 = confidentialVmMigrationDoneRecord.isConfidentialVm;
        }
        if ((i & 8) != 0) {
            j2 = confidentialVmMigrationDoneRecord.completedAtMs;
        }
        C7384Etj.A0Y(str3, 0);
        return new ConfidentialVmMigrationDoneRecord(str3, str4, z2, j2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ConfidentialVmMigrationDoneRecord confidentialVmMigrationDoneRecord, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(confidentialVmMigrationDoneRecord.destinationEnvId, c9iZ, 0);
        c9j5.AAP(confidentialVmMigrationDoneRecord.migrationId, C07779iq.A01, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, confidentialVmMigrationDoneRecord.isConfidentialVm);
        c9j5.AAN(c9iZ, 3, confidentialVmMigrationDoneRecord.completedAtMs);
    }

    public final ConfidentialVmMigrationDoneRecord copy(String str, String str2, boolean z, long j) {
        C7384Etj.A0Y(str, 0);
        return new ConfidentialVmMigrationDoneRecord(str, str2, z, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmMigrationDoneRecord) {
                ConfidentialVmMigrationDoneRecord confidentialVmMigrationDoneRecord = (ConfidentialVmMigrationDoneRecord) obj;
                if (!C7384Etj.areEqual(this.destinationEnvId, confidentialVmMigrationDoneRecord.destinationEnvId) || !C7384Etj.areEqual(this.migrationId, confidentialVmMigrationDoneRecord.migrationId) || this.isConfidentialVm != confidentialVmMigrationDoneRecord.isConfidentialVm || this.completedAtMs != confidentialVmMigrationDoneRecord.completedAtMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.destinationEnvId;
    }

    public final String component2() {
        return this.migrationId;
    }

    public final boolean component3() {
        return this.isConfidentialVm;
    }

    public final long component4() {
        return this.completedAtMs;
    }

    public final long getCompletedAtMs() {
        return this.completedAtMs;
    }

    public final String getDestinationEnvId() {
        return this.destinationEnvId;
    }

    public final String getMigrationId() {
        return this.migrationId;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.completedAtMs, C0KA.A01((AnonymousClass001.A0G(this.destinationEnvId) + AnonymousClass006.A0G(this.migrationId)) * 31, this.isConfidentialVm));
    }

    public final boolean isConfidentialVm() {
        return this.isConfidentialVm;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmMigrationDoneRecord(int i, String str, String str2, boolean z, long j, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(ConfidentialVmMigrationDoneRecord$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.destinationEnvId = str;
        this.migrationId = str2;
        this.isConfidentialVm = z;
        this.completedAtMs = j;
    }
}
