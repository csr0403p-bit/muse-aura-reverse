package com.meta.maps.display.routeline;

import X.AnonymousClass005;
import X.C60Q;
import X.C60R;
import X.C6xC;
import X.C7384Etj;
import com.meta.maps.display.SDKColor;

/* loaded from: classes3.dex */
public final class RouteSegmentStyle {
    public SDKColor casingColor;
    public SDKColor lineColor;
    public RouteLinePattern pattern;

    public RouteSegmentStyle(SDKColor sDKColor) {
        C7384Etj.A0Y(sDKColor, 0);
        this.lineColor = sDKColor;
        this.casingColor = null;
        this.pattern = RouteLinePattern.SOLID;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof RouteSegmentStyle) {
                RouteSegmentStyle routeSegmentStyle = (RouteSegmentStyle) obj;
                if (!C6xC.A00(this.lineColor, routeSegmentStyle.lineColor) || !C6xC.A00(this.casingColor, routeSegmentStyle.casingColor) || !C6xC.A00(this.pattern, routeSegmentStyle.pattern)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pattern, ((C60Q.A02(this.lineColor) * 31) + C60R.A01(this.casingColor)) * 31);
    }
}
