package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCheckoutRedirectUrlJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String http_method;
    public final Boolean is_for_three_ds;
    public final String url;

    public final class Companion {
        public final C9hr<HatchCheckoutRedirectUrlJson> serializer() {
            return HatchCheckoutRedirectUrlJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutRedirectUrlJson.url != null) {
            c9j5.AAP(hatchCheckoutRedirectUrlJson.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCheckoutRedirectUrlJson.http_method != null) {
            c9j5.AAP(hatchCheckoutRedirectUrlJson.http_method, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchCheckoutRedirectUrlJson.is_for_three_ds != null) {
            c9j5.AAP(hatchCheckoutRedirectUrlJson.is_for_three_ds, C07839ix.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutRedirectUrlJson) {
                HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson = (HatchCheckoutRedirectUrlJson) obj;
                if (!C7384Etj.areEqual(this.url, hatchCheckoutRedirectUrlJson.url) || !C7384Etj.areEqual(this.http_method, hatchCheckoutRedirectUrlJson.http_method) || !C7384Etj.areEqual(this.is_for_three_ds, hatchCheckoutRedirectUrlJson.is_for_three_ds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutRedirectUrlJson copy$default(HatchCheckoutRedirectUrlJson hatchCheckoutRedirectUrlJson, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutRedirectUrlJson.url;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutRedirectUrlJson.http_method;
        }
        if ((i & 4) != 0) {
            bool = hatchCheckoutRedirectUrlJson.is_for_three_ds;
        }
        return new HatchCheckoutRedirectUrlJson(str, str2, bool);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.http_method;
    }

    public final Boolean component3() {
        return this.is_for_three_ds;
    }

    public final HatchCheckoutRedirectUrlJson copy(String str, String str2, Boolean bool) {
        return new HatchCheckoutRedirectUrlJson(str, str2, bool);
    }

    public final String getHttp_method() {
        return this.http_method;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.url) * 31) + AnonymousClass006.A0G(this.http_method)) * 31) + C3cH.A02(this.is_for_three_ds);
    }

    public final Boolean is_for_three_ds() {
        return this.is_for_three_ds;
    }

    public HatchCheckoutRedirectUrlJson(String str, String str2, Boolean bool) {
        this.url = str;
        this.http_method = str2;
        this.is_for_three_ds = bool;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutRedirectUrlJson(int i, String str, String str2, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.http_method = null;
        } else {
            this.http_method = str2;
        }
        if ((i & 4) == 0) {
            this.is_for_three_ds = null;
        } else {
            this.is_for_three_ds = bool;
        }
    }

    public /* synthetic */ HatchCheckoutRedirectUrlJson(String str, String str2, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }

    public HatchCheckoutRedirectUrlJson() {
        this(null, null, null);
    }
}
