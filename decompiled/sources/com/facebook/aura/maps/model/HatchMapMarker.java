package com.facebook.aura.maps.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.maps.model.HatchMapElement;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchMapMarker extends C06G implements HatchMapElement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String backgroundImageUrl;
    public final HatchMapCoordinate coordinate;
    public final String id;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<HatchMapMarker> serializer() {
            return HatchMapMarker$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(HatchMapMarker hatchMapMarker, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchMapMarker.getId(), c9iZ, 0);
        c9j5.AAQ(hatchMapMarker.getCoordinate(), HatchMapCoordinate$$serializer.INSTANCE, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchMapMarker.title != null) {
            c9j5.AAP(hatchMapMarker.title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchMapMarker.subtitle != null) {
            c9j5.AAP(hatchMapMarker.subtitle, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchMapMarker.backgroundImageUrl != null) {
            c9j5.AAP(hatchMapMarker.backgroundImageUrl, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapMarker) {
                HatchMapMarker hatchMapMarker = (HatchMapMarker) obj;
                if (!C7384Etj.areEqual(this.id, hatchMapMarker.id) || !C7384Etj.areEqual(this.coordinate, hatchMapMarker.coordinate) || !C7384Etj.areEqual(this.title, hatchMapMarker.title) || !C7384Etj.areEqual(this.subtitle, hatchMapMarker.subtitle) || !C7384Etj.areEqual(this.backgroundImageUrl, hatchMapMarker.backgroundImageUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchMapMarker(int i, String str, HatchMapCoordinate hatchMapCoordinate, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchMapMarker$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.coordinate = hatchMapCoordinate;
        if ((i & 4) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 8) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 16) == 0) {
            this.backgroundImageUrl = null;
        } else {
            this.backgroundImageUrl = str4;
        }
    }

    public static /* synthetic */ HatchMapMarker copy$default(HatchMapMarker hatchMapMarker, String str, HatchMapCoordinate hatchMapCoordinate, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchMapMarker.id;
        }
        if ((i & 2) != 0) {
            hatchMapCoordinate = hatchMapMarker.coordinate;
        }
        if ((i & 4) != 0) {
            str2 = hatchMapMarker.title;
        }
        if ((i & 8) != 0) {
            str3 = hatchMapMarker.subtitle;
        }
        if ((i & 16) != 0) {
            str4 = hatchMapMarker.backgroundImageUrl;
        }
        return hatchMapMarker.copy(str, hatchMapCoordinate, str2, str3, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final HatchMapCoordinate component2() {
        return this.coordinate;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.backgroundImageUrl;
    }

    public final String getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    @Override // com.facebook.aura.maps.model.HatchMapElement
    public HatchMapCoordinate getCoordinate() {
        return this.coordinate;
    }

    @Override // com.facebook.aura.maps.model.HatchMapElement
    public String getId() {
        return this.id;
    }

    @Override // com.facebook.aura.maps.model.HatchMapElement
    public String getKind() {
        return "marker";
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.coordinate, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.backgroundImageUrl);
    }

    public final HatchMapMarker copy(String str, HatchMapCoordinate hatchMapCoordinate, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, hatchMapCoordinate);
        return new HatchMapMarker(str, hatchMapCoordinate, str2, str3, str4);
    }

    @Override // com.facebook.aura.maps.model.HatchMapElement
    public /* bridge */ String getArtifactId() {
        return HatchMapElement.CC.$default$getArtifactId(this);
    }

    public String toString() {
        return super.toString();
    }

    public HatchMapMarker(String str, HatchMapCoordinate hatchMapCoordinate, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, hatchMapCoordinate);
        this.id = str;
        this.coordinate = hatchMapCoordinate;
        this.title = str2;
        this.subtitle = str3;
        this.backgroundImageUrl = str4;
    }

    public /* synthetic */ HatchMapMarker(String str, HatchMapCoordinate hatchMapCoordinate, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, hatchMapCoordinate, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
