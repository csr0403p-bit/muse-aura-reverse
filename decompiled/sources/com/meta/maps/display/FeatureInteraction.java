package com.meta.maps.display;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60Q;
import X.C60R;
import X.C6xC;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes4.dex */
public final class FeatureInteraction {
    public FeatureInteractionData feature;
    public GestureInteraction gesture;
    public GeoCoordinates position;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof FeatureInteraction) {
                FeatureInteraction featureInteraction = (FeatureInteraction) obj;
                if (!C6xC.A00(this.gesture, featureInteraction.gesture) || !C6xC.A00(this.position, featureInteraction.position) || !C6xC.A00(this.feature, featureInteraction.feature)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.position, C60Q.A02(this.gesture) * 31) + C60R.A01(this.feature);
    }

    public FeatureInteraction(GestureInteraction gestureInteraction, GeoCoordinates geoCoordinates) {
        AnonymousClass003.A0u(gestureInteraction, geoCoordinates);
        this.gesture = gestureInteraction;
        this.position = geoCoordinates;
        this.feature = null;
    }
}
