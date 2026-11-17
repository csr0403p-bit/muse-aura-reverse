package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ProvisionAndPrepareMigrationResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String new_cvm_env_id;
    public final String new_env_id;

    public final class Companion {
        public final C9hr<ProvisionAndPrepareMigrationResponseJson> serializer() {
            return ProvisionAndPrepareMigrationResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ProvisionAndPrepareMigrationResponseJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.new_cvm_env_id = str;
        this.new_env_id = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ProvisionAndPrepareMigrationResponseJson provisionAndPrepareMigrationResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(provisionAndPrepareMigrationResponseJson.new_cvm_env_id, c9iZ, 0);
        if (c9j5.AfR() || provisionAndPrepareMigrationResponseJson.new_env_id != null) {
            c9j5.AAP(provisionAndPrepareMigrationResponseJson.new_env_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public final ProvisionAndPrepareMigrationResponseJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ProvisionAndPrepareMigrationResponseJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProvisionAndPrepareMigrationResponseJson) {
                ProvisionAndPrepareMigrationResponseJson provisionAndPrepareMigrationResponseJson = (ProvisionAndPrepareMigrationResponseJson) obj;
                if (!C7384Etj.areEqual(this.new_cvm_env_id, provisionAndPrepareMigrationResponseJson.new_cvm_env_id) || !C7384Etj.areEqual(this.new_env_id, provisionAndPrepareMigrationResponseJson.new_env_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProvisionAndPrepareMigrationResponseJson copy$default(ProvisionAndPrepareMigrationResponseJson provisionAndPrepareMigrationResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provisionAndPrepareMigrationResponseJson.new_cvm_env_id;
        }
        if ((i & 2) != 0) {
            str2 = provisionAndPrepareMigrationResponseJson.new_env_id;
        }
        C7384Etj.A0Y(str, 0);
        return new ProvisionAndPrepareMigrationResponseJson(str, str2);
    }

    public final String component1() {
        return this.new_cvm_env_id;
    }

    public final String component2() {
        return this.new_env_id;
    }

    public final String getNew_cvm_env_id() {
        return this.new_cvm_env_id;
    }

    public final String getNew_env_id() {
        return this.new_env_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.new_cvm_env_id) + AnonymousClass006.A0G(this.new_env_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProvisionAndPrepareMigrationResponseJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ProvisionAndPrepareMigrationResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.new_cvm_env_id = str;
        this.new_env_id = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ ProvisionAndPrepareMigrationResponseJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
