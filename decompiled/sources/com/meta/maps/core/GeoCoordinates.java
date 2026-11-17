package com.meta.maps.core;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C6xC;
import java.util.List;

/* loaded from: classes4.dex */
public final class GeoCoordinates {
    public static final Companion Companion = new Companion();
    public Double altitude;
    public double latitude;
    public double longitude;

    public static final native GeoCoordinates fromEcef(Vec3d vec3d);

    public static final native double length(List<GeoCoordinates> list);

    public final native double bearing(GeoCoordinates geoCoordinates);

    public final native GeoCoordinates closestPoint(List<GeoCoordinates> list);

    public final native GeoCoordinates coordinatesAt(double d, double d2);

    public final native double distance(GeoCoordinates geoCoordinates);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GeoCoordinates) {
                GeoCoordinates geoCoordinates = (GeoCoordinates) obj;
                if (Double.compare(this.latitude, geoCoordinates.latitude) != 0 || Double.compare(this.longitude, geoCoordinates.longitude) != 0 || !C6xC.A00(this.altitude, geoCoordinates.altitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public final native List<GeoCoordinates> pointsAlongSegment(GeoCoordinates geoCoordinates, double d);

    public final native Vec3d toEcef(double d);

    public final class Companion {
        public final GeoCoordinates fromEcef(Vec3d vec3d) {
            return GeoCoordinates.fromEcef(vec3d);
        }

        public final double length(List<GeoCoordinates> list) {
            return GeoCoordinates.length(list);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public int hashCode() {
        int iA06 = AnonymousClass006.A06(Double.doubleToLongBits(this.longitude), (217 + C3cG.A02(Double.doubleToLongBits(this.latitude))) * 31);
        Double d = this.altitude;
        return iA06 + (d != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d.doubleValue())) : 0);
    }

    public GeoCoordinates(double d, double d2, Double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
    }

    public GeoCoordinates(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = null;
    }
}
