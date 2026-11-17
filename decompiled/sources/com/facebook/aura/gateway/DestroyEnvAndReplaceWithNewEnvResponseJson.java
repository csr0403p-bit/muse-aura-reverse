package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class DestroyEnvAndReplaceWithNewEnvResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String vm_id;

    public final class Companion {
        public final C9hr<DestroyEnvAndReplaceWithNewEnvResponseJson> serializer() {
            return DestroyEnvAndReplaceWithNewEnvResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DestroyEnvAndReplaceWithNewEnvResponseJson destroyEnvAndReplaceWithNewEnvResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(destroyEnvAndReplaceWithNewEnvResponseJson.vm_id)) {
            c9j5.AAV(destroyEnvAndReplaceWithNewEnvResponseJson.vm_id, c9iZ, 0);
        }
    }

    public final DestroyEnvAndReplaceWithNewEnvResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new DestroyEnvAndReplaceWithNewEnvResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DestroyEnvAndReplaceWithNewEnvResponseJson) && C7384Etj.areEqual(this.vm_id, ((DestroyEnvAndReplaceWithNewEnvResponseJson) obj).vm_id));
    }

    public static /* synthetic */ DestroyEnvAndReplaceWithNewEnvResponseJson copy$default(DestroyEnvAndReplaceWithNewEnvResponseJson destroyEnvAndReplaceWithNewEnvResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = destroyEnvAndReplaceWithNewEnvResponseJson.vm_id;
        }
        C7384Etj.A0Y(str, 0);
        return new DestroyEnvAndReplaceWithNewEnvResponseJson(str);
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

    public /* synthetic */ DestroyEnvAndReplaceWithNewEnvResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.vm_id = "";
        } else {
            this.vm_id = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public DestroyEnvAndReplaceWithNewEnvResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.vm_id = str;
    }

    public /* synthetic */ DestroyEnvAndReplaceWithNewEnvResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public DestroyEnvAndReplaceWithNewEnvResponseJson() {
        this("");
    }
}
