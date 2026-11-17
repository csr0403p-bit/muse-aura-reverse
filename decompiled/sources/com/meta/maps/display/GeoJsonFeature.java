package com.meta.maps.display;

import X.C60R;
import X.C6xC;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class GeoJsonFeature {
    public Geometry geometry;
    public String id;
    public byte[] propertiesBlob;

    public GeoJsonFeature(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.geometry = null;
        this.propertiesBlob = bArr;
        this.id = null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GeoJsonFeature) {
                GeoJsonFeature geoJsonFeature = (GeoJsonFeature) obj;
                if (!C6xC.A00(this.geometry, geoJsonFeature.geometry) || !C6xC.A00(this.propertiesBlob, geoJsonFeature.propertiesBlob) || !C6xC.A00(this.id, geoJsonFeature.id)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA01 = (((217 + C60R.A01(this.geometry)) * 31) + this.propertiesBlob.hashCode()) * 31;
        String str = this.id;
        return iA01 + (str != null ? str.hashCode() : 0);
    }
}
