package com.facebook.aura.storagerecovery.data;

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
public final class MintVmRecoveryTokenRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String vm_id;

    public final class Companion {
        public final C9hr<MintVmRecoveryTokenRequestJson> serializer() {
            return MintVmRecoveryTokenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final MintVmRecoveryTokenRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new MintVmRecoveryTokenRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MintVmRecoveryTokenRequestJson) && C7384Etj.areEqual(this.vm_id, ((MintVmRecoveryTokenRequestJson) obj).vm_id));
    }

    public /* synthetic */ MintVmRecoveryTokenRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(MintVmRecoveryTokenRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.vm_id = str;
    }

    public static /* synthetic */ MintVmRecoveryTokenRequestJson copy$default(MintVmRecoveryTokenRequestJson mintVmRecoveryTokenRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mintVmRecoveryTokenRequestJson.vm_id;
        }
        C7384Etj.A0Y(str, 0);
        return new MintVmRecoveryTokenRequestJson(str);
    }

    public final String component1() {
        return this.vm_id;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return this.vm_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public MintVmRecoveryTokenRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.vm_id = str;
    }
}
