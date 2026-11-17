package com.facebook.aura.devices.pairing;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.devices.token.LinkDeviceKeyTarget;

/* loaded from: classes4.dex */
public interface LinkDeviceKeyPlan {

    public final class Blocked extends C06G implements LinkDeviceKeyPlan {
        public static final int $stable = 0;
        public final LinkDeviceKeySetupFailure failure;

        public Blocked(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            this.failure = linkDeviceKeySetupFailure;
        }

        public final Blocked copy(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new Blocked(linkDeviceKeySetupFailure);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Blocked) && this.failure == ((Blocked) obj).failure);
        }

        public static /* synthetic */ Blocked copy$default(Blocked blocked, LinkDeviceKeySetupFailure linkDeviceKeySetupFailure, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeySetupFailure = blocked.failure;
            }
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            return new Blocked(linkDeviceKeySetupFailure);
        }

        public final LinkDeviceKeySetupFailure component1() {
            return this.failure;
        }

        public final LinkDeviceKeySetupFailure getFailure() {
            return this.failure;
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Keyed extends C06G implements LinkDeviceKeyPlan {
        public static final int $stable = 8;
        public final LinkDeviceKeyTarget target;

        public Keyed(LinkDeviceKeyTarget linkDeviceKeyTarget) {
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            this.target = linkDeviceKeyTarget;
        }

        public final Keyed copy(LinkDeviceKeyTarget linkDeviceKeyTarget) {
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            return new Keyed(linkDeviceKeyTarget);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Keyed) && C7384Etj.areEqual(this.target, ((Keyed) obj).target));
        }

        public static /* synthetic */ Keyed copy$default(Keyed keyed, LinkDeviceKeyTarget linkDeviceKeyTarget, int i, Object obj) {
            if ((i & 1) != 0) {
                linkDeviceKeyTarget = keyed.target;
            }
            C7384Etj.A0Y(linkDeviceKeyTarget, 0);
            return new Keyed(linkDeviceKeyTarget);
        }

        public final LinkDeviceKeyTarget component1() {
            return this.target;
        }

        public final LinkDeviceKeyTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Keyless implements LinkDeviceKeyPlan {
        public static final int $stable = 0;
        public static final Keyless INSTANCE = new Keyless();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Keyless);
        }

        public String toString() {
            return "Keyless";
        }

        public int hashCode() {
            return -260539173;
        }
    }

    public final class OtaRound extends C06G implements LinkDeviceKeyPlan {
        public static final int $stable = 0;
        public final boolean mintsTokens;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OtaRound) && this.mintsTokens == ((OtaRound) obj).mintsTokens);
        }

        public static /* synthetic */ OtaRound copy$default(OtaRound otaRound, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = otaRound.mintsTokens;
            }
            return new OtaRound(z);
        }

        public final boolean component1() {
            return this.mintsTokens;
        }

        public final OtaRound copy(boolean z) {
            return new OtaRound(z);
        }

        public final boolean getMintsTokens() {
            return this.mintsTokens;
        }

        public int hashCode() {
            return this.mintsTokens ? 1231 : 1237;
        }

        public OtaRound(boolean z) {
            this.mintsTokens = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
