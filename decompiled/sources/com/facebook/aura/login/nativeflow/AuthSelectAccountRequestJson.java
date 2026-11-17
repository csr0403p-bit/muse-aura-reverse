package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
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

@Serializable
/* loaded from: classes2.dex */
public final class AuthSelectAccountRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String account_ref;
    public final String device_id;
    public final String selection_state;
    public final boolean supports_reactivation;
    public final String waterfall_id;

    public final class Companion {
        public final C9hr<AuthSelectAccountRequestJson> serializer() {
            return AuthSelectAccountRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_api_api(AuthSelectAccountRequestJson authSelectAccountRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(authSelectAccountRequestJson.selection_state, c9iZ, 0);
        c9j5.AAV(authSelectAccountRequestJson.account_ref, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !authSelectAccountRequestJson.supports_reactivation) {
            c9j5.AA7(c9iZ, 2, authSelectAccountRequestJson.supports_reactivation);
        }
        if (zAfR || authSelectAccountRequestJson.device_id != null) {
            c9j5.AAP(authSelectAccountRequestJson.device_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || authSelectAccountRequestJson.waterfall_id != null) {
            c9j5.AAP(authSelectAccountRequestJson.waterfall_id, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuthSelectAccountRequestJson) {
                AuthSelectAccountRequestJson authSelectAccountRequestJson = (AuthSelectAccountRequestJson) obj;
                if (!C7384Etj.areEqual(this.selection_state, authSelectAccountRequestJson.selection_state) || !C7384Etj.areEqual(this.account_ref, authSelectAccountRequestJson.account_ref) || this.supports_reactivation != authSelectAccountRequestJson.supports_reactivation || !C7384Etj.areEqual(this.device_id, authSelectAccountRequestJson.device_id) || !C7384Etj.areEqual(this.waterfall_id, authSelectAccountRequestJson.waterfall_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuthSelectAccountRequestJson copy$default(AuthSelectAccountRequestJson authSelectAccountRequestJson, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authSelectAccountRequestJson.selection_state;
        }
        if ((i & 2) != 0) {
            str2 = authSelectAccountRequestJson.account_ref;
        }
        if ((i & 4) != 0) {
            z = authSelectAccountRequestJson.supports_reactivation;
        }
        if ((i & 8) != 0) {
            str3 = authSelectAccountRequestJson.device_id;
        }
        if ((i & 16) != 0) {
            str4 = authSelectAccountRequestJson.waterfall_id;
        }
        return authSelectAccountRequestJson.copy(str, str2, z, str3, str4);
    }

    public final String component1() {
        return this.selection_state;
    }

    public final String component2() {
        return this.account_ref;
    }

    public final boolean component3() {
        return this.supports_reactivation;
    }

    public final String component4() {
        return this.device_id;
    }

    public final String component5() {
        return this.waterfall_id;
    }

    public final String getAccount_ref() {
        return this.account_ref;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final String getSelection_state() {
        return this.selection_state;
    }

    public final boolean getSupports_reactivation() {
        return this.supports_reactivation;
    }

    public final String getWaterfall_id() {
        return this.waterfall_id;
    }

    public int hashCode() {
        return ((C0KA.A01(AnonymousClass005.A0I(this.account_ref, AnonymousClass001.A0G(this.selection_state)), this.supports_reactivation) + AnonymousClass006.A0G(this.device_id)) * 31) + AnonymousClass005.A0H(this.waterfall_id);
    }

    public AuthSelectAccountRequestJson(String str, String str2, boolean z, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.selection_state = str;
        this.account_ref = str2;
        this.supports_reactivation = z;
        this.device_id = str3;
        this.waterfall_id = str4;
    }

    public final AuthSelectAccountRequestJson copy(String str, String str2, boolean z, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new AuthSelectAccountRequestJson(str, str2, z, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuthSelectAccountRequestJson(String str, String str2, boolean z, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ AuthSelectAccountRequestJson(int i, String str, String str2, boolean z, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuthSelectAccountRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.selection_state = str;
        this.account_ref = str2;
        this.supports_reactivation = (i & 4) == 0 ? true : z;
        if ((i & 8) == 0) {
            this.device_id = null;
        } else {
            this.device_id = str3;
        }
        if ((i & 16) == 0) {
            this.waterfall_id = null;
        } else {
            this.waterfall_id = str4;
        }
    }
}
