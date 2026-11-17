package com.facebook.aura.devices.pairing;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface GattConnectOutcome {

    public final class Failed implements GattConnectOutcome {
        public static final int $stable = 0;
        public final String detail;
        public final boolean isTransient;
        public final boolean reportsWhenStopped;

        public Failed(String str, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            this.detail = str;
            this.isTransient = z;
            this.reportsWhenStopped = z2;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final boolean getReportsWhenStopped() {
            return this.reportsWhenStopped;
        }

        public final boolean isTransient() {
            return this.isTransient;
        }

        public /* synthetic */ Failed(String str, boolean z, boolean z2, int i, C06H c06h) {
            this(str, z, AnonymousClass005.A1O(i, z2));
        }
    }

    public final class Ready implements GattConnectOutcome {
        public static final int $stable = 0;
        public static final Ready INSTANCE = new Ready();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Ready);
        }

        public String toString() {
            return "Ready";
        }

        public int hashCode() {
            return 180899998;
        }
    }
}
