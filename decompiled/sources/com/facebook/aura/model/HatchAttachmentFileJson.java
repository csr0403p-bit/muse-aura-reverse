package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.sharesheet.HatchShareLoggingKt;
import com.facebook.aura.shopping.model.ShoppingFeaturedProductJsonKt;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class HatchAttachmentFileJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentAudioJson audio;
    public final Long byte_len;
    public final JsonElement featured_products;
    public final String kind;
    public final String label;
    public final String mime;
    public final boolean missing;
    public final String path;
    public final HatchAttachmentVariantsJson variants;

    public final class Companion {
        public final C9hr<HatchAttachmentFileJson> serializer() {
            return HatchAttachmentFileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ HatchAttachmentFileJson copy$default(HatchAttachmentFileJson hatchAttachmentFileJson, String str, String str2, String str3, Long l, boolean z, HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str4, HatchAttachmentAudioJson hatchAttachmentAudioJson, JsonElement jsonElement, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Long l2 = l;
        boolean z2 = z;
        HatchAttachmentVariantsJson hatchAttachmentVariantsJson2 = hatchAttachmentVariantsJson;
        String str8 = str4;
        HatchAttachmentAudioJson hatchAttachmentAudioJson2 = hatchAttachmentAudioJson;
        JsonElement jsonElement2 = jsonElement;
        if ((i & 1) != 0) {
            str5 = hatchAttachmentFileJson.path;
        }
        if ((i & 2) != 0) {
            str6 = hatchAttachmentFileJson.label;
        }
        if ((i & 4) != 0) {
            str7 = hatchAttachmentFileJson.mime;
        }
        if ((i & 8) != 0) {
            l2 = hatchAttachmentFileJson.byte_len;
        }
        if ((i & 16) != 0) {
            z2 = hatchAttachmentFileJson.missing;
        }
        if ((i & 32) != 0) {
            hatchAttachmentVariantsJson2 = hatchAttachmentFileJson.variants;
        }
        if ((i & 64) != 0) {
            str8 = hatchAttachmentFileJson.kind;
        }
        if ((i & 128) != 0) {
            hatchAttachmentAudioJson2 = hatchAttachmentFileJson.audio;
        }
        if ((i & 256) != 0) {
            jsonElement2 = hatchAttachmentFileJson.featured_products;
        }
        AnonymousClass003.A0u(str5, str6);
        return new HatchAttachmentFileJson(str5, str6, str7, l2, z2, hatchAttachmentVariantsJson2, str8, hatchAttachmentAudioJson2, jsonElement2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchAttachmentFileJson hatchAttachmentFileJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(hatchAttachmentFileJson.path)) {
            c9j5.AAV(hatchAttachmentFileJson.path, c9iZ, 0);
        }
        if (zAfR || !"".equals(hatchAttachmentFileJson.label)) {
            c9j5.AAV(hatchAttachmentFileJson.label, c9iZ, 1);
        }
        if (zAfR || hatchAttachmentFileJson.mime != null) {
            c9j5.AAP(hatchAttachmentFileJson.mime, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hatchAttachmentFileJson.byte_len != null) {
            c9j5.AAP(hatchAttachmentFileJson.byte_len, C9j1.A00, c9iZ, 3);
        }
        if (zAfR || hatchAttachmentFileJson.missing) {
            c9j5.AA7(c9iZ, 4, hatchAttachmentFileJson.missing);
        }
        if (zAfR || hatchAttachmentFileJson.variants != null) {
            c9j5.AAP(hatchAttachmentFileJson.variants, HatchAttachmentVariantsJson$$serializer.INSTANCE, c9iZ, 5);
        }
        if (zAfR || hatchAttachmentFileJson.kind != null) {
            c9j5.AAP(hatchAttachmentFileJson.kind, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || hatchAttachmentFileJson.audio != null) {
            c9j5.AAP(hatchAttachmentFileJson.audio, HatchAttachmentAudioJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || hatchAttachmentFileJson.featured_products != null) {
            c9j5.AAP(hatchAttachmentFileJson.featured_products, JsonElementSerializer.A00, c9iZ, 8);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAttachmentFileJson) {
                HatchAttachmentFileJson hatchAttachmentFileJson = (HatchAttachmentFileJson) obj;
                if (!C7384Etj.areEqual(this.path, hatchAttachmentFileJson.path) || !C7384Etj.areEqual(this.label, hatchAttachmentFileJson.label) || !C7384Etj.areEqual(this.mime, hatchAttachmentFileJson.mime) || !C7384Etj.areEqual(this.byte_len, hatchAttachmentFileJson.byte_len) || this.missing != hatchAttachmentFileJson.missing || !C7384Etj.areEqual(this.variants, hatchAttachmentFileJson.variants) || !C7384Etj.areEqual(this.kind, hatchAttachmentFileJson.kind) || !C7384Etj.areEqual(this.audio, hatchAttachmentFileJson.audio) || !C7384Etj.areEqual(this.featured_products, hatchAttachmentFileJson.featured_products)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.mime;
    }

    public final Long component4() {
        return this.byte_len;
    }

    public final boolean component5() {
        return this.missing;
    }

    public final HatchAttachmentVariantsJson component6() {
        return this.variants;
    }

    public final String component7() {
        return this.kind;
    }

    public final HatchAttachmentAudioJson component8() {
        return this.audio;
    }

    public final JsonElement component9() {
        return this.featured_products;
    }

    public final HatchAttachmentAudioJson getAudio() {
        return this.audio;
    }

    public final Long getByte_len() {
        return this.byte_len;
    }

    public final JsonElement getFeatured_products() {
        return this.featured_products;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMime() {
        return this.mime;
    }

    public final boolean getMissing() {
        return this.missing;
    }

    public final String getPath() {
        return this.path;
    }

    public final HatchAttachmentVariantsJson getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return ((((((C0KA.A01((((AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.path)) + AnonymousClass006.A0G(this.mime)) * 31) + AnonymousClass006.A0D(this.byte_len)) * 31, this.missing) + AnonymousClass006.A0D(this.variants)) * 31) + AnonymousClass006.A0G(this.kind)) * 31) + AnonymousClass006.A0D(this.audio)) * 31) + C3cH.A02(this.featured_products);
    }

    public final HatchAttachmentFile toDomain() {
        String strA0l;
        String strA0l2;
        String str;
        String strA0l3 = AnonymousClass002.A0l(this.path);
        if (strA0l3.length() <= 0) {
            return null;
        }
        String strA0l4 = AnonymousClass002.A0l(this.label);
        if (strA0l4.length() <= 0) {
            strA0l4 = C7BY.A0R(strA0l3, strA0l3, '/');
        }
        String str2 = this.mime;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        Long l = this.byte_len;
        if (l == null || l.longValue() < 0) {
            l = null;
        }
        boolean z = this.missing;
        HatchAttachmentVariantsJson hatchAttachmentVariantsJson = this.variants;
        if (hatchAttachmentVariantsJson == null || (str = hatchAttachmentVariantsJson.original) == null || (strA0l2 = AnonymousClass002.A0l(str)) == null || strA0l2.length() <= 0) {
            strA0l2 = null;
        }
        HatchAttachmentKind hatchAttachmentKind = HatchShareLoggingKt.AVATAR_DANCE_CONTENT_TYPE.equals(this.kind) ? HatchAttachmentKind.AvatarDance : null;
        HatchAttachmentAudioJson hatchAttachmentAudioJson = this.audio;
        return new HatchAttachmentFile(strA0l3, strA0l4, strA0l, l, z, strA0l2, hatchAttachmentKind, hatchAttachmentAudioJson != null ? hatchAttachmentAudioJson.toDomain() : null, ShoppingFeaturedProductJsonKt.parseShoppingFeaturedProducts(this.featured_products));
    }

    public /* synthetic */ HatchAttachmentFileJson(int i, String str, String str2, String str3, Long l, boolean z, HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str4, HatchAttachmentAudioJson hatchAttachmentAudioJson, JsonElement jsonElement, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.mime = null;
        } else {
            this.mime = str3;
        }
        if ((i & 8) == 0) {
            this.byte_len = null;
        } else {
            this.byte_len = l;
        }
        if ((i & 16) == 0) {
            this.missing = false;
        } else {
            this.missing = z;
        }
        if ((i & 32) == 0) {
            this.variants = null;
        } else {
            this.variants = hatchAttachmentVariantsJson;
        }
        if ((i & 64) == 0) {
            this.kind = null;
        } else {
            this.kind = str4;
        }
        if ((i & 128) == 0) {
            this.audio = null;
        } else {
            this.audio = hatchAttachmentAudioJson;
        }
        if ((i & 256) == 0) {
            this.featured_products = null;
        } else {
            this.featured_products = jsonElement;
        }
    }

    public final HatchAttachmentFileJson copy(String str, String str2, String str3, Long l, boolean z, HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str4, HatchAttachmentAudioJson hatchAttachmentAudioJson, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, str2);
        return new HatchAttachmentFileJson(str, str2, str3, l, z, hatchAttachmentVariantsJson, str4, hatchAttachmentAudioJson, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAttachmentFileJson(String str, String str2, String str3, Long l, boolean z, HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str4, HatchAttachmentAudioJson hatchAttachmentAudioJson, JsonElement jsonElement) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.label = str2;
        this.mime = str3;
        this.byte_len = l;
        this.missing = z;
        this.variants = hatchAttachmentVariantsJson;
        this.kind = str4;
        this.audio = hatchAttachmentAudioJson;
        this.featured_products = jsonElement;
    }

    public /* synthetic */ HatchAttachmentFileJson(String str, String str2, String str3, Long l, boolean z, HatchAttachmentVariantsJson hatchAttachmentVariantsJson, String str4, HatchAttachmentAudioJson hatchAttachmentAudioJson, JsonElement jsonElement, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : hatchAttachmentVariantsJson, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : hatchAttachmentAudioJson, (i & 256) != 0 ? null : jsonElement);
    }

    public HatchAttachmentFileJson() {
        this("", "", null, null, false, null, null, null, null);
    }
}
