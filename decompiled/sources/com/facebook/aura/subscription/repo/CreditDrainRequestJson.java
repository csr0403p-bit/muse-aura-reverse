package com.facebook.aura.subscription.repo;

import X.AnonymousClass001;
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
public final class CreditDrainRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int percent_used;
    public final String quota_type;

    public final class Companion {
        public final C9hr<CreditDrainRequestJson> serializer() {
            return CreditDrainRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CreditDrainRequestJson(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.quota_type = str;
        this.percent_used = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(CreditDrainRequestJson creditDrainRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(creditDrainRequestJson.quota_type, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, creditDrainRequestJson.percent_used);
    }

    public final CreditDrainRequestJson copy(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return new CreditDrainRequestJson(str, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CreditDrainRequestJson) {
                CreditDrainRequestJson creditDrainRequestJson = (CreditDrainRequestJson) obj;
                if (!C7384Etj.areEqual(this.quota_type, creditDrainRequestJson.quota_type) || this.percent_used != creditDrainRequestJson.percent_used) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CreditDrainRequestJson copy$default(CreditDrainRequestJson creditDrainRequestJson, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = creditDrainRequestJson.quota_type;
        }
        if ((i2 & 2) != 0) {
            i = creditDrainRequestJson.percent_used;
        }
        C7384Etj.A0Y(str, 0);
        return new CreditDrainRequestJson(str, i);
    }

    public final String component1() {
        return this.quota_type;
    }

    public final int component2() {
        return this.percent_used;
    }

    public final int getPercent_used() {
        return this.percent_used;
    }

    public final String getQuota_type() {
        return this.quota_type;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.quota_type) + this.percent_used;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CreditDrainRequestJson(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(CreditDrainRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.quota_type = str;
        this.percent_used = i2;
    }
}
