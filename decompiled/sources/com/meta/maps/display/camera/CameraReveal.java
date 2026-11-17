package com.meta.maps.display.camera;

import X.AnonymousClass005;
import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public final class CameraReveal {
    public GeoCoordinates coordinate;
    public CameraFraming framing;
    public SDKInsets padding;

    public CameraReveal(GeoCoordinates geoCoordinates) {
        C7384Etj.A0Y(geoCoordinates, 0);
        this.coordinate = geoCoordinates;
        this.padding = new SDKInsets();
        this.framing = CameraFraming.VISIBLE_VIEWPORT;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CameraReveal) {
                CameraReveal cameraReveal = (CameraReveal) obj;
                if (!C6xC.A00(this.coordinate, cameraReveal.coordinate) || !C6xC.A00(this.padding, cameraReveal.padding) || !C6xC.A00(this.framing, cameraReveal.framing)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.framing, AnonymousClass005.A0F(this.padding, C60Q.A02(this.coordinate) * 31));
    }
}
