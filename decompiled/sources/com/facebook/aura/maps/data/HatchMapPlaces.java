package com.facebook.aura.maps.data;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C9Fg;
import X.C9Tm;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchMapPlaces extends C06G {
    public final C9Fg cardData;
    public final String motivation;
    public final Map<String, String> placeIdsByCardId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapPlaces) {
                HatchMapPlaces hatchMapPlaces = (HatchMapPlaces) obj;
                if (!C7384Etj.areEqual(this.cardData, hatchMapPlaces.cardData) || !C7384Etj.areEqual(this.placeIdsByCardId, hatchMapPlaces.placeIdsByCardId) || !C7384Etj.areEqual(this.motivation, hatchMapPlaces.motivation)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchMapPlaces copy$default(HatchMapPlaces hatchMapPlaces, C9Fg c9Fg, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c9Fg = hatchMapPlaces.cardData;
        }
        if ((i & 2) != 0) {
            map = hatchMapPlaces.placeIdsByCardId;
        }
        if ((i & 4) != 0) {
            str = hatchMapPlaces.motivation;
        }
        return hatchMapPlaces.copy(c9Fg, map, str);
    }

    public final C9Fg component1() {
        return this.cardData;
    }

    public final Map<String, String> component2() {
        return this.placeIdsByCardId;
    }

    public final String component3() {
        return this.motivation;
    }

    public final C9Fg getCardData() {
        return this.cardData;
    }

    public final String getMotivation() {
        return this.motivation;
    }

    public final Map<String, String> getPlaceIdsByCardId() {
        return this.placeIdsByCardId;
    }

    public final List<C9Tm> getPlaces() {
        return this.cardData.A00;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.placeIdsByCardId, AnonymousClass005.A0E(this.cardData)) + AnonymousClass006.A0G(this.motivation);
    }

    public HatchMapPlaces(C9Fg c9Fg, Map<String, String> map, String str) {
        AnonymousClass003.A0u(c9Fg, map);
        this.cardData = c9Fg;
        this.placeIdsByCardId = map;
        this.motivation = str;
    }

    public final HatchMapPlaces copy(C9Fg c9Fg, Map<String, String> map, String str) {
        AnonymousClass003.A0u(c9Fg, map);
        return new HatchMapPlaces(c9Fg, map, str);
    }

    public String toString() {
        return super.toString();
    }
}
