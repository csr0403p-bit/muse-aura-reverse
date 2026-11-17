package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class HatchToolCallRequest extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String detail;
    public final String label;
    public final JsonElement metadata;
    public final String summary;

    public final class Companion {
        public final C9hr<HatchToolCallRequest> serializer() {
            return HatchToolCallRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchToolCallRequest hatchToolCallRequest, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchToolCallRequest.label, c9iZ, 0);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(hatchToolCallRequest.summary, c07779iq, c9iZ, 1);
        c9j5.AAP(hatchToolCallRequest.detail, c07779iq, c9iZ, 2);
        c9j5.AAP(hatchToolCallRequest.metadata, JsonElementSerializer.A00, c9iZ, 3);
    }

    public final HatchToolCallRequest copy(String str, String str2, String str3, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        return new HatchToolCallRequest(str, str2, str3, jsonElement);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchToolCallRequest) {
                HatchToolCallRequest hatchToolCallRequest = (HatchToolCallRequest) obj;
                if (!C7384Etj.areEqual(this.label, hatchToolCallRequest.label) || !C7384Etj.areEqual(this.summary, hatchToolCallRequest.summary) || !C7384Etj.areEqual(this.detail, hatchToolCallRequest.detail) || !C7384Etj.areEqual(this.metadata, hatchToolCallRequest.metadata)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchToolCallRequest(int i, String str, String str2, String str3, JsonElement jsonElement, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(HatchToolCallRequest$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.summary = str2;
        this.detail = str3;
        this.metadata = jsonElement;
    }

    public static /* synthetic */ HatchToolCallRequest copy$default(HatchToolCallRequest hatchToolCallRequest, String str, String str2, String str3, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchToolCallRequest.label;
        }
        if ((i & 2) != 0) {
            str2 = hatchToolCallRequest.summary;
        }
        if ((i & 4) != 0) {
            str3 = hatchToolCallRequest.detail;
        }
        if ((i & 8) != 0) {
            jsonElement = hatchToolCallRequest.metadata;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchToolCallRequest(str, str2, str3, jsonElement);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.detail;
    }

    public final JsonElement component4() {
        return this.metadata;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getLabel() {
        return this.label;
    }

    public final JsonElement getMetadata() {
        return this.metadata;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return ((((AnonymousClass001.A0G(this.label) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.detail)) * 31) + C3cH.A02(this.metadata);
    }

    public String toString() {
        return super.toString();
    }

    public HatchToolCallRequest(String str, String str2, String str3, JsonElement jsonElement) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.summary = str2;
        this.detail = str3;
        this.metadata = jsonElement;
    }
}
