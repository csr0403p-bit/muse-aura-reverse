package com.facebook.aura.explore.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaCardSection extends C06G {
    public final AHD<IdeaCard> cards;
    public final IdeaCardLayout layout;
    public final String sectionId;
    public final String subtitle;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardSection) {
                IdeaCardSection ideaCardSection = (IdeaCardSection) obj;
                if (!C7384Etj.areEqual(this.sectionId, ideaCardSection.sectionId) || !C7384Etj.areEqual(this.title, ideaCardSection.title) || !C7384Etj.areEqual(this.subtitle, ideaCardSection.subtitle) || this.layout != ideaCardSection.layout || !C7384Etj.areEqual(this.cards, ideaCardSection.cards)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaCardSection copy$default(IdeaCardSection ideaCardSection, String str, String str2, String str3, IdeaCardLayout ideaCardLayout, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaCardSection.sectionId;
        }
        if ((i & 2) != 0) {
            str2 = ideaCardSection.title;
        }
        if ((i & 4) != 0) {
            str3 = ideaCardSection.subtitle;
        }
        if ((i & 8) != 0) {
            ideaCardLayout = ideaCardSection.layout;
        }
        if ((i & 16) != 0) {
            ahd = ideaCardSection.cards;
        }
        return ideaCardSection.copy(str, str2, str3, ideaCardLayout, ahd);
    }

    public final String component1() {
        return this.sectionId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final IdeaCardLayout component4() {
        return this.layout;
    }

    public final AHD<IdeaCard> component5() {
        return this.cards;
    }

    public final AHD<IdeaCard> getCards() {
        return this.cards;
    }

    public final IdeaCardLayout getLayout() {
        return this.layout;
    }

    public final String getSectionId() {
        return this.sectionId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.cards, AnonymousClass005.A0F(this.layout, (AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.sectionId)) + AnonymousClass006.A0G(this.subtitle)) * 31));
    }

    public IdeaCardSection(String str, String str2, String str3, IdeaCardLayout ideaCardLayout, AHD<IdeaCard> ahd) {
        AnonymousClass005.A0y(str, str2, ideaCardLayout);
        C7384Etj.A0Y(ahd, 4);
        this.sectionId = str;
        this.title = str2;
        this.subtitle = str3;
        this.layout = ideaCardLayout;
        this.cards = ahd;
    }

    public final IdeaCardSection copy(String str, String str2, String str3, IdeaCardLayout ideaCardLayout, AHD<IdeaCard> ahd) {
        AnonymousClass005.A0y(str, str2, ideaCardLayout);
        C7384Etj.A0Y(ahd, 4);
        return new IdeaCardSection(str, str2, str3, ideaCardLayout, ahd);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardSection(String str, String str2, String str3, IdeaCardLayout ideaCardLayout, AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3), (i & 8) != 0 ? IdeaCardLayout.IDEAS : ideaCardLayout, (i & 16) != 0 ? AHI.A01 : ahd);
    }

    public IdeaCardSection() {
        this("", "", null, IdeaCardLayout.IDEAS, AHI.A01);
    }
}
