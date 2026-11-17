package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class HatchLinkingWebAuthResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String attempt_id;
    public final Long expires_at;
    public final String url;

    public final class Companion {
        public final C9hr<HatchLinkingWebAuthResponseJson> serializer() {
            return HatchLinkingWebAuthResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchLinkingWebAuthResponseJson hatchLinkingWebAuthResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchLinkingWebAuthResponseJson.url != null) {
            c9j5.AAP(hatchLinkingWebAuthResponseJson.url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchLinkingWebAuthResponseJson.attempt_id != null) {
            c9j5.AAP(hatchLinkingWebAuthResponseJson.attempt_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchLinkingWebAuthResponseJson.expires_at != null) {
            c9j5.AAP(hatchLinkingWebAuthResponseJson.expires_at, C9j1.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkingWebAuthResponseJson) {
                HatchLinkingWebAuthResponseJson hatchLinkingWebAuthResponseJson = (HatchLinkingWebAuthResponseJson) obj;
                if (!C7384Etj.areEqual(this.url, hatchLinkingWebAuthResponseJson.url) || !C7384Etj.areEqual(this.attempt_id, hatchLinkingWebAuthResponseJson.attempt_id) || !C7384Etj.areEqual(this.expires_at, hatchLinkingWebAuthResponseJson.expires_at)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchLinkingWebAuthResponseJson copy$default(HatchLinkingWebAuthResponseJson hatchLinkingWebAuthResponseJson, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchLinkingWebAuthResponseJson.url;
        }
        if ((i & 2) != 0) {
            str2 = hatchLinkingWebAuthResponseJson.attempt_id;
        }
        if ((i & 4) != 0) {
            l = hatchLinkingWebAuthResponseJson.expires_at;
        }
        return new HatchLinkingWebAuthResponseJson(str, str2, l);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.attempt_id;
    }

    public final Long component3() {
        return this.expires_at;
    }

    public final HatchLinkingWebAuthResponseJson copy(String str, String str2, Long l) {
        return new HatchLinkingWebAuthResponseJson(str, str2, l);
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final Long getExpires_at() {
        return this.expires_at;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.url) * 31) + AnonymousClass006.A0G(this.attempt_id)) * 31) + C3cH.A02(this.expires_at);
    }

    public HatchLinkingWebAuthResponseJson(String str, String str2, Long l) {
        this.url = str;
        this.attempt_id = str2;
        this.expires_at = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkingWebAuthResponseJson(int i, String str, String str2, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.attempt_id = null;
        } else {
            this.attempt_id = str2;
        }
        if ((i & 4) == 0) {
            this.expires_at = null;
        } else {
            this.expires_at = l;
        }
    }

    public /* synthetic */ HatchLinkingWebAuthResponseJson(String str, String str2, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }

    public HatchLinkingWebAuthResponseJson() {
        this(null, null, null);
    }
}
