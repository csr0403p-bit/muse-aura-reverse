package com.facebook.aura.devices.pairing;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HatchLinkOtaRepairState {

    public final class AwaitingReboot extends C06G implements HatchLinkOtaRepairState {
        public static final int $stable = 0;
        public final String password;
        public final String ssid;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AwaitingReboot) {
                    AwaitingReboot awaitingReboot = (AwaitingReboot) obj;
                    if (!C7384Etj.areEqual(this.ssid, awaitingReboot.ssid) || !C7384Etj.areEqual(this.password, awaitingReboot.password)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AwaitingReboot copy$default(AwaitingReboot awaitingReboot, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = awaitingReboot.ssid;
            }
            if ((i & 2) != 0) {
                str2 = awaitingReboot.password;
            }
            AnonymousClass003.A0u(str, str2);
            return new AwaitingReboot(str, str2);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.password;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.password, AnonymousClass001.A0G(this.ssid));
        }

        public AwaitingReboot(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.ssid = str;
            this.password = str2;
        }

        public final AwaitingReboot copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new AwaitingReboot(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Idle implements HatchLinkOtaRepairState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return -1110438617;
        }
    }

    public final class Repairing extends C06G implements HatchLinkOtaRepairState {
        public static final int $stable = 0;
        public final String password;
        public final String ssid;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Repairing) {
                    Repairing repairing = (Repairing) obj;
                    if (!C7384Etj.areEqual(this.ssid, repairing.ssid) || !C7384Etj.areEqual(this.password, repairing.password)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Repairing copy$default(Repairing repairing, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repairing.ssid;
            }
            if ((i & 2) != 0) {
                str2 = repairing.password;
            }
            AnonymousClass003.A0u(str, str2);
            return new Repairing(str, str2);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.password;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.password, AnonymousClass001.A0G(this.ssid));
        }

        public Repairing(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.ssid = str;
            this.password = str2;
        }

        public final Repairing copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Repairing(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Rescanning extends C06G implements HatchLinkOtaRepairState {
        public static final int $stable = 0;
        public final int attempts;
        public final String password;
        public final String ssid;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Rescanning) {
                    Rescanning rescanning = (Rescanning) obj;
                    if (!C7384Etj.areEqual(this.ssid, rescanning.ssid) || !C7384Etj.areEqual(this.password, rescanning.password) || this.attempts != rescanning.attempts) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Rescanning copy$default(Rescanning rescanning, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = rescanning.ssid;
            }
            if ((i2 & 2) != 0) {
                str2 = rescanning.password;
            }
            if ((i2 & 4) != 0) {
                i = rescanning.attempts;
            }
            return rescanning.copy(str, str2, i);
        }

        public final String component1() {
            return this.ssid;
        }

        public final String component2() {
            return this.password;
        }

        public final int component3() {
            return this.attempts;
        }

        public final int getAttempts() {
            return this.attempts;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getSsid() {
            return this.ssid;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.password, AnonymousClass001.A0G(this.ssid)) + this.attempts;
        }

        public Rescanning(String str, String str2, int i) {
            AnonymousClass003.A0u(str, str2);
            this.ssid = str;
            this.password = str2;
            this.attempts = i;
        }

        public final Rescanning copy(String str, String str2, int i) {
            AnonymousClass003.A0u(str, str2);
            return new Rescanning(str, str2, i);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Rescanning(String str, String str2, int i, int i2, C06H c06h) {
            this(str, str2, (i2 & 4) != 0 ? 0 : i);
        }
    }
}
