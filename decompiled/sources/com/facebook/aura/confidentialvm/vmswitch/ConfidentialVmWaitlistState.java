package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;

/* loaded from: classes.dex */
public interface ConfidentialVmWaitlistState {

    public final class Failed implements ConfidentialVmWaitlistState {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return 445034928;
        }
    }

    public final class Loaded extends C06G implements ConfidentialVmWaitlistState {
        public final boolean isShown;
        public final ConfidentialVmWaitlistStatus status;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (this.status != loaded.status || this.isShown != loaded.isShown) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ConfidentialVmWaitlistStatus confidentialVmWaitlistStatus, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                confidentialVmWaitlistStatus = loaded.status;
            }
            if ((i & 2) != 0) {
                z = loaded.isShown;
            }
            return new Loaded(confidentialVmWaitlistStatus, z);
        }

        public final ConfidentialVmWaitlistStatus component1() {
            return this.status;
        }

        public final boolean component2() {
            return this.isShown;
        }

        public final Loaded copy(ConfidentialVmWaitlistStatus confidentialVmWaitlistStatus, boolean z) {
            return new Loaded(confidentialVmWaitlistStatus, z);
        }

        public final ConfidentialVmWaitlistStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0D(this.status) * 31, this.isShown);
        }

        public final boolean isShown() {
            return this.isShown;
        }

        public Loaded(ConfidentialVmWaitlistStatus confidentialVmWaitlistStatus, boolean z) {
            this.status = confidentialVmWaitlistStatus;
            this.isShown = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unresolved implements ConfidentialVmWaitlistState {
        public static final Unresolved INSTANCE = new Unresolved();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unresolved);
        }

        public String toString() {
            return "Unresolved";
        }

        public int hashCode() {
            return 1418612100;
        }
    }
}
