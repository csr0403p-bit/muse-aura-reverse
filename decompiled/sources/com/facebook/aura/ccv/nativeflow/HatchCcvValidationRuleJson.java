package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchCcvValidationRuleJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String error_message;
    public final String type;
    public final String value;

    public final class Companion {
        public final C9hr<HatchCcvValidationRuleJson> serializer() {
            return HatchCcvValidationRuleJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCcvValidationRuleJson hatchCcvValidationRuleJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCcvValidationRuleJson.type != null) {
            c9j5.AAP(hatchCcvValidationRuleJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCcvValidationRuleJson.value != null) {
            c9j5.AAP(hatchCcvValidationRuleJson.value, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchCcvValidationRuleJson.error_message != null) {
            c9j5.AAP(hatchCcvValidationRuleJson.error_message, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvValidationRuleJson) {
                HatchCcvValidationRuleJson hatchCcvValidationRuleJson = (HatchCcvValidationRuleJson) obj;
                if (!C7384Etj.areEqual(this.type, hatchCcvValidationRuleJson.type) || !C7384Etj.areEqual(this.value, hatchCcvValidationRuleJson.value) || !C7384Etj.areEqual(this.error_message, hatchCcvValidationRuleJson.error_message)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCcvValidationRuleJson copy$default(HatchCcvValidationRuleJson hatchCcvValidationRuleJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCcvValidationRuleJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hatchCcvValidationRuleJson.value;
        }
        if ((i & 4) != 0) {
            str3 = hatchCcvValidationRuleJson.error_message;
        }
        return new HatchCcvValidationRuleJson(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.value;
    }

    public final String component3() {
        return this.error_message;
    }

    public final HatchCcvValidationRuleJson copy(String str, String str2, String str3) {
        return new HatchCcvValidationRuleJson(str, str2, str3);
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.value)) * 31) + AnonymousClass005.A0H(this.error_message);
    }

    public HatchCcvValidationRuleJson(String str, String str2, String str3) {
        this.type = str;
        this.value = str2;
        this.error_message = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCcvValidationRuleJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.error_message = null;
        } else {
            this.error_message = str3;
        }
    }

    public /* synthetic */ HatchCcvValidationRuleJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public HatchCcvValidationRuleJson() {
        this(null, null, null);
    }
}
