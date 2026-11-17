package com.meta.maps.display;

import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class GeoJsonFeatureCollection {
    public List<GeoJsonFeature> features;

    public GeoJsonFeatureCollection(List<GeoJsonFeature> list) {
        C7384Etj.A0Y(list, 0);
        this.features = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GeoJsonFeatureCollection) {
            return C6xC.A00(this.features, ((GeoJsonFeatureCollection) obj).features);
        }
        return false;
    }

    public int hashCode() {
        return C60Q.A02(this.features);
    }
}
