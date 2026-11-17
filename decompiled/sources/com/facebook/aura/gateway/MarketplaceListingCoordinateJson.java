package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceListingCoordinateJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Double latitude;
    public final Double longitude;

    public final class Companion {
        public final C9hr<MarketplaceListingCoordinateJson> serializer() {
            return MarketplaceListingCoordinateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceListingCoordinateJson.latitude != null) {
            c9j5.AAP(marketplaceListingCoordinateJson.latitude, C07799it.A00, c9iZ, 0);
        }
        if (zAfR || marketplaceListingCoordinateJson.longitude != null) {
            c9j5.AAP(marketplaceListingCoordinateJson.longitude, C07799it.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceListingCoordinateJson) {
                MarketplaceListingCoordinateJson marketplaceListingCoordinateJson = (MarketplaceListingCoordinateJson) obj;
                if (!C7384Etj.areEqual(this.latitude, marketplaceListingCoordinateJson.latitude) || !C7384Etj.areEqual(this.longitude, marketplaceListingCoordinateJson.longitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceListingCoordinateJson copy$default(MarketplaceListingCoordinateJson marketplaceListingCoordinateJson, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = marketplaceListingCoordinateJson.latitude;
        }
        if ((i & 2) != 0) {
            d2 = marketplaceListingCoordinateJson.longitude;
        }
        return new MarketplaceListingCoordinateJson(d, d2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final MarketplaceListingCoordinateJson copy(Double d, Double d2) {
        return new MarketplaceListingCoordinateJson(d, d2);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.latitude) * 31) + C3cH.A02(this.longitude);
    }

    public MarketplaceListingCoordinateJson(Double d, Double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceListingCoordinateJson(int i, Double d, Double d2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d;
        }
        if ((i & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d2;
        }
    }

    public /* synthetic */ MarketplaceListingCoordinateJson(Double d, Double d2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public MarketplaceListingCoordinateJson() {
        this(null, null);
    }
}
