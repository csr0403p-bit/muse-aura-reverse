package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VmMigrationJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> channels_disconnected;
    public final List<String> connectors_disconnected;
    public final String migration_id;
    public final String to_mode;

    public final class Companion {
        public final C9hr<VmMigrationJson> serializer() {
            return VmMigrationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, VmMigrationJson$Companion$$childSerializers$1.INSTANCE), VmMigrationJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmMigrationJson) {
                VmMigrationJson vmMigrationJson = (VmMigrationJson) obj;
                if (!C7384Etj.areEqual(this.migration_id, vmMigrationJson.migration_id) || !C7384Etj.areEqual(this.to_mode, vmMigrationJson.to_mode) || !C7384Etj.areEqual(this.connectors_disconnected, vmMigrationJson.connectors_disconnected) || !C7384Etj.areEqual(this.channels_disconnected, vmMigrationJson.channels_disconnected)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmMigrationJson copy$default(VmMigrationJson vmMigrationJson, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmMigrationJson.migration_id;
        }
        if ((i & 2) != 0) {
            str2 = vmMigrationJson.to_mode;
        }
        if ((i & 4) != 0) {
            list = vmMigrationJson.connectors_disconnected;
        }
        if ((i & 8) != 0) {
            list2 = vmMigrationJson.channels_disconnected;
        }
        AnonymousClass003.A0u(str, str2);
        return new VmMigrationJson(str, str2, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_vmswitch_vmswitch(VmMigrationJson vmMigrationJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(vmMigrationJson.migration_id, c9iZ, 0);
        c9j5.AAV(vmMigrationJson.to_mode, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || vmMigrationJson.connectors_disconnected != null) {
            c9j5.AAP(vmMigrationJson.connectors_disconnected, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || vmMigrationJson.channels_disconnected != null) {
            c9j5.AAP(vmMigrationJson.channels_disconnected, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final String component1() {
        return this.migration_id;
    }

    public final String component2() {
        return this.to_mode;
    }

    public final List<String> component3() {
        return this.connectors_disconnected;
    }

    public final List<String> component4() {
        return this.channels_disconnected;
    }

    public final List<String> getChannels_disconnected() {
        return this.channels_disconnected;
    }

    public final List<String> getConnectors_disconnected() {
        return this.connectors_disconnected;
    }

    public final String getMigration_id() {
        return this.migration_id;
    }

    public final String getTo_mode() {
        return this.to_mode;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.to_mode, AnonymousClass001.A0G(this.migration_id)) + AnonymousClass006.A0D(this.connectors_disconnected)) * 31) + C3cH.A02(this.channels_disconnected);
    }

    public VmMigrationJson(String str, String str2, List<String> list, List<String> list2) {
        AnonymousClass003.A0u(str, str2);
        this.migration_id = str;
        this.to_mode = str2;
        this.connectors_disconnected = list;
        this.channels_disconnected = list2;
    }

    public final VmMigrationJson copy(String str, String str2, List<String> list, List<String> list2) {
        AnonymousClass003.A0u(str, str2);
        return new VmMigrationJson(str, str2, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VmMigrationJson(int i, String str, String str2, List list, List list2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VmMigrationJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.migration_id = str;
        this.to_mode = str2;
        if ((i & 4) == 0) {
            this.connectors_disconnected = null;
        } else {
            this.connectors_disconnected = list;
        }
        if ((i & 8) == 0) {
            this.channels_disconnected = null;
        } else {
            this.channels_disconnected = list2;
        }
    }

    public /* synthetic */ VmMigrationJson(String str, String str2, List list, List list2, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }
}
