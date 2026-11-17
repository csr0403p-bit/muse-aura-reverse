package com.facebook.rsys.ai.gen;

import X.AnonymousClass001;
import X.BV8;
import X.C8923Ftf;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class GpsLocation {
    public static G50<GpsLocation> CONVERTER = C8923Ftf.A00(5);
    public static long sMcfTypeId;
    public final String latitude;
    public final String longitude;

    public class Builder {
        public String latitude;
        public String longitude;

        public GpsLocation build() {
            return new GpsLocation(this);
        }
    }

    public static native GpsLocation createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GpsLocation) {
                GpsLocation gpsLocation = (GpsLocation) obj;
                if (!this.latitude.equals(gpsLocation.latitude) || !this.longitude.equals(gpsLocation.longitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.longitude, BV8.A0B(this.latitude));
    }

    public String toString() {
        return FGI.A0h("GpsLocation{latitude=", this.latitude, ",longitude=", this.longitude, "}");
    }

    public GpsLocation(Builder builder) {
        builder.latitude.getClass();
        builder.longitude.getClass();
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
    }
}
