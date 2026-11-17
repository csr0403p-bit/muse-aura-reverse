package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EnableVmRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String env_id;

    public final class Companion {
        public final C9hr<EnableVmRequestJson> serializer() {
            return EnableVmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EnableVmRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new EnableVmRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EnableVmRequestJson) && C7384Etj.areEqual(this.env_id, ((EnableVmRequestJson) obj).env_id));
    }

    public /* synthetic */ EnableVmRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EnableVmRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.env_id = str;
    }

    public static /* synthetic */ EnableVmRequestJson copy$default(EnableVmRequestJson enableVmRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableVmRequestJson.env_id;
        }
        C7384Etj.A0Y(str, 0);
        return new EnableVmRequestJson(str);
    }

    public final String component1() {
        return this.env_id;
    }

    public final String getEnv_id() {
        return this.env_id;
    }

    public int hashCode() {
        return this.env_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EnableVmRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.env_id = str;
    }
}
