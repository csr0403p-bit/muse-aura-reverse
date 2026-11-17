package com.facebook.aura.ccv.nativeflow;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchAgeConfirmationScreenJson extends C06G {
    public final String age_confirmation_title;
    public final HatchCcvParamsJson ccv_params;
    public final String ccv_subtitle;
    public final List<String> linkable_account_types;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, HatchAgeConfirmationScreenJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<HatchAgeConfirmationScreenJson> serializer() {
            return HatchAgeConfirmationScreenJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchAgeConfirmationScreenJson() {
        this(C0881AGi.A00, null, null, null);
    }

    public final HatchAgeConfirmationScreenJson copy(List<String> list, String str, String str2, HatchCcvParamsJson hatchCcvParamsJson) {
        C7384Etj.A0Y(list, 0);
        return new HatchAgeConfirmationScreenJson(list, str, str2, hatchCcvParamsJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAgeConfirmationScreenJson) {
                HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson = (HatchAgeConfirmationScreenJson) obj;
                if (!C7384Etj.areEqual(this.linkable_account_types, hatchAgeConfirmationScreenJson.linkable_account_types) || !C7384Etj.areEqual(this.age_confirmation_title, hatchAgeConfirmationScreenJson.age_confirmation_title) || !C7384Etj.areEqual(this.ccv_subtitle, hatchAgeConfirmationScreenJson.ccv_subtitle) || !C7384Etj.areEqual(this.ccv_params, hatchAgeConfirmationScreenJson.ccv_params)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAgeConfirmationScreenJson copy$default(HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson, List list, String str, String str2, HatchCcvParamsJson hatchCcvParamsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchAgeConfirmationScreenJson.linkable_account_types;
        }
        if ((i & 2) != 0) {
            str = hatchAgeConfirmationScreenJson.age_confirmation_title;
        }
        if ((i & 4) != 0) {
            str2 = hatchAgeConfirmationScreenJson.ccv_subtitle;
        }
        if ((i & 8) != 0) {
            hatchCcvParamsJson = hatchAgeConfirmationScreenJson.ccv_params;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchAgeConfirmationScreenJson(list, str, str2, hatchCcvParamsJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchAgeConfirmationScreenJson hatchAgeConfirmationScreenJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(hatchAgeConfirmationScreenJson.linkable_account_types)) {
            c9j5.AAQ(hatchAgeConfirmationScreenJson.linkable_account_types, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || hatchAgeConfirmationScreenJson.age_confirmation_title != null) {
            c9j5.AAP(hatchAgeConfirmationScreenJson.age_confirmation_title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchAgeConfirmationScreenJson.ccv_subtitle != null) {
            c9j5.AAP(hatchAgeConfirmationScreenJson.ccv_subtitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAgeConfirmationScreenJson.ccv_params != null) {
            c9j5.AAP(hatchAgeConfirmationScreenJson.ccv_params, HatchCcvParamsJson$$serializer.INSTANCE, c9iZ, 3);
        }
    }

    public final List<String> component1() {
        return this.linkable_account_types;
    }

    public final String component2() {
        return this.age_confirmation_title;
    }

    public final String component3() {
        return this.ccv_subtitle;
    }

    public final HatchCcvParamsJson component4() {
        return this.ccv_params;
    }

    public final String getAge_confirmation_title() {
        return this.age_confirmation_title;
    }

    public final HatchCcvParamsJson getCcv_params() {
        return this.ccv_params;
    }

    public final String getCcv_subtitle() {
        return this.ccv_subtitle;
    }

    public final List<String> getLinkable_account_types() {
        return this.linkable_account_types;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0E(this.linkable_account_types) + AnonymousClass006.A0G(this.age_confirmation_title)) * 31) + AnonymousClass006.A0G(this.ccv_subtitle)) * 31) + C3cH.A02(this.ccv_params);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAgeConfirmationScreenJson(List<String> list, String str, String str2, HatchCcvParamsJson hatchCcvParamsJson) {
        C7384Etj.A0Y(list, 0);
        this.linkable_account_types = list;
        this.age_confirmation_title = str;
        this.ccv_subtitle = str2;
        this.ccv_params = hatchCcvParamsJson;
    }

    public /* synthetic */ HatchAgeConfirmationScreenJson(List list, String str, String str2, HatchCcvParamsJson hatchCcvParamsJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : hatchCcvParamsJson);
    }

    public /* synthetic */ HatchAgeConfirmationScreenJson(int i, List list, String str, String str2, HatchCcvParamsJson hatchCcvParamsJson, C2hx c2hx) {
        this.linkable_account_types = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.age_confirmation_title = null;
        } else {
            this.age_confirmation_title = str;
        }
        if ((i & 4) == 0) {
            this.ccv_subtitle = null;
        } else {
            this.ccv_subtitle = str2;
        }
        if ((i & 8) == 0) {
            this.ccv_params = null;
        } else {
            this.ccv_params = hatchCcvParamsJson;
        }
    }
}
