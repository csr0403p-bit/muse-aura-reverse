package com.facebook.aura.agentpermission;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface CheckoutInfoTitle {

    public final class Resource extends C06G implements CheckoutInfoTitle {
        public static final int $stable = 0;
        public final int id;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resource) && this.id == ((Resource) obj).id);
        }

        public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.id;
            }
            return new Resource(i);
        }

        public final int component1() {
            return this.id;
        }

        public final Resource copy(int i) {
            return new Resource(i);
        }

        public final int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id;
        }

        public Resource(int i) {
            this.id = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Server extends C06G implements CheckoutInfoTitle {
        public static final int $stable = 0;
        public final String value;

        public Server(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Server copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Server(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Server) && C7384Etj.areEqual(this.value, ((Server) obj).value));
        }

        public static /* synthetic */ Server copy$default(Server server, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = server.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Server(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
