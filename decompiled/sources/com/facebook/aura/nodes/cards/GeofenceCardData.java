package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GeofenceCardData extends C06G implements HatchNodeCardData {
    public static final int $stable = 0;
    public final String address;
    public final String label;
    public final Double latitude;
    public final Double longitude;
    public final Double radiusMeters;
    public final String trigger;

    public static /* synthetic */ GeofenceCardData copy$default(GeofenceCardData geofenceCardData, String str, String str2, Double d, Double d2, Double d3, String str3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        Double d4 = d;
        Double d5 = d2;
        Double d6 = d3;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = geofenceCardData.label;
        }
        if ((i & 2) != 0) {
            str5 = geofenceCardData.trigger;
        }
        if ((i & 4) != 0) {
            d4 = geofenceCardData.radiusMeters;
        }
        if ((i & 8) != 0) {
            d5 = geofenceCardData.latitude;
        }
        if ((i & 16) != 0) {
            d6 = geofenceCardData.longitude;
        }
        if ((i & 32) != 0) {
            str6 = geofenceCardData.address;
        }
        AnonymousClass003.A0u(str4, str5);
        return new GeofenceCardData(str4, str5, d4, d5, d6, str6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GeofenceCardData) {
                GeofenceCardData geofenceCardData = (GeofenceCardData) obj;
                if (!C7384Etj.areEqual(this.label, geofenceCardData.label) || !C7384Etj.areEqual(this.trigger, geofenceCardData.trigger) || !C7384Etj.areEqual(this.radiusMeters, geofenceCardData.radiusMeters) || !C7384Etj.areEqual(this.latitude, geofenceCardData.latitude) || !C7384Etj.areEqual(this.longitude, geofenceCardData.longitude) || !C7384Etj.areEqual(this.address, geofenceCardData.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ GeofenceCardData(String str, String str2, Double d, Double d2, Double d3, String str3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.trigger;
    }

    public final Double component3() {
        return this.radiusMeters;
    }

    public final Double component4() {
        return this.latitude;
    }

    public final Double component5() {
        return this.longitude;
    }

    public final String component6() {
        return this.address;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getRadiusMeters() {
        return this.radiusMeters;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.trigger, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0D(this.radiusMeters)) * 31) + AnonymousClass006.A0D(this.latitude)) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass005.A0H(this.address);
    }

    public final GeofenceCardData copy(String str, String str2, Double d, Double d2, Double d3, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new GeofenceCardData(str, str2, d, d2, d3, str3);
    }

    public String toString() {
        return super.toString();
    }

    public GeofenceCardData(String str, String str2, Double d, Double d2, Double d3, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.trigger = str2;
        this.radiusMeters = d;
        this.latitude = d2;
        this.longitude = d3;
        this.address = str3;
    }
}
