package com.meta.maps.core;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C60Q;
import X.C6xC;
import java.util.List;

/* loaded from: classes4.dex */
public final class GeoCoordinatesBoundingBox {
    public static final Companion Companion = new Companion();
    public final GeoCoordinates northEast;
    public final GeoCoordinates southWest;

    public static final native GeoCoordinatesBoundingBox fromCoordinates(List<GeoCoordinates> list);

    public final native GeoCoordinatesBoundingBox ensuringMinimumSize(double d);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GeoCoordinatesBoundingBox) {
                GeoCoordinatesBoundingBox geoCoordinatesBoundingBox = (GeoCoordinatesBoundingBox) obj;
                if (!C6xC.A00(this.northEast, geoCoordinatesBoundingBox.northEast) || !C6xC.A00(this.southWest, geoCoordinatesBoundingBox.southWest)) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public final GeoCoordinatesBoundingBox fromCoordinates(List<GeoCoordinates> list) {
            return GeoCoordinatesBoundingBox.fromCoordinates(list);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.southWest, C60Q.A02(this.northEast) * 31);
    }

    public GeoCoordinatesBoundingBox(GeoCoordinates geoCoordinates, GeoCoordinates geoCoordinates2) {
        AnonymousClass003.A0u(geoCoordinates, geoCoordinates2);
        this.northEast = geoCoordinates;
        this.southWest = geoCoordinates2;
    }
}
