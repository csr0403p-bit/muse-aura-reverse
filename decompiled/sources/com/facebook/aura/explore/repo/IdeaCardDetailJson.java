package com.facebook.aura.explore.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.F0C;
import com.facebook.aura.model.IdeaSharing;
import com.facebook.aura.model.IdeaSharingJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaCardDetailJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> connectionIds;
    public final IdeaCardContentJson content;
    public final String iconUrl;
    public final String id;
    public final List<IdeaCardItemJson> items;
    public final String mimeType;
    public final IdeaCardPresentationJson presentation;
    public final JsonElement sharing;

    public final class Companion {
        public final C9hr<IdeaCardDetailJson> serializer() {
            return IdeaCardDetailJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, AbstractC5321DgF.A02(num, IdeaCardDetailJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, IdeaCardDetailJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public IdeaCardDetailJson(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, List<IdeaCardItemJson> list, List<String> list2) {
        AnonymousClass005.A11(str, ideaCardContentJson, ideaCardPresentationJson, 0);
        C7384Etj.A0Y(list, 6);
        this.id = str;
        this.sharing = jsonElement;
        this.content = ideaCardContentJson;
        this.presentation = ideaCardPresentationJson;
        this.iconUrl = str2;
        this.mimeType = str3;
        this.items = list;
        this.connectionIds = list2;
    }

    public final IdeaCardDetailJson copy(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, List<IdeaCardItemJson> list, List<String> list2) {
        AnonymousClass005.A11(str, ideaCardContentJson, ideaCardPresentationJson, 0);
        C7384Etj.A0Y(list, 6);
        return new IdeaCardDetailJson(str, jsonElement, ideaCardContentJson, ideaCardPresentationJson, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardDetailJson) {
                IdeaCardDetailJson ideaCardDetailJson = (IdeaCardDetailJson) obj;
                if (!C7384Etj.areEqual(this.id, ideaCardDetailJson.id) || !C7384Etj.areEqual(this.sharing, ideaCardDetailJson.sharing) || !C7384Etj.areEqual(this.content, ideaCardDetailJson.content) || !C7384Etj.areEqual(this.presentation, ideaCardDetailJson.presentation) || !C7384Etj.areEqual(this.iconUrl, ideaCardDetailJson.iconUrl) || !C7384Etj.areEqual(this.mimeType, ideaCardDetailJson.mimeType) || !C7384Etj.areEqual(this.items, ideaCardDetailJson.items) || !C7384Etj.areEqual(this.connectionIds, ideaCardDetailJson.connectionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaCardDetailJson copy$default(IdeaCardDetailJson ideaCardDetailJson, String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardDetailJson.id;
        }
        if ((i & 2) != 0) {
            jsonElement = ideaCardDetailJson.sharing;
        }
        if ((i & 4) != 0) {
            ideaCardContentJson = ideaCardDetailJson.content;
        }
        if ((i & 8) != 0) {
            ideaCardPresentationJson = ideaCardDetailJson.presentation;
        }
        if ((i & 16) != 0) {
            str2 = ideaCardDetailJson.iconUrl;
        }
        if ((i & 32) != 0) {
            str3 = ideaCardDetailJson.mimeType;
        }
        if ((i & 64) != 0) {
            list = ideaCardDetailJson.items;
        }
        if ((i & 128) != 0) {
            list2 = ideaCardDetailJson.connectionIds;
        }
        return ideaCardDetailJson.copy(str, jsonElement, ideaCardContentJson, ideaCardPresentationJson, str2, str3, list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(com.facebook.aura.explore.repo.IdeaCardDetailJson r12, X.C9j5 r13, X.C9iZ r14) {
        /*
            X.F0C<X.9hr<java.lang.Object>>[] r1 = com.facebook.aura.explore.repo.IdeaCardDetailJson.$childSerializers
            r2 = 0
            boolean r4 = r13.AfR()
            if (r4 != 0) goto L11
            java.lang.String r0 = r12.id
            boolean r0 = X.C3cH.A1Q(r0)
            if (r0 != 0) goto L16
        L11:
            java.lang.String r0 = r12.id
            r13.AAV(r0, r14, r2)
        L16:
            r3 = 1
            if (r4 != 0) goto L1d
            kotlinx.serialization.json.JsonElement r0 = r12.sharing
            if (r0 == 0) goto L24
        L1d:
            kotlinx.serialization.json.JsonElementSerializer r2 = kotlinx.serialization.json.JsonElementSerializer.A00
            kotlinx.serialization.json.JsonElement r0 = r12.sharing
            r13.AAP(r0, r2, r14, r3)
        L24:
            r3 = 2
            if (r4 != 0) goto L3a
            com.facebook.aura.explore.repo.IdeaCardContentJson r0 = r12.content
            r8 = 0
            java.lang.String r6 = ""
            com.facebook.aura.explore.repo.IdeaCardContentJson r5 = new com.facebook.aura.explore.repo.IdeaCardContentJson
            r7 = r6
            r9 = r8
            r10 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 != 0) goto L41
        L3a:
            com.facebook.aura.explore.repo.IdeaCardContentJson$$serializer r2 = com.facebook.aura.explore.repo.IdeaCardContentJson$$serializer.INSTANCE
            com.facebook.aura.explore.repo.IdeaCardContentJson r0 = r12.content
            r13.AAQ(r0, r2, r14, r3)
        L41:
            r3 = 3
            if (r4 != 0) goto L59
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r0 = r12.presentation
            r6 = 0
            X.AGi r8 = X.C0881AGi.A00
            java.lang.String r11 = ""
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r5 = new com.facebook.aura.explore.repo.IdeaCardPresentationJson
            r7 = r6
            r9 = r8
            r10 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 != 0) goto L60
        L59:
            com.facebook.aura.explore.repo.IdeaCardPresentationJson$$serializer r2 = com.facebook.aura.explore.repo.IdeaCardPresentationJson$$serializer.INSTANCE
            com.facebook.aura.explore.repo.IdeaCardPresentationJson r0 = r12.presentation
            r13.AAQ(r0, r2, r14, r3)
        L60:
            r3 = 4
            if (r4 != 0) goto L67
            java.lang.String r0 = r12.iconUrl
            if (r0 == 0) goto L6e
        L67:
            X.9iq r2 = X.C07779iq.A01
            java.lang.String r0 = r12.iconUrl
            r13.AAP(r0, r2, r14, r3)
        L6e:
            r3 = 5
            if (r4 != 0) goto L75
            java.lang.String r0 = r12.mimeType
            if (r0 == 0) goto L7c
        L75:
            X.9iq r2 = X.C07779iq.A01
            java.lang.String r0 = r12.mimeType
            r13.AAP(r0, r2, r14, r3)
        L7c:
            r3 = 6
            if (r4 != 0) goto L87
            java.util.List<com.facebook.aura.explore.repo.IdeaCardItemJson> r0 = r12.items
            boolean r0 = X.C3cG.A1L(r0)
            if (r0 != 0) goto L90
        L87:
            X.9hv r2 = X.C3cH.A15(r1, r3)
            java.util.List<com.facebook.aura.explore.repo.IdeaCardItemJson> r0 = r12.items
            r13.AAQ(r0, r2, r14, r3)
        L90:
            r2 = 7
            if (r4 != 0) goto L97
            java.util.List<java.lang.String> r0 = r12.connectionIds
            if (r0 == 0) goto La0
        L97:
            X.9hv r1 = X.C3cH.A15(r1, r2)
            java.util.List<java.lang.String> r0 = r12.connectionIds
            r13.AAP(r0, r1, r14, r2)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.repo.IdeaCardDetailJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(com.facebook.aura.explore.repo.IdeaCardDetailJson, X.9j5, X.9iZ):void");
    }

    public final String component1() {
        return this.id;
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

    public final List<IdeaCardItemJson> component7() {
        return this.items;
    }

    public final List<String> component8() {
        return this.connectionIds;
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

    public final List<IdeaCardItemJson> getItems() {
        return this.items;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final IdeaCardPresentationJson getPresentation() {
        return this.presentation;
    }

    public final JsonElement getSharing() {
        return this.sharing;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.items, (((AnonymousClass005.A0F(this.presentation, AnonymousClass005.A0F(this.content, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0D(this.sharing)) * 31)) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + C3cH.A02(this.connectionIds);
    }

    public final IdeaCardDetail toDomain() {
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
        String strPrimaryLabel = this.presentation.primaryLabel();
        String strSecondaryLabel = this.presentation.secondaryLabel();
        AHD ahdA07 = AGI.A07(this.presentation.badgeTexts());
        String str7 = this.presentation.actionLabel;
        List<IdeaCardItemJson> list = this.items;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<IdeaCardItemJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        AHD ahdA072 = AGI.A07(arrayListA0i);
        List<String> list2 = this.connectionIds;
        return new IdeaCardDetail(str, ideaSharing, str2, str3, str4, str5, str6, strFirstUrl, strIconUrl, strIconMimeType, strPrimaryLabel, strSecondaryLabel, ahdA07, str7, ahdA072, list2 != null ? IdeaCardsJsonKt.toConnectionIds(list2) : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardDetailJson(String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, List list, List list2, int i, C06H c06h) {
        JsonElement jsonElement2 = jsonElement;
        IdeaCardContentJson ideaCardContentJson2 = ideaCardContentJson;
        IdeaCardPresentationJson ideaCardPresentationJson2 = ideaCardPresentationJson;
        String str4 = str2;
        String str5 = str3;
        List list3 = list2;
        List list4 = list;
        String str6 = (i & 1) != 0 ? "" : str;
        jsonElement2 = (i & 2) != 0 ? null : jsonElement2;
        ideaCardContentJson2 = (i & 4) != 0 ? new IdeaCardContentJson("", "", null, null, null) : ideaCardContentJson2;
        if ((i & 8) != 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            ideaCardPresentationJson2 = new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, "");
        }
        this(str6, jsonElement2, ideaCardContentJson2, ideaCardPresentationJson2, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? C0881AGi.A00 : list4, (i & 128) != 0 ? null : list3);
    }

    public /* synthetic */ IdeaCardDetailJson(int i, String str, JsonElement jsonElement, IdeaCardContentJson ideaCardContentJson, IdeaCardPresentationJson ideaCardPresentationJson, String str2, String str3, List list, List list2, C2hx c2hx) {
        List list3 = list;
        this.id = C3cG.A0Z(i, str);
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
        this.items = (i & 64) == 0 ? C0881AGi.A00 : list3;
        if ((i & 128) == 0) {
            this.connectionIds = null;
        } else {
            this.connectionIds = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdeaCardDetailJson() {
        this((String) null, (JsonElement) (0 == true ? 1 : 0), (IdeaCardContentJson) (0 == true ? 1 : 0), (IdeaCardPresentationJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), 255, (C06H) (0 == true ? 1 : 0));
    }
}
