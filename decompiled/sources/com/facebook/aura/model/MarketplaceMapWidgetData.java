package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.C9hr;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable(with = MarketplaceMapWidgetDataSerializer.class)
/* loaded from: classes4.dex */
public final class MarketplaceMapWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final List<MarketplaceMapListing> listings;
    public final String motivation;

    public final class Companion {
        public final C9hr<MarketplaceMapWidgetData> serializer() {
            return MarketplaceMapWidgetDataSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MarketplaceMapWidgetData(List<MarketplaceMapListing> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.listings = list;
        this.motivation = str;
    }

    public final MarketplaceMapWidgetData copy(List<MarketplaceMapListing> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new MarketplaceMapWidgetData(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MarketplaceMapWidgetData) {
                MarketplaceMapWidgetData marketplaceMapWidgetData = (MarketplaceMapWidgetData) obj;
                if (!C7384Etj.areEqual(this.listings, marketplaceMapWidgetData.listings) || !C7384Etj.areEqual(this.motivation, marketplaceMapWidgetData.motivation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MarketplaceMapWidgetData copy$default(MarketplaceMapWidgetData marketplaceMapWidgetData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketplaceMapWidgetData.listings;
        }
        if ((i & 2) != 0) {
            str = marketplaceMapWidgetData.motivation;
        }
        C7384Etj.A0Y(list, 0);
        return new MarketplaceMapWidgetData(list, str);
    }

    public final List<MarketplaceMapListing> component1() {
        return this.listings;
    }

    public final String component2() {
        return this.motivation;
    }

    public final List<MarketplaceMapListing> getListings() {
        return this.listings;
    }

    public final String getMotivation() {
        return this.motivation;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.listings) + AnonymousClass006.A0G(this.motivation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MarketplaceMapWidgetData(List list, String str, int i, C06H c06h) {
        this(list, AnonymousClass006.A0s(i, str));
    }
}
