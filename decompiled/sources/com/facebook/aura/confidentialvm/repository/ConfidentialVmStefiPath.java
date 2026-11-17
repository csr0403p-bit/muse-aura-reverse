package com.facebook.aura.confidentialvm.repository;

import X.C06G;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;

/* loaded from: classes.dex */
public interface ConfidentialVmStefiPath extends StefiHatchPath.Extension {

    /* loaded from: classes2.dex */
    public final class CvmMigrationStatus extends C06G implements ConfidentialVmStefiPath {
        public final String oldEnvId;

        public CvmMigrationStatus(String str) {
            C7384Etj.A0Y(str, 0);
            this.oldEnvId = str;
        }

        public final CvmMigrationStatus copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new CvmMigrationStatus(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CvmMigrationStatus) && C7384Etj.areEqual(this.oldEnvId, ((CvmMigrationStatus) obj).oldEnvId));
        }

        public static /* synthetic */ CvmMigrationStatus copy$default(CvmMigrationStatus cvmMigrationStatus, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cvmMigrationStatus.oldEnvId;
            }
            C7384Etj.A0Y(str, 0);
            return new CvmMigrationStatus(str);
        }

        public final String component1() {
            return this.oldEnvId;
        }

        public final String getOldEnvId() {
            return this.oldEnvId;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return FGI.A0M("/hatch/cvm_migration_status?old_env_id=", Uri.encode(this.oldEnvId));
        }

        public int hashCode() {
            return this.oldEnvId.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CvmValueProps implements ConfidentialVmStefiPath {
        public static final CvmValueProps INSTANCE = new CvmValueProps();
        public static final String value = "/hatch/cvm_value_props";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CvmValueProps);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CvmValueProps";
        }

        public int hashCode() {
            return 709829427;
        }
    }

    public final class CvmWaitlist implements ConfidentialVmStefiPath {
        public static final CvmWaitlist INSTANCE = new CvmWaitlist();
        public static final String value = "/hatch/cvm/waitlist";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CvmWaitlist);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CvmWaitlist";
        }

        public int hashCode() {
            return -550848185;
        }
    }

    public final class CvmWaitlistJoin implements ConfidentialVmStefiPath {
        public static final CvmWaitlistJoin INSTANCE = new CvmWaitlistJoin();
        public static final String value = "/hatch/cvm/waitlist/join";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CvmWaitlistJoin);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CvmWaitlistJoin";
        }

        public int hashCode() {
            return 1831997201;
        }
    }

    /* loaded from: classes2.dex */
    public final class ProvisionAndPrepareMigration implements ConfidentialVmStefiPath {
        public static final ProvisionAndPrepareMigration INSTANCE = new ProvisionAndPrepareMigration();
        public static final String value = "/hatch/provision_and_prepare_migration";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ProvisionAndPrepareMigration);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ProvisionAndPrepareMigration";
        }

        public int hashCode() {
            return -1600501393;
        }
    }

    /* loaded from: classes2.dex */
    public final class StartCvmMigration implements ConfidentialVmStefiPath {
        public static final StartCvmMigration INSTANCE = new StartCvmMigration();
        public static final String value = "/hatch/start_cvm_migration";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartCvmMigration);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "StartCvmMigration";
        }

        public int hashCode() {
            return -948542000;
        }
    }

    /* loaded from: classes2.dex */
    public final class StartSvmDowngrade implements ConfidentialVmStefiPath {
        public static final StartSvmDowngrade INSTANCE = new StartSvmDowngrade();
        public static final String value = "/hatch/start_svm_downgrade";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartSvmDowngrade);
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "StartSvmDowngrade";
        }

        public int hashCode() {
            return -1017923481;
        }
    }

    /* loaded from: classes4.dex */
    public final class VestaUserInfo extends C06G implements ConfidentialVmStefiPath {
        public final int clientApiVersion;
        public final String value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof VestaUserInfo) && this.clientApiVersion == ((VestaUserInfo) obj).clientApiVersion);
        }

        public static /* synthetic */ VestaUserInfo copy$default(VestaUserInfo vestaUserInfo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = vestaUserInfo.clientApiVersion;
            }
            return new VestaUserInfo(i);
        }

        public final int component1() {
            return this.clientApiVersion;
        }

        public final VestaUserInfo copy(int i) {
            return new VestaUserInfo(i);
        }

        public final int getClientApiVersion() {
            return this.clientApiVersion;
        }

        @Override // com.facebook.aura.network.api.StefiPath
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.clientApiVersion;
        }

        public VestaUserInfo(int i) {
            this.clientApiVersion = i;
            this.value = FGI.A0H("/hatch/vesta-auth/user-info?vesta_client_api_version=", i);
        }

        public String toString() {
            return super.toString();
        }
    }
}
