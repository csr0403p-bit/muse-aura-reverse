package com.facebook.aura.bugreport;

import X.C06G;
import X.C0KA;

/* loaded from: classes.dex */
public interface AuraVmLogFetchState {

    public final class Fetching implements AuraVmLogFetchState {
        public static final int $stable = 0;
        public static final Fetching INSTANCE = new Fetching();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Fetching);
        }

        public String toString() {
            return "Fetching";
        }

        public int hashCode() {
            return 707578123;
        }
    }

    public final class Idle implements AuraVmLogFetchState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public String toString() {
            return "Idle";
        }

        public int hashCode() {
            return 997405559;
        }
    }

    public final class Loaded implements AuraVmLogFetchState {
        public static final int $stable = 0;
        public static final Loaded INSTANCE = new Loaded();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loaded);
        }

        public String toString() {
            return "Loaded";
        }

        public int hashCode() {
            return 824755944;
        }
    }

    public final class Unavailable extends C06G implements AuraVmLogFetchState {
        public static final int $stable = 0;
        public final int messageRes;
        public final boolean retryable;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Unavailable) {
                    Unavailable unavailable = (Unavailable) obj;
                    if (this.messageRes != unavailable.messageRes || this.retryable != unavailable.retryable) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = unavailable.messageRes;
            }
            if ((i2 & 2) != 0) {
                z = unavailable.retryable;
            }
            return new Unavailable(i, z);
        }

        public final int component1() {
            return this.messageRes;
        }

        public final boolean component2() {
            return this.retryable;
        }

        public final Unavailable copy(int i, boolean z) {
            return new Unavailable(i, z);
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public int hashCode() {
            return C0KA.A00(this.messageRes * 31, this.retryable);
        }

        public Unavailable(int i, boolean z) {
            this.messageRes = i;
            this.retryable = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
