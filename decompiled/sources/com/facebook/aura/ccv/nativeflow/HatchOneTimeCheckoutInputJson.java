package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchOneTimeCheckoutInputJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String otc_session_id;
    public final String otc_type;

    public final class Companion {
        public final C9hr<HatchOneTimeCheckoutInputJson> serializer() {
            return HatchOneTimeCheckoutInputJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchOneTimeCheckoutInputJson.otc_session_id, c9iZ, 0);
        c9j5.AAV(hatchOneTimeCheckoutInputJson.otc_type, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchOneTimeCheckoutInputJson) {
                HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson = (HatchOneTimeCheckoutInputJson) obj;
                if (!C7384Etj.areEqual(this.otc_session_id, hatchOneTimeCheckoutInputJson.otc_session_id) || !C7384Etj.areEqual(this.otc_type, hatchOneTimeCheckoutInputJson.otc_type)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchOneTimeCheckoutInputJson copy$default(HatchOneTimeCheckoutInputJson hatchOneTimeCheckoutInputJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchOneTimeCheckoutInputJson.otc_session_id;
        }
        if ((i & 2) != 0) {
            str2 = hatchOneTimeCheckoutInputJson.otc_type;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchOneTimeCheckoutInputJson(str, str2);
    }

    public final String component1() {
        return this.otc_session_id;
    }

    public final String component2() {
        return this.otc_type;
    }

    public final String getOtc_session_id() {
        return this.otc_session_id;
    }

    public final String getOtc_type() {
        return this.otc_type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.otc_type, AnonymousClass001.A0G(this.otc_session_id));
    }

    public HatchOneTimeCheckoutInputJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.otc_session_id = str;
        this.otc_type = str2;
    }

    public final HatchOneTimeCheckoutInputJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchOneTimeCheckoutInputJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchOneTimeCheckoutInputJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchOneTimeCheckoutInputJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.otc_session_id = str;
        this.otc_type = str2;
    }
}
