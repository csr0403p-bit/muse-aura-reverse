package com.meta.maps.display;

import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes3.dex */
public final class Point {
    public GeoCoordinates coordinates;

    public Point(GeoCoordinates geoCoordinates) {
        C7384Etj.A0Y(geoCoordinates, 0);
        this.coordinates = geoCoordinates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point) {
            return C6xC.A00(this.coordinates, ((Point) obj).coordinates);
        }
        return false;
    }

    public int hashCode() {
        return C60Q.A02(this.coordinates);
    }
}
