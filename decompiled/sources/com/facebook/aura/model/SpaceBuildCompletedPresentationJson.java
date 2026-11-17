package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceBuildCompletedPresentationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String description;
    public final String display_name;
    public final String image_url;
    public final String name;
    public final SpaceBuildCompletedPreviewImageJson preview_image;
    public final String proposal_id;
    public final String slug;
    public final String source_presentation_id;
    public final String space_path;
    public final String space_slug;
    public final String summary;

    public final class Companion {
        public final C9hr<SpaceBuildCompletedPresentationJson> serializer() {
            return SpaceBuildCompletedPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceBuildCompletedPresentationJson() {
        this("", "", "", "", "", "", "", null, "", "", "");
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SpaceBuildCompletedPresentationJson spaceBuildCompletedPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.display_name)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.display_name, c9iZ, 0);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.name)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.name, c9iZ, 1);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.space_slug)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.space_slug, c9iZ, 2);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.slug)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.slug, c9iZ, 3);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.space_path)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.space_path, c9iZ, 4);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.summary)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.summary, c9iZ, 5);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.description)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.description, c9iZ, 6);
        }
        if (zAfR || spaceBuildCompletedPresentationJson.preview_image != null) {
            c9j5.AAP(spaceBuildCompletedPresentationJson.preview_image, SpaceBuildCompletedPreviewImageJson$$serializer.INSTANCE, c9iZ, 7);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.image_url)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.image_url, c9iZ, 8);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.proposal_id)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.proposal_id, c9iZ, 9);
        }
        if (zAfR || !"".equals(spaceBuildCompletedPresentationJson.source_presentation_id)) {
            c9j5.AAV(spaceBuildCompletedPresentationJson.source_presentation_id, c9iZ, 10);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceBuildCompletedPresentationJson) {
                SpaceBuildCompletedPresentationJson spaceBuildCompletedPresentationJson = (SpaceBuildCompletedPresentationJson) obj;
                if (!C7384Etj.areEqual(this.display_name, spaceBuildCompletedPresentationJson.display_name) || !C7384Etj.areEqual(this.name, spaceBuildCompletedPresentationJson.name) || !C7384Etj.areEqual(this.space_slug, spaceBuildCompletedPresentationJson.space_slug) || !C7384Etj.areEqual(this.slug, spaceBuildCompletedPresentationJson.slug) || !C7384Etj.areEqual(this.space_path, spaceBuildCompletedPresentationJson.space_path) || !C7384Etj.areEqual(this.summary, spaceBuildCompletedPresentationJson.summary) || !C7384Etj.areEqual(this.description, spaceBuildCompletedPresentationJson.description) || !C7384Etj.areEqual(this.preview_image, spaceBuildCompletedPresentationJson.preview_image) || !C7384Etj.areEqual(this.image_url, spaceBuildCompletedPresentationJson.image_url) || !C7384Etj.areEqual(this.proposal_id, spaceBuildCompletedPresentationJson.proposal_id) || !C7384Etj.areEqual(this.source_presentation_id, spaceBuildCompletedPresentationJson.source_presentation_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceBuildCompletedPresentationJson copy$default(SpaceBuildCompletedPresentationJson spaceBuildCompletedPresentationJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceBuildCompletedPresentationJson.display_name;
        }
        if ((i & 2) != 0) {
            str2 = spaceBuildCompletedPresentationJson.name;
        }
        if ((i & 4) != 0) {
            str3 = spaceBuildCompletedPresentationJson.space_slug;
        }
        if ((i & 8) != 0) {
            str4 = spaceBuildCompletedPresentationJson.slug;
        }
        if ((i & 16) != 0) {
            str5 = spaceBuildCompletedPresentationJson.space_path;
        }
        if ((i & 32) != 0) {
            str6 = spaceBuildCompletedPresentationJson.summary;
        }
        if ((i & 64) != 0) {
            str7 = spaceBuildCompletedPresentationJson.description;
        }
        if ((i & 128) != 0) {
            spaceBuildCompletedPreviewImageJson = spaceBuildCompletedPresentationJson.preview_image;
        }
        if ((i & 256) != 0) {
            str8 = spaceBuildCompletedPresentationJson.image_url;
        }
        if ((i & 512) != 0) {
            str9 = spaceBuildCompletedPresentationJson.proposal_id;
        }
        if ((i & 1024) != 0) {
            str10 = spaceBuildCompletedPresentationJson.source_presentation_id;
        }
        return spaceBuildCompletedPresentationJson.copy(str, str2, str3, str4, str5, str6, str7, spaceBuildCompletedPreviewImageJson, str8, str9, str10);
    }

    public final String component1() {
        return this.display_name;
    }

    public final String component10() {
        return this.proposal_id;
    }

    public final String component11() {
        return this.source_presentation_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.space_slug;
    }

    public final String component4() {
        return this.slug;
    }

    public final String component5() {
        return this.space_path;
    }

    public final String component6() {
        return this.summary;
    }

    public final String component7() {
        return this.description;
    }

    public final SpaceBuildCompletedPreviewImageJson component8() {
        return this.preview_image;
    }

    public final String component9() {
        return this.image_url;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getName() {
        return this.name;
    }

    public final SpaceBuildCompletedPreviewImageJson getPreview_image() {
        return this.preview_image;
    }

    public final String getProposal_id() {
        return this.proposal_id;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSource_presentation_id() {
        return this.source_presentation_id;
    }

    public final String getSpace_path() {
        return this.space_path;
    }

    public final String getSpace_slug() {
        return this.space_slug;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.source_presentation_id, AnonymousClass005.A0I(this.proposal_id, AnonymousClass005.A0I(this.image_url, (AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.space_path, AnonymousClass005.A0I(this.slug, AnonymousClass005.A0I(this.space_slug, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.display_name))))))) + AnonymousClass006.A0D(this.preview_image)) * 31)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[PHI: r1
  0x004e: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v20 java.lang.String) binds: [B:15:0x003f, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[PHI: r1
  0x0068: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v19 java.lang.String) binds: [B:20:0x0059, B:22:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[PHI: r1
  0x0077: PHI (r1v16 java.lang.String) = (r1v5 java.lang.String), (r1v18 java.lang.String), (r1v17 java.lang.String) binds: [B:71:0x00e6, B:68:0x00dc, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084 A[PHI: r1
  0x0084: PHI (r1v14 java.lang.String) = (r1v6 java.lang.String), (r1v15 java.lang.String) binds: [B:63:0x00d1, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091 A[PHI: r1
  0x0091: PHI (r1v11 java.lang.String) = (r1v7 java.lang.String), (r1v13 java.lang.String), (r1v12 java.lang.String) binds: [B:60:0x00c7, B:57:0x00bd, B:41:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.model.SpaceBuildCompletedPresentation toDomain() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.SpaceBuildCompletedPresentationJson.toDomain():com.facebook.aura.model.SpaceBuildCompletedPresentation");
    }

    public final SpaceBuildCompletedPresentationJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str8, String str9, String str10) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        C7384Etj.A0Y(str8, 8);
        C3cH.A18(str9, str10);
        return new SpaceBuildCompletedPresentationJson(str, str2, str3, str4, str5, str6, str7, spaceBuildCompletedPreviewImageJson, str8, str9, str10);
    }

    public String toString() {
        return super.toString();
    }

    public SpaceBuildCompletedPresentationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str8, String str9, String str10) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A0z(str6, str7);
        C7384Etj.A0Y(str8, 8);
        C3cH.A18(str9, str10);
        this.display_name = str;
        this.name = str2;
        this.space_slug = str3;
        this.slug = str4;
        this.space_path = str5;
        this.summary = str6;
        this.description = str7;
        this.preview_image = spaceBuildCompletedPreviewImageJson;
        this.image_url = str8;
        this.proposal_id = str9;
        this.source_presentation_id = str10;
    }

    public /* synthetic */ SpaceBuildCompletedPresentationJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str8, String str9, String str10, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.space_slug = "";
        } else {
            this.space_slug = str3;
        }
        if ((i & 8) == 0) {
            this.slug = "";
        } else {
            this.slug = str4;
        }
        if ((i & 16) == 0) {
            this.space_path = "";
        } else {
            this.space_path = str5;
        }
        if ((i & 32) == 0) {
            this.summary = "";
        } else {
            this.summary = str6;
        }
        if ((i & 64) == 0) {
            this.description = "";
        } else {
            this.description = str7;
        }
        if ((i & 128) == 0) {
            this.preview_image = null;
        } else {
            this.preview_image = spaceBuildCompletedPreviewImageJson;
        }
        if ((i & 256) == 0) {
            this.image_url = "";
        } else {
            this.image_url = str8;
        }
        if ((i & 512) == 0) {
            this.proposal_id = "";
        } else {
            this.proposal_id = str9;
        }
        if ((i & 1024) == 0) {
            this.source_presentation_id = "";
        } else {
            this.source_presentation_id = str10;
        }
    }

    public /* synthetic */ SpaceBuildCompletedPresentationJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, SpaceBuildCompletedPreviewImageJson spaceBuildCompletedPreviewImageJson, String str8, String str9, String str10, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : spaceBuildCompletedPreviewImageJson, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10);
    }
}
