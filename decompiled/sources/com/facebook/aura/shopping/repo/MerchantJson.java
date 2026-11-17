package com.facebook.aura.shopping.repo;

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
public final class MerchantJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String image_url;
    public final String name;

    public final class Companion {
        public final C9hr<MerchantJson> serializer() {
            return MerchantJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MerchantJson merchantJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || merchantJson.name != null) {
            c9j5.AAP(merchantJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || merchantJson.image_url != null) {
            c9j5.AAP(merchantJson.image_url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MerchantJson) {
                MerchantJson merchantJson = (MerchantJson) obj;
                if (!C7384Etj.areEqual(this.name, merchantJson.name) || !C7384Etj.areEqual(this.image_url, merchantJson.image_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MerchantJson copy$default(MerchantJson merchantJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantJson.name;
        }
        if ((i & 2) != 0) {
            str2 = merchantJson.image_url;
        }
        return new MerchantJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.image_url;
    }

    public final MerchantJson copy(String str, String str2) {
        return new MerchantJson(str, str2);
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.image_url);
    }

    public MerchantJson(String str, String str2) {
        this.name = str;
        this.image_url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MerchantJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str2;
        }
    }

    public /* synthetic */ MerchantJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public MerchantJson() {
        this(null, null);
    }
}
