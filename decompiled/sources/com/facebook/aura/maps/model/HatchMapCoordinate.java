package com.facebook.aura.maps.model;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchMapCoordinate extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final double latitude;
    public final double longitude;

    public final class Companion {
        public final C9hr<HatchMapCoordinate> serializer() {
            return HatchMapCoordinate$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(HatchMapCoordinate hatchMapCoordinate, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAD(c9iZ, hatchMapCoordinate.latitude, 0);
        c9j5.AAD(c9iZ, hatchMapCoordinate.longitude, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapCoordinate) {
                HatchMapCoordinate hatchMapCoordinate = (HatchMapCoordinate) obj;
                if (Double.compare(this.latitude, hatchMapCoordinate.latitude) != 0 || Double.compare(this.longitude, hatchMapCoordinate.longitude) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMapCoordinate copy$default(HatchMapCoordinate hatchMapCoordinate, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = hatchMapCoordinate.latitude;
        }
        if ((i & 2) != 0) {
            d2 = hatchMapCoordinate.longitude;
        }
        return new HatchMapCoordinate(d, d2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final HatchMapCoordinate copy(double d, double d2) {
        return new HatchMapCoordinate(d, d2);
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (AnonymousClass002.A0A(Double.doubleToLongBits(this.latitude)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.longitude));
    }

    public HatchMapCoordinate(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchMapCoordinate(int i, double d, double d2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchMapCoordinate$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.latitude = d;
        this.longitude = d2;
    }
}
