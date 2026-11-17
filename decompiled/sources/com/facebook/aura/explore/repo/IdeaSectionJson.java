package com.facebook.aura.explore.repo;

import X.AGI;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class IdeaSectionJson extends C06G {
    public final List<IdeaCardSummaryJson> cards;
    public final String id;
    public final IdeaSectionPresentationJson presentation;
    public final String subtitle;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, IdeaSectionJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<IdeaSectionJson> serializer() {
            return IdeaSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaSectionJson) {
                IdeaSectionJson ideaSectionJson = (IdeaSectionJson) obj;
                if (!C7384Etj.areEqual(this.id, ideaSectionJson.id) || !C7384Etj.areEqual(this.title, ideaSectionJson.title) || !C7384Etj.areEqual(this.subtitle, ideaSectionJson.subtitle) || !C7384Etj.areEqual(this.presentation, ideaSectionJson.presentation) || !C7384Etj.areEqual(this.cards, ideaSectionJson.cards)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaSectionJson copy$default(IdeaSectionJson ideaSectionJson, String str, String str2, String str3, IdeaSectionPresentationJson ideaSectionPresentationJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaSectionJson.id;
        }
        if ((i & 2) != 0) {
            str2 = ideaSectionJson.title;
        }
        if ((i & 4) != 0) {
            str3 = ideaSectionJson.subtitle;
        }
        if ((i & 8) != 0) {
            ideaSectionPresentationJson = ideaSectionJson.presentation;
        }
        if ((i & 16) != 0) {
            list = ideaSectionJson.cards;
        }
        return ideaSectionJson.copy(str, str2, str3, ideaSectionPresentationJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaSectionJson ideaSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(ideaSectionJson.id)) {
            c9j5.AAV(ideaSectionJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(ideaSectionJson.title)) {
            c9j5.AAV(ideaSectionJson.title, c9iZ, 1);
        }
        if (zAfR || ideaSectionJson.subtitle != null) {
            c9j5.AAP(ideaSectionJson.subtitle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(ideaSectionJson.presentation, new IdeaSectionPresentationJson(""))) {
            c9j5.AAQ(ideaSectionJson.presentation, IdeaSectionPresentationJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(ideaSectionJson.cards)) {
            c9j5.AAQ(ideaSectionJson.cards, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final IdeaSectionPresentationJson component4() {
        return this.presentation;
    }

    public final List<IdeaCardSummaryJson> component5() {
        return this.cards;
    }

    public final List<IdeaCardSummaryJson> getCards() {
        return this.cards;
    }

    public final String getId() {
        return this.id;
    }

    public final IdeaSectionPresentationJson getPresentation() {
        return this.presentation;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.cards, AnonymousClass005.A0F(this.presentation, (AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.subtitle)) * 31));
    }

    public final IdeaCardSection toDomain() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = null;
        if (str3 != null && str3.length() > 0) {
            str4 = str3;
        }
        IdeaCardLayout ideaCardLayoutFromWire = IdeaCardLayout.Companion.fromWire(this.presentation.layout);
        List<IdeaCardSummaryJson> list = this.cards;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<IdeaCardSummaryJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new IdeaCardSection(str, str2, str4, ideaCardLayoutFromWire, AGI.A07(arrayListA0i));
    }

    public IdeaSectionJson(String str, String str2, String str3, IdeaSectionPresentationJson ideaSectionPresentationJson, List<IdeaCardSummaryJson> list) {
        AnonymousClass005.A0y(str, str2, ideaSectionPresentationJson);
        C7384Etj.A0Y(list, 4);
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.presentation = ideaSectionPresentationJson;
        this.cards = list;
    }

    public final IdeaSectionJson copy(String str, String str2, String str3, IdeaSectionPresentationJson ideaSectionPresentationJson, List<IdeaCardSummaryJson> list) {
        AnonymousClass005.A0y(str, str2, ideaSectionPresentationJson);
        C7384Etj.A0Y(list, 4);
        return new IdeaSectionJson(str, str2, str3, ideaSectionPresentationJson, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaSectionJson(String str, String str2, String str3, IdeaSectionPresentationJson ideaSectionPresentationJson, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new IdeaSectionPresentationJson("") : ideaSectionPresentationJson, (i & 16) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ IdeaSectionJson(int i, String str, String str2, String str3, IdeaSectionPresentationJson ideaSectionPresentationJson, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str3;
        }
        if ((i & 8) == 0) {
            this.presentation = new IdeaSectionPresentationJson("");
        } else {
            this.presentation = ideaSectionPresentationJson;
        }
        if ((i & 16) == 0) {
            this.cards = C0881AGi.A00;
        } else {
            this.cards = list;
        }
    }

    public IdeaSectionJson() {
        this("", "", null, new IdeaSectionPresentationJson(""), C0881AGi.A00);
    }
}
