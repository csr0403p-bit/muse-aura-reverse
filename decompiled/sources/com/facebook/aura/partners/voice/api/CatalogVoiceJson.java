package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CatalogVoiceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String accent;
    public final String description;
    public final String gender;
    public final String id;
    public final boolean is_selected;
    public final String name;
    public final String source;
    public final String tone;

    public final class Companion {
        public final C9hr<CatalogVoiceJson> serializer() {
            return CatalogVoiceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(CatalogVoiceJson catalogVoiceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(catalogVoiceJson.id, c9iZ, 0);
        c9j5.AAV(catalogVoiceJson.name, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || catalogVoiceJson.description != null) {
            c9j5.AAP(catalogVoiceJson.description, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || catalogVoiceJson.gender != null) {
            c9j5.AAP(catalogVoiceJson.gender, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || catalogVoiceJson.accent != null) {
            c9j5.AAP(catalogVoiceJson.accent, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || catalogVoiceJson.tone != null) {
            c9j5.AAP(catalogVoiceJson.tone, C07779iq.A01, c9iZ, 5);
        }
        c9j5.AAV(catalogVoiceJson.source, c9iZ, 6);
        c9j5.AA7(c9iZ, 7, catalogVoiceJson.is_selected);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CatalogVoiceJson) {
                CatalogVoiceJson catalogVoiceJson = (CatalogVoiceJson) obj;
                if (!C7384Etj.areEqual(this.id, catalogVoiceJson.id) || !C7384Etj.areEqual(this.name, catalogVoiceJson.name) || !C7384Etj.areEqual(this.description, catalogVoiceJson.description) || !C7384Etj.areEqual(this.gender, catalogVoiceJson.gender) || !C7384Etj.areEqual(this.accent, catalogVoiceJson.accent) || !C7384Etj.areEqual(this.tone, catalogVoiceJson.tone) || !C7384Etj.areEqual(this.source, catalogVoiceJson.source) || this.is_selected != catalogVoiceJson.is_selected) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CatalogVoiceJson copy$default(CatalogVoiceJson catalogVoiceJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catalogVoiceJson.id;
        }
        if ((i & 2) != 0) {
            str2 = catalogVoiceJson.name;
        }
        if ((i & 4) != 0) {
            str3 = catalogVoiceJson.description;
        }
        if ((i & 8) != 0) {
            str4 = catalogVoiceJson.gender;
        }
        if ((i & 16) != 0) {
            str5 = catalogVoiceJson.accent;
        }
        if ((i & 32) != 0) {
            str6 = catalogVoiceJson.tone;
        }
        if ((i & 64) != 0) {
            str7 = catalogVoiceJson.source;
        }
        if ((i & 128) != 0) {
            z = catalogVoiceJson.is_selected;
        }
        return catalogVoiceJson.copy(str, str2, str3, str4, str5, str6, str7, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.gender;
    }

    public final String component5() {
        return this.accent;
    }

    public final String component6() {
        return this.tone;
    }

    public final String component7() {
        return this.source;
    }

    public final boolean component8() {
        return this.is_selected;
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTone() {
        return this.tone;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.source, (((((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.gender)) * 31) + AnonymousClass006.A0G(this.accent)) * 31) + AnonymousClass005.A0H(this.tone)) * 31), this.is_selected);
    }

    public final boolean is_selected() {
        return this.is_selected;
    }

    public CatalogVoiceJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str7, 6);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.gender = str4;
        this.accent = str5;
        this.tone = str6;
        this.source = str7;
        this.is_selected = z;
    }

    public final CatalogVoiceJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str7, 6);
        return new CatalogVoiceJson(str, str2, str3, str4, str5, str6, str7, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CatalogVoiceJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, str7, z);
    }

    public /* synthetic */ CatalogVoiceJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, C2hx c2hx) {
        if (195 != (i & 195)) {
            C9iI.A00(CatalogVoiceJson$$serializer.descriptor, i, 195);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.gender = null;
        } else {
            this.gender = str4;
        }
        if ((i & 16) == 0) {
            this.accent = null;
        } else {
            this.accent = str5;
        }
        if ((i & 32) == 0) {
            this.tone = null;
        } else {
            this.tone = str6;
        }
        this.source = str7;
        this.is_selected = z;
    }
}
