package com.facebook.aura.shopping.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.PdpLocation;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocationJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Double latitude;
    public final String location_text;
    public final Double longitude;
    public final Double radius_km;
    public final String static_map_image_url;

    public final class Companion {
        public final C9hr<LocationJson> serializer() {
            return LocationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(LocationJson locationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || locationJson.latitude != null) {
            c9j5.AAP(locationJson.latitude, C07799it.A00, c9iZ, 0);
        }
        if (zAfR || locationJson.longitude != null) {
            c9j5.AAP(locationJson.longitude, C07799it.A00, c9iZ, 1);
        }
        if (zAfR || locationJson.radius_km != null) {
            c9j5.AAP(locationJson.radius_km, C07799it.A00, c9iZ, 2);
        }
        if (zAfR || locationJson.location_text != null) {
            c9j5.AAP(locationJson.location_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || locationJson.static_map_image_url != null) {
            c9j5.AAP(locationJson.static_map_image_url, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationJson) {
                LocationJson locationJson = (LocationJson) obj;
                if (!C7384Etj.areEqual(this.latitude, locationJson.latitude) || !C7384Etj.areEqual(this.longitude, locationJson.longitude) || !C7384Etj.areEqual(this.radius_km, locationJson.radius_km) || !C7384Etj.areEqual(this.location_text, locationJson.location_text) || !C7384Etj.areEqual(this.static_map_image_url, locationJson.static_map_image_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocationJson copy$default(LocationJson locationJson, Double d, Double d2, Double d3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationJson.latitude;
        }
        if ((i & 2) != 0) {
            d2 = locationJson.longitude;
        }
        if ((i & 4) != 0) {
            d3 = locationJson.radius_km;
        }
        if ((i & 8) != 0) {
            str = locationJson.location_text;
        }
        if ((i & 16) != 0) {
            str2 = locationJson.static_map_image_url;
        }
        return locationJson.copy(d, d2, d3, str, str2);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final Double component3() {
        return this.radius_km;
    }

    public final String component4() {
        return this.location_text;
    }

    public final String component5() {
        return this.static_map_image_url;
    }

    public final LocationJson copy(Double d, Double d2, Double d3, String str, String str2) {
        return new LocationJson(d, d2, d3, str, str2);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final String getLocation_text() {
        return this.location_text;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getRadius_km() {
        return this.radius_km;
    }

    public final String getStatic_map_image_url() {
        return this.static_map_image_url;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.latitude) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass006.A0D(this.radius_km)) * 31) + AnonymousClass006.A0G(this.location_text)) * 31) + AnonymousClass005.A0H(this.static_map_image_url);
    }

    public final PdpLocation toDomain() {
        Double d = this.latitude;
        Double d2 = this.longitude;
        Double d3 = this.radius_km;
        String str = this.location_text;
        String str2 = null;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str3 = this.static_map_image_url;
        if (str3 != null && !C7BY.A0j(str3)) {
            str2 = str3;
        }
        return new PdpLocation(d, d2, d3, str, str2);
    }

    public /* synthetic */ LocationJson(int i, Double d, Double d2, Double d3, String str, String str2, C2hx c2hx) {
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
        if ((i & 4) == 0) {
            this.radius_km = null;
        } else {
            this.radius_km = d3;
        }
        if ((i & 8) == 0) {
            this.location_text = null;
        } else {
            this.location_text = str;
        }
        if ((i & 16) == 0) {
            this.static_map_image_url = null;
        } else {
            this.static_map_image_url = str2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public LocationJson(Double d, Double d2, Double d3, String str, String str2) {
        this.latitude = d;
        this.longitude = d2;
        this.radius_km = d3;
        this.location_text = str;
        this.static_map_image_url = str2;
    }

    public /* synthetic */ LocationJson(Double d, Double d2, Double d3, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public LocationJson() {
        this(null, null, null, null, null);
    }
}
