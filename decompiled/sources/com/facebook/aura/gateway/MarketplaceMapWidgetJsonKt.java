package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class MarketplaceMapWidgetJsonKt {
    public static final String MARKETPLACE_LISTING_KIND = "marketplace_listing";
    public static final int MARKETPLACE_LISTING_MAX_URL_LENGTH = 8192;
    public static final int MARKETPLACE_MAP_MAX_LISTINGS = 24;
    public static final int MARKETPLACE_MAP_SUPPORTED_SCHEMA_VERSION = 1;

    public static final MarketplaceMapDecodeResult toDomain(MarketplaceMapTypedDataJson marketplaceMapTypedDataJson) {
        String str;
        C7384Etj.A0Y(marketplaceMapTypedDataJson, 0);
        Integer num = marketplaceMapTypedDataJson.schema_version;
        if (num == null || num.intValue() != 1 || ((str = marketplaceMapTypedDataJson.kind) != null && !AnonymousClass000.A00(49).equals(str))) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = AbstractC0878AGe.A0a(marketplaceMapTypedDataJson.elements, 24).iterator();
        int i = 0;
        while (it.hasNext()) {
            MarketplaceMapListing listing = toListing((JsonElement) it.next());
            if (listing == null || !hashSet.add(listing.id)) {
                i++;
            } else {
                arrayListA0h.add(listing);
            }
        }
        return new MarketplaceMapDecodeResult(new MarketplaceMapWidgetData(AbstractC0878AGe.A0X(arrayListA0h), trimmedOrNull(marketplaceMapTypedDataJson.motivation)), i, marketplaceMapTypedDataJson.elements.size());
    }

    public static final String trimmedOrNull(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    public static final boolean isLiteralTrue(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || jsonPrimitive.A01()) {
            return false;
        }
        return AnonymousClass002.A1b(C9oY.A01(jsonPrimitive), true);
    }

    public static final MarketplaceMapListing toListing(JsonElement jsonElement) {
        Object objA0s;
        String strTrimmedOrNull;
        String strTrimmedOrNull2;
        String strTrimmedOrNull3;
        String webUrl;
        HatchMapCoordinate domain;
        String str = null;
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        try {
            objA0s = (MarketplaceListingJson) HatchJsonKt.HatchJson.A01(MarketplaceListingJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        MarketplaceListingJson marketplaceListingJson = (MarketplaceListingJson) objA0s;
        if (marketplaceListingJson == null || !MARKETPLACE_LISTING_KIND.equals(marketplaceListingJson.kind) || (strTrimmedOrNull = trimmedOrNull(marketplaceListingJson.id)) == null || (strTrimmedOrNull2 = trimmedOrNull(marketplaceListingJson.listing_id)) == null || (strTrimmedOrNull3 = trimmedOrNull(marketplaceListingJson.name)) == null || (webUrl = toWebUrl(marketplaceListingJson.url, true)) == null) {
            return null;
        }
        MarketplaceListingCoordinateJson marketplaceListingCoordinateJson = marketplaceListingJson.coordinate;
        if (marketplaceListingCoordinateJson == null) {
            domain = null;
        } else {
            domain = toDomain(marketplaceListingCoordinateJson);
            if (domain == null) {
                return null;
            }
        }
        String str2 = marketplaceListingJson.image_url;
        if (str2 != null) {
            String webUrl2 = toWebUrl(str2, false);
            if (webUrl2 == null) {
                return null;
            }
            str = webUrl2;
        }
        return new MarketplaceMapListing(strTrimmedOrNull, strTrimmedOrNull2, strTrimmedOrNull3, webUrl, domain, trimmedOrNull(marketplaceListingJson.price), trimmedOrNull(marketplaceListingJson.sale_price), str, isLiteralTrue(marketplaceListingJson.is_unavailable));
    }

    public static final String toWebUrl(String str, boolean z) {
        Object objA0s;
        String host;
        String strTrimmedOrNull = trimmedOrNull(str);
        if (strTrimmedOrNull == null || strTrimmedOrNull.length() > 8192) {
            strTrimmedOrNull = null;
        }
        if (strTrimmedOrNull != null) {
            try {
                objA0s = new URI(strTrimmedOrNull);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            URI uri = (URI) objA0s;
            if (uri != null) {
                String scheme = uri.getScheme();
                String strA0u = scheme != null ? AnonymousClass001.A0u(scheme) : null;
                if (("https".equals(strA0u) || (z && AuraDeeplinkHandlerActivity.HTTP.equals(strA0u))) && (host = uri.getHost()) != null && host.length() != 0 && uri.getRawUserInfo() == null) {
                    return strTrimmedOrNull;
                }
            }
        }
        return null;
    }

    public static final HatchMapCoordinate toDomain(MarketplaceListingCoordinateJson marketplaceListingCoordinateJson) {
        Double d = marketplaceListingCoordinateJson.latitude;
        if (d == null) {
            return null;
        }
        double dDoubleValue = d.doubleValue();
        Double d2 = marketplaceListingCoordinateJson.longitude;
        if (d2 == null) {
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        double dAbs = Math.abs(dDoubleValue);
        if (dAbs > Double.MAX_VALUE) {
            return null;
        }
        double dAbs2 = Math.abs(dDoubleValue2);
        if (dAbs2 > Double.MAX_VALUE || dAbs > 90.0d || dAbs2 > 180.0d) {
            return null;
        }
        return new HatchMapCoordinate(dDoubleValue, dDoubleValue2);
    }
}
