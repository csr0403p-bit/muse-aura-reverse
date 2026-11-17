package com.facebook.aura.maps.model;

import X.AnonymousClass001;
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
public final class HatchMapPlace extends C06G implements HatchMapElement {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String category;
    public final HatchMapCoordinate coordinate;
    public final String id;
    public final String name;
    public final String photoUrl;
    public final String placeId;

    public final class Companion {
        public final C9hr<HatchMapPlace> serializer() {
            return HatchMapPlace$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(HatchMapPlace hatchMapPlace, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchMapPlace.getId(), c9iZ, 0);
        c9j5.AAV(hatchMapPlace.placeId, c9iZ, 1);
        c9j5.AAV(hatchMapPlace.name, c9iZ, 2);
        c9j5.AAQ(hatchMapPlace.getCoordinate(), HatchMapCoordinate$$serializer.INSTANCE, c9iZ, 3);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchMapPlace.category != null) {
            c9j5.AAP(hatchMapPlace.category, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchMapPlace.photoUrl != null) {
            c9j5.AAP(hatchMapPlace.photoUrl, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapPlace) {
                HatchMapPlace hatchMapPlace = (HatchMapPlace) obj;
                if (!C7384Etj.areEqual(this.id, hatchMapPlace.id) || !C7384Etj.areEqual(this.placeId, hatchMapPlace.placeId) || !C7384Etj.areEqual(this.name, hatchMapPlace.name) || !C7384Etj.areEqual(this.coordinate, hatchMapPlace.coordinate) || !C7384Etj.areEqual(this.category, hatchMapPlace.category) || !C7384Etj.areEqual(this.photoUrl, hatchMapPlace.photoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchMapPlace(int i, String str, String str2, String str3, HatchMapCoordinate hatchMapCoordinate, String str4, String str5, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(HatchMapPlace$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.placeId = str2;
        this.name = str3;
        this.coordinate = hatchMapCoordinate;
        if ((i & 16) == 0) {
            this.category = null;
        } else {
            this.category = str4;
        }
        if ((i & 32) == 0) {
            this.photoUrl = null;
        } else {
            this.photoUrl = str5;
        }
    }

    public static /* synthetic */ HatchMapPlace copy$default(HatchMapPlace hatchMapPlace, String str, String str2, String str3, HatchMapCoordinate hatchMapCoordinate, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchMapPlace.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchMapPlace.placeId;
        }
        if ((i & 4) != 0) {
            str3 = hatchMapPlace.name;
        }
        if ((i & 8) != 0) {
            hatchMapCoordinate = hatchMapPlace.coordinate;
        }
        if ((i & 16) != 0) {
            str4 = hatchMapPlace.category;
        }
        if ((i & 32) != 0) {
            str5 = hatchMapPlace.photoUrl;
        }
        return hatchMapPlace.copy(str, str2, str3, hatchMapCoordinate, str4, str5);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.placeId;
    }

    public final String component3() {
        return this.name;
    }

    public final HatchMapCoordinate component4() {
        return this.coordinate;
    }

    public final String component5() {
        return this.category;
    }

    public final String component6() {
        return this.photoUrl;
    }

    public final String getCategory() {
        return this.category;
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
        return "rich_place";
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final String getPlaceId() {
        return this.placeId;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.coordinate, AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.placeId, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass005.A0H(this.photoUrl);
    }

    public final HatchMapPlace copy(String str, String str2, String str3, HatchMapCoordinate hatchMapCoordinate, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, hatchMapCoordinate);
        return new HatchMapPlace(str, str2, str3, hatchMapCoordinate, str4, str5);
    }

    @Override // com.facebook.aura.maps.model.HatchMapElement
    public /* bridge */ String getArtifactId() {
        return HatchMapElement.CC.$default$getArtifactId(this);
    }

    public String toString() {
        return super.toString();
    }

    public HatchMapPlace(String str, String str2, String str3, HatchMapCoordinate hatchMapCoordinate, String str4, String str5) {
        AnonymousClass005.A14(str, str2, str3, hatchMapCoordinate);
        this.id = str;
        this.placeId = str2;
        this.name = str3;
        this.coordinate = hatchMapCoordinate;
        this.category = str4;
        this.photoUrl = str5;
    }

    public /* synthetic */ HatchMapPlace(String str, String str2, String str3, HatchMapCoordinate hatchMapCoordinate, String str4, String str5, int i, C06H c06h) {
        this(str, str2, str3, hatchMapCoordinate, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
