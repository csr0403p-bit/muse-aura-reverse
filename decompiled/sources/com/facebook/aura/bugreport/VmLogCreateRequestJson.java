package com.facebook.aura.bugreport;

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
public final class VmLogCreateRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String request_id;

    public final class Companion {
        public final C9hr<VmLogCreateRequestJson> serializer() {
            return VmLogCreateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final VmLogCreateRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new VmLogCreateRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmLogCreateRequestJson) && C7384Etj.areEqual(this.request_id, ((VmLogCreateRequestJson) obj).request_id));
    }

    public /* synthetic */ VmLogCreateRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VmLogCreateRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.request_id = str;
    }

    public static /* synthetic */ VmLogCreateRequestJson copy$default(VmLogCreateRequestJson vmLogCreateRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmLogCreateRequestJson.request_id;
        }
        C7384Etj.A0Y(str, 0);
        return new VmLogCreateRequestJson(str);
    }

    public final String component1() {
        return this.request_id;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public int hashCode() {
        return this.request_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public VmLogCreateRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.request_id = str;
    }
}
