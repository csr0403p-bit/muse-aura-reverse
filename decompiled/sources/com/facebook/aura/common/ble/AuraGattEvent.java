package com.facebook.aura.common.ble;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface AuraGattEvent {

    public final class Connected extends C06G implements AuraGattEvent {
        public final String address;
        public final String name;

        public Connected(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.address = str;
            this.name = str2;
        }

        public final Connected copy(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            return new Connected(str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Connected) {
                    Connected connected = (Connected) obj;
                    if (!C7384Etj.areEqual(this.address, connected.address) || !C7384Etj.areEqual(this.name, connected.name)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Connected copy$default(Connected connected, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connected.address;
            }
            if ((i & 2) != 0) {
                str2 = connected.name;
            }
            C7384Etj.A0Y(str, 0);
            return new Connected(str, str2);
        }

        public final String component1() {
            return this.address;
        }

        public final String component2() {
            return this.name;
        }

        public final String getAddress() {
            return this.address;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.address) + AnonymousClass006.A0G(this.name);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Disconnected implements AuraGattEvent {
        public static final Disconnected INSTANCE = new Disconnected();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Disconnected);
        }

        public String toString() {
            return "Disconnected";
        }

        public int hashCode() {
            return 798894546;
        }
    }

    public final class ServicesDiscovered extends C06G implements AuraGattEvent {
        public final boolean success;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ServicesDiscovered) && this.success == ((ServicesDiscovered) obj).success);
        }

        public static /* synthetic */ ServicesDiscovered copy$default(ServicesDiscovered servicesDiscovered, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = servicesDiscovered.success;
            }
            return new ServicesDiscovered(z);
        }

        public final boolean component1() {
            return this.success;
        }

        public final ServicesDiscovered copy(boolean z) {
            return new ServicesDiscovered(z);
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.success ? 1231 : 1237;
        }

        public ServicesDiscovered(boolean z) {
            this.success = z;
        }

        public String toString() {
            return super.toString();
        }
    }
}
