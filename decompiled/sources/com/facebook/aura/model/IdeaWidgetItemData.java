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

@Serializable
/* loaded from: classes.dex */
public final class IdeaWidgetItemData extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String buildSummary;
    public final String detailDescription;
    public final String id;
    public final String kind;
    public final String previewImageUrl;
    public final String status;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<IdeaWidgetItemData> serializer() {
            return IdeaWidgetItemData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ IdeaWidgetItemData copy$default(IdeaWidgetItemData ideaWidgetItemData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9 = str;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        if ((i & 1) != 0) {
            str9 = ideaWidgetItemData.id;
        }
        if ((i & 2) != 0) {
            str10 = ideaWidgetItemData.kind;
        }
        if ((i & 4) != 0) {
            str11 = ideaWidgetItemData.title;
        }
        if ((i & 8) != 0) {
            str12 = ideaWidgetItemData.summary;
        }
        if ((i & 16) != 0) {
            str13 = ideaWidgetItemData.buildSummary;
        }
        if ((i & 32) != 0) {
            str14 = ideaWidgetItemData.detailDescription;
        }
        if ((i & 64) != 0) {
            str15 = ideaWidgetItemData.previewImageUrl;
        }
        if ((i & 128) != 0) {
            str16 = ideaWidgetItemData.status;
        }
        AnonymousClass003.A0v(str9, str11);
        return new IdeaWidgetItemData(str9, str10, str11, str12, str13, str14, str15, str16);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(IdeaWidgetItemData ideaWidgetItemData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(ideaWidgetItemData.id, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || ideaWidgetItemData.kind != null) {
            c9j5.AAP(ideaWidgetItemData.kind, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAV(ideaWidgetItemData.title, c9iZ, 2);
        if (zAfR || ideaWidgetItemData.summary != null) {
            c9j5.AAP(ideaWidgetItemData.summary, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || ideaWidgetItemData.buildSummary != null) {
            c9j5.AAP(ideaWidgetItemData.buildSummary, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || ideaWidgetItemData.detailDescription != null) {
            c9j5.AAP(ideaWidgetItemData.detailDescription, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || ideaWidgetItemData.previewImageUrl != null) {
            c9j5.AAP(ideaWidgetItemData.previewImageUrl, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || ideaWidgetItemData.status != null) {
            c9j5.AAP(ideaWidgetItemData.status, C07779iq.A01, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaWidgetItemData) {
                IdeaWidgetItemData ideaWidgetItemData = (IdeaWidgetItemData) obj;
                if (!C7384Etj.areEqual(this.id, ideaWidgetItemData.id) || !C7384Etj.areEqual(this.kind, ideaWidgetItemData.kind) || !C7384Etj.areEqual(this.title, ideaWidgetItemData.title) || !C7384Etj.areEqual(this.summary, ideaWidgetItemData.summary) || !C7384Etj.areEqual(this.buildSummary, ideaWidgetItemData.buildSummary) || !C7384Etj.areEqual(this.detailDescription, ideaWidgetItemData.detailDescription) || !C7384Etj.areEqual(this.previewImageUrl, ideaWidgetItemData.previewImageUrl) || !C7384Etj.areEqual(this.status, ideaWidgetItemData.status)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.summary;
    }

    public final String component5() {
        return this.buildSummary;
    }

    public final String component6() {
        return this.detailDescription;
    }

    public final String component7() {
        return this.previewImageUrl;
    }

    public final String component8() {
        return this.status;
    }

    public final String getBuildSummary() {
        return this.buildSummary;
    }

    public final String getDetailDescription() {
        return this.detailDescription;
    }

    public final String getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPreviewImageUrl() {
        return this.previewImageUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.title, (AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.kind)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.buildSummary)) * 31) + AnonymousClass006.A0G(this.detailDescription)) * 31) + AnonymousClass006.A0G(this.previewImageUrl)) * 31) + AnonymousClass005.A0H(this.status);
    }

    public IdeaWidgetItemData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0v(str, str3);
        this.id = str;
        this.kind = str2;
        this.title = str3;
        this.summary = str4;
        this.buildSummary = str5;
        this.detailDescription = str6;
        this.previewImageUrl = str7;
        this.status = str8;
    }

    public final IdeaWidgetItemData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AnonymousClass003.A0v(str, str3);
        return new IdeaWidgetItemData(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaWidgetItemData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }

    public /* synthetic */ IdeaWidgetItemData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(IdeaWidgetItemData$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.kind = null;
        } else {
            this.kind = str2;
        }
        this.title = str3;
        if ((i & 8) == 0) {
            this.summary = null;
        } else {
            this.summary = str4;
        }
        if ((i & 16) == 0) {
            this.buildSummary = null;
        } else {
            this.buildSummary = str5;
        }
        if ((i & 32) == 0) {
            this.detailDescription = null;
        } else {
            this.detailDescription = str6;
        }
        if ((i & 64) == 0) {
            this.previewImageUrl = null;
        } else {
            this.previewImageUrl = str7;
        }
        if ((i & 128) == 0) {
            this.status = null;
        } else {
            this.status = str8;
        }
    }
}
