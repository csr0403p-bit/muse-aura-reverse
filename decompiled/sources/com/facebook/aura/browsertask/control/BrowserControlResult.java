package com.facebook.aura.browsertask.control;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C60N;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface BrowserControlResult {

    public final class Conflict implements BrowserControlResult {
        public static final int $stable = 0;
        public static final Conflict INSTANCE = new Conflict();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Conflict);
        }

        public String toString() {
            return C60N.A00(12);
        }

        public int hashCode() {
            return -1785526452;
        }
    }

    public final class Failed implements BrowserControlResult {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -1064237513;
        }
    }

    public final class Granted implements BrowserControlResult {
        public static final int $stable = BrowserControlLease.$stable;
        public final BrowserControlLease lease;
        public final String presentedTaskId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Granted) {
                    Granted granted = (Granted) obj;
                    if (!C7384Etj.areEqual(this.lease, granted.lease) || !C7384Etj.areEqual(this.presentedTaskId, granted.presentedTaskId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Granted copy$default(Granted granted, BrowserControlLease browserControlLease, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                browserControlLease = granted.lease;
            }
            if ((i & 2) != 0) {
                str = granted.presentedTaskId;
            }
            return new Granted(browserControlLease, str);
        }

        public final BrowserControlLease component1() {
            return this.lease;
        }

        public final String component2() {
            return this.presentedTaskId;
        }

        public final Granted copy(BrowserControlLease browserControlLease, String str) {
            return new Granted(browserControlLease, str);
        }

        public final BrowserControlLease getLease() {
            return this.lease;
        }

        public final String getPresentedTaskId() {
            return this.presentedTaskId;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.lease) * 31) + AnonymousClass005.A0H(this.presentedTaskId);
        }

        public String toString() {
            return C3cJ.A0N(", presentedTaskId=", this.presentedTaskId, C3cG.A0f(this.lease, "Granted(lease="));
        }

        public Granted(BrowserControlLease browserControlLease, String str) {
            this.lease = browserControlLease;
            this.presentedTaskId = str;
        }

        public /* synthetic */ Granted(BrowserControlLease browserControlLease, String str, int i, C06H c06h) {
            this(browserControlLease, AnonymousClass006.A0s(i, str));
        }
    }

    public final class InvalidState implements BrowserControlResult {
        public static final int $stable = 0;
        public static final InvalidState INSTANCE = new InvalidState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidState);
        }

        public String toString() {
            return "InvalidState";
        }

        public int hashCode() {
            return 1362826068;
        }
    }

    public final class Retry implements BrowserControlResult {
        public static final int $stable = 0;
        public static final Retry INSTANCE = new Retry();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public String toString() {
            return "Retry";
        }

        public int hashCode() {
            return -1547138706;
        }
    }
}
