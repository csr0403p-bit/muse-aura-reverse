package com.meta.maps.display;

import X.AnonymousClass005;
import X.C60Q;
import X.C6xC;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes4.dex */
public final class SelectedFeature {
    public String contentIdentifier;
    public FeatureInteractionData feature;
    public GeoCoordinates selectionPosition;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof SelectedFeature) {
                SelectedFeature selectedFeature = (SelectedFeature) obj;
                if (!C6xC.A00(this.feature, selectedFeature.feature) || !C6xC.A00(this.contentIdentifier, selectedFeature.contentIdentifier) || !C6xC.A00(this.selectionPosition, selectedFeature.selectionPosition)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.selectionPosition, AnonymousClass005.A0I(this.contentIdentifier, C60Q.A02(this.feature) * 31));
    }

    public SelectedFeature(FeatureInteractionData featureInteractionData, String str, GeoCoordinates geoCoordinates) {
        AnonymousClass005.A0x(featureInteractionData, str, geoCoordinates);
        this.feature = featureInteractionData;
        this.contentIdentifier = str;
        this.selectionPosition = geoCoordinates;
    }
}
