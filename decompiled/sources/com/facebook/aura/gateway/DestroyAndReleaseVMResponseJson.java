package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DestroyAndReleaseVMResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean success;

    public final class Companion {
        public final C9hr<DestroyAndReleaseVMResponseJson> serializer() {
            return DestroyAndReleaseVMResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DestroyAndReleaseVMResponseJson destroyAndReleaseVMResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || destroyAndReleaseVMResponseJson.success) {
            c9j5.AA7(c9iZ, 0, destroyAndReleaseVMResponseJson.success);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DestroyAndReleaseVMResponseJson) && this.success == ((DestroyAndReleaseVMResponseJson) obj).success);
    }

    public static /* synthetic */ DestroyAndReleaseVMResponseJson copy$default(DestroyAndReleaseVMResponseJson destroyAndReleaseVMResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = destroyAndReleaseVMResponseJson.success;
        }
        return new DestroyAndReleaseVMResponseJson(z);
    }

    public final boolean component1() {
        return this.success;
    }

    public final DestroyAndReleaseVMResponseJson copy(boolean z) {
        return new DestroyAndReleaseVMResponseJson(z);
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.success ? 1231 : 1237;
    }

    public /* synthetic */ DestroyAndReleaseVMResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.success = false;
        } else {
            this.success = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DestroyAndReleaseVMResponseJson(boolean z) {
        this.success = z;
    }

    public /* synthetic */ DestroyAndReleaseVMResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public DestroyAndReleaseVMResponseJson() {
        this(false);
    }
}
