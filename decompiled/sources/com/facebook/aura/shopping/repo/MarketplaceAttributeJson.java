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
public final class MarketplaceAttributeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;
    public final String value;

    public final class Companion {
        public final C9hr<MarketplaceAttributeJson> serializer() {
            return MarketplaceAttributeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MarketplaceAttributeJson marketplaceAttributeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceAttributeJson.name != null) {
            c9j5.AAP(marketplaceAttributeJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || marketplaceAttributeJson.value != null) {
            c9j5.AAP(marketplaceAttributeJson.value, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceAttributeJson) {
                MarketplaceAttributeJson marketplaceAttributeJson = (MarketplaceAttributeJson) obj;
                if (!C7384Etj.areEqual(this.name, marketplaceAttributeJson.name) || !C7384Etj.areEqual(this.value, marketplaceAttributeJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceAttributeJson copy$default(MarketplaceAttributeJson marketplaceAttributeJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceAttributeJson.name;
        }
        if ((i & 2) != 0) {
            str2 = marketplaceAttributeJson.value;
        }
        return new MarketplaceAttributeJson(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final MarketplaceAttributeJson copy(String str, String str2) {
        return new MarketplaceAttributeJson(str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.name) * 31) + AnonymousClass005.A0H(this.value);
    }

    public MarketplaceAttributeJson(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceAttributeJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = str2;
        }
    }

    public /* synthetic */ MarketplaceAttributeJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public MarketplaceAttributeJson() {
        this(null, null);
    }
}
