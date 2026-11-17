package com.meta.maps.display;

import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import com.meta.maps.core.GeoCoordinates;
import java.util.List;

/* loaded from: classes3.dex */
public final class LineString {
    public List<GeoCoordinates> coordinates;

    public LineString(List<GeoCoordinates> list) {
        C7384Etj.A0Y(list, 0);
        this.coordinates = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LineString) {
            return C6xC.A00(this.coordinates, ((LineString) obj).coordinates);
        }
        return false;
    }

    public int hashCode() {
        return C60Q.A02(this.coordinates);
    }
}
