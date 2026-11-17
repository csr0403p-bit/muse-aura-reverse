package com.meta.maps.display.routeline;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C60Q;
import X.C60R;
import X.C6xC;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.display.SDKColor;
import java.util.List;

/* loaded from: classes3.dex */
public final class RouteSegment {
    public String boardingLabel;
    public List<GeoCoordinates> geometry;
    public SDKColor lineBadgeColor;
    public SDKColor lineBadgeTextColor;
    public String lineShortName;
    public List<GeoCoordinates> stops;
    public RouteSegmentStyle style;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof RouteSegment) {
                RouteSegment routeSegment = (RouteSegment) obj;
                if (!C6xC.A00(this.geometry, routeSegment.geometry) || !C6xC.A00(this.style, routeSegment.style) || !C6xC.A00(this.stops, routeSegment.stops) || !C6xC.A00(this.boardingLabel, routeSegment.boardingLabel) || !C6xC.A00(this.lineShortName, routeSegment.lineShortName) || !C6xC.A00(this.lineBadgeColor, routeSegment.lineBadgeColor) || !C6xC.A00(this.lineBadgeTextColor, routeSegment.lineBadgeTextColor)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.stops, AnonymousClass005.A0F(this.style, C60Q.A02(this.geometry) * 31));
        String str = this.boardingLabel;
        int iHashCode = (iA0F + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.lineShortName;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C60R.A01(this.lineBadgeColor)) * 31;
        SDKColor sDKColor = this.lineBadgeTextColor;
        return iHashCode2 + (sDKColor != null ? sDKColor.hashCode() : 0);
    }

    public RouteSegment(List<GeoCoordinates> list, RouteSegmentStyle routeSegmentStyle) {
        AnonymousClass003.A0u(list, routeSegmentStyle);
        this.geometry = list;
        this.style = routeSegmentStyle;
        this.stops = C3cG.A0h();
        this.boardingLabel = null;
        this.lineShortName = null;
        this.lineBadgeColor = null;
        this.lineBadgeTextColor = null;
    }
}
