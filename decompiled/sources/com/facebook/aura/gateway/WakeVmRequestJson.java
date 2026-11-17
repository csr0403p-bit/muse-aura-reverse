package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class WakeVmRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int retry_count;
    public final String vm_id;

    public final class Companion {
        public final C9hr<WakeVmRequestJson> serializer() {
            return WakeVmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WakeVmRequestJson(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.vm_id = str;
        this.retry_count = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WakeVmRequestJson wakeVmRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(wakeVmRequestJson.vm_id, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, wakeVmRequestJson.retry_count);
    }

    public final WakeVmRequestJson copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new WakeVmRequestJson(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WakeVmRequestJson) {
                WakeVmRequestJson wakeVmRequestJson = (WakeVmRequestJson) obj;
                if (!C7384Etj.areEqual(this.vm_id, wakeVmRequestJson.vm_id) || this.retry_count != wakeVmRequestJson.retry_count) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WakeVmRequestJson copy$default(WakeVmRequestJson wakeVmRequestJson, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wakeVmRequestJson.vm_id;
        }
        if ((i2 & 2) != 0) {
            i = wakeVmRequestJson.retry_count;
        }
        C7384Etj.A0Y(str, 0);
        return new WakeVmRequestJson(str, i);
    }

    public final String component1() {
        return this.vm_id;
    }

    public final int component2() {
        return this.retry_count;
    }

    public final int getRetry_count() {
        return this.retry_count;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.vm_id) + this.retry_count;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WakeVmRequestJson(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(WakeVmRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.vm_id = str;
        this.retry_count = i2;
    }
}
