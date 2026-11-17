package com.meta.maps.core;

import X.AnonymousClass006;
import X.C8j4;

/* loaded from: classes6.dex */
public final class Vec3d {
    public final double x;
    public final double y;
    public final double z;

    public final native Vec3d add(Vec3d vec3d);

    public final native double distanceTo(Vec3d vec3d);

    public final native double dot(Vec3d vec3d);

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Vec3d) {
                Vec3d vec3d = (Vec3d) obj;
                if (Double.compare(this.x, vec3d.x) != 0 || Double.compare(this.y, vec3d.y) != 0 || Double.compare(this.z, vec3d.z) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final native double length();

    public final native Vec3d scale(double d);

    public final native double sqhericalDistanceTo(Vec3d vec3d);

    public final native Vec3d subtract(Vec3d vec3d);

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.x);
        return C8j4.A0B(Double.doubleToLongBits(this.z), AnonymousClass006.A06(Double.doubleToLongBits(this.y), (217 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31));
    }

    public Vec3d(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }
}
