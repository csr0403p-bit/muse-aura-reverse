package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapCoordinate$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class MarketplaceMapListing extends C06G {
    public final HatchMapCoordinate coordinate;
    public final String id;
    public final String imageUrl;
    public final boolean isUnavailable;
    public final String listingId;
    public final String name;
    public final String price;
    public final String salePrice;
    public final String url;
    public static final Companion Companion = new Companion();
    public static final int $stable = HatchMapCoordinate.$stable;

    public final class Companion {
        public final C9hr<MarketplaceMapListing> serializer() {
            return MarketplaceMapListing$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(MarketplaceMapListing marketplaceMapListing, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(marketplaceMapListing.id, c9iZ, 0);
        c9j5.AAV(marketplaceMapListing.listingId, c9iZ, 1);
        c9j5.AAV(marketplaceMapListing.name, c9iZ, 2);
        c9j5.AAV(marketplaceMapListing.url, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || marketplaceMapListing.coordinate != null) {
            c9j5.AAP(marketplaceMapListing.coordinate, HatchMapCoordinate$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || marketplaceMapListing.price != null) {
            c9j5.AAP(marketplaceMapListing.price, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || marketplaceMapListing.salePrice != null) {
            c9j5.AAP(marketplaceMapListing.salePrice, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || marketplaceMapListing.imageUrl != null) {
            c9j5.AAP(marketplaceMapListing.imageUrl, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || marketplaceMapListing.isUnavailable) {
            c9j5.AA7(c9iZ, 8, marketplaceMapListing.isUnavailable);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceMapListing) {
                MarketplaceMapListing marketplaceMapListing = (MarketplaceMapListing) obj;
                if (!C7384Etj.areEqual(this.id, marketplaceMapListing.id) || !C7384Etj.areEqual(this.listingId, marketplaceMapListing.listingId) || !C7384Etj.areEqual(this.name, marketplaceMapListing.name) || !C7384Etj.areEqual(this.url, marketplaceMapListing.url) || !C7384Etj.areEqual(this.coordinate, marketplaceMapListing.coordinate) || !C7384Etj.areEqual(this.price, marketplaceMapListing.price) || !C7384Etj.areEqual(this.salePrice, marketplaceMapListing.salePrice) || !C7384Etj.areEqual(this.imageUrl, marketplaceMapListing.imageUrl) || this.isUnavailable != marketplaceMapListing.isUnavailable) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ MarketplaceMapListing(int i, String str, String str2, String str3, String str4, HatchMapCoordinate hatchMapCoordinate, String str5, String str6, String str7, boolean z, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(MarketplaceMapListing$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.listingId = str2;
        this.name = str3;
        this.url = str4;
        if ((i & 16) == 0) {
            this.coordinate = null;
        } else {
            this.coordinate = hatchMapCoordinate;
        }
        if ((i & 32) == 0) {
            this.price = null;
        } else {
            this.price = str5;
        }
        if ((i & 64) == 0) {
            this.salePrice = null;
        } else {
            this.salePrice = str6;
        }
        if ((i & 128) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str7;
        }
        if ((i & 256) == 0) {
            this.isUnavailable = false;
        } else {
            this.isUnavailable = z;
        }
    }

    public static /* synthetic */ MarketplaceMapListing copy$default(MarketplaceMapListing marketplaceMapListing, String str, String str2, String str3, String str4, HatchMapCoordinate hatchMapCoordinate, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketplaceMapListing.id;
        }
        if ((i & 2) != 0) {
            str2 = marketplaceMapListing.listingId;
        }
        if ((i & 4) != 0) {
            str3 = marketplaceMapListing.name;
        }
        if ((i & 8) != 0) {
            str4 = marketplaceMapListing.url;
        }
        if ((i & 16) != 0) {
            hatchMapCoordinate = marketplaceMapListing.coordinate;
        }
        if ((i & 32) != 0) {
            str5 = marketplaceMapListing.price;
        }
        if ((i & 64) != 0) {
            str6 = marketplaceMapListing.salePrice;
        }
        if ((i & 128) != 0) {
            str7 = marketplaceMapListing.imageUrl;
        }
        if ((i & 256) != 0) {
            z = marketplaceMapListing.isUnavailable;
        }
        return marketplaceMapListing.copy(str, str2, str3, str4, hatchMapCoordinate, str5, str6, str7, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.listingId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.url;
    }

    public final HatchMapCoordinate component5() {
        return this.coordinate;
    }

    public final String component6() {
        return this.price;
    }

    public final String component7() {
        return this.salePrice;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final boolean component9() {
        return this.isUnavailable;
    }

    public final HatchMapCoordinate getCoordinate() {
        return this.coordinate;
    }

    public final String getDisplayPrice() {
        String str = this.salePrice;
        return str == null ? this.price : str;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getListingId() {
        return this.listingId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getSalePrice() {
        return this.salePrice;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00((((((((AnonymousClass005.A0I(this.url, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.listingId, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0D(this.coordinate)) * 31) + AnonymousClass006.A0G(this.price)) * 31) + AnonymousClass006.A0G(this.salePrice)) * 31) + AnonymousClass005.A0H(this.imageUrl)) * 31, this.isUnavailable);
    }

    public final boolean isUnavailable() {
        return this.isUnavailable;
    }

    public final MarketplaceMapListing copy(String str, String str2, String str3, String str4, HatchMapCoordinate hatchMapCoordinate, String str5, String str6, String str7, boolean z) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new MarketplaceMapListing(str, str2, str3, str4, hatchMapCoordinate, str5, str6, str7, z);
    }

    public String toString() {
        return super.toString();
    }

    public MarketplaceMapListing(String str, String str2, String str3, String str4, HatchMapCoordinate hatchMapCoordinate, String str5, String str6, String str7, boolean z) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.id = str;
        this.listingId = str2;
        this.name = str3;
        this.url = str4;
        this.coordinate = hatchMapCoordinate;
        this.price = str5;
        this.salePrice = str6;
        this.imageUrl = str7;
        this.isUnavailable = z;
    }

    public /* synthetic */ MarketplaceMapListing(String str, String str2, String str3, String str4, HatchMapCoordinate hatchMapCoordinate, String str5, String str6, String str7, boolean z, int i, C06H c06h) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : hatchMapCoordinate, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, C3cG.A1K(i & 256, z));
    }
}
