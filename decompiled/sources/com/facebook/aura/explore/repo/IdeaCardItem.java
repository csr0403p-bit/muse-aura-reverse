package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaCardItem extends C06G {
    public final String buildSummary;
    public final String detailDescription;
    public final boolean isSelected;
    public final String itemId;
    public final String kind;
    public final String previewImageUrl;
    public final boolean selectable;
    public final String summary;
    public final String title;
    public final String tone;

    public IdeaCardItem() {
        this("", "", true, false, "", "", null, null, null, "");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardItem) {
                IdeaCardItem ideaCardItem = (IdeaCardItem) obj;
                if (!C7384Etj.areEqual(this.itemId, ideaCardItem.itemId) || !C7384Etj.areEqual(this.kind, ideaCardItem.kind) || this.selectable != ideaCardItem.selectable || this.isSelected != ideaCardItem.isSelected || !C7384Etj.areEqual(this.title, ideaCardItem.title) || !C7384Etj.areEqual(this.summary, ideaCardItem.summary) || !C7384Etj.areEqual(this.buildSummary, ideaCardItem.buildSummary) || !C7384Etj.areEqual(this.previewImageUrl, ideaCardItem.previewImageUrl) || !C7384Etj.areEqual(this.detailDescription, ideaCardItem.detailDescription) || !C7384Etj.areEqual(this.tone, ideaCardItem.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardItem copy$default(IdeaCardItem ideaCardItem, String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardItem.itemId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardItem.kind;
        }
        if ((i & 4) != 0) {
            z = ideaCardItem.selectable;
        }
        if ((i & 8) != 0) {
            z2 = ideaCardItem.isSelected;
        }
        if ((i & 16) != 0) {
            str3 = ideaCardItem.title;
        }
        if ((i & 32) != 0) {
            str4 = ideaCardItem.summary;
        }
        if ((i & 64) != 0) {
            str5 = ideaCardItem.buildSummary;
        }
        if ((i & 128) != 0) {
            str6 = ideaCardItem.previewImageUrl;
        }
        if ((i & 256) != 0) {
            str7 = ideaCardItem.detailDescription;
        }
        if ((i & 512) != 0) {
            str8 = ideaCardItem.tone;
        }
        return ideaCardItem.copy(str, str2, z, z2, str3, str4, str5, str6, str7, str8);
    }

    public final String component1() {
        return this.itemId;
    }

    public final String component10() {
        return this.tone;
    }

    public final String component2() {
        return this.kind;
    }

    public final boolean component3() {
        return this.selectable;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.summary;
    }

    public final String component7() {
        return this.buildSummary;
    }

    public final String component8() {
        return this.previewImageUrl;
    }

    public final String component9() {
        return this.detailDescription;
    }

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTone() {
        return this.tone;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.tone, (((((AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.itemId)), this.selectable), this.isSelected))) + AnonymousClass006.A0G(this.buildSummary)) * 31) + AnonymousClass006.A0G(this.previewImageUrl)) * 31) + AnonymousClass005.A0H(this.detailDescription)) * 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final IdeaCardItem copy(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(str8, 9);
        return new IdeaCardItem(str, str2, z, z2, str3, str4, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardItem(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? "" : str8);
    }

    public IdeaCardItem(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(str8, 9);
        this.itemId = str;
        this.kind = str2;
        this.selectable = z;
        this.isSelected = z2;
        this.title = str3;
        this.summary = str4;
        this.buildSummary = str5;
        this.previewImageUrl = str6;
        this.detailDescription = str7;
        this.tone = str8;
    }
}
