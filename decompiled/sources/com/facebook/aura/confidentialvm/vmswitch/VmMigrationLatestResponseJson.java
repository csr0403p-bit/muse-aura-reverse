package com.facebook.aura.confidentialvm.vmswitch;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VmMigrationLatestResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final VmMigrationJson migration;

    public final class Companion {
        public final C9hr<VmMigrationLatestResponseJson> serializer() {
            return VmMigrationLatestResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VmMigrationLatestResponseJson) && C7384Etj.areEqual(this.migration, ((VmMigrationLatestResponseJson) obj).migration));
    }

    public /* synthetic */ VmMigrationLatestResponseJson(int i, VmMigrationJson vmMigrationJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(VmMigrationLatestResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.migration = vmMigrationJson;
    }

    public static /* synthetic */ VmMigrationLatestResponseJson copy$default(VmMigrationLatestResponseJson vmMigrationLatestResponseJson, VmMigrationJson vmMigrationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            vmMigrationJson = vmMigrationLatestResponseJson.migration;
        }
        return new VmMigrationLatestResponseJson(vmMigrationJson);
    }

    public final VmMigrationJson component1() {
        return this.migration;
    }

    public final VmMigrationLatestResponseJson copy(VmMigrationJson vmMigrationJson) {
        return new VmMigrationLatestResponseJson(vmMigrationJson);
    }

    public final VmMigrationJson getMigration() {
        return this.migration;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.migration);
    }

    public String toString() {
        return super.toString();
    }

    public VmMigrationLatestResponseJson(VmMigrationJson vmMigrationJson) {
        this.migration = vmMigrationJson;
    }
}
