package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LocalMapElementJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String background_image_url;
    public final String category;
    public final LocalMapCoordinateJson coordinate;
    public final String id;
    public final String kind;
    public final String name;
    public final String photo_url;
    public final String place_id;
    public final String subtitle;
    public final String title;

    public final class Companion {
        public final C9hr<LocalMapElementJson> serializer() {
            return LocalMapElementJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(LocalMapElementJson localMapElementJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(localMapElementJson.kind)) {
            c9j5.AAV(localMapElementJson.kind, c9iZ, 0);
        }
        if (zAfR || !"".equals(localMapElementJson.id)) {
            c9j5.AAV(localMapElementJson.id, c9iZ, 1);
        }
        if (zAfR || localMapElementJson.coordinate != null) {
            c9j5.AAP(localMapElementJson.coordinate, LocalMapCoordinateJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || !"".equals(localMapElementJson.place_id)) {
            c9j5.AAV(localMapElementJson.place_id, c9iZ, 3);
        }
        if (zAfR || !"".equals(localMapElementJson.name)) {
            c9j5.AAV(localMapElementJson.name, c9iZ, 4);
        }
        if (zAfR || localMapElementJson.category != null) {
            c9j5.AAP(localMapElementJson.category, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || localMapElementJson.photo_url != null) {
            c9j5.AAP(localMapElementJson.photo_url, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || localMapElementJson.title != null) {
            c9j5.AAP(localMapElementJson.title, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || localMapElementJson.subtitle != null) {
            c9j5.AAP(localMapElementJson.subtitle, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || localMapElementJson.background_image_url != null) {
            c9j5.AAP(localMapElementJson.background_image_url, C07779iq.A01, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMapElementJson) {
                LocalMapElementJson localMapElementJson = (LocalMapElementJson) obj;
                if (!C7384Etj.areEqual(this.kind, localMapElementJson.kind) || !C7384Etj.areEqual(this.id, localMapElementJson.id) || !C7384Etj.areEqual(this.coordinate, localMapElementJson.coordinate) || !C7384Etj.areEqual(this.place_id, localMapElementJson.place_id) || !C7384Etj.areEqual(this.name, localMapElementJson.name) || !C7384Etj.areEqual(this.category, localMapElementJson.category) || !C7384Etj.areEqual(this.photo_url, localMapElementJson.photo_url) || !C7384Etj.areEqual(this.title, localMapElementJson.title) || !C7384Etj.areEqual(this.subtitle, localMapElementJson.subtitle) || !C7384Etj.areEqual(this.background_image_url, localMapElementJson.background_image_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalMapElementJson copy$default(LocalMapElementJson localMapElementJson, String str, String str2, LocalMapCoordinateJson localMapCoordinateJson, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localMapElementJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = localMapElementJson.id;
        }
        if ((i & 4) != 0) {
            localMapCoordinateJson = localMapElementJson.coordinate;
        }
        if ((i & 8) != 0) {
            str3 = localMapElementJson.place_id;
        }
        if ((i & 16) != 0) {
            str4 = localMapElementJson.name;
        }
        if ((i & 32) != 0) {
            str5 = localMapElementJson.category;
        }
        if ((i & 64) != 0) {
            str6 = localMapElementJson.photo_url;
        }
        if ((i & 128) != 0) {
            str7 = localMapElementJson.title;
        }
        if ((i & 256) != 0) {
            str8 = localMapElementJson.subtitle;
        }
        if ((i & 512) != 0) {
            str9 = localMapElementJson.background_image_url;
        }
        return localMapElementJson.copy(str, str2, localMapCoordinateJson, str3, str4, str5, str6, str7, str8, str9);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component10() {
        return this.background_image_url;
    }

    public final String component2() {
        return this.id;
    }

    public final LocalMapCoordinateJson component3() {
        return this.coordinate;
    }

    public final String component4() {
        return this.place_id;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.category;
    }

    public final String component7() {
        return this.photo_url;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.subtitle;
    }

    public final String getBackground_image_url() {
        return this.background_image_url;
    }

    public final String getCategory() {
        return this.category;
    }

    public final LocalMapCoordinateJson getCoordinate() {
        return this.coordinate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoto_url() {
        return this.photo_url;
    }

    public final String getPlace_id() {
        return this.place_id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.place_id, (AnonymousClass005.A0I(this.id, AnonymousClass001.A0G(this.kind)) + AnonymousClass006.A0D(this.coordinate)) * 31)) + AnonymousClass006.A0G(this.category)) * 31) + AnonymousClass006.A0G(this.photo_url)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass005.A0H(this.background_image_url);
    }

    public /* synthetic */ LocalMapElementJson(int i, String str, String str2, LocalMapCoordinateJson localMapCoordinateJson, String str3, String str4, String str5, String str6, String str7, String str8, String str9, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = "";
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.id = "";
        } else {
            this.id = str2;
        }
        if ((i & 4) == 0) {
            this.coordinate = null;
        } else {
            this.coordinate = localMapCoordinateJson;
        }
        if ((i & 8) == 0) {
            this.place_id = "";
        } else {
            this.place_id = str3;
        }
        if ((i & 16) == 0) {
            this.name = "";
        } else {
            this.name = str4;
        }
        if ((i & 32) == 0) {
            this.category = null;
        } else {
            this.category = str5;
        }
        if ((i & 64) == 0) {
            this.photo_url = null;
        } else {
            this.photo_url = str6;
        }
        if ((i & 128) == 0) {
            this.title = null;
        } else {
            this.title = str7;
        }
        if ((i & 256) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str8;
        }
        if ((i & 512) == 0) {
            this.background_image_url = null;
        } else {
            this.background_image_url = str9;
        }
    }

    public final LocalMapElementJson copy(String str, String str2, LocalMapCoordinateJson localMapCoordinateJson, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        return new LocalMapElementJson(str, str2, localMapCoordinateJson, str3, str4, str5, str6, str7, str8, str9);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LocalMapElementJson(String str, String str2, LocalMapCoordinateJson localMapCoordinateJson, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : localMapCoordinateJson, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9);
    }

    public LocalMapElementJson(String str, String str2, LocalMapCoordinateJson localMapCoordinateJson, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AnonymousClass005.A0y(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        this.kind = str;
        this.id = str2;
        this.coordinate = localMapCoordinateJson;
        this.place_id = str3;
        this.name = str4;
        this.category = str5;
        this.photo_url = str6;
        this.title = str7;
        this.subtitle = str8;
        this.background_image_url = str9;
    }

    public LocalMapElementJson() {
        this("", "", null, "", "", null, null, null, null, null);
    }
}
