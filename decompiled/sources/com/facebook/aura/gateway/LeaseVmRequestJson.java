package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LeaseVmRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int hatchling_vm_type;
    public final boolean notary_token;

    public final class Companion {
        public final C9hr<LeaseVmRequestJson> serializer() {
            return LeaseVmRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(LeaseVmRequestJson leaseVmRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, leaseVmRequestJson.hatchling_vm_type);
        c9j5.AA7(c9iZ, 1, leaseVmRequestJson.notary_token);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeaseVmRequestJson) {
                LeaseVmRequestJson leaseVmRequestJson = (LeaseVmRequestJson) obj;
                if (this.hatchling_vm_type != leaseVmRequestJson.hatchling_vm_type || this.notary_token != leaseVmRequestJson.notary_token) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LeaseVmRequestJson copy$default(LeaseVmRequestJson leaseVmRequestJson, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = leaseVmRequestJson.hatchling_vm_type;
        }
        if ((i2 & 2) != 0) {
            z = leaseVmRequestJson.notary_token;
        }
        return new LeaseVmRequestJson(i, z);
    }

    public final int component1() {
        return this.hatchling_vm_type;
    }

    public final boolean component2() {
        return this.notary_token;
    }

    public final LeaseVmRequestJson copy(int i, boolean z) {
        return new LeaseVmRequestJson(i, z);
    }

    public final int getHatchling_vm_type() {
        return this.hatchling_vm_type;
    }

    public final boolean getNotary_token() {
        return this.notary_token;
    }

    public int hashCode() {
        return C0KA.A00(this.hatchling_vm_type * 31, this.notary_token);
    }

    public LeaseVmRequestJson(int i, boolean z) {
        this.hatchling_vm_type = i;
        this.notary_token = z;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LeaseVmRequestJson(int i, int i2, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LeaseVmRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.hatchling_vm_type = i2;
        this.notary_token = z;
    }
}
