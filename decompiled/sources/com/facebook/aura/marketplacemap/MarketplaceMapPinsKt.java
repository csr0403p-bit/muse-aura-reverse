package com.facebook.aura.marketplacemap;

import X.AGH;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapMarker;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.scene.HatchMapMarkerSpreadKt;
import com.facebook.aura.model.MarketplaceMapListing;
import com.facebook.aura.model.MarketplaceMapWidgetData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class MarketplaceMapPinsKt {
    public static final double PIN_SPREAD_RADIUS_METERS = 500.0d;

    public static final MarketplaceMapPins toMapPins(MarketplaceMapWidgetData marketplaceMapWidgetData) {
        C7384Etj.A0Y(marketplaceMapWidgetData, 0);
        List<MarketplaceMapListing> list = marketplaceMapWidgetData.listings;
        ArrayList<MarketplaceMapListing> arrayListA0h = C3cG.A0h();
        for (MarketplaceMapListing marketplaceMapListing : list) {
            MarketplaceMapListing marketplaceMapListing2 = marketplaceMapListing;
            if (marketplaceMapListing2.coordinate != null && !marketplaceMapListing2.isUnavailable) {
                arrayListA0h.add(marketplaceMapListing);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (MarketplaceMapListing marketplaceMapListing3 : arrayListA0h) {
            HatchMapCoordinate hatchMapCoordinate = marketplaceMapListing3.coordinate;
            if (hatchMapCoordinate != null) {
                String str = marketplaceMapListing3.id;
                String str2 = marketplaceMapListing3.salePrice;
                if (str2 == null) {
                    str2 = marketplaceMapListing3.price;
                }
                if (str2 == null) {
                    str2 = marketplaceMapListing3.name;
                }
                arrayListA0h2.add(new HatchMapMarker(str, hatchMapCoordinate, str2, null, marketplaceMapListing3.imageUrl));
            }
        }
        List<HatchMapMarker> listSpreadCoincidentMarkers = HatchMapMarkerSpreadKt.spreadCoincidentMarkers(arrayListA0h2, 500.0d);
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(arrayListA0h));
        for (Object obj : arrayListA0h) {
            linkedHashMapA15.put(((MarketplaceMapListing) obj).id, obj);
        }
        HatchMapScene hatchMapScene = new HatchMapScene(listSpreadCoincidentMarkers, marketplaceMapWidgetData.motivation);
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (HatchMapMarker hatchMapMarker : listSpreadCoincidentMarkers) {
            Object obj2 = linkedHashMapA15.get(hatchMapMarker.getId());
            if (obj2 != null) {
                AnonymousClass002.A1J(hatchMapMarker.getArtifactId(), obj2, arrayListA0h3);
            }
        }
        return new MarketplaceMapPins(hatchMapScene, AGH.A06(arrayListA0h3));
    }
}
