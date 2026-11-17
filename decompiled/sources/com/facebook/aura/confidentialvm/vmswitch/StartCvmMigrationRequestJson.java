package com.facebook.aura.confidentialvm.vmswitch;

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
public final class StartCvmMigrationRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String old_env_id;

    public final class Companion {
        public final C9hr<StartCvmMigrationRequestJson> serializer() {
            return StartCvmMigrationRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final StartCvmMigrationRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new StartCvmMigrationRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StartCvmMigrationRequestJson) && C7384Etj.areEqual(this.old_env_id, ((StartCvmMigrationRequestJson) obj).old_env_id));
    }

    public /* synthetic */ StartCvmMigrationRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(StartCvmMigrationRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.old_env_id = str;
    }

    public static /* synthetic */ StartCvmMigrationRequestJson copy$default(StartCvmMigrationRequestJson startCvmMigrationRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startCvmMigrationRequestJson.old_env_id;
        }
        C7384Etj.A0Y(str, 0);
        return new StartCvmMigrationRequestJson(str);
    }

    public final String component1() {
        return this.old_env_id;
    }

    public final String getOld_env_id() {
        return this.old_env_id;
    }

    public int hashCode() {
        return this.old_env_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public StartCvmMigrationRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.old_env_id = str;
    }
}
