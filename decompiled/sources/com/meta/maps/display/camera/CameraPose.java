package com.meta.maps.display.camera;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C60R;
import X.C6xC;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.SDKAlignment;
import com.meta.maps.display.SDKInsets;

/* loaded from: classes4.dex */
public final class CameraPose {
    public GeoCoordinates center = null;
    public SDKAlignment anchor = null;
    public Double zoomLevel = null;
    public Double pitch = null;
    public Double heading = null;
    public SDKInsets padding = new SDKInsets();
    public CameraFraming framing = CameraFraming.VISIBLE_VIEWPORT;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CameraPose) {
                CameraPose cameraPose = (CameraPose) obj;
                if (!C6xC.A00(this.center, cameraPose.center) || !C6xC.A00(this.anchor, cameraPose.anchor) || !C6xC.A00(this.zoomLevel, cameraPose.zoomLevel) || !C6xC.A00(this.pitch, cameraPose.pitch) || !C6xC.A00(this.heading, cameraPose.heading) || !C6xC.A00(this.padding, cameraPose.padding) || !C6xC.A00(this.framing, cameraPose.framing)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA01 = (((217 + C60R.A01(this.center)) * 31) + C60R.A01(this.anchor)) * 31;
        Double d = this.zoomLevel;
        int iA0A = (iA01 + (d != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d.doubleValue())) : 0)) * 31;
        Double d2 = this.pitch;
        int iA0A2 = (iA0A + (d2 != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d2.doubleValue())) : 0)) * 31;
        Double d3 = this.heading;
        return AnonymousClass005.A0G(this.framing, AnonymousClass005.A0F(this.padding, (iA0A2 + (d3 != null ? AnonymousClass002.A0A(Double.doubleToLongBits(d3.doubleValue())) : 0)) * 31));
    }
}
