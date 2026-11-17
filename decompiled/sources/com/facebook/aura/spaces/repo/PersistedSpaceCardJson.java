package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07799it;
import X.C07839ix;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PersistedSpaceCardJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Double favorite_order;
    public final String icon;
    public final String id;
    public final String image_url;
    public final String image_version;
    public final Boolean is_pwa_compliant;
    public final boolean is_shared;
    public final String message;
    public final String shared_shortcode;
    public final String source_url;
    public final String space_id;
    public final String subtitle;
    public final String title;
    public final String type;
    public final Long updated_at_ms;

    public final class Companion {
        public final C9hr<PersistedSpaceCardJson> serializer() {
            return PersistedSpaceCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(PersistedSpaceCardJson persistedSpaceCardJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(persistedSpaceCardJson.id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || persistedSpaceCardJson.space_id != null) {
            c9j5.AAP(persistedSpaceCardJson.space_id, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAV(persistedSpaceCardJson.type, c9iZ, 2);
        c9j5.AAV(persistedSpaceCardJson.title, c9iZ, 3);
        if (zAfR || persistedSpaceCardJson.subtitle != null) {
            c9j5.AAP(persistedSpaceCardJson.subtitle, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || persistedSpaceCardJson.message != null) {
            c9j5.AAP(persistedSpaceCardJson.message, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || persistedSpaceCardJson.icon != null) {
            c9j5.AAP(persistedSpaceCardJson.icon, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || persistedSpaceCardJson.image_url != null) {
            c9j5.AAP(persistedSpaceCardJson.image_url, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || persistedSpaceCardJson.image_version != null) {
            c9j5.AAP(persistedSpaceCardJson.image_version, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || persistedSpaceCardJson.favorite_order != null) {
            c9j5.AAP(persistedSpaceCardJson.favorite_order, C07799it.A00, c9iZ, 9);
        }
        if (zAfR || persistedSpaceCardJson.source_url != null) {
            c9j5.AAP(persistedSpaceCardJson.source_url, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || persistedSpaceCardJson.updated_at_ms != null) {
            c9j5.AAP(persistedSpaceCardJson.updated_at_ms, C9j1.A00, c9iZ, 11);
        }
        if (zAfR || persistedSpaceCardJson.is_shared) {
            c9j5.AA7(c9iZ, 12, persistedSpaceCardJson.is_shared);
        }
        if (zAfR || persistedSpaceCardJson.shared_shortcode != null) {
            c9j5.AAP(persistedSpaceCardJson.shared_shortcode, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || persistedSpaceCardJson.is_pwa_compliant != null) {
            c9j5.AAP(persistedSpaceCardJson.is_pwa_compliant, C07839ix.A00, c9iZ, 14);
        }
    }

    public final PersistedSpaceCardJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, Long l, boolean z, String str11, Boolean bool) {
        AnonymousClass005.A11(str, str3, str4, 0);
        return new PersistedSpaceCardJson(str, str2, str3, str4, str5, str6, str7, str8, str9, d, str10, l, z, str11, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PersistedSpaceCardJson) {
                PersistedSpaceCardJson persistedSpaceCardJson = (PersistedSpaceCardJson) obj;
                if (!C7384Etj.areEqual(this.id, persistedSpaceCardJson.id) || !C7384Etj.areEqual(this.space_id, persistedSpaceCardJson.space_id) || !C7384Etj.areEqual(this.type, persistedSpaceCardJson.type) || !C7384Etj.areEqual(this.title, persistedSpaceCardJson.title) || !C7384Etj.areEqual(this.subtitle, persistedSpaceCardJson.subtitle) || !C7384Etj.areEqual(this.message, persistedSpaceCardJson.message) || !C7384Etj.areEqual(this.icon, persistedSpaceCardJson.icon) || !C7384Etj.areEqual(this.image_url, persistedSpaceCardJson.image_url) || !C7384Etj.areEqual(this.image_version, persistedSpaceCardJson.image_version) || !C7384Etj.areEqual(this.favorite_order, persistedSpaceCardJson.favorite_order) || !C7384Etj.areEqual(this.source_url, persistedSpaceCardJson.source_url) || !C7384Etj.areEqual(this.updated_at_ms, persistedSpaceCardJson.updated_at_ms) || this.is_shared != persistedSpaceCardJson.is_shared || !C7384Etj.areEqual(this.shared_shortcode, persistedSpaceCardJson.shared_shortcode) || !C7384Etj.areEqual(this.is_pwa_compliant, persistedSpaceCardJson.is_pwa_compliant)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PersistedSpaceCardJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, Long l, boolean z, String str11, Boolean bool, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : d, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : l, C3cG.A1K(i & 4096, z), (i & 8192) != 0 ? null : str11, (i & 16384) != 0 ? null : bool);
    }

    public static /* synthetic */ PersistedSpaceCardJson copy$default(PersistedSpaceCardJson persistedSpaceCardJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, Long l, boolean z, String str11, Boolean bool, int i, Object obj) {
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        Double d2 = d;
        String str19 = str10;
        Long l2 = l;
        boolean z2 = z;
        String str20 = str11;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            str = persistedSpaceCardJson.id;
        }
        if ((i & 2) != 0) {
            str2 = persistedSpaceCardJson.space_id;
        }
        if ((i & 4) != 0) {
            str12 = persistedSpaceCardJson.type;
        }
        if ((i & 8) != 0) {
            str13 = persistedSpaceCardJson.title;
        }
        if ((i & 16) != 0) {
            str14 = persistedSpaceCardJson.subtitle;
        }
        if ((i & 32) != 0) {
            str15 = persistedSpaceCardJson.message;
        }
        if ((i & 64) != 0) {
            str16 = persistedSpaceCardJson.icon;
        }
        if ((i & 128) != 0) {
            str17 = persistedSpaceCardJson.image_url;
        }
        if ((i & 256) != 0) {
            str18 = persistedSpaceCardJson.image_version;
        }
        if ((i & 512) != 0) {
            d2 = persistedSpaceCardJson.favorite_order;
        }
        if ((i & 1024) != 0) {
            str19 = persistedSpaceCardJson.source_url;
        }
        if ((i & 2048) != 0) {
            l2 = persistedSpaceCardJson.updated_at_ms;
        }
        if ((i & 4096) != 0) {
            z2 = persistedSpaceCardJson.is_shared;
        }
        if ((i & 8192) != 0) {
            str20 = persistedSpaceCardJson.shared_shortcode;
        }
        if ((i & 16384) != 0) {
            bool2 = persistedSpaceCardJson.is_pwa_compliant;
        }
        return persistedSpaceCardJson.copy(str, str2, str12, str13, str14, str15, str16, str17, str18, d2, str19, l2, z2, str20, bool2);
    }

    public final String component1() {
        return this.id;
    }

    public final Double component10() {
        return this.favorite_order;
    }

    public final String component11() {
        return this.source_url;
    }

    public final Long component12() {
        return this.updated_at_ms;
    }

    public final boolean component13() {
        return this.is_shared;
    }

    public final String component14() {
        return this.shared_shortcode;
    }

    public final Boolean component15() {
        return this.is_pwa_compliant;
    }

    public final String component2() {
        return this.space_id;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.message;
    }

    public final String component7() {
        return this.icon;
    }

    public final String component8() {
        return this.image_url;
    }

    public final String component9() {
        return this.image_version;
    }

    public final Double getFavorite_order() {
        return this.favorite_order;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getImage_version() {
        return this.image_version;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getShared_shortcode() {
        return this.shared_shortcode;
    }

    public final String getSource_url() {
        return this.source_url;
    }

    public final String getSpace_id() {
        return this.space_id;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getUpdated_at_ms() {
        return this.updated_at_ms;
    }

    public int hashCode() {
        return ((C0KA.A01((((((((((((((((AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.type, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.space_id)) * 31)) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass006.A0G(this.icon)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31) + AnonymousClass006.A0G(this.image_version)) * 31) + AnonymousClass006.A0D(this.favorite_order)) * 31) + AnonymousClass006.A0G(this.source_url)) * 31) + AnonymousClass006.A0D(this.updated_at_ms)) * 31, this.is_shared) + AnonymousClass006.A0G(this.shared_shortcode)) * 31) + C3cH.A02(this.is_pwa_compliant);
    }

    public final Boolean is_pwa_compliant() {
        return this.is_pwa_compliant;
    }

    public final boolean is_shared() {
        return this.is_shared;
    }

    public String toString() {
        return super.toString();
    }

    public PersistedSpaceCardJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, Long l, boolean z, String str11, Boolean bool) {
        AnonymousClass005.A11(str, str3, str4, 0);
        this.id = str;
        this.space_id = str2;
        this.type = str3;
        this.title = str4;
        this.subtitle = str5;
        this.message = str6;
        this.icon = str7;
        this.image_url = str8;
        this.image_version = str9;
        this.favorite_order = d;
        this.source_url = str10;
        this.updated_at_ms = l;
        this.is_shared = z;
        this.shared_shortcode = str11;
        this.is_pwa_compliant = bool;
    }

    public /* synthetic */ PersistedSpaceCardJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, String str10, Long l, boolean z, String str11, Boolean bool, C2hx c2hx) {
        boolean z2 = z;
        if (13 != (i & 13)) {
            C9iI.A00(PersistedSpaceCardJson$$serializer.descriptor, i, 13);
            throw F60.createAndThrow();
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.space_id = null;
        } else {
            this.space_id = str2;
        }
        this.type = str3;
        this.title = str4;
        if ((i & 16) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str5;
        }
        if ((i & 32) == 0) {
            this.message = null;
        } else {
            this.message = str6;
        }
        if ((i & 64) == 0) {
            this.icon = null;
        } else {
            this.icon = str7;
        }
        if ((i & 128) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str8;
        }
        if ((i & 256) == 0) {
            this.image_version = null;
        } else {
            this.image_version = str9;
        }
        if ((i & 512) == 0) {
            this.favorite_order = null;
        } else {
            this.favorite_order = d;
        }
        if ((i & 1024) == 0) {
            this.source_url = null;
        } else {
            this.source_url = str10;
        }
        if ((i & 2048) == 0) {
            this.updated_at_ms = null;
        } else {
            this.updated_at_ms = l;
        }
        this.is_shared = (i & 4096) == 0 ? false : z2;
        if ((i & 8192) == 0) {
            this.shared_shortcode = null;
        } else {
            this.shared_shortcode = str11;
        }
        if ((i & 16384) == 0) {
            this.is_pwa_compliant = null;
        } else {
            this.is_pwa_compliant = bool;
        }
    }
}
