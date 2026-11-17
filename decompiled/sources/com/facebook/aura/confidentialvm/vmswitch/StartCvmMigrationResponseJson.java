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
public final class StartCvmMigrationResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String new_cvm_env_id;

    public final class Companion {
        public final C9hr<StartCvmMigrationResponseJson> serializer() {
            return StartCvmMigrationResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final StartCvmMigrationResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new StartCvmMigrationResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StartCvmMigrationResponseJson) && C7384Etj.areEqual(this.new_cvm_env_id, ((StartCvmMigrationResponseJson) obj).new_cvm_env_id));
    }

    public /* synthetic */ StartCvmMigrationResponseJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(StartCvmMigrationResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.new_cvm_env_id = str;
    }

    public static /* synthetic */ StartCvmMigrationResponseJson copy$default(StartCvmMigrationResponseJson startCvmMigrationResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startCvmMigrationResponseJson.new_cvm_env_id;
        }
        C7384Etj.A0Y(str, 0);
        return new StartCvmMigrationResponseJson(str);
    }

    public final String component1() {
        return this.new_cvm_env_id;
    }

    public final String getNew_cvm_env_id() {
        return this.new_cvm_env_id;
    }

    public int hashCode() {
        return this.new_cvm_env_id.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public StartCvmMigrationResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.new_cvm_env_id = str;
    }
}
