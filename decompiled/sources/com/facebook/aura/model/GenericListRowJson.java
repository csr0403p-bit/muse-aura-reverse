package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class GenericListRowJson extends C06G {
    public static final int $stable = 8;
    public final JsonObject data;
    public final List<String> icons;
    public final String image_url;
    public final String subtitle;
    public final String tertiary_title;
    public final String title;
    public final String type;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, GenericListRowJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<GenericListRowJson> serializer() {
            return GenericListRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public GenericListRowJson() {
        this("", null, null, null, C0881AGi.A00, GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC, null);
    }

    public final GenericListRowJson copy(String str, String str2, String str3, String str4, List<String> list, String str5, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(list, str5);
        return new GenericListRowJson(str, str2, str3, str4, list, str5, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListRowJson) {
                GenericListRowJson genericListRowJson = (GenericListRowJson) obj;
                if (!C7384Etj.areEqual(this.title, genericListRowJson.title) || !C7384Etj.areEqual(this.subtitle, genericListRowJson.subtitle) || !C7384Etj.areEqual(this.tertiary_title, genericListRowJson.tertiary_title) || !C7384Etj.areEqual(this.image_url, genericListRowJson.image_url) || !C7384Etj.areEqual(this.icons, genericListRowJson.icons) || !C7384Etj.areEqual(this.type, genericListRowJson.type) || !C7384Etj.areEqual(this.data, genericListRowJson.data)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericListRowJson copy$default(GenericListRowJson genericListRowJson, String str, String str2, String str3, String str4, List list, String str5, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genericListRowJson.title;
        }
        if ((i & 2) != 0) {
            str2 = genericListRowJson.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = genericListRowJson.tertiary_title;
        }
        if ((i & 8) != 0) {
            str4 = genericListRowJson.image_url;
        }
        if ((i & 16) != 0) {
            list = genericListRowJson.icons;
        }
        if ((i & 32) != 0) {
            str5 = genericListRowJson.type;
        }
        if ((i & 64) != 0) {
            jsonObject = genericListRowJson.data;
        }
        return genericListRowJson.copy(str, str2, str3, str4, list, str5, jsonObject);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListRowJson genericListRowJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(genericListRowJson.title)) {
            c9j5.AAV(genericListRowJson.title, c9iZ, 0);
        }
        if (zAfR || genericListRowJson.subtitle != null) {
            c9j5.AAP(genericListRowJson.subtitle, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || genericListRowJson.tertiary_title != null) {
            c9j5.AAP(genericListRowJson.tertiary_title, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || genericListRowJson.image_url != null) {
            c9j5.AAP(genericListRowJson.image_url, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(genericListRowJson.icons)) {
            c9j5.AAQ(genericListRowJson.icons, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC.equals(genericListRowJson.type)) {
            c9j5.AAV(genericListRowJson.type, c9iZ, 5);
        }
        if (zAfR || genericListRowJson.data != null) {
            c9j5.AAP(genericListRowJson.data, JsonObjectSerializer.A01, c9iZ, 6);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.tertiary_title;
    }

    public final String component4() {
        return this.image_url;
    }

    public final List<String> component5() {
        return this.icons;
    }

    public final String component6() {
        return this.type;
    }

    public final JsonObject component7() {
        return this.data;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final List<String> getIcons() {
        return this.icons;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTertiary_title() {
        return this.tertiary_title;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.type, AnonymousClass005.A0F(this.icons, (((((AnonymousClass001.A0G(this.title) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.tertiary_title)) * 31) + AnonymousClass006.A0G(this.image_url)) * 31)) + C3cH.A02(this.data);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0094 A[PHI: r13
  0x0094: PHI (r13v7 java.lang.String) = (r13v0 java.lang.String), (r13v8 java.lang.String) binds: [B:67:0x00e4, B:43:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae A[PHI: r13 r14
  0x00ae: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String), (r13v6 java.lang.String), (r13v6 java.lang.String) binds: [B:70:0x00e8, B:48:0x009e, B:50:0x00a6, B:52:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r14v1 com.facebook.aura.model.HatchAttachmentFile) = 
  (r14v0 com.facebook.aura.model.HatchAttachmentFile)
  (r14v5 com.facebook.aura.model.HatchAttachmentFile)
  (r14v5 com.facebook.aura.model.HatchAttachmentFile)
  (r14v5 com.facebook.aura.model.HatchAttachmentFile)
 binds: [B:70:0x00e8, B:48:0x009e, B:50:0x00a6, B:52:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1 A[PHI: r3 r13 r14
  0x00b1: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:54:0x00af, B:52:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r13v5 java.lang.String) = (r13v2 java.lang.String), (r13v6 java.lang.String) binds: [B:54:0x00af, B:52:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r14v4 com.facebook.aura.model.HatchAttachmentFile) = (r14v1 com.facebook.aura.model.HatchAttachmentFile), (r14v5 com.facebook.aura.model.HatchAttachmentFile) binds: [B:54:0x00af, B:52:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1 A[PHI: r3 r13 r14
  0x00e1: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:54:0x00af, B:55:0x00b1] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r13v3 java.lang.String) = (r13v2 java.lang.String), (r13v5 java.lang.String) binds: [B:54:0x00af, B:55:0x00b1] A[DONT_GENERATE, DONT_INLINE]
  0x00e1: PHI (r14v2 com.facebook.aura.model.HatchAttachmentFile) = (r14v1 com.facebook.aura.model.HatchAttachmentFile), (r14v4 com.facebook.aura.model.HatchAttachmentFile) binds: [B:54:0x00af, B:55:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7 A[PHI: r13
  0x00e7: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v7 java.lang.String) binds: [B:67:0x00e4, B:45:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.GenericListRow toDomain() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.GenericListRowJson.toDomain():com.facebook.aura.model.GenericListRow");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListRowJson(int i, String str, String str2, String str3, String str4, List list, String str5, JsonObject jsonObject, C2hx c2hx) {
        this.title = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.tertiary_title = null;
        } else {
            this.tertiary_title = str3;
        }
        if ((i & 8) == 0) {
            this.image_url = null;
        } else {
            this.image_url = str4;
        }
        if ((i & 16) == 0) {
            this.icons = C0881AGi.A00;
        } else {
            this.icons = list;
        }
        if ((i & 32) == 0) {
            this.type = GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC;
        } else {
            this.type = str5;
        }
        if ((i & 64) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public GenericListRowJson(String str, String str2, String str3, String str4, List<String> list, String str5, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(list, str5);
        this.title = str;
        this.subtitle = str2;
        this.tertiary_title = str3;
        this.image_url = str4;
        this.icons = list;
        this.type = str5;
        this.data = jsonObject;
    }

    public /* synthetic */ GenericListRowJson(String str, String str2, String str3, String str4, List list, String str5, JsonObject jsonObject, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? GenericListPresentationKt.GENERIC_LIST_ROW_TYPE_GENERIC : str5, (i & 64) != 0 ? null : jsonObject);
    }
}
