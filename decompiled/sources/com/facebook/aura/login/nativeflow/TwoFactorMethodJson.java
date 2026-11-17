package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
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
/* loaded from: classes2.dex */
public final class TwoFactorMethodJson extends C06G {
    public static final Companion Companion = new Companion();
    public final int code_length;
    public final String display_contact_point;
    public final String label;
    public final String method_id;
    public final String method_type;

    public final class Companion {
        public final C9hr<TwoFactorMethodJson> serializer() {
            return TwoFactorMethodJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(TwoFactorMethodJson twoFactorMethodJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(twoFactorMethodJson.method_id)) {
            c9j5.AAV(twoFactorMethodJson.method_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(twoFactorMethodJson.method_type)) {
            c9j5.AAV(twoFactorMethodJson.method_type, c9iZ, 1);
        }
        if (zAfR || !"".equals(twoFactorMethodJson.label)) {
            c9j5.AAV(twoFactorMethodJson.label, c9iZ, 2);
        }
        if (zAfR || twoFactorMethodJson.display_contact_point != null) {
            c9j5.AAP(twoFactorMethodJson.display_contact_point, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || twoFactorMethodJson.code_length != 0) {
            c9j5.AAK(c9iZ, 4, twoFactorMethodJson.code_length);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TwoFactorMethodJson) {
                TwoFactorMethodJson twoFactorMethodJson = (TwoFactorMethodJson) obj;
                if (!C7384Etj.areEqual(this.method_id, twoFactorMethodJson.method_id) || !C7384Etj.areEqual(this.method_type, twoFactorMethodJson.method_type) || !C7384Etj.areEqual(this.label, twoFactorMethodJson.label) || !C7384Etj.areEqual(this.display_contact_point, twoFactorMethodJson.display_contact_point) || this.code_length != twoFactorMethodJson.code_length) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TwoFactorMethodJson copy$default(TwoFactorMethodJson twoFactorMethodJson, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = twoFactorMethodJson.method_id;
        }
        if ((i2 & 2) != 0) {
            str2 = twoFactorMethodJson.method_type;
        }
        if ((i2 & 4) != 0) {
            str3 = twoFactorMethodJson.label;
        }
        if ((i2 & 8) != 0) {
            str4 = twoFactorMethodJson.display_contact_point;
        }
        if ((i2 & 16) != 0) {
            i = twoFactorMethodJson.code_length;
        }
        return twoFactorMethodJson.copy(str, str2, str3, str4, i);
    }

    public final String component1() {
        return this.method_id;
    }

    public final String component2() {
        return this.method_type;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.display_contact_point;
    }

    public final int component5() {
        return this.code_length;
    }

    public final int getCode_length() {
        return this.code_length;
    }

    public final String getDisplay_contact_point() {
        return this.display_contact_point;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMethod_id() {
        return this.method_id;
    }

    public final String getMethod_type() {
        return this.method_type;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.method_type, AnonymousClass001.A0G(this.method_id))) + AnonymousClass006.A0G(this.display_contact_point)) * 31) + this.code_length;
    }

    public TwoFactorMethodJson(String str, String str2, String str3, String str4, int i) {
        AnonymousClass005.A0x(str, str2, str3);
        this.method_id = str;
        this.method_type = str2;
        this.label = str3;
        this.display_contact_point = str4;
        this.code_length = i;
    }

    public final TwoFactorMethodJson copy(String str, String str2, String str3, String str4, int i) {
        AnonymousClass005.A0x(str, str2, str3);
        return new TwoFactorMethodJson(str, str2, str3, str4, i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TwoFactorMethodJson(String str, String str2, String str3, String str4, int i, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, AnonymousClass006.A0u(i2, str4), (i2 & 16) != 0 ? 0 : i);
    }

    public /* synthetic */ TwoFactorMethodJson(int i, String str, String str2, String str3, String str4, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.method_id = "";
        } else {
            this.method_id = str;
        }
        if ((i & 2) == 0) {
            this.method_type = "";
        } else {
            this.method_type = str2;
        }
        if ((i & 4) == 0) {
            this.label = "";
        } else {
            this.label = str3;
        }
        if ((i & 8) == 0) {
            this.display_contact_point = null;
        } else {
            this.display_contact_point = str4;
        }
        if ((i & 16) == 0) {
            this.code_length = 0;
        } else {
            this.code_length = i2;
        }
    }

    public TwoFactorMethodJson() {
        this("", "", "", null, 0);
    }
}
