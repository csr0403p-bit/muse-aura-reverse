package com.facebook.aura.shopping.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PdpLocation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Double latitude;
    public final String locationText;
    public final Double longitude;
    public final Double radiusKm;
    public final String staticMapImageUrl;

    public final class Companion {
        public final C9hr<PdpLocation> serializer() {
            return PdpLocation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpLocation) {
                PdpLocation pdpLocation = (PdpLocation) obj;
                if (!C7384Etj.areEqual(this.latitude, pdpLocation.latitude) || !C7384Etj.areEqual(this.longitude, pdpLocation.longitude) || !C7384Etj.areEqual(this.radiusKm, pdpLocation.radiusKm) || !C7384Etj.areEqual(this.locationText, pdpLocation.locationText) || !C7384Etj.areEqual(this.staticMapImageUrl, pdpLocation.staticMapImageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpLocation copy$default(PdpLocation pdpLocation, Double d, Double d2, Double d3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = pdpLocation.latitude;
        }
        if ((i & 2) != 0) {
            d2 = pdpLocation.longitude;
        }
        if ((i & 4) != 0) {
            d3 = pdpLocation.radiusKm;
        }
        if ((i & 8) != 0) {
            str = pdpLocation.locationText;
        }
        if ((i & 16) != 0) {
            str2 = pdpLocation.staticMapImageUrl;
        }
        return pdpLocation.copy(d, d2, d3, str, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpLocation pdpLocation, C9j5 c9j5, C9iZ c9iZ) {
        C07799it c07799it = C07799it.A00;
        c9j5.AAP(pdpLocation.latitude, c07799it, c9iZ, 0);
        c9j5.AAP(pdpLocation.longitude, c07799it, c9iZ, 1);
        c9j5.AAP(pdpLocation.radiusKm, c07799it, c9iZ, 2);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(pdpLocation.locationText, c07779iq, c9iZ, 3);
        c9j5.AAP(pdpLocation.staticMapImageUrl, c07779iq, c9iZ, 4);
    }

    public final Double component1() {
        return this.latitude;
    }

    public final Double component2() {
        return this.longitude;
    }

    public final Double component3() {
        return this.radiusKm;
    }

    public final String component4() {
        return this.locationText;
    }

    public final String component5() {
        return this.staticMapImageUrl;
    }

    public final PdpLocation copy(Double d, Double d2, Double d3, String str, String str2) {
        return new PdpLocation(d, d2, d3, str, str2);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final String getLocationText() {
        return this.locationText;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getRadiusKm() {
        return this.radiusKm;
    }

    public final String getStaticMapImageUrl() {
        return this.staticMapImageUrl;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.latitude) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass006.A0D(this.radiusKm)) * 31) + AnonymousClass006.A0G(this.locationText)) * 31) + AnonymousClass005.A0H(this.staticMapImageUrl);
    }

    public PdpLocation(Double d, Double d2, Double d3, String str, String str2) {
        this.latitude = d;
        this.longitude = d2;
        this.radiusKm = d3;
        this.locationText = str;
        this.staticMapImageUrl = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpLocation(int i, Double d, Double d2, Double d3, String str, String str2, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(PdpLocation$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.latitude = d;
        this.longitude = d2;
        this.radiusKm = d3;
        this.locationText = str;
        this.staticMapImageUrl = str2;
    }
}
