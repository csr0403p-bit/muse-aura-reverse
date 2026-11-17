package com.meta.maps.fancypins;

import X.AnonymousClass005;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes6.dex */
public final class FancyPinFrameState {
    public final GeoCoordinates coordinate;
    public final String id;
    public final int rank;
    public final String variantId;

    public FancyPinFrameState(String str, GeoCoordinates geoCoordinates, String str2, int i) {
        AnonymousClass005.A0x(str, geoCoordinates, str2);
        this.id = str;
        this.coordinate = geoCoordinates;
        this.variantId = str2;
        this.rank = i;
    }
}
