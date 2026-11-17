package com.facebook.aura.marketplacemap;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.model.MarketplaceMapListing;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class MarketplaceMapPins {
    public static final int $stable = 0;
    public final Map<String, String> artifactIdsByListingId;
    public final Map<String, MarketplaceMapListing> listingsByArtifactId;
    public final HatchMapScene scene;

    public final String artifactId(String str) {
        C7384Etj.A0Y(str, 0);
        return C60O.A0p(str, this.artifactIdsByListingId);
    }

    public final boolean isPinned(String str) {
        C7384Etj.A0Y(str, 0);
        return this.artifactIdsByListingId.containsKey(str);
    }

    public final MarketplaceMapListing listing(String str) {
        C7384Etj.A0Y(str, 0);
        return this.listingsByArtifactId.get(str);
    }

    public final boolean getHasPins() {
        return !this.listingsByArtifactId.isEmpty();
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public MarketplaceMapPins(HatchMapScene hatchMapScene, Map<String, MarketplaceMapListing> map) {
        AnonymousClass003.A0u(hatchMapScene, map);
        this.scene = hatchMapScene;
        this.listingsByArtifactId = map;
        Set<Map.Entry<String, MarketplaceMapListing>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, MarketplaceMapListing>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            linkedHashMapA15.put(((MarketplaceMapListing) entryA0l.getValue()).id, entryA0l.getKey());
        }
        this.artifactIdsByListingId = linkedHashMapA15;
    }
}
