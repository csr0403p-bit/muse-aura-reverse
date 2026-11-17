package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ProvisionAndPrepareMigrationRequestJson extends C06G {
    public final VmMigrationModeJson mode;
    public final String old_env_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, ProvisionAndPrepareMigrationRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ProvisionAndPrepareMigrationRequestJson> serializer() {
            return ProvisionAndPrepareMigrationRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ProvisionAndPrepareMigrationRequestJson(String str, VmMigrationModeJson vmMigrationModeJson) {
        C7384Etj.A0Y(str, 0);
        this.old_env_id = str;
        this.mode = vmMigrationModeJson;
    }

    public final ProvisionAndPrepareMigrationRequestJson copy(String str, VmMigrationModeJson vmMigrationModeJson) {
        C7384Etj.A0Y(str, 0);
        return new ProvisionAndPrepareMigrationRequestJson(str, vmMigrationModeJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProvisionAndPrepareMigrationRequestJson) {
                ProvisionAndPrepareMigrationRequestJson provisionAndPrepareMigrationRequestJson = (ProvisionAndPrepareMigrationRequestJson) obj;
                if (!C7384Etj.areEqual(this.old_env_id, provisionAndPrepareMigrationRequestJson.old_env_id) || this.mode != provisionAndPrepareMigrationRequestJson.mode) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProvisionAndPrepareMigrationRequestJson copy$default(ProvisionAndPrepareMigrationRequestJson provisionAndPrepareMigrationRequestJson, String str, VmMigrationModeJson vmMigrationModeJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = provisionAndPrepareMigrationRequestJson.old_env_id;
        }
        if ((i & 2) != 0) {
            vmMigrationModeJson = provisionAndPrepareMigrationRequestJson.mode;
        }
        C7384Etj.A0Y(str, 0);
        return new ProvisionAndPrepareMigrationRequestJson(str, vmMigrationModeJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(ProvisionAndPrepareMigrationRequestJson provisionAndPrepareMigrationRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(provisionAndPrepareMigrationRequestJson.old_env_id, c9iZ, 0);
        if (c9j5.AfR() || provisionAndPrepareMigrationRequestJson.mode != null) {
            c9j5.AAP(provisionAndPrepareMigrationRequestJson.mode, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.old_env_id;
    }

    public final VmMigrationModeJson component2() {
        return this.mode;
    }

    public final VmMigrationModeJson getMode() {
        return this.mode;
    }

    public final String getOld_env_id() {
        return this.old_env_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.old_env_id) + AnonymousClass006.A0D(this.mode);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProvisionAndPrepareMigrationRequestJson(int i, String str, VmMigrationModeJson vmMigrationModeJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ProvisionAndPrepareMigrationRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.old_env_id = str;
        this.mode = (i & 2) == 0 ? null : vmMigrationModeJson;
    }

    public /* synthetic */ ProvisionAndPrepareMigrationRequestJson(String str, VmMigrationModeJson vmMigrationModeJson, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : vmMigrationModeJson);
    }
}
