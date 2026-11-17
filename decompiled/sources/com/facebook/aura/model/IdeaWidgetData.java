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
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class IdeaWidgetData extends C06G implements HatchWidgetData {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public final String categoryLabel;
    public final String createdAt;
    public final String dateLabel;
    public final String iconMimeType;
    public final String iconUrl;
    public final String id;
    public final String ideaId;
    public final String installMarkdown;
    public final List<IdeaWidgetItemData> items;
    public final String kind;
    public final String lane;
    public final String previewImageUrl;
    public final String rationale;
    public final IdeaSharing sharing;
    public final boolean showDoItButton;
    public final String summary;
    public final List<String> tags;
    public final String title;
    public final String updatedAt;
    public static final Companion Companion = new Companion();
    public static final int $stable = IdeaSharing.$stable;

    public final class Companion {
        public final C9hr<IdeaWidgetData> serializer() {
            return IdeaWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(num, IdeaWidgetData$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, IdeaWidgetData$Companion$$childSerializers$2.INSTANCE), null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaWidgetData) {
                IdeaWidgetData ideaWidgetData = (IdeaWidgetData) obj;
                if (!C7384Etj.areEqual(this.ideaId, ideaWidgetData.ideaId) || !C7384Etj.areEqual(this.id, ideaWidgetData.id) || !C7384Etj.areEqual(this.kind, ideaWidgetData.kind) || !C7384Etj.areEqual(this.title, ideaWidgetData.title) || !C7384Etj.areEqual(this.summary, ideaWidgetData.summary) || !C7384Etj.areEqual(this.rationale, ideaWidgetData.rationale) || !C7384Etj.areEqual(this.categoryLabel, ideaWidgetData.categoryLabel) || !C7384Etj.areEqual(this.dateLabel, ideaWidgetData.dateLabel) || !C7384Etj.areEqual(this.lane, ideaWidgetData.lane) || !C7384Etj.areEqual(this.previewImageUrl, ideaWidgetData.previewImageUrl) || !C7384Etj.areEqual(this.iconUrl, ideaWidgetData.iconUrl) || !C7384Etj.areEqual(this.iconMimeType, ideaWidgetData.iconMimeType) || !C7384Etj.areEqual(this.installMarkdown, ideaWidgetData.installMarkdown) || !C7384Etj.areEqual(this.createdAt, ideaWidgetData.createdAt) || !C7384Etj.areEqual(this.updatedAt, ideaWidgetData.updatedAt) || !C7384Etj.areEqual(this.items, ideaWidgetData.items) || !C7384Etj.areEqual(this.tags, ideaWidgetData.tags) || this.showDoItButton != ideaWidgetData.showDoItButton || !C7384Etj.areEqual(this.sharing, ideaWidgetData.sharing)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(IdeaWidgetData ideaWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(ideaWidgetData.ideaId, c9iZ, 0);
        c9j5.AAV(ideaWidgetData.id, c9iZ, 1);
        c9j5.AAV(ideaWidgetData.kind, c9iZ, 2);
        c9j5.AAV(ideaWidgetData.title, c9iZ, 3);
        c9j5.AAV(ideaWidgetData.summary, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaWidgetData.rationale != null) {
            c9j5.AAP(ideaWidgetData.rationale, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || ideaWidgetData.categoryLabel != null) {
            c9j5.AAP(ideaWidgetData.categoryLabel, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || ideaWidgetData.dateLabel != null) {
            c9j5.AAP(ideaWidgetData.dateLabel, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || ideaWidgetData.lane != null) {
            c9j5.AAP(ideaWidgetData.lane, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || ideaWidgetData.previewImageUrl != null) {
            c9j5.AAP(ideaWidgetData.previewImageUrl, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || ideaWidgetData.iconUrl != null) {
            c9j5.AAP(ideaWidgetData.iconUrl, C07779iq.A01, c9iZ, 10);
        }
        if (zAfR || ideaWidgetData.iconMimeType != null) {
            c9j5.AAP(ideaWidgetData.iconMimeType, C07779iq.A01, c9iZ, 11);
        }
        if (zAfR || ideaWidgetData.installMarkdown != null) {
            c9j5.AAP(ideaWidgetData.installMarkdown, C07779iq.A01, c9iZ, 12);
        }
        if (zAfR || ideaWidgetData.createdAt != null) {
            c9j5.AAP(ideaWidgetData.createdAt, C07779iq.A01, c9iZ, 13);
        }
        if (zAfR || ideaWidgetData.updatedAt != null) {
            c9j5.AAP(ideaWidgetData.updatedAt, C07779iq.A01, c9iZ, 14);
        }
        if (zAfR || !C7384Etj.areEqual(ideaWidgetData.items, C0881AGi.A00)) {
            c9j5.AAQ(ideaWidgetData.items, C06G.A0e(f0cArr, 15), c9iZ, 15);
        }
        if (zAfR || !C7384Etj.areEqual(ideaWidgetData.tags, C0881AGi.A00)) {
            c9j5.AAQ(ideaWidgetData.tags, C06G.A0e(f0cArr, 16), c9iZ, 16);
        }
        if (zAfR || !ideaWidgetData.showDoItButton) {
            c9j5.AA7(c9iZ, 17, ideaWidgetData.showDoItButton);
        }
        if (!zAfR) {
            IdeaSharing ideaSharing = ideaWidgetData.sharing;
            int i = IdeaSharing.$stable;
            if (C7384Etj.areEqual(ideaSharing, new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null))) {
                return;
            }
        }
        c9j5.AAQ(ideaWidgetData.sharing, IdeaSharing$$serializer.INSTANCE, c9iZ, 18);
    }

    public final String component1() {
        return this.ideaId;
    }

    public final String component10() {
        return this.previewImageUrl;
    }

    public final String component11() {
        return this.iconUrl;
    }

    public final String component12() {
        return this.iconMimeType;
    }

    public final String component13() {
        return this.installMarkdown;
    }

    public final String component14() {
        return this.createdAt;
    }

    public final String component15() {
        return this.updatedAt;
    }

    public final List<IdeaWidgetItemData> component16() {
        return this.items;
    }

    public final List<String> component17() {
        return this.tags;
    }

    public final boolean component18() {
        return this.showDoItButton;
    }

    public final IdeaSharing component19() {
        return this.sharing;
    }

    public final String component2() {
        return this.id;
    }

    public final String component3() {
        return this.kind;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.rationale;
    }

    public final String component7() {
        return this.categoryLabel;
    }

    public final String component8() {
        return this.dateLabel;
    }

    public final String component9() {
        return this.lane;
    }

    public final String getCategoryLabel() {
        return this.categoryLabel;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDateLabel() {
        return this.dateLabel;
    }

    public final String getIconMimeType() {
        return this.iconMimeType;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIdeaId() {
        return this.ideaId;
    }

    public final String getInstallMarkdown() {
        return this.installMarkdown;
    }

    public final List<IdeaWidgetItemData> getItems() {
        return this.items;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getLane() {
        return this.lane;
    }

    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final String getRationale() {
        return this.rationale;
    }

    public final IdeaSharing getSharing() {
        return this.sharing;
    }

    public final boolean getShowDoItButton() {
        return this.showDoItButton;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sharing, C0KA.A01(AnonymousClass005.A0F(this.tags, AnonymousClass005.A0F(this.items, (((((((((((((((((((AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass005.A0I(this.kind, AnonymousClass005.A0I(this.id, AnonymousClass001.A0G(this.ideaId))))) + AnonymousClass006.A0G(this.rationale)) * 31) + AnonymousClass006.A0G(this.categoryLabel)) * 31) + AnonymousClass006.A0G(this.dateLabel)) * 31) + AnonymousClass006.A0G(this.lane)) * 31) + AnonymousClass006.A0G(this.previewImageUrl)) * 31) + AnonymousClass006.A0G(this.iconUrl)) * 31) + AnonymousClass006.A0G(this.iconMimeType)) * 31) + AnonymousClass006.A0G(this.installMarkdown)) * 31) + AnonymousClass006.A0G(this.createdAt)) * 31) + AnonymousClass005.A0H(this.updatedAt)) * 31)), this.showDoItButton));
    }

    public IdeaWidgetData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<IdeaWidgetItemData> list, List<String> list2, boolean z, IdeaSharing ideaSharing) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A12(list, list2);
        C7384Etj.A0Y(ideaSharing, 18);
        this.ideaId = str;
        this.id = str2;
        this.kind = str3;
        this.title = str4;
        this.summary = str5;
        this.rationale = str6;
        this.categoryLabel = str7;
        this.dateLabel = str8;
        this.lane = str9;
        this.previewImageUrl = str10;
        this.iconUrl = str11;
        this.iconMimeType = str12;
        this.installMarkdown = str13;
        this.createdAt = str14;
        this.updatedAt = str15;
        this.items = list;
        this.tags = list2;
        this.showDoItButton = z;
        this.sharing = ideaSharing;
    }

    public final IdeaWidgetData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List<IdeaWidgetItemData> list, List<String> list2, boolean z, IdeaSharing ideaSharing) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        AnonymousClass003.A12(list, list2);
        C7384Etj.A0Y(ideaSharing, 18);
        return new IdeaWidgetData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, list, list2, z, ideaSharing);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ IdeaWidgetData copy$default(IdeaWidgetData ideaWidgetData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, List list2, boolean z, IdeaSharing ideaSharing, int i, Object obj) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str10;
        String str26 = str11;
        String str27 = str12;
        String str28 = str13;
        String str29 = str14;
        String str30 = str15;
        List list3 = list;
        boolean z2 = z;
        List list4 = list2;
        IdeaSharing ideaSharing2 = ideaSharing;
        if ((i & 1) != 0) {
            str16 = ideaWidgetData.ideaId;
        }
        if ((i & 2) != 0) {
            str17 = ideaWidgetData.id;
        }
        if ((i & 4) != 0) {
            str18 = ideaWidgetData.kind;
        }
        if ((i & 8) != 0) {
            str19 = ideaWidgetData.title;
        }
        if ((i & 16) != 0) {
            str20 = ideaWidgetData.summary;
        }
        if ((i & 32) != 0) {
            str21 = ideaWidgetData.rationale;
        }
        if ((i & 64) != 0) {
            str22 = ideaWidgetData.categoryLabel;
        }
        if ((i & 128) != 0) {
            str23 = ideaWidgetData.dateLabel;
        }
        if ((i & 256) != 0) {
            str24 = ideaWidgetData.lane;
        }
        if ((i & 512) != 0) {
            str25 = ideaWidgetData.previewImageUrl;
        }
        if ((i & 1024) != 0) {
            str26 = ideaWidgetData.iconUrl;
        }
        if ((i & 2048) != 0) {
            str27 = ideaWidgetData.iconMimeType;
        }
        if ((i & 4096) != 0) {
            str28 = ideaWidgetData.installMarkdown;
        }
        if ((i & 8192) != 0) {
            str29 = ideaWidgetData.createdAt;
        }
        if ((i & 16384) != 0) {
            str30 = ideaWidgetData.updatedAt;
        }
        if ((i & 32768) != 0) {
            list3 = ideaWidgetData.items;
        }
        if ((i & 65536) != 0) {
            list4 = ideaWidgetData.tags;
        }
        if ((i & 131072) != 0) {
            z2 = ideaWidgetData.showDoItButton;
        }
        if ((i & 262144) != 0) {
            ideaSharing2 = ideaWidgetData.sharing;
        }
        String str31 = str22;
        return ideaWidgetData.copy(str16, str17, str18, str19, str20, str21, str31, str23, str24, str25, str26, str27, str28, str29, str30, list3, list4, z2, ideaSharing2);
    }

    public /* synthetic */ IdeaWidgetData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, List list2, boolean z, IdeaSharing ideaSharing, C2hx c2hx) {
        boolean z2 = z;
        IdeaSharing ideaSharing2 = ideaSharing;
        List list3 = list;
        List list4 = list2;
        if (31 != (i & 31)) {
            C9iI.A00(IdeaWidgetData$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.ideaId = str;
        this.id = str2;
        this.kind = str3;
        this.title = str4;
        this.summary = str5;
        if ((i & 32) == 0) {
            this.rationale = null;
        } else {
            this.rationale = str6;
        }
        if ((i & 64) == 0) {
            this.categoryLabel = null;
        } else {
            this.categoryLabel = str7;
        }
        if ((i & 128) == 0) {
            this.dateLabel = null;
        } else {
            this.dateLabel = str8;
        }
        if ((i & 256) == 0) {
            this.lane = null;
        } else {
            this.lane = str9;
        }
        if ((i & 512) == 0) {
            this.previewImageUrl = null;
        } else {
            this.previewImageUrl = str10;
        }
        if ((i & 1024) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str11;
        }
        if ((i & 2048) == 0) {
            this.iconMimeType = null;
        } else {
            this.iconMimeType = str12;
        }
        if ((i & 4096) == 0) {
            this.installMarkdown = null;
        } else {
            this.installMarkdown = str13;
        }
        if ((i & 8192) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str14;
        }
        if ((i & 16384) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str15;
        }
        this.items = (32768 & i) == 0 ? C0881AGi.A00 : list3;
        this.tags = (65536 & i) == 0 ? C0881AGi.A00 : list4;
        this.showDoItButton = (131072 & i) == 0 ? true : z2;
        if ((i & 262144) == 0) {
            int i2 = IdeaSharing.$stable;
            ideaSharing2 = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        }
        this.sharing = ideaSharing2;
    }

    public /* synthetic */ IdeaWidgetData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, List list, List list2, boolean z, IdeaSharing ideaSharing, int i, C06H c06h) {
        IdeaSharing ideaSharing2 = ideaSharing;
        str6 = (i & 32) != 0 ? null : str6;
        str7 = (i & 64) != 0 ? null : str7;
        str8 = (i & 128) != 0 ? null : str8;
        str9 = (i & 256) != 0 ? null : str9;
        str10 = (i & 512) != 0 ? null : str10;
        str11 = (i & 1024) != 0 ? null : str11;
        str12 = (i & 2048) != 0 ? null : str12;
        str13 = (i & 4096) != 0 ? null : str13;
        str14 = (i & 8192) != 0 ? null : str14;
        str15 = (i & 16384) != 0 ? null : str15;
        list = (32768 & i) != 0 ? C0881AGi.A00 : list;
        list2 = (65536 & i) != 0 ? C0881AGi.A00 : list2;
        z = (131072 & i) != 0 ? true : z;
        if ((i & 262144) != 0) {
            int i2 = IdeaSharing.$stable;
            ideaSharing2 = new IdeaSharing(IdeaSharingKind.UNAVAILABLE, null);
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, list, list2, z, ideaSharing2);
    }
}
