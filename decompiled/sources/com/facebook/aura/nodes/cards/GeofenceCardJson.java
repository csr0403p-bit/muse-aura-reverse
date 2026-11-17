package com.facebook.aura.nodes.cards;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C3cJ;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class GeofenceCardJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String address;
    public final String label;
    public final Double latitude;
    public final Double longitude;
    public final Double radius_meters;
    public final String trigger;

    public final class Companion {
        public final C9hr<GeofenceCardJson> serializer() {
            return GeofenceCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GeofenceCardJson() {
        this("", "", null, null, null, null);
    }

    public static /* synthetic */ GeofenceCardJson copy$default(GeofenceCardJson geofenceCardJson, String str, String str2, Double d, Double d2, Double d3, String str3, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        Double d4 = d;
        Double d5 = d2;
        Double d6 = d3;
        String str6 = str3;
        if ((i & 1) != 0) {
            str4 = geofenceCardJson.label;
        }
        if ((i & 2) != 0) {
            str5 = geofenceCardJson.trigger;
        }
        if ((i & 4) != 0) {
            d4 = geofenceCardJson.radius_meters;
        }
        if ((i & 8) != 0) {
            d5 = geofenceCardJson.latitude;
        }
        if ((i & 16) != 0) {
            d6 = geofenceCardJson.longitude;
        }
        if ((i & 32) != 0) {
            str6 = geofenceCardJson.address;
        }
        AnonymousClass003.A0u(str4, str5);
        return new GeofenceCardJson(str4, str5, d4, d5, d6, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(GeofenceCardJson geofenceCardJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(geofenceCardJson.label)) {
            c9j5.AAV(geofenceCardJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(geofenceCardJson.trigger)) {
            c9j5.AAV(geofenceCardJson.trigger, c9iZ, 1);
        }
        if (zAfR || geofenceCardJson.radius_meters != null) {
            c9j5.AAP(geofenceCardJson.radius_meters, C07799it.A00, c9iZ, 2);
        }
        if (zAfR || geofenceCardJson.latitude != null) {
            c9j5.AAP(geofenceCardJson.latitude, C07799it.A00, c9iZ, 3);
        }
        if (zAfR || geofenceCardJson.longitude != null) {
            c9j5.AAP(geofenceCardJson.longitude, C07799it.A00, c9iZ, 4);
        }
        if (zAfR || geofenceCardJson.address != null) {
            c9j5.AAP(geofenceCardJson.address, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GeofenceCardJson) {
                GeofenceCardJson geofenceCardJson = (GeofenceCardJson) obj;
                if (!C7384Etj.areEqual(this.label, geofenceCardJson.label) || !C7384Etj.areEqual(this.trigger, geofenceCardJson.trigger) || !C7384Etj.areEqual(this.radius_meters, geofenceCardJson.radius_meters) || !C7384Etj.areEqual(this.latitude, geofenceCardJson.latitude) || !C7384Etj.areEqual(this.longitude, geofenceCardJson.longitude) || !C7384Etj.areEqual(this.address, geofenceCardJson.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.trigger;
    }

    public final Double component3() {
        return this.radius_meters;
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

    public final Double getRadius_meters() {
        return this.radius_meters;
    }

    public final String getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.trigger, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0D(this.radius_meters)) * 31) + AnonymousClass006.A0D(this.latitude)) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass005.A0H(this.address);
    }

    public final GeofenceCardData toDomain() {
        String strA0l;
        String strA0l2 = AnonymousClass002.A0l(this.label);
        if (strA0l2.length() <= 0) {
            return null;
        }
        String strA0J = C3cJ.A0J(this.trigger);
        Double d = this.radius_meters;
        Double d2 = this.latitude;
        Double d3 = this.longitude;
        String str = this.address;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        return new GeofenceCardData(strA0l2, strA0J, d, d2, d3, strA0l);
    }

    public final GeofenceCardJson copy(String str, String str2, Double d, Double d2, Double d3, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new GeofenceCardJson(str, str2, d, d2, d3, str3);
    }

    public String toString() {
        return super.toString();
    }

    public GeofenceCardJson(String str, String str2, Double d, Double d2, Double d3, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.trigger = str2;
        this.radius_meters = d;
        this.latitude = d2;
        this.longitude = d3;
        this.address = str3;
    }

    public /* synthetic */ GeofenceCardJson(String str, String str2, Double d, Double d2, Double d3, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : str3);
    }

    public /* synthetic */ GeofenceCardJson(int i, String str, String str2, Double d, Double d2, Double d3, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.trigger = "";
        } else {
            this.trigger = str2;
        }
        if ((i & 4) == 0) {
            this.radius_meters = null;
        } else {
            this.radius_meters = d;
        }
        if ((i & 8) == 0) {
            this.latitude = null;
        } else {
            this.latitude = d2;
        }
        if ((i & 16) == 0) {
            this.longitude = null;
        } else {
            this.longitude = d3;
        }
        if ((i & 32) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
    }
}
