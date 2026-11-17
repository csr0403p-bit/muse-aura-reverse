package com.meta.maps.display;

import X.C60Q;
import X.C60R;
import X.C6xC;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class Geometry {
    public List<Geometry> geometryCollection;
    public LineString lineString;
    public MultiLineString multiLineString;
    public MultiPoint multiPoint;
    public MultiPolygon multiPolygon;
    public Point point;
    public Polygon polygon;
    public GeometryType type;

    public Geometry(GeometryType geometryType) {
        C7384Etj.A0Y(geometryType, 0);
        this.type = geometryType;
        this.point = null;
        this.lineString = null;
        this.polygon = null;
        this.multiPoint = null;
        this.multiLineString = null;
        this.multiPolygon = null;
        this.geometryCollection = null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Geometry) {
                Geometry geometry = (Geometry) obj;
                if (!C6xC.A00(this.type, geometry.type) || !C6xC.A00(this.point, geometry.point) || !C6xC.A00(this.lineString, geometry.lineString) || !C6xC.A00(this.polygon, geometry.polygon) || !C6xC.A00(this.multiPoint, geometry.multiPoint) || !C6xC.A00(this.multiLineString, geometry.multiLineString) || !C6xC.A00(this.multiPolygon, geometry.multiPolygon) || !C6xC.A00(this.geometryCollection, geometry.geometryCollection)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA02 = ((((((((((((C60Q.A02(this.type) * 31) + C60R.A01(this.point)) * 31) + C60R.A01(this.lineString)) * 31) + C60R.A01(this.polygon)) * 31) + C60R.A01(this.multiPoint)) * 31) + C60R.A01(this.multiLineString)) * 31) + C60R.A01(this.multiPolygon)) * 31;
        List<Geometry> list = this.geometryCollection;
        return iA02 + (list != null ? list.hashCode() : 0);
    }
}
