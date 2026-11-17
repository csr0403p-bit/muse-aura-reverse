package com.meta.maps.display;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C6xC;
import X.C8j4;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes6.dex */
public final class VisibleFeature {
    public GeoCoordinates coordinates;
    public String featureId;
    public String layerId;
    public double screenX;
    public double screenY;
    public String sourceId;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof VisibleFeature) {
                VisibleFeature visibleFeature = (VisibleFeature) obj;
                if (!C6xC.A00(this.featureId, visibleFeature.featureId) || !C6xC.A00(this.layerId, visibleFeature.layerId) || !C6xC.A00(this.sourceId, visibleFeature.sourceId) || !C6xC.A00(this.coordinates, visibleFeature.coordinates) || Double.compare(this.screenX, visibleFeature.screenX) != 0 || Double.compare(this.screenY, visibleFeature.screenY) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A0B(Double.doubleToLongBits(this.screenY), AnonymousClass006.A06(Double.doubleToLongBits(this.screenX), AnonymousClass005.A0F(this.coordinates, AnonymousClass005.A0I(this.sourceId, AnonymousClass005.A0I(this.layerId, (217 + this.featureId.hashCode()) * 31)))));
    }

    public VisibleFeature(String str, String str2, String str3, GeoCoordinates geoCoordinates, double d, double d2) {
        AnonymousClass005.A14(str, str2, str3, geoCoordinates);
        this.featureId = str;
        this.layerId = str2;
        this.sourceId = str3;
        this.coordinates = geoCoordinates;
        this.screenX = d;
        this.screenY = d2;
    }
}
