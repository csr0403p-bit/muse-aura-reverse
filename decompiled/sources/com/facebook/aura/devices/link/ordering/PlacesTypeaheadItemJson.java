package com.facebook.aura.devices.link.ordering;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PlacesTypeaheadItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final PlacesTypeaheadAddressJson address;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<PlacesTypeaheadItemJson> serializer() {
            return PlacesTypeaheadItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PlacesTypeaheadItemJson(String str, String str2, PlacesTypeaheadAddressJson placesTypeaheadAddressJson) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.subtitle = str2;
        this.address = placesTypeaheadAddressJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_devices_link_ordering_ordering(PlacesTypeaheadItemJson placesTypeaheadItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(placesTypeaheadItemJson.title)) {
            c9j5.AAV(placesTypeaheadItemJson.title, c9iZ, 0);
        }
        if (zAfR || placesTypeaheadItemJson.subtitle != null) {
            c9j5.AAP(placesTypeaheadItemJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || placesTypeaheadItemJson.address != null) {
            c9j5.AAP(placesTypeaheadItemJson.address, PlacesTypeaheadAddressJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final PlacesTypeaheadItemJson copy(String str, String str2, PlacesTypeaheadAddressJson placesTypeaheadAddressJson) {
        C7384Etj.A0Y(str, 0);
        return new PlacesTypeaheadItemJson(str, str2, placesTypeaheadAddressJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesTypeaheadItemJson) {
                PlacesTypeaheadItemJson placesTypeaheadItemJson = (PlacesTypeaheadItemJson) obj;
                if (!C7384Etj.areEqual(this.title, placesTypeaheadItemJson.title) || !C7384Etj.areEqual(this.subtitle, placesTypeaheadItemJson.subtitle) || !C7384Etj.areEqual(this.address, placesTypeaheadItemJson.address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlacesTypeaheadItemJson copy$default(PlacesTypeaheadItemJson placesTypeaheadItemJson, String str, String str2, PlacesTypeaheadAddressJson placesTypeaheadAddressJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placesTypeaheadItemJson.title;
        }
        if ((i & 2) != 0) {
            str2 = placesTypeaheadItemJson.subtitle;
        }
        if ((i & 4) != 0) {
            placesTypeaheadAddressJson = placesTypeaheadItemJson.address;
        }
        return placesTypeaheadItemJson.copy(str, str2, placesTypeaheadAddressJson);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final PlacesTypeaheadAddressJson component3() {
        return this.address;
    }

    public final PlacesTypeaheadAddressJson getAddress() {
        return this.address;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + C3cH.A02(this.address);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PlacesTypeaheadItemJson(int i, String str, String str2, PlacesTypeaheadAddressJson placesTypeaheadAddressJson, C2hx c2hx) {
        this.title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = placesTypeaheadAddressJson;
        }
    }

    public /* synthetic */ PlacesTypeaheadItemJson(String str, String str2, PlacesTypeaheadAddressJson placesTypeaheadAddressJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : placesTypeaheadAddressJson);
    }

    public PlacesTypeaheadItemJson() {
        this("", null, null);
    }
}
