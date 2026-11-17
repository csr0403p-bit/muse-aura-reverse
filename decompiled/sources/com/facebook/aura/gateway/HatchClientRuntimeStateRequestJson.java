package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchClientRuntimeStateRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String app_visibility;

    public final class Companion {
        public final C9hr<HatchClientRuntimeStateRequestJson> serializer() {
            return HatchClientRuntimeStateRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchClientRuntimeStateRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new HatchClientRuntimeStateRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchClientRuntimeStateRequestJson) && C7384Etj.areEqual(this.app_visibility, ((HatchClientRuntimeStateRequestJson) obj).app_visibility));
    }

    public /* synthetic */ HatchClientRuntimeStateRequestJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchClientRuntimeStateRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.app_visibility = str;
    }

    public static /* synthetic */ HatchClientRuntimeStateRequestJson copy$default(HatchClientRuntimeStateRequestJson hatchClientRuntimeStateRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchClientRuntimeStateRequestJson.app_visibility;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchClientRuntimeStateRequestJson(str);
    }

    public final String component1() {
        return this.app_visibility;
    }

    public final String getApp_visibility() {
        return this.app_visibility;
    }

    public int hashCode() {
        return this.app_visibility.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HatchClientRuntimeStateRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.app_visibility = str;
    }
}
