package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
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
public final class ConfidentialVmDataMigrationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ConfidentialVmDataMigrationStepJson confidential_vm;
    public final ConfidentialVmDataMigrationStepJson secure_vm;

    public final class Companion {
        public final C9hr<ConfidentialVmDataMigrationJson> serializer() {
            return ConfidentialVmDataMigrationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(ConfidentialVmDataMigrationJson confidentialVmDataMigrationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || confidentialVmDataMigrationJson.confidential_vm != null) {
            c9j5.AAP(confidentialVmDataMigrationJson.confidential_vm, ConfidentialVmDataMigrationStepJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || confidentialVmDataMigrationJson.secure_vm != null) {
            c9j5.AAP(confidentialVmDataMigrationJson.secure_vm, ConfidentialVmDataMigrationStepJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmDataMigrationJson) {
                ConfidentialVmDataMigrationJson confidentialVmDataMigrationJson = (ConfidentialVmDataMigrationJson) obj;
                if (!C7384Etj.areEqual(this.confidential_vm, confidentialVmDataMigrationJson.confidential_vm) || !C7384Etj.areEqual(this.secure_vm, confidentialVmDataMigrationJson.secure_vm)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmDataMigrationJson copy$default(ConfidentialVmDataMigrationJson confidentialVmDataMigrationJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            confidentialVmDataMigrationStepJson = confidentialVmDataMigrationJson.confidential_vm;
        }
        if ((i & 2) != 0) {
            confidentialVmDataMigrationStepJson2 = confidentialVmDataMigrationJson.secure_vm;
        }
        return new ConfidentialVmDataMigrationJson(confidentialVmDataMigrationStepJson, confidentialVmDataMigrationStepJson2);
    }

    public final ConfidentialVmDataMigrationStepJson component1() {
        return this.confidential_vm;
    }

    public final ConfidentialVmDataMigrationStepJson component2() {
        return this.secure_vm;
    }

    public final ConfidentialVmDataMigrationJson copy(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson2) {
        return new ConfidentialVmDataMigrationJson(confidentialVmDataMigrationStepJson, confidentialVmDataMigrationStepJson2);
    }

    public final ConfidentialVmDataMigrationStepJson getConfidential_vm() {
        return this.confidential_vm;
    }

    public final ConfidentialVmDataMigrationStepJson getSecure_vm() {
        return this.secure_vm;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.confidential_vm) * 31) + C3cH.A02(this.secure_vm);
    }

    public ConfidentialVmDataMigrationJson(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson2) {
        this.confidential_vm = confidentialVmDataMigrationStepJson;
        this.secure_vm = confidentialVmDataMigrationStepJson2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmDataMigrationJson(int i, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.confidential_vm = null;
        } else {
            this.confidential_vm = confidentialVmDataMigrationStepJson;
        }
        if ((i & 2) == 0) {
            this.secure_vm = null;
        } else {
            this.secure_vm = confidentialVmDataMigrationStepJson2;
        }
    }

    public /* synthetic */ ConfidentialVmDataMigrationJson(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson, ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : confidentialVmDataMigrationStepJson, (i & 2) != 0 ? null : confidentialVmDataMigrationStepJson2);
    }

    public ConfidentialVmDataMigrationJson() {
        this(null, null);
    }
}
