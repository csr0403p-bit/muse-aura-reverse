package com.facebook.aura.gateway.connection;

import X.C06G;
import X.C0KA;

/* loaded from: classes2.dex */
public interface ConnectRequestResult {

    public final class Accepted extends C06G implements ConnectRequestResult {
        public final int connectionCycle;
        public final boolean startedFreshCycle;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Accepted) {
                    Accepted accepted = (Accepted) obj;
                    if (this.connectionCycle != accepted.connectionCycle || this.startedFreshCycle != accepted.startedFreshCycle) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Accepted copy$default(Accepted accepted, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = accepted.connectionCycle;
            }
            if ((i2 & 2) != 0) {
                z = accepted.startedFreshCycle;
            }
            return new Accepted(i, z);
        }

        public final int component1() {
            return this.connectionCycle;
        }

        public final boolean component2() {
            return this.startedFreshCycle;
        }

        public final Accepted copy(int i, boolean z) {
            return new Accepted(i, z);
        }

        public final int getConnectionCycle() {
            return this.connectionCycle;
        }

        public final boolean getStartedFreshCycle() {
            return this.startedFreshCycle;
        }

        public int hashCode() {
            return C0KA.A00(this.connectionCycle * 31, this.startedFreshCycle);
        }

        public Accepted(int i, boolean z) {
            this.connectionCycle = i;
            this.startedFreshCycle = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Rejected implements ConnectRequestResult {
        public static final Rejected INSTANCE = new Rejected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        public String toString() {
            return "Rejected";
        }

        public int hashCode() {
            return -1027412588;
        }
    }
}
