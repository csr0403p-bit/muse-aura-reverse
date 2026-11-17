package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchCvmReplacement {

    /* loaded from: classes2.dex */
    public final class Active extends C06G implements HatchCvmReplacement {
        public static final int $stable = 0;
        public final String attemptId;
        public final Long claimExpiresAtSecs;
        public final String ownerNonce;
        public final HatchVmState state;
        public final String vmId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Active) {
                    Active active = (Active) obj;
                    if (!C7384Etj.areEqual(this.vmId, active.vmId) || !C7384Etj.areEqual(this.attemptId, active.attemptId) || this.state != active.state || !C7384Etj.areEqual(this.ownerNonce, active.ownerNonce) || !C7384Etj.areEqual(this.claimExpiresAtSecs, active.claimExpiresAtSecs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Active copy$default(Active active, String str, String str2, HatchVmState hatchVmState, String str3, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = active.vmId;
            }
            if ((i & 2) != 0) {
                str2 = active.attemptId;
            }
            if ((i & 4) != 0) {
                hatchVmState = active.state;
            }
            if ((i & 8) != 0) {
                str3 = active.ownerNonce;
            }
            if ((i & 16) != 0) {
                l = active.claimExpiresAtSecs;
            }
            return active.copy(str, str2, hatchVmState, str3, l);
        }

        public final String component1() {
            return this.vmId;
        }

        public final String component2() {
            return this.attemptId;
        }

        public final HatchVmState component3() {
            return this.state;
        }

        public final String component4() {
            return this.ownerNonce;
        }

        public final Long component5() {
            return this.claimExpiresAtSecs;
        }

        public final String getAttemptId() {
            return this.attemptId;
        }

        public final Long getClaimExpiresAtSecs() {
            return this.claimExpiresAtSecs;
        }

        public final String getOwnerNonce() {
            return this.ownerNonce;
        }

        public final HatchVmState getState() {
            return this.state;
        }

        public final String getVmId() {
            return this.vmId;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.state, AnonymousClass005.A0I(this.attemptId, AnonymousClass001.A0G(this.vmId))) + AnonymousClass006.A0G(this.ownerNonce)) * 31) + C3cH.A02(this.claimExpiresAtSecs);
        }

        public Active(String str, String str2, HatchVmState hatchVmState, String str3, Long l) {
            AnonymousClass005.A0x(str, str2, hatchVmState);
            this.vmId = str;
            this.attemptId = str2;
            this.state = hatchVmState;
            this.ownerNonce = str3;
            this.claimExpiresAtSecs = l;
        }

        public final Active copy(String str, String str2, HatchVmState hatchVmState, String str3, Long l) {
            AnonymousClass005.A0x(str, str2, hatchVmState);
            return new Active(str, str2, hatchVmState, str3, l);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Active(String str, String str2, HatchVmState hatchVmState, String str3, Long l, int i, C06H c06h) {
            this(str, str2, hatchVmState, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : l);
        }
    }

    /* loaded from: classes2.dex */
    public final class None implements HatchCvmReplacement {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 1978175080;
        }
    }

    /* loaded from: classes4.dex */
    public final class NotFound implements HatchCvmReplacement {
        public static final int $stable = 0;
        public static final NotFound INSTANCE = new NotFound();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public String toString() {
            return "NotFound";
        }

        public int hashCode() {
            return 560435103;
        }
    }

    /* loaded from: classes4.dex */
    public final class Unknown implements HatchCvmReplacement {
        public static final int $stable = 0;
        public static final Unknown INSTANCE = new Unknown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public String toString() {
            return "Unknown";
        }

        public int hashCode() {
            return -1840890086;
        }
    }
}
