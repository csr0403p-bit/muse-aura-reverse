package com.facebook.aura.json;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchProblemJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String auth_state;
    public final String checkpoint_url;
    public final String detail;
    public final String error_code;
    public final Boolean has_muse_account;
    public final HatchPasswordCopyJson password_copy;
    public final boolean password_login_available;
    public final int status;
    public final String title;
    public final String type;

    public final class Companion {
        public final C9hr<HatchProblemJson> serializer() {
            return HatchProblemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(HatchProblemJson hatchProblemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hatchProblemJson.type)) {
            c9j5.AAV(hatchProblemJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(hatchProblemJson.title)) {
            c9j5.AAV(hatchProblemJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(hatchProblemJson.detail)) {
            c9j5.AAV(hatchProblemJson.detail, c9iZ, 2);
        }
        if (zAfR || hatchProblemJson.status != 0) {
            c9j5.AAK(c9iZ, 3, hatchProblemJson.status);
        }
        if (zAfR || hatchProblemJson.password_login_available) {
            c9j5.AA7(c9iZ, 4, hatchProblemJson.password_login_available);
        }
        if (zAfR || !"".equals(hatchProblemJson.auth_state)) {
            c9j5.AAV(hatchProblemJson.auth_state, c9iZ, 5);
        }
        if (zAfR || hatchProblemJson.has_muse_account != null) {
            c9j5.AAP(hatchProblemJson.has_muse_account, C07839ix.A00, c9iZ, 6);
        }
        if (zAfR || hatchProblemJson.password_copy != null) {
            c9j5.AAP(hatchProblemJson.password_copy, HatchPasswordCopyJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || !"".equals(hatchProblemJson.checkpoint_url)) {
            c9j5.AAV(hatchProblemJson.checkpoint_url, c9iZ, 8);
        }
        if (zAfR || !"".equals(hatchProblemJson.error_code)) {
            c9j5.AAV(hatchProblemJson.error_code, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchProblemJson) {
                HatchProblemJson hatchProblemJson = (HatchProblemJson) obj;
                if (!C7384Etj.areEqual(this.type, hatchProblemJson.type) || !C7384Etj.areEqual(this.title, hatchProblemJson.title) || !C7384Etj.areEqual(this.detail, hatchProblemJson.detail) || this.status != hatchProblemJson.status || this.password_login_available != hatchProblemJson.password_login_available || !C7384Etj.areEqual(this.auth_state, hatchProblemJson.auth_state) || !C7384Etj.areEqual(this.has_muse_account, hatchProblemJson.has_muse_account) || !C7384Etj.areEqual(this.password_copy, hatchProblemJson.password_copy) || !C7384Etj.areEqual(this.checkpoint_url, hatchProblemJson.checkpoint_url) || !C7384Etj.areEqual(this.error_code, hatchProblemJson.error_code)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchProblemJson copy$default(HatchProblemJson hatchProblemJson, String str, String str2, String str3, int i, boolean z, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchProblemJson.type;
        }
        if ((i2 & 2) != 0) {
            str2 = hatchProblemJson.title;
        }
        if ((i2 & 4) != 0) {
            str3 = hatchProblemJson.detail;
        }
        if ((i2 & 8) != 0) {
            i = hatchProblemJson.status;
        }
        if ((i2 & 16) != 0) {
            z = hatchProblemJson.password_login_available;
        }
        if ((i2 & 32) != 0) {
            str4 = hatchProblemJson.auth_state;
        }
        if ((i2 & 64) != 0) {
            bool = hatchProblemJson.has_muse_account;
        }
        if ((i2 & 128) != 0) {
            hatchPasswordCopyJson = hatchProblemJson.password_copy;
        }
        if ((i2 & 256) != 0) {
            str5 = hatchProblemJson.checkpoint_url;
        }
        if ((i2 & 512) != 0) {
            str6 = hatchProblemJson.error_code;
        }
        return hatchProblemJson.copy(str, str2, str3, i, z, str4, bool, hatchPasswordCopyJson, str5, str6);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.error_code;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.detail;
    }

    public final int component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.password_login_available;
    }

    public final String component6() {
        return this.auth_state;
    }

    public final Boolean component7() {
        return this.has_muse_account;
    }

    public final HatchPasswordCopyJson component8() {
        return this.password_copy;
    }

    public final String component9() {
        return this.checkpoint_url;
    }

    public final String getAuth_state() {
        return this.auth_state;
    }

    public final String getCheckpoint_url() {
        return this.checkpoint_url;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final Boolean getHas_muse_account() {
        return this.has_muse_account;
    }

    public final HatchPasswordCopyJson getPassword_copy() {
        return this.password_copy;
    }

    public final boolean getPassword_login_available() {
        return this.password_login_available;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.error_code, AnonymousClass005.A0I(this.checkpoint_url, (((AnonymousClass005.A0I(this.auth_state, C0KA.A01((AnonymousClass005.A0I(this.detail, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.type))) + this.status) * 31, this.password_login_available)) + AnonymousClass006.A0D(this.has_muse_account)) * 31) + C3cH.A02(this.password_copy)) * 31));
    }

    public HatchProblemJson(String str, String str2, String str3, int i, boolean z, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 5);
        AnonymousClass002.A1F(str5, 8, str6);
        this.type = str;
        this.title = str2;
        this.detail = str3;
        this.status = i;
        this.password_login_available = z;
        this.auth_state = str4;
        this.has_muse_account = bool;
        this.password_copy = hatchPasswordCopyJson;
        this.checkpoint_url = str5;
        this.error_code = str6;
    }

    public final HatchProblemJson copy(String str, String str2, String str3, int i, boolean z, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 5);
        AnonymousClass002.A1F(str5, 8, str6);
        return new HatchProblemJson(str, str2, str3, i, z, str4, bool, hatchPasswordCopyJson, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchProblemJson(String str, String str2, String str3, int i, boolean z, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, String str5, String str6, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i, AnonymousClass005.A1Q(i2, z), (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : hatchPasswordCopyJson, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6);
    }

    public /* synthetic */ HatchProblemJson(int i, String str, String str2, String str3, int i2, boolean z, String str4, Boolean bool, HatchPasswordCopyJson hatchPasswordCopyJson, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.detail = "";
        } else {
            this.detail = str3;
        }
        if ((i & 8) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
        if ((i & 16) == 0) {
            this.password_login_available = false;
        } else {
            this.password_login_available = z;
        }
        if ((i & 32) == 0) {
            this.auth_state = "";
        } else {
            this.auth_state = str4;
        }
        if ((i & 64) == 0) {
            this.has_muse_account = null;
        } else {
            this.has_muse_account = bool;
        }
        if ((i & 128) == 0) {
            this.password_copy = null;
        } else {
            this.password_copy = hatchPasswordCopyJson;
        }
        if ((i & 256) == 0) {
            this.checkpoint_url = "";
        } else {
            this.checkpoint_url = str5;
        }
        if ((i & 512) == 0) {
            this.error_code = "";
        } else {
            this.error_code = str6;
        }
    }

    public HatchProblemJson() {
        this("", "", "", 0, false, "", null, null, "", "");
    }
}
