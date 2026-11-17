package com.facebook.aura.browsertask.data;

import X.C06H;
import X.C2hx;
import X.C60O;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class BrowserLeaseRequestJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String lease_id;

    public final class Companion {
        public final C9hr<BrowserLeaseRequestJson> serializer() {
            return BrowserLeaseRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final BrowserLeaseRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new BrowserLeaseRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BrowserLeaseRequestJson) && C7384Etj.areEqual(this.lease_id, ((BrowserLeaseRequestJson) obj).lease_id));
    }

    public /* synthetic */ BrowserLeaseRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(BrowserLeaseRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.lease_id = str;
    }

    public static /* synthetic */ BrowserLeaseRequestJson copy$default(BrowserLeaseRequestJson browserLeaseRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browserLeaseRequestJson.lease_id;
        }
        C7384Etj.A0Y(str, 0);
        return new BrowserLeaseRequestJson(str);
    }

    public final String component1() {
        return this.lease_id;
    }

    public final String getLease_id() {
        return this.lease_id;
    }

    public int hashCode() {
        return this.lease_id.hashCode();
    }

    public String toString() {
        return C60O.A0r("BrowserLeaseRequestJson(lease_id=", this.lease_id);
    }

    public BrowserLeaseRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.lease_id = str;
    }
}
