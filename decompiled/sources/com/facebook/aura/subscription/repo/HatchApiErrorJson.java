package com.facebook.aura.subscription.repo;

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
/* loaded from: classes4.dex */
public final class HatchApiErrorJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String detail;
    public final String title;
    public final String type;

    public final class Companion {
        public final C9hr<HatchApiErrorJson> serializer() {
            return HatchApiErrorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(HatchApiErrorJson hatchApiErrorJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchApiErrorJson.type != null) {
            c9j5.AAP(hatchApiErrorJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchApiErrorJson.title != null) {
            c9j5.AAP(hatchApiErrorJson.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || hatchApiErrorJson.detail != null) {
            c9j5.AAP(hatchApiErrorJson.detail, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchApiErrorJson) {
                HatchApiErrorJson hatchApiErrorJson = (HatchApiErrorJson) obj;
                if (!C7384Etj.areEqual(this.type, hatchApiErrorJson.type) || !C7384Etj.areEqual(this.title, hatchApiErrorJson.title) || !C7384Etj.areEqual(this.detail, hatchApiErrorJson.detail)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchApiErrorJson copy$default(HatchApiErrorJson hatchApiErrorJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchApiErrorJson.type;
        }
        if ((i & 2) != 0) {
            str2 = hatchApiErrorJson.title;
        }
        if ((i & 4) != 0) {
            str3 = hatchApiErrorJson.detail;
        }
        return new HatchApiErrorJson(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.detail;
    }

    public final HatchApiErrorJson copy(String str, String str2, String str3) {
        return new HatchApiErrorJson(str, str2, str3);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass005.A0H(this.detail);
    }

    public HatchApiErrorJson(String str, String str2, String str3) {
        this.type = str;
        this.title = str2;
        this.detail = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchApiErrorJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.detail = null;
        } else {
            this.detail = str3;
        }
    }

    public /* synthetic */ HatchApiErrorJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public HatchApiErrorJson() {
        this(null, null, null);
    }
}
