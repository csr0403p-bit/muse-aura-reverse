package com.facebook.aura.network.state;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes5.dex */
public interface AuraNetworkState {

    public final class Offline implements AuraNetworkState {
        public static final Offline INSTANCE = new Offline();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Offline);
        }

        public String toString() {
            return "Offline";
        }

        public int hashCode() {
            return 1457173640;
        }
    }

    public final class Online extends C06G implements AuraNetworkState {
        public final boolean isMetered;
        public final boolean isValidated;
        public final Transport transport;

        public Online(Transport transport, boolean z, boolean z2) {
            C7384Etj.A0Y(transport, 0);
            this.transport = transport;
            this.isValidated = z;
            this.isMetered = z2;
        }

        public final Online copy(Transport transport, boolean z, boolean z2) {
            C7384Etj.A0Y(transport, 0);
            return new Online(transport, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Online) {
                    Online online = (Online) obj;
                    if (this.transport != online.transport || this.isValidated != online.isValidated || this.isMetered != online.isMetered) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Online copy$default(Online online, Transport transport, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                transport = online.transport;
            }
            if ((i & 2) != 0) {
                z = online.isValidated;
            }
            if ((i & 4) != 0) {
                z2 = online.isMetered;
            }
            return online.copy(transport, z, z2);
        }

        public final Transport component1() {
            return this.transport;
        }

        public final boolean component2() {
            return this.isValidated;
        }

        public final boolean component3() {
            return this.isMetered;
        }

        public final Transport getTransport() {
            return this.transport;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.transport), this.isValidated), this.isMetered);
        }

        public final boolean isMetered() {
            return this.isMetered;
        }

        public final boolean isValidated() {
            return this.isValidated;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Unknown implements AuraNetworkState {
        public static final Unknown INSTANCE = new Unknown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public String toString() {
            return "Unknown";
        }

        public int hashCode() {
            return -1574022417;
        }
    }
}
