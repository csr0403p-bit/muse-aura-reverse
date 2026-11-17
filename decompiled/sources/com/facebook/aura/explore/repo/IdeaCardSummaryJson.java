package com.facebook.aura.explore.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaSharingJsonKt;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaCardSummaryJson extends C06G {
    public final String buildStatus;
    public final String build_status;
    public final List<String> connectionIds;
    public final IdeaCardContentJson content;
    public final String iconUrl;
    public final String id;
    public final String mimeType;
    public final IdeaCardPresentationJson presentation;
    public final String primaryLabel;
    public final String secondaryLabel;
    public final JsonElement sharing;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, IdeaCardSummaryJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<IdeaCardSummaryJson> serializer() {
            return IdeaCardSummaryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaCardSummaryJson(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        AnonymousClass005.A11(str, ideaCardContentJson, ideaCardPresentationJson, 0);
        AnonymousClass002.A1F(str6, 8, str7);
        this.id = str;
        this.sharing = jsonElement;
        this.content = ideaCardContentJson;
        this.presentation = ideaCardPresentationJson;
        this.iconUrl = str2;
        this.mimeType = str3;
        this.primaryLabel = str4;
        this.secondaryLabel = str5;
        this.buildStatus = str6;
        this.build_status = str7;
        this.connectionIds = list;
    }

    public final IdeaCardSummaryJson copy(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list) {
        AnonymousClass005.A11(str, ideaCardContentJson, ideaCardPresentationJson, 0);
        AnonymousClass002.A1F(str6, 8, str7);
        return new IdeaCardSummaryJson(str, jsonElement, ideaCardContentJson, ideaCardPresentationJson, str2, str3, str4, str5, str6, str7, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardSummaryJson) {
                IdeaCardSummaryJson ideaCardSummaryJson = (IdeaCardSummaryJson) obj;
                if (!C7384Etj.areEqual(this.id, ideaCardSummaryJson.id) || !C7384Etj.areEqual(this.sharing, ideaCardSummaryJson.sharing) || !C7384Etj.areEqual(this.content, ideaCardSummaryJson.content) || !C7384Etj.areEqual(this.presentation, ideaCardSummaryJson.presentation) || !C7384Etj.areEqual(this.iconUrl, ideaCardSummaryJson.iconUrl) || !C7384Etj.areEqual(this.mimeType, ideaCardSummaryJson.mimeType) || !C7384Etj.areEqual(this.primaryLabel, ideaCardSummaryJson.primaryLabel) || !C7384Etj.areEqual(this.secondaryLabel, ideaCardSummaryJson.secondaryLabel) || !C7384Etj.areEqual(this.buildStatus, ideaCardSummaryJson.buildStatus) || !C7384Etj.areEqual(this.build_status, ideaCardSummaryJson.build_status) || !C7384Etj.areEqual(this.connectionIds, ideaCardSummaryJson.connectionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaCardSummaryJson copy$default(IdeaCardSummaryJson ideaCardSummaryJson, String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardSummaryJson.id;
        }
        if ((i & 2) != 0) {
            jsonElement = ideaCardSummaryJson.sharing;
        }
        if ((i & 4) != 0) {
            ideaCardContentJson = ideaCardSummaryJson.content;
        }
        if ((i & 8) != 0) {
            ideaCardPresentationJson = ideaCardSummaryJson.presentation;
        }
        if ((i & 16) != 0) {
            str2 = ideaCardSummaryJson.iconUrl;
        }
        if ((i & 32) != 0) {
            str3 = ideaCardSummaryJson.mimeType;
        }
        if ((i & 64) != 0) {
            str4 = ideaCardSummaryJson.primaryLabel;
        }
        if ((i & 128) != 0) {
            str5 = ideaCardSummaryJson.secondaryLabel;
        }
        if ((i & 256) != 0) {
            str6 = ideaCardSummaryJson.buildStatus;
        }
        if ((i & 512) != 0) {
            str7 = ideaCardSummaryJson.build_status;
        }
        if ((i & 1024) != 0) {
            list = ideaCardSummaryJson.connectionIds;
        }
        return ideaCardSummaryJson.copy(str, jsonElement, ideaCardContentJson, ideaCardPresentationJson, str2, str3, str4, str5, str6, str7, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(com.facebook.aura.explore.repo.IdeaCardSummaryJson r15, X.C9j5 r16, X.C9iZ r17) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r1 = com.facebook.aura.explore.repo.IdeaCardSummaryJson.$childSerializers
            r5 = 0
            r3 = r16
            boolean r7 = r3.AfR()
            java.lang.String r14 = ""
            r2 = r17
            r4 = r15
            if (r7 != 0) goto L18
            java.lang.String r0 = r15.id
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L1d
        L18:
            java.lang.String r0 = r15.id
            r3.AAV(r0, r2, r5)
        L1d:
            r6 = 1
            if (r7 != 0) goto L24
            kotlinx.serialization.json.JsonElement r0 = r15.sharing
            if (r0 == 0) goto L2b
        L24:
            kotlinx.serialization.json.JsonElementSerializer r5 = kotlinx.serialization.json.JsonElementSerializer.A00
            kotlinx.serialization.json.JsonElement r0 = r15.sharing
            r3.AAP(r0, r5, r2, r6)
        L2b:
            r6 = 2
            if (r7 != 0) goto L41
            com.facebook.aura.explore.repo.IdeaCardContentJson r0 = r15.content
            r15 = 0
            com.facebook.aura.explore.repo.IdeaCardContentJson r12 = new com.facebook.aura.explore.repo.IdeaCardContentJson
            r13 = r14
            r16 = r15
            r17 = r15
            r12.<init>(r13, r14, r15, r16, r17)
            boolean r0 = X.C7384Etj.areEqual(r0, r12)
            if (r0 != 0) goto L48
        L41:
            com.facebook.aura.explore.repo.IdeaCardContentJson$$serializer r5 = com.facebook.aura.explore.repo.IdeaCardContentJson$$serializer.INSTANCE
            com.facebook.aura.explore.repo.IdeaCardContentJson r0 = r4.content
            r3.AAQ(r0, r5, r2, r6)
        L48:
            r6 = 3
            if (r7 != 0) goto L5e
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r0 = r4.presentation
            r9 = 0
            X.AGi r11 = X.C0881AGi.A00
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r8 = new com.facebook.aura.explore.repo.IdeaCardPresentationJson
            r10 = r9
            r12 = r11
            r13 = r9
            r8.<init>(r9, r10, r11, r12, r13, r14)
            boolean r0 = X.C7384Etj.areEqual(r0, r8)
            if (r0 != 0) goto L65
        L5e:
            com.facebook.aura.explore.repo.IdeaCardPresentationJson$$serializer r5 = com.facebook.aura.explore.repo.IdeaCardPresentationJson$$serializer.INSTANCE
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r0 = r4.presentation
            r3.AAQ(r0, r5, r2, r6)
        L65:
            r6 = 4
            if (r7 != 0) goto L6c
            java.lang.String r0 = r4.iconUrl
            if (r0 == 0) goto L73
        L6c:
            X.9iq r5 = X.C07779iq.A01
            java.lang.String r0 = r4.iconUrl
            r3.AAP(r0, r5, r2, r6)
        L73:
            r6 = 5
            if (r7 != 0) goto L7a
            java.lang.String r0 = r4.mimeType
            if (r0 == 0) goto L81
        L7a:
            X.9iq r5 = X.C07779iq.A01
            java.lang.String r0 = r4.mimeType
            r3.AAP(r0, r5, r2, r6)
        L81:
            r6 = 6
            if (r7 != 0) goto L88
            java.lang.String r0 = r4.primaryLabel
            if (r0 == 0) goto L8f
        L88:
            X.9iq r5 = X.C07779iq.A01
            java.lang.String r0 = r4.primaryLabel
            r3.AAP(r0, r5, r2, r6)
        L8f:
            r6 = 7
            if (r7 != 0) goto L96
            java.lang.String r0 = r4.secondaryLabel
            if (r0 == 0) goto L9d
        L96:
            X.9iq r5 = X.C07779iq.A01
            java.lang.String r0 = r4.secondaryLabel
            r3.AAP(r0, r5, r2, r6)
        L9d:
            r5 = 8
            if (r7 != 0) goto La9
            java.lang.String r0 = r4.buildStatus
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto Lae
        La9:
            java.lang.String r0 = r4.buildStatus
            r3.AAV(r0, r2, r5)
        Lae:
            r5 = 9
            if (r7 != 0) goto Lba
            java.lang.String r0 = r4.build_status
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto Lbf
        Lba:
            java.lang.String r0 = r4.build_status
            r3.AAV(r0, r2, r5)
        Lbf:
            r5 = 10
            if (r7 != 0) goto Lc7
            java.util.List<java.lang.String> r0 = r4.connectionIds
            if (r0 == 0) goto Ld0
        Lc7:
            X.9hv r1 = X.C3cH.A15(r1, r5)
            java.util.List<java.lang.String> r0 = r4.connectionIds
            r3.AAP(r0, r1, r2, r5)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardSummaryJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(com.facebook.aura.explore.repo.IdeaCardSummaryJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.build_status;
    }

    public final List<String> component11() {
        return this.connectionIds;
    }

    public final JsonElement component2() {
        return this.sharing;
    }

    public final IdeaCardContentJson component3() {
        return this.content;
    }

    public final IdeaCardPresentationJson component4() {
        return this.presentation;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.mimeType;
    }

    public final String component7() {
        return this.primaryLabel;
    }

    public final String component8() {
        return this.secondaryLabel;
    }

    public final String component9() {
        return this.buildStatus;
    }

    public final String getBuildStatus() {
        return this.buildStatus;
    }

    public final String getBuild_status() {
        return this.build_status;
    }

    public final List<String> getConnectionIds() {
        return this.connectionIds;
    }

    public final IdeaCardContentJson getContent() {
        return this.content;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final IdeaCardPresentationJson getPresentation() {
        return this.presentation;
    }

    public final String getPrimaryLabel() {
        return this.primaryLabel;
    }

    public final String getSecondaryLabel() {
        return this.secondaryLabel;
    }

    public final JsonElement getSharing() {
        return this.sharing;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.build_status, AnonymousClass005.A0I(this.buildStatus, (((((((AnonymousClass005.A0F(this.presentation, AnonymousClass005.A0F(this.content, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0D(this.sharing)) * 31)) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + AnonymousClass006.A0G(this.primaryLabel)) * 31) + AnonymousClass006.A0G(this.secondaryLabel)) * 31)) + C3cH.A02(this.connectionIds);
    }

    public final IdeaCard toDomain() {
        String str = this.id;
        IdeaSharing ideaSharing = IdeaSharingJsonKt.parseIdeaSharing(this.sharing);
        IdeaCardContentJson ideaCardContentJson = this.content;
        String str2 = ideaCardContentJson.title;
        String str3 = ideaCardContentJson.summary;
        String str4 = ideaCardContentJson.detailDescription;
        if (str4 == null || str4.length() <= 0) {
            str4 = null;
        }
        String str5 = ideaCardContentJson.fitReason;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        String str6 = ideaCardContentJson.buildSummary;
        if (str6 == null || str6.length() <= 0) {
            str6 = null;
        }
        MediaRefJson mediaRefJson = this.presentation.previewImage;
        String strFirstUrl = mediaRefJson != null ? mediaRefJson.firstUrl() : null;
        String strIconUrl = this.iconUrl;
        if (strIconUrl == null || strIconUrl.length() <= 0) {
            strIconUrl = this.presentation.iconUrl();
        }
        String strIconMimeType = this.mimeType;
        if (strIconMimeType == null || strIconMimeType.length() <= 0) {
            strIconMimeType = this.presentation.iconMimeType();
        }
        String strPrimaryLabel = this.primaryLabel;
        if (strPrimaryLabel == null || strPrimaryLabel.length() <= 0) {
            strPrimaryLabel = this.presentation.primaryLabel();
        }
        String strSecondaryLabel = this.secondaryLabel;
        if (strSecondaryLabel == null || strSecondaryLabel.length() <= 0) {
            strSecondaryLabel = this.presentation.secondaryLabel();
        }
        IdeaCardPresentationJson ideaCardPresentationJson = this.presentation;
        String strDisplayBadgeText = ideaCardPresentationJson.displayBadgeText();
        AHD ahdA07 = AGI.A07(ideaCardPresentationJson.badgeTexts());
        String str7 = this.presentation.actionLabel;
        String str8 = this.buildStatus;
        if (str8.length() == 0) {
            str8 = this.build_status;
        }
        return new IdeaCard(str, ideaSharing, str2, str3, str4, str5, str6, strFirstUrl, strIconUrl, strIconMimeType, strPrimaryLabel, strSecondaryLabel, strDisplayBadgeText, ahdA07, str7, str8, IdeaCardsJsonKt.toConnectionIds(this.connectionIds));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardSummaryJson(int i, String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, String str4, String str5, String str6, String str7, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.sharing = null;
        } else {
            this.sharing = jsonElement;
        }
        if ((i & 4) == 0) {
            this.content = new IdeaCardContentJson("", "", null, null, null);
        } else {
            this.content = ideaCardContentJson;
        }
        if ((i & 8) == 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            this.presentation = new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, "");
        } else {
            this.presentation = ideaCardPresentationJson;
        }
        if ((i & 16) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str2;
        }
        if ((i & 32) == 0) {
            this.mimeType = null;
        } else {
            this.mimeType = str3;
        }
        if ((i & 64) == 0) {
            this.primaryLabel = null;
        } else {
            this.primaryLabel = str4;
        }
        if ((i & 128) == 0) {
            this.secondaryLabel = null;
        } else {
            this.secondaryLabel = str5;
        }
        if ((i & 256) == 0) {
            this.buildStatus = "";
        } else {
            this.buildStatus = str6;
        }
        if ((i & 512) == 0) {
            this.build_status = "";
        } else {
            this.build_status = str7;
        }
        if ((i & 1024) == 0) {
            this.connectionIds = null;
        } else {
            this.connectionIds = list;
        }
    }

    public /* synthetic */ IdeaCardSummaryJson(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, C06H c06h) {
        JsonElement jsonElement2 = jsonElement;
        IdeaCardContentJson ideaCardContentJson2 = ideaCardContentJson;
        IdeaCardPresentationJson ideaCardPresentationJson2 = ideaCardPresentationJson;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        List list2 = list;
        String str13 = (i & 1) != 0 ? "" : str;
        jsonElement2 = (i & 2) != 0 ? null : jsonElement2;
        ideaCardContentJson2 = (i & 4) != 0 ? new IdeaCardContentJson("", "", null, null, null) : ideaCardContentJson2;
        if ((i & 8) != 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            ideaCardPresentationJson2 = new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, "");
        }
        this(str13, jsonElement2, ideaCardContentJson2, ideaCardPresentationJson2, (i & 16) != 0 ? null : str8, (i & 32) != 0 ? null : str9, (i & 64) != 0 ? null : str10, (i & 128) != 0 ? null : str11, (i & 256) != 0 ? "" : str12, (i & 512) == 0 ? str7 : "", (i & 1024) != 0 ? null : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdeaCardSummaryJson() {
        this((String) null, (JsonElement) (0 == true ? 1 : 0), (IdeaCardContentJson) (0 == true ? 1 : 0), (IdeaCardPresentationJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 2047, (C06H) (0 == true ? 1 : 0));
    }
}
