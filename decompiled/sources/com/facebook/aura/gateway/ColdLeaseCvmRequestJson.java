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
public final class ColdLeaseCvmRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String idempotency_key;

    public final class Companion {
        public final C9hr<ColdLeaseCvmRequestJson> serializer() {
            return ColdLeaseCvmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ColdLeaseCvmRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ColdLeaseCvmRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ColdLeaseCvmRequestJson) && C7384Etj.areEqual(this.idempotency_key, ((ColdLeaseCvmRequestJson) obj).idempotency_key));
    }

    public /* synthetic */ ColdLeaseCvmRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ColdLeaseCvmRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.idempotency_key = str;
    }

    public static /* synthetic */ ColdLeaseCvmRequestJson copy$default(ColdLeaseCvmRequestJson coldLeaseCvmRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coldLeaseCvmRequestJson.idempotency_key;
        }
        C7384Etj.A0Y(str, 0);
        return new ColdLeaseCvmRequestJson(str);
    }

    public final String component1() {
        return this.idempotency_key;
    }

    public final String getIdempotency_key() {
        return this.idempotency_key;
    }

    public int hashCode() {
        return this.idempotency_key.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ColdLeaseCvmRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.idempotency_key = str;
    }
}
