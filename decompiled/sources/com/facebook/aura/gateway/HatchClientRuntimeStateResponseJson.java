package com.facebook.aura.gateway;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchClientRuntimeStateResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean accepted;

    public final class Companion {
        public final C9hr<HatchClientRuntimeStateResponseJson> serializer() {
            return HatchClientRuntimeStateResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchClientRuntimeStateResponseJson) && this.accepted == ((HatchClientRuntimeStateResponseJson) obj).accepted);
    }

    public /* synthetic */ HatchClientRuntimeStateResponseJson(int i, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchClientRuntimeStateResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accepted = z;
    }

    public static /* synthetic */ HatchClientRuntimeStateResponseJson copy$default(HatchClientRuntimeStateResponseJson hatchClientRuntimeStateResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchClientRuntimeStateResponseJson.accepted;
        }
        return new HatchClientRuntimeStateResponseJson(z);
    }

    public final boolean component1() {
        return this.accepted;
    }

    public final HatchClientRuntimeStateResponseJson copy(boolean z) {
        return new HatchClientRuntimeStateResponseJson(z);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public int hashCode() {
        return this.accepted ? 1231 : 1237;
    }

    public String toString() {
        return super.toString();
    }

    public HatchClientRuntimeStateResponseJson(boolean z) {
        this.accepted = z;
    }
}
