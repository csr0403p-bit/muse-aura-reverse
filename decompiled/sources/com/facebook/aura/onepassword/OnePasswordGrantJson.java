package com.facebook.aura.onepassword;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnePasswordGrantJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final OnePasswordGrantPayloadJson payload;

    public final class Companion {
        public final C9hr<OnePasswordGrantJson> serializer() {
            return OnePasswordGrantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OnePasswordGrantJson copy(OnePasswordGrantPayloadJson onePasswordGrantPayloadJson) {
        C7384Etj.A0Y(onePasswordGrantPayloadJson, 0);
        return new OnePasswordGrantJson(onePasswordGrantPayloadJson);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnePasswordGrantJson) && C7384Etj.areEqual(this.payload, ((OnePasswordGrantJson) obj).payload));
    }

    public /* synthetic */ OnePasswordGrantJson(int i, OnePasswordGrantPayloadJson onePasswordGrantPayloadJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(OnePasswordGrantJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.payload = onePasswordGrantPayloadJson;
    }

    public static /* synthetic */ OnePasswordGrantJson copy$default(OnePasswordGrantJson onePasswordGrantJson, OnePasswordGrantPayloadJson onePasswordGrantPayloadJson, int i, Object obj) {
        if ((i & 1) != 0) {
            onePasswordGrantPayloadJson = onePasswordGrantJson.payload;
        }
        C7384Etj.A0Y(onePasswordGrantPayloadJson, 0);
        return new OnePasswordGrantJson(onePasswordGrantPayloadJson);
    }

    public final OnePasswordGrantPayloadJson component1() {
        return this.payload;
    }

    public final OnePasswordGrantPayloadJson getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public OnePasswordGrantJson(OnePasswordGrantPayloadJson onePasswordGrantPayloadJson) {
        C7384Etj.A0Y(onePasswordGrantPayloadJson, 0);
        this.payload = onePasswordGrantPayloadJson;
    }
}
