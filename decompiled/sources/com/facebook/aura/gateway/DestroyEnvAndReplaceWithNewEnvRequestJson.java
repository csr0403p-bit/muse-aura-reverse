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
public final class DestroyEnvAndReplaceWithNewEnvRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int hatchling_vm_type;
    public final String old_env_id;

    public final class Companion {
        public final C9hr<DestroyEnvAndReplaceWithNewEnvRequestJson> serializer() {
            return DestroyEnvAndReplaceWithNewEnvRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DestroyEnvAndReplaceWithNewEnvRequestJson(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.old_env_id = str;
        this.hatchling_vm_type = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DestroyEnvAndReplaceWithNewEnvRequestJson destroyEnvAndReplaceWithNewEnvRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(destroyEnvAndReplaceWithNewEnvRequestJson.old_env_id, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, destroyEnvAndReplaceWithNewEnvRequestJson.hatchling_vm_type);
    }

    public final DestroyEnvAndReplaceWithNewEnvRequestJson copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new DestroyEnvAndReplaceWithNewEnvRequestJson(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DestroyEnvAndReplaceWithNewEnvRequestJson) {
                DestroyEnvAndReplaceWithNewEnvRequestJson destroyEnvAndReplaceWithNewEnvRequestJson = (DestroyEnvAndReplaceWithNewEnvRequestJson) obj;
                if (!C7384Etj.areEqual(this.old_env_id, destroyEnvAndReplaceWithNewEnvRequestJson.old_env_id) || this.hatchling_vm_type != destroyEnvAndReplaceWithNewEnvRequestJson.hatchling_vm_type) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DestroyEnvAndReplaceWithNewEnvRequestJson copy$default(DestroyEnvAndReplaceWithNewEnvRequestJson destroyEnvAndReplaceWithNewEnvRequestJson, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = destroyEnvAndReplaceWithNewEnvRequestJson.old_env_id;
        }
        if ((i2 & 2) != 0) {
            i = destroyEnvAndReplaceWithNewEnvRequestJson.hatchling_vm_type;
        }
        C7384Etj.A0Y(str, 0);
        return new DestroyEnvAndReplaceWithNewEnvRequestJson(str, i);
    }

    public final String component1() {
        return this.old_env_id;
    }

    public final int component2() {
        return this.hatchling_vm_type;
    }

    public final int getHatchling_vm_type() {
        return this.hatchling_vm_type;
    }

    public final String getOld_env_id() {
        return this.old_env_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.old_env_id) + this.hatchling_vm_type;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DestroyEnvAndReplaceWithNewEnvRequestJson(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(DestroyEnvAndReplaceWithNewEnvRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.old_env_id = str;
        this.hatchling_vm_type = i2;
    }
}
