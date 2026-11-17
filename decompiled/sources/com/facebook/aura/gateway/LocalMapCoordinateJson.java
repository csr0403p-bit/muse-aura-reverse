package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalMapCoordinateJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Double latitude;
    public final Double longitude;

    public final class Companion {
        public final C9hr<LocalMapCoordinateJson> serializer() {
            return LocalMapCoordinateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(LocalMapCoordinateJson localMapCoordinateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || localMapCoordinateJson.latitude != null) {
            c9j5.AAP(localMapCoordinateJson.latitude, C07799it.A00, c9iZ, 0);
        }
        if (zAfR || localMapCoordinateJson.longitude != null) {
            c9j5.AAP(localMapCoordinateJson.longitude, C07799it.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMapCoordinateJson) {
                LocalMapCoordinateJson localMapCoordinateJson = (LocalMapCoordinateJson) obj;
                if (!C7384Etj.areEqual(this.latitude, localMapCoordinateJson.latitude) || !C7384Etj.areEqual(this.longitude, localMapCoordinateJson.longitude)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalMapCoordinateJson copy$default(LocalMapCoordinateJson localMapCoordinateJson, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = localMapCoordinateJson.latitude;
        }
        if ((i & 2) != 0) {
            d2 = localMapCoordinateJson.longitude;
        }
        return new LocalMapCoordinateJson(d, d2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final LocalMapCoordinateJson copy(Double d, Double d2) {
        return new LocalMapCoordinateJson(d, d2);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.latitude) * 31) + C3cH.A02(this.longitude);
    }

    public LocalMapCoordinateJson(Double d, Double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LocalMapCoordinateJson(int i, Double d, Double d2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d;
        }
        if ((i & 2) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d2;
        }
    }

    public /* synthetic */ LocalMapCoordinateJson(Double d, Double d2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2);
    }

    public LocalMapCoordinateJson() {
        this(null, null);
    }
}
