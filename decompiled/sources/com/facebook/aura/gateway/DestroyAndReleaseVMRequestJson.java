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
public final class DestroyAndReleaseVMRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String fqdn;

    public final class Companion {
        public final C9hr<DestroyAndReleaseVMRequestJson> serializer() {
            return DestroyAndReleaseVMRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final DestroyAndReleaseVMRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new DestroyAndReleaseVMRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DestroyAndReleaseVMRequestJson) && C7384Etj.areEqual(this.fqdn, ((DestroyAndReleaseVMRequestJson) obj).fqdn));
    }

    public /* synthetic */ DestroyAndReleaseVMRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(DestroyAndReleaseVMRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.fqdn = str;
    }

    public static /* synthetic */ DestroyAndReleaseVMRequestJson copy$default(DestroyAndReleaseVMRequestJson destroyAndReleaseVMRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = destroyAndReleaseVMRequestJson.fqdn;
        }
        C7384Etj.A0Y(str, 0);
        return new DestroyAndReleaseVMRequestJson(str);
    }

    public final String component1() {
        return this.fqdn;
    }

    public final String getFqdn() {
        return this.fqdn;
    }

    public int hashCode() {
        return this.fqdn.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public DestroyAndReleaseVMRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.fqdn = str;
    }
}
