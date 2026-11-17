package com.facebook.aura.model;

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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes.dex */
public final class SpaceBuildCompletedPresentation extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String iconImageUrl;
    public final String imageUrl;
    public final String name;
    public final String previewCardImageUrl;
    public final String proposalId;
    public final String slug;
    public final String sourcePresentationId;
    public final String spacePath;
    public final String summary;
    public final String thumbnailImageUrl;

    /* loaded from: classes3.dex */
    public final class Companion {
        public final C9hr<SpaceBuildCompletedPresentation> serializer() {
            return SpaceBuildCompletedPresentation$$serializer.INSTANCE;
        }

        public final SpaceBuildCompletedPresentation fromJson(JsonElement jsonElement) {
            return HatchMessageJsonKt.parseSpaceBuildCompletedPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ SpaceBuildCompletedPresentation copy$default(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        if ((i & 1) != 0) {
            str11 = spaceBuildCompletedPresentation.name;
        }
        if ((i & 2) != 0) {
            str12 = spaceBuildCompletedPresentation.slug;
        }
        if ((i & 4) != 0) {
            str13 = spaceBuildCompletedPresentation.spacePath;
        }
        if ((i & 8) != 0) {
            str14 = spaceBuildCompletedPresentation.summary;
        }
        if ((i & 16) != 0) {
            str15 = spaceBuildCompletedPresentation.previewCardImageUrl;
        }
        if ((i & 32) != 0) {
            str16 = spaceBuildCompletedPresentation.thumbnailImageUrl;
        }
        if ((i & 64) != 0) {
            str17 = spaceBuildCompletedPresentation.iconImageUrl;
        }
        if ((i & 128) != 0) {
            str18 = spaceBuildCompletedPresentation.imageUrl;
        }
        if ((i & 256) != 0) {
            str19 = spaceBuildCompletedPresentation.proposalId;
        }
        if ((i & 512) != 0) {
            str20 = spaceBuildCompletedPresentation.sourcePresentationId;
        }
        AnonymousClass003.A0u(str11, str12);
        return new SpaceBuildCompletedPresentation(str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SpaceBuildCompletedPresentation spaceBuildCompletedPresentation, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spaceBuildCompletedPresentation.name, c9iZ, 0);
        c9j5.AAV(spaceBuildCompletedPresentation.slug, c9iZ, 1);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(spaceBuildCompletedPresentation.spacePath, c07779iq, c9iZ, 2);
        c9j5.AAP(spaceBuildCompletedPresentation.summary, c07779iq, c9iZ, 3);
        c9j5.AAP(spaceBuildCompletedPresentation.previewCardImageUrl, c07779iq, c9iZ, 4);
        c9j5.AAP(spaceBuildCompletedPresentation.thumbnailImageUrl, c07779iq, c9iZ, 5);
        if (c9j5.AfR() || spaceBuildCompletedPresentation.iconImageUrl != null) {
            c9j5.AAP(spaceBuildCompletedPresentation.iconImageUrl, c07779iq, c9iZ, 6);
        }
        c9j5.AAP(spaceBuildCompletedPresentation.imageUrl, c07779iq, c9iZ, 7);
        c9j5.AAP(spaceBuildCompletedPresentation.proposalId, c07779iq, c9iZ, 8);
        c9j5.AAP(spaceBuildCompletedPresentation.sourcePresentationId, c07779iq, c9iZ, 9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceBuildCompletedPresentation) {
                SpaceBuildCompletedPresentation spaceBuildCompletedPresentation = (SpaceBuildCompletedPresentation) obj;
                if (!C7384Etj.areEqual(this.name, spaceBuildCompletedPresentation.name) || !C7384Etj.areEqual(this.slug, spaceBuildCompletedPresentation.slug) || !C7384Etj.areEqual(this.spacePath, spaceBuildCompletedPresentation.spacePath) || !C7384Etj.areEqual(this.summary, spaceBuildCompletedPresentation.summary) || !C7384Etj.areEqual(this.previewCardImageUrl, spaceBuildCompletedPresentation.previewCardImageUrl) || !C7384Etj.areEqual(this.thumbnailImageUrl, spaceBuildCompletedPresentation.thumbnailImageUrl) || !C7384Etj.areEqual(this.iconImageUrl, spaceBuildCompletedPresentation.iconImageUrl) || !C7384Etj.areEqual(this.imageUrl, spaceBuildCompletedPresentation.imageUrl) || !C7384Etj.areEqual(this.proposalId, spaceBuildCompletedPresentation.proposalId) || !C7384Etj.areEqual(this.sourcePresentationId, spaceBuildCompletedPresentation.sourcePresentationId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SpaceBuildCompletedPresentation(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C2hx c2hx) {
        if (959 != (i & 959)) {
            C9iI.A00(SpaceBuildCompletedPresentation$$serializer.descriptor, i, 959);
            throw F60.createAndThrow();
        }
        this.name = str;
        this.slug = str2;
        this.spacePath = str3;
        this.summary = str4;
        this.previewCardImageUrl = str5;
        this.thumbnailImageUrl = str6;
        this.iconImageUrl = (i & 64) == 0 ? null : str7;
        this.imageUrl = str8;
        this.proposalId = str9;
        this.sourcePresentationId = str10;
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.sourcePresentationId;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.spacePath;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.previewCardImageUrl;
    }

    public final String component6() {
        return this.thumbnailImageUrl;
    }

    public final String component7() {
        return this.iconImageUrl;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final String component9() {
        return this.proposalId;
    }

    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewCardImageUrl() {
        return this.previewCardImageUrl;
    }

    public final String getProposalId() {
        return this.proposalId;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSourcePresentationId() {
        return this.sourcePresentationId;
    }

    public final String getSpacePath() {
        return this.spacePath;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass005.A0I(this.slug, AnonymousClass001.A0G(this.name)) + AnonymousClass006.A0G(this.spacePath)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.previewCardImageUrl)) * 31) + AnonymousClass006.A0G(this.thumbnailImageUrl)) * 31) + AnonymousClass006.A0G(this.iconImageUrl)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31) + AnonymousClass006.A0G(this.proposalId)) * 31) + AnonymousClass005.A0H(this.sourcePresentationId);
    }

    public final SpaceBuildCompletedPresentation copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass003.A0u(str, str2);
        return new SpaceBuildCompletedPresentation(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceBuildCompletedPresentation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, str8, str9, str10);
    }

    public SpaceBuildCompletedPresentation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        AnonymousClass003.A0u(str, str2);
        this.name = str;
        this.slug = str2;
        this.spacePath = str3;
        this.summary = str4;
        this.previewCardImageUrl = str5;
        this.thumbnailImageUrl = str6;
        this.iconImageUrl = str7;
        this.imageUrl = str8;
        this.proposalId = str9;
        this.sourcePresentationId = str10;
    }
}
