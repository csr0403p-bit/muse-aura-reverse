package com.facebook.aura.shopping.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceApproxLocationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonPrimitive latitude;
    public final JsonPrimitive longitude;
    public final JsonPrimitive radius_km;

    public final class Companion {
        public final C9hr<MarketplaceApproxLocationJson> serializer() {
            return MarketplaceApproxLocationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(MarketplaceApproxLocationJson marketplaceApproxLocationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceApproxLocationJson.latitude != null) {
            c9j5.AAP(marketplaceApproxLocationJson.latitude, JsonPrimitiveSerializer.A01, c9iZ, 0);
        }
        if (zAfR || marketplaceApproxLocationJson.longitude != null) {
            c9j5.AAP(marketplaceApproxLocationJson.longitude, JsonPrimitiveSerializer.A01, c9iZ, 1);
        }
        if (zAfR || marketplaceApproxLocationJson.radius_km != null) {
            c9j5.AAP(marketplaceApproxLocationJson.radius_km, JsonPrimitiveSerializer.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceApproxLocationJson) {
                MarketplaceApproxLocationJson marketplaceApproxLocationJson = (MarketplaceApproxLocationJson) obj;
                if (!C7384Etj.areEqual(this.latitude, marketplaceApproxLocationJson.latitude) || !C7384Etj.areEqual(this.longitude, marketplaceApproxLocationJson.longitude) || !C7384Etj.areEqual(this.radius_km, marketplaceApproxLocationJson.radius_km)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceApproxLocationJson copy$default(MarketplaceApproxLocationJson marketplaceApproxLocationJson, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonPrimitive = marketplaceApproxLocationJson.latitude;
        }
        if ((i & 2) != 0) {
            jsonPrimitive2 = marketplaceApproxLocationJson.longitude;
        }
        if ((i & 4) != 0) {
            jsonPrimitive3 = marketplaceApproxLocationJson.radius_km;
        }
        return new MarketplaceApproxLocationJson(jsonPrimitive, jsonPrimitive2, jsonPrimitive3);
    }

    public final JsonPrimitive component1() {
        return this.latitude;
    }

    public final JsonPrimitive component2() {
        return this.longitude;
    }

    public final JsonPrimitive component3() {
        return this.radius_km;
    }

    public final MarketplaceApproxLocationJson copy(JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3) {
        return new MarketplaceApproxLocationJson(jsonPrimitive, jsonPrimitive2, jsonPrimitive3);
    }

    public final JsonPrimitive getLatitude() {
        return this.latitude;
    }

    public final JsonPrimitive getLongitude() {
        return this.longitude;
    }

    public final JsonPrimitive getRadius_km() {
        return this.radius_km;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.latitude) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + C3cH.A02(this.radius_km);
    }

    public MarketplaceApproxLocationJson(JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3) {
        this.latitude = jsonPrimitive;
        this.longitude = jsonPrimitive2;
        this.radius_km = jsonPrimitive3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceApproxLocationJson(int i, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = jsonPrimitive;
        }
        if ((i & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = jsonPrimitive2;
        }
        if ((i & 4) == 0) {
            this.radius_km = null;
        } else {
            this.radius_km = jsonPrimitive3;
        }
    }

    public /* synthetic */ MarketplaceApproxLocationJson(JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, JsonPrimitive jsonPrimitive3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : jsonPrimitive, (i & 2) != 0 ? null : jsonPrimitive2, (i & 4) != 0 ? null : jsonPrimitive3);
    }

    public MarketplaceApproxLocationJson() {
        this(null, null, null);
    }
}
