package com.meta.maps.fancypins;

import X.AnonymousClass005;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes6.dex */
public final class FancyPin {
    public final String blueprintId;
    public final GeoCoordinates coordinates;
    public final byte[] data;
    public final String id;
    public final int rank;

    public FancyPin(String str, GeoCoordinates geoCoordinates, String str2, byte[] bArr, int i) {
        AnonymousClass005.A14(str, geoCoordinates, str2, bArr);
        this.id = str;
        this.coordinates = geoCoordinates;
        this.blueprintId = str2;
        this.data = bArr;
        this.rank = i;
    }
}
