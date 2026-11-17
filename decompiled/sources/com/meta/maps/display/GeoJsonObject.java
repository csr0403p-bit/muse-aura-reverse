package com.meta.maps.display;

import X.C60Q;
import X.C60R;
import X.C6xC;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class GeoJsonObject {
    public GeoJsonFeature feature;
    public GeoJsonFeatureCollection featureCollection;
    public Geometry geometry;
    public GeoJsonObjectType type;

    public GeoJsonObject(GeoJsonObjectType geoJsonObjectType) {
        C7384Etj.A0Y(geoJsonObjectType, 0);
        this.type = geoJsonObjectType;
        this.geometry = null;
        this.feature = null;
        this.featureCollection = null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GeoJsonObject) {
                GeoJsonObject geoJsonObject = (GeoJsonObject) obj;
                if (!C6xC.A00(this.type, geoJsonObject.type) || !C6xC.A00(this.geometry, geoJsonObject.geometry) || !C6xC.A00(this.feature, geoJsonObject.feature) || !C6xC.A00(this.featureCollection, geoJsonObject.featureCollection)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA02 = ((((C60Q.A02(this.type) * 31) + C60R.A01(this.geometry)) * 31) + C60R.A01(this.feature)) * 31;
        GeoJsonFeatureCollection geoJsonFeatureCollection = this.featureCollection;
        return iA02 + (geoJsonFeatureCollection != null ? geoJsonFeatureCollection.hashCode() : 0);
    }
}
