package com.facebook.aura.main;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchVmState;

/* loaded from: classes.dex */
public interface VmAccessGate {

    public final class ErrorScreen implements VmAccessGate {
        public static final int $stable = 0;
        public final int messageRes;

        public final int getMessageRes() {
            return this.messageRes;
        }

        public ErrorScreen(int i) {
            this.messageRes = i;
        }
    }

    public final class Maintenance implements VmAccessGate {
        public static final int $stable = 0;
        public final HatchVmState state;

        public Maintenance(HatchVmState hatchVmState) {
            C7384Etj.A0Y(hatchVmState, 0);
            this.state = hatchVmState;
        }

        public final HatchVmState getState() {
            return this.state;
        }
    }

    public final class ShowBlockingOverlay implements VmAccessGate {
        public static final int $stable = 0;
        public static final ShowBlockingOverlay INSTANCE = new ShowBlockingOverlay();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowBlockingOverlay);
        }

        public String toString() {
            return "ShowBlockingOverlay";
        }

        public int hashCode() {
            return 1945456539;
        }
    }

    public final class ShowContent implements VmAccessGate {
        public static final int $stable = 0;
        public static final ShowContent INSTANCE = new ShowContent();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowContent);
        }

        public String toString() {
            return "ShowContent";
        }

        public int hashCode() {
            return 1170180537;
        }
    }

    public final class Spinner implements VmAccessGate {
        public static final int $stable = 0;
        public final String debugCaption;
        public final boolean escapable;

        public Spinner(String str, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.debugCaption = str;
            this.escapable = z;
        }

        public final String getDebugCaption() {
            return this.debugCaption;
        }

        public final boolean getEscapable() {
            return this.escapable;
        }

        public /* synthetic */ Spinner(String str, boolean z, int i, C06H c06h) {
            this(str, AnonymousClass001.A1Q(i, z));
        }
    }
}
