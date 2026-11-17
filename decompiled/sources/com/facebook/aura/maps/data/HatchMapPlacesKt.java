package com.facebook.aura.maps.data;

import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9Fg;
import X.C9Tm;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapMarker;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class HatchMapPlacesKt {
    public static final HatchMapPlaces toHatchMapPlaces(HatchMapScene hatchMapScene) {
        C7384Etj.A0Y(hatchMapScene, 0);
        ArrayList arrayListA0t = C60Q.A0t(hatchMapScene.elements);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (HatchMapElement hatchMapElement : hatchMapScene.elements) {
            if (hatchMapElement instanceof HatchMapPlace) {
                String artifactId = hatchMapElement.getArtifactId();
                HatchMapPlace hatchMapPlace = (HatchMapPlace) hatchMapElement;
                String str = hatchMapPlace.name;
                HatchMapCoordinate coordinate = hatchMapPlace.getCoordinate();
                double d = coordinate.latitude;
                double d2 = coordinate.longitude;
                String str2 = hatchMapPlace.category;
                if (str2 == null) {
                    str2 = "";
                }
                arrayListA0t.add(new C9Tm(null, null, null, null, artifactId, str, "", str2, null, hatchMapPlace.photoUrl, "", null, null, d, d2));
                linkedHashMapA0j.put(hatchMapElement.getArtifactId(), hatchMapPlace.placeId);
            } else {
                if (!(hatchMapElement instanceof HatchMapMarker)) {
                    throw C3cG.A0q();
                }
                String artifactId2 = hatchMapElement.getArtifactId();
                HatchMapMarker hatchMapMarker = (HatchMapMarker) hatchMapElement;
                String str3 = hatchMapMarker.title;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = hatchMapMarker.subtitle;
                if (str4 == null) {
                    str4 = "";
                }
                HatchMapCoordinate coordinate2 = hatchMapMarker.getCoordinate();
                String str5 = str3;
                String str6 = str4;
                arrayListA0t.add(new C9Tm(null, null, null, null, artifactId2, str5, str6, "", null, hatchMapMarker.backgroundImageUrl, "", null, null, coordinate2.latitude, coordinate2.longitude));
            }
        }
        return new HatchMapPlaces(new C9Fg(arrayListA0t), linkedHashMapA0j, hatchMapScene.motivation);
    }
}
