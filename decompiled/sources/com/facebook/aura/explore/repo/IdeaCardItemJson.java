package com.facebook.aura.explore.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class IdeaCardItemJson extends C06G {
    public static final Companion Companion = new Companion();
    public final IdeaItemContentJson content;
    public final String id;
    public final boolean isSelected;
    public final IdeaCardPresentationJson presentation;
    public final boolean selectable;
    public final String type;

    public final class Companion {
        public final C9hr<IdeaCardItemJson> serializer() {
            return IdeaCardItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardItemJson ideaCardItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaCardItemJson.id)) {
            c9j5.AAV(ideaCardItemJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(ideaCardItemJson.type)) {
            c9j5.AAV(ideaCardItemJson.type, c9iZ, 1);
        }
        if (zAfR || !ideaCardItemJson.selectable) {
            c9j5.AA7(c9iZ, 2, ideaCardItemJson.selectable);
        }
        if (zAfR || ideaCardItemJson.isSelected) {
            c9j5.AA7(c9iZ, 3, ideaCardItemJson.isSelected);
        }
        if (zAfR || !C7384Etj.areEqual(ideaCardItemJson.content, new IdeaItemContentJson("", null, null))) {
            c9j5.AAQ(ideaCardItemJson.content, IdeaItemContentJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (!zAfR) {
            IdeaCardPresentationJson ideaCardPresentationJson = ideaCardItemJson.presentation;
            C0881AGi c0881AGi = C0881AGi.A00;
            if (C7384Etj.areEqual(ideaCardPresentationJson, new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, ""))) {
                return;
            }
        }
        c9j5.AAQ(ideaCardItemJson.presentation, IdeaCardPresentationJson$$serializer.INSTANCE, c9iZ, 5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardItemJson) {
                IdeaCardItemJson ideaCardItemJson = (IdeaCardItemJson) obj;
                if (!C7384Etj.areEqual(this.id, ideaCardItemJson.id) || !C7384Etj.areEqual(this.type, ideaCardItemJson.type) || this.selectable != ideaCardItemJson.selectable || this.isSelected != ideaCardItemJson.isSelected || !C7384Etj.areEqual(this.content, ideaCardItemJson.content) || !C7384Etj.areEqual(this.presentation, ideaCardItemJson.presentation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaCardItemJson copy$default(IdeaCardItemJson ideaCardItemJson, String str, String str2, boolean z, boolean z2, IdeaItemContentJson ideaItemContentJson, IdeaCardPresentationJson ideaCardPresentationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardItemJson.id;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardItemJson.type;
        }
        if ((i & 4) != 0) {
            z = ideaCardItemJson.selectable;
        }
        if ((i & 8) != 0) {
            z2 = ideaCardItemJson.isSelected;
        }
        if ((i & 16) != 0) {
            ideaItemContentJson = ideaCardItemJson.content;
        }
        if ((i & 32) != 0) {
            ideaCardPresentationJson = ideaCardItemJson.presentation;
        }
        return ideaCardItemJson.copy(str, str2, z, z2, ideaItemContentJson, ideaCardPresentationJson);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final boolean component3() {
        return this.selectable;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    public final IdeaItemContentJson component5() {
        return this.content;
    }

    public final IdeaCardPresentationJson component6() {
        return this.presentation;
    }

    public final IdeaItemContentJson getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final IdeaCardPresentationJson getPresentation() {
        return this.presentation;
    }

    public final boolean getSelectable() {
        return this.selectable;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.presentation, AnonymousClass005.A0F(this.content, C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.type, AnonymousClass001.A0G(this.id)), this.selectable), this.isSelected)));
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final IdeaCardItem toDomain() {
        String str = this.id;
        String str2 = this.type;
        boolean z = this.selectable;
        boolean z2 = this.isSelected;
        IdeaItemContentJson ideaItemContentJson = this.content;
        String str3 = ideaItemContentJson.title;
        String str4 = ideaItemContentJson.summary;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = ideaItemContentJson.buildSummary;
        if (str5 == null || str5.length() <= 0) {
            str5 = null;
        }
        MediaRefJson mediaRefJson = this.presentation.previewImage;
        return new IdeaCardItem(str, str2, z, z2, str3, str4, str5, mediaRefJson != null ? mediaRefJson.firstUrl() : null, null, "");
    }

    public /* synthetic */ IdeaCardItemJson(int i, String str, String str2, boolean z, boolean z2, IdeaItemContentJson ideaItemContentJson, IdeaCardPresentationJson ideaCardPresentationJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str2;
        }
        if ((i & 4) == 0) {
            this.selectable = true;
        } else {
            this.selectable = z;
        }
        if ((i & 8) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z2;
        }
        if ((i & 16) == 0) {
            this.content = new IdeaItemContentJson("", null, null);
        } else {
            this.content = ideaItemContentJson;
        }
        if ((i & 32) != 0) {
            this.presentation = ideaCardPresentationJson;
        } else {
            C0881AGi c0881AGi = C0881AGi.A00;
            this.presentation = new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, "");
        }
    }

    public final IdeaCardItemJson copy(String str, String str2, boolean z, boolean z2, IdeaItemContentJson ideaItemContentJson, IdeaCardPresentationJson ideaCardPresentationJson) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(ideaItemContentJson, ideaCardPresentationJson);
        return new IdeaCardItemJson(str, str2, z, z2, ideaItemContentJson, ideaCardPresentationJson);
    }

    public String toString() {
        return super.toString();
    }

    public IdeaCardItemJson(String str, String str2, boolean z, boolean z2, IdeaItemContentJson ideaItemContentJson, IdeaCardPresentationJson ideaCardPresentationJson) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(ideaItemContentJson, ideaCardPresentationJson);
        this.id = str;
        this.type = str2;
        this.selectable = z;
        this.isSelected = z2;
        this.content = ideaItemContentJson;
        this.presentation = ideaCardPresentationJson;
    }

    public /* synthetic */ IdeaCardItemJson(String str, String str2, boolean z, boolean z2, IdeaItemContentJson ideaItemContentJson, IdeaCardPresentationJson ideaCardPresentationJson, int i, C06H c06h) {
        IdeaItemContentJson ideaItemContentJson2 = ideaItemContentJson;
        IdeaCardPresentationJson ideaCardPresentationJson2 = ideaCardPresentationJson;
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) == 0 ? str2 : "";
        boolean zA1Q = C60Q.A1Q(i & 4, z);
        boolean zA1K = C3cG.A1K(i & 8, z2);
        ideaItemContentJson2 = (i & 16) != 0 ? new IdeaItemContentJson("", null, null) : ideaItemContentJson2;
        if ((i & 32) != 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            ideaCardPresentationJson2 = new IdeaCardPresentationJson(null, null, c0881AGi, c0881AGi, null, "");
        }
        this(str3, str4, zA1Q, zA1K, ideaItemContentJson2, ideaCardPresentationJson2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public IdeaCardItemJson() {
        boolean z = false;
        this((String) null, (String) (0 == true ? 1 : 0), z, z, (IdeaItemContentJson) (0 == true ? 1 : 0), (IdeaCardPresentationJson) (0 == true ? 1 : 0), 63, (C06H) (0 == true ? 1 : 0));
    }
}
