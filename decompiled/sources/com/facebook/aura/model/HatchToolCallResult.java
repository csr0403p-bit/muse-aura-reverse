package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
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
public final class HatchToolCallResult extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String detail;
    public final String error;
    public final String label;
    public final JsonElement metadata;
    public final boolean success;
    public final String summary;

    public final class Companion {
        public final C9hr<HatchToolCallResult> serializer() {
            return HatchToolCallResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchToolCallResult(boolean z, String str, String str2, String str3, JsonElement jsonElement, String str4) {
        C7384Etj.A0Y(str, 1);
        this.success = z;
        this.label = str;
        this.summary = str2;
        this.detail = str3;
        this.metadata = jsonElement;
        this.error = str4;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchToolCallResult hatchToolCallResult, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, hatchToolCallResult.success);
        c9j5.AAV(hatchToolCallResult.label, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(hatchToolCallResult.summary, c07779iq, c9iZ, 2);
        c9j5.AAP(hatchToolCallResult.detail, c07779iq, c9iZ, 3);
        c9j5.AAP(hatchToolCallResult.metadata, JsonElementSerializer.A00, c9iZ, 4);
        c9j5.AAP(hatchToolCallResult.error, c07779iq, c9iZ, 5);
    }

    public final HatchToolCallResult copy(boolean z, String str, String str2, String str3, JsonElement jsonElement, String str4) {
        C7384Etj.A0Y(str, 1);
        return new HatchToolCallResult(z, str, str2, str3, jsonElement, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchToolCallResult) {
                HatchToolCallResult hatchToolCallResult = (HatchToolCallResult) obj;
                if (this.success != hatchToolCallResult.success || !C7384Etj.areEqual(this.label, hatchToolCallResult.label) || !C7384Etj.areEqual(this.summary, hatchToolCallResult.summary) || !C7384Etj.areEqual(this.detail, hatchToolCallResult.detail) || !C7384Etj.areEqual(this.metadata, hatchToolCallResult.metadata) || !C7384Etj.areEqual(this.error, hatchToolCallResult.error)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchToolCallResult copy$default(HatchToolCallResult hatchToolCallResult, boolean z, String str, String str2, String str3, JsonElement jsonElement, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchToolCallResult.success;
        }
        if ((i & 2) != 0) {
            str = hatchToolCallResult.label;
        }
        if ((i & 4) != 0) {
            str2 = hatchToolCallResult.summary;
        }
        if ((i & 8) != 0) {
            str3 = hatchToolCallResult.detail;
        }
        if ((i & 16) != 0) {
            jsonElement = hatchToolCallResult.metadata;
        }
        if ((i & 32) != 0) {
            str4 = hatchToolCallResult.error;
        }
        return hatchToolCallResult.copy(z, str, str2, str3, jsonElement, str4);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.detail;
    }

    public final JsonElement component5() {
        return this.metadata;
    }

    public final String component6() {
        return this.error;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getError() {
        return this.error;
    }

    public final String getLabel() {
        return this.label;
    }

    public final JsonElement getMetadata() {
        return this.metadata;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.label, C0KA.A02(this.success)) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.detail)) * 31) + AnonymousClass006.A0D(this.metadata)) * 31) + AnonymousClass005.A0H(this.error);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchToolCallResult(int i, boolean z, String str, String str2, String str3, JsonElement jsonElement, String str4, C2hx c2hx) {
        if (63 != (i & 63)) {
            C9iI.A00(HatchToolCallResult$$serializer.descriptor, i, 63);
            throw F60.createAndThrow();
        }
        this.success = z;
        this.label = str;
        this.summary = str2;
        this.detail = str3;
        this.metadata = jsonElement;
        this.error = str4;
    }
}
