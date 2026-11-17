package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class GatewayVmCredentialSelection {
    public static final int $stable = 8;

    public final class Failure extends GatewayVmCredentialSelection {
        public static final int $stable = 0;
        public final String errorMessage;
        public final String errorType;
        public final int validCredentialCount;
        public final int validUrlCount;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Failure) {
                    Failure failure = (Failure) obj;
                    if (!C7384Etj.areEqual(this.errorType, failure.errorType) || !C7384Etj.areEqual(this.errorMessage, failure.errorMessage) || this.validUrlCount != failure.validUrlCount || this.validCredentialCount != failure.validCredentialCount) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = failure.errorType;
            }
            if ((i3 & 2) != 0) {
                str2 = failure.errorMessage;
            }
            if ((i3 & 4) != 0) {
                i = failure.validUrlCount;
            }
            if ((i3 & 8) != 0) {
                i2 = failure.validCredentialCount;
            }
            AnonymousClass003.A0u(str, str2);
            return new Failure(str, str2, i, i2);
        }

        public final String component1() {
            return this.errorType;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final int component3() {
            return this.validUrlCount;
        }

        public final int component4() {
            return this.validCredentialCount;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public final int getValidCredentialCount() {
            return this.validCredentialCount;
        }

        public final int getValidUrlCount() {
            return this.validUrlCount;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0I(this.errorMessage, AnonymousClass001.A0G(this.errorType)) + this.validUrlCount) * 31) + this.validCredentialCount;
        }

        public Failure(String str, String str2, int i, int i2) {
            AnonymousClass003.A0u(str, str2);
            this.errorType = str;
            this.errorMessage = str2;
            this.validUrlCount = i;
            this.validCredentialCount = i2;
        }

        public final Failure copy(String str, String str2, int i, int i2) {
            AnonymousClass003.A0u(str, str2);
            return new Failure(str, str2, i, i2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends GatewayVmCredentialSelection {
        public static final int $stable = 0;
        public final boolean followedMigration;
        public final long migrationStampMs;
        public final GatewayVmCredential selectedVm;
        public final List<GatewayVmCredential> usableVms;
        public final int validUrlCount;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.selectedVm, success.selectedVm) || !C7384Etj.areEqual(this.usableVms, success.usableVms) || this.validUrlCount != success.validUrlCount || this.followedMigration != success.followedMigration || this.migrationStampMs != success.migrationStampMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Success(GatewayVmCredential gatewayVmCredential, List list, int i, boolean z, long j, int i2, C06H c06h) {
            this(gatewayVmCredential, list, i, C3cG.A1K(i2 & 8, z), (i2 & 16) != 0 ? 0L : j);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, GatewayVmCredential gatewayVmCredential, List list, int i, boolean z, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                gatewayVmCredential = success.selectedVm;
            }
            if ((i2 & 2) != 0) {
                list = success.usableVms;
            }
            if ((i2 & 4) != 0) {
                i = success.validUrlCount;
            }
            if ((i2 & 8) != 0) {
                z = success.followedMigration;
            }
            if ((i2 & 16) != 0) {
                j = success.migrationStampMs;
            }
            return success.copy(gatewayVmCredential, list, i, z, j);
        }

        public final GatewayVmCredential component1() {
            return this.selectedVm;
        }

        public final List<GatewayVmCredential> component2() {
            return this.usableVms;
        }

        public final int component3() {
            return this.validUrlCount;
        }

        public final boolean component4() {
            return this.followedMigration;
        }

        public final long component5() {
            return this.migrationStampMs;
        }

        public final boolean getFollowedMigration() {
            return this.followedMigration;
        }

        public final long getMigrationStampMs() {
            return this.migrationStampMs;
        }

        public final GatewayVmCredential getSelectedVm() {
            return this.selectedVm;
        }

        public final List<GatewayVmCredential> getUsableVms() {
            return this.usableVms;
        }

        public final int getValidUrlCount() {
            return this.validUrlCount;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.migrationStampMs, C0KA.A01((AnonymousClass005.A0F(this.usableVms, AnonymousClass005.A0E(this.selectedVm)) + this.validUrlCount) * 31, this.followedMigration));
        }

        public final Success copy(GatewayVmCredential gatewayVmCredential, List<GatewayVmCredential> list, int i, boolean z, long j) {
            AnonymousClass003.A0u(gatewayVmCredential, list);
            return new Success(gatewayVmCredential, list, i, z, j);
        }

        public String toString() {
            return super.toString();
        }

        public Success(GatewayVmCredential gatewayVmCredential, List<GatewayVmCredential> list, int i, boolean z, long j) {
            AnonymousClass003.A0u(gatewayVmCredential, list);
            this.selectedVm = gatewayVmCredential;
            this.usableVms = list;
            this.validUrlCount = i;
            this.followedMigration = z;
            this.migrationStampMs = j;
        }
    }

    public /* synthetic */ GatewayVmCredentialSelection(C06H c06h) {
    }

    public GatewayVmCredentialSelection() {
    }
}
