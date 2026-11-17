package com.facebook.aura.skills.connect.config;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;

/* loaded from: classes3.dex */
public interface ConnectorConnectionRoute {

    public final class AccountLinking extends C06G implements ConnectorConnectionRoute {
        public final HatchAccountLinkingTarget target;

        public AccountLinking(HatchAccountLinkingTarget hatchAccountLinkingTarget) {
            C7384Etj.A0Y(hatchAccountLinkingTarget, 0);
            this.target = hatchAccountLinkingTarget;
        }

        public final AccountLinking copy(HatchAccountLinkingTarget hatchAccountLinkingTarget) {
            C7384Etj.A0Y(hatchAccountLinkingTarget, 0);
            return new AccountLinking(hatchAccountLinkingTarget);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof AccountLinking) && this.target == ((AccountLinking) obj).target);
        }

        public static /* synthetic */ AccountLinking copy$default(AccountLinking accountLinking, HatchAccountLinkingTarget hatchAccountLinkingTarget, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchAccountLinkingTarget = accountLinking.target;
            }
            C7384Etj.A0Y(hatchAccountLinkingTarget, 0);
            return new AccountLinking(hatchAccountLinkingTarget);
        }

        public final HatchAccountLinkingTarget component1() {
            return this.target;
        }

        public final HatchAccountLinkingTarget getTarget() {
            return this.target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AlreadyInRequestedState implements ConnectorConnectionRoute {
        public static final AlreadyInRequestedState INSTANCE = new AlreadyInRequestedState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AlreadyInRequestedState);
        }

        public String toString() {
            return "AlreadyInRequestedState";
        }

        public int hashCode() {
            return -532435108;
        }
    }

    public final class Connect implements ConnectorConnectionRoute {
        public static final Connect INSTANCE = new Connect();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connect);
        }

        public String toString() {
            return "Connect";
        }

        public int hashCode() {
            return -396528250;
        }
    }

    public final class DirectSignIn implements ConnectorConnectionRoute {
        public static final DirectSignIn INSTANCE = new DirectSignIn();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DirectSignIn);
        }

        public String toString() {
            return "DirectSignIn";
        }

        public int hashCode() {
            return -72342033;
        }
    }

    public final class Disconnect implements ConnectorConnectionRoute {
        public static final Disconnect INSTANCE = new Disconnect();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disconnect);
        }

        public String toString() {
            return "Disconnect";
        }

        public int hashCode() {
            return -506870144;
        }
    }
}
