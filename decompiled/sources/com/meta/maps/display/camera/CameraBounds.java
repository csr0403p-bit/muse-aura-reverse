package com.meta.maps.display.camera;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import com.meta.maps.core.GeoCoordinatesBoundingBox;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public final class CameraBounds {
    public GeoCoordinatesBoundingBox bbox;
    public CameraFraming framing;
    public Double heading;
    public SDKInsets padding;
    public Double pitch;

    public CameraBounds(GeoCoordinatesBoundingBox geoCoordinatesBoundingBox) {
        C7384Etj.A0Y(geoCoordinatesBoundingBox, 0);
        this.bbox = geoCoordinatesBoundingBox;
        this.pitch = null;
        this.heading = null;
        this.padding = new SDKInsets();
        this.framing = CameraFraming.VISIBLE_VIEWPORT;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CameraBounds) {
                CameraBounds cameraBounds = (CameraBounds) obj;
                if (!C6xC.A00(this.bbox, cameraBounds.bbox) || !C6xC.A00(this.pitch, cameraBounds.pitch) || !C6xC.A00(this.heading, cameraBounds.heading) || !C6xC.A00(this.padding, cameraBounds.padding) || !C6xC.A00(this.framing, cameraBounds.framing)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA02 = C60Q.A02(this.bbox) * 31;
        Double d = this.pitch;
        int iA0A = (iA02 + (d != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d.doubleValue())) : 0)) * 31;
        Double d2 = this.heading;
        return AnonymousClass005.A0G(this.framing, AnonymousClass005.A0F(this.padding, (iA0A + (d2 != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d2.doubleValue())) : 0)) * 31));
    }
}
