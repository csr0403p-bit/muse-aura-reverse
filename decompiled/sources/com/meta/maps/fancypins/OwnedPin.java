package com.meta.maps.fancypins;

import X.AbstractC7608F5v;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes6.dex */
public final class OwnedPin {
    public static final Companion Companion = new Companion();
    public final Double altitude;
    public final String blueprintId;
    public final byte[] data;
    public final String id;
    public final double latitude;
    public final double longitude;
    public final int rank;

    public OwnedPin(String str, double d, double d2, Double d3, String str2, byte[] bArr, int i) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str2, bArr);
        this.id = str;
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.blueprintId = str2;
        this.data = bArr;
        this.rank = i;
    }

    public final class Companion {
        public final OwnedPin from(FancyPin fancyPin) {
            C7384Etj.A0Y(fancyPin, 0);
            String str = fancyPin.id;
            GeoCoordinates geoCoordinates = fancyPin.coordinates;
            return new OwnedPin(str, geoCoordinates.latitude, geoCoordinates.longitude, geoCoordinates.altitude, fancyPin.blueprintId, AbstractC7608F5v.A1a(fancyPin.data), fancyPin.rank);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final String getBlueprintId() {
        return this.blueprintId;
    }

    public final String getId() {
        return this.id;
    }

    public final FancyPin materialize() {
        return new FancyPin(this.id, new GeoCoordinates(this.latitude, this.longitude, this.altitude), this.blueprintId, AbstractC7608F5v.A1a(this.data), this.rank);
    }
}
