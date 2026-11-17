package com.facebook.aura.gateway;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface ChipAllowlistFetch {

    public final class Unavailable extends C06G implements ChipAllowlistFetch {
        public static final int $stable = 0;
        public final String reason;

        public Unavailable(String str) {
            C7384Etj.A0Y(str, 0);
            this.reason = str;
        }

        public final Unavailable copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Unavailable(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unavailable) && C7384Etj.areEqual(this.reason, ((Unavailable) obj).reason));
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unavailable.reason;
            }
            C7384Etj.A0Y(str, 0);
            return new Unavailable(str);
        }

        public final String component1() {
            return this.reason;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Verified extends C06G implements ChipAllowlistFetch {
        public static final int $stable = HatchChipAllowlist.$stable;
        public final HatchChipAllowlist allowlist;

        public Verified(HatchChipAllowlist hatchChipAllowlist) {
            C7384Etj.A0Y(hatchChipAllowlist, 0);
            this.allowlist = hatchChipAllowlist;
        }

        public final Verified copy(HatchChipAllowlist hatchChipAllowlist) {
            C7384Etj.A0Y(hatchChipAllowlist, 0);
            return new Verified(hatchChipAllowlist);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Verified) && C7384Etj.areEqual(this.allowlist, ((Verified) obj).allowlist));
        }

        public static /* synthetic */ Verified copy$default(Verified verified, HatchChipAllowlist hatchChipAllowlist, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchChipAllowlist = verified.allowlist;
            }
            C7384Etj.A0Y(hatchChipAllowlist, 0);
            return new Verified(hatchChipAllowlist);
        }

        public final HatchChipAllowlist component1() {
            return this.allowlist;
        }

        public final HatchChipAllowlist getAllowlist() {
            return this.allowlist;
        }

        public int hashCode() {
            return this.allowlist.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
