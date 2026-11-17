package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class IdeaGroupWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 8;
    public final List<IdeaWidgetData> ideas;
    public final NavigationWidgetData navigation;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, IdeaGroupWidgetData$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<IdeaGroupWidgetData> serializer() {
            return IdeaGroupWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public IdeaGroupWidgetData(List<IdeaWidgetData> list, NavigationWidgetData navigationWidgetData) {
        C7384Etj.A0Y(list, 0);
        this.ideas = list;
        this.navigation = navigationWidgetData;
    }

    public final IdeaGroupWidgetData copy(List<IdeaWidgetData> list, NavigationWidgetData navigationWidgetData) {
        C7384Etj.A0Y(list, 0);
        return new IdeaGroupWidgetData(list, navigationWidgetData);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaGroupWidgetData) {
                IdeaGroupWidgetData ideaGroupWidgetData = (IdeaGroupWidgetData) obj;
                if (!C7384Etj.areEqual(this.ideas, ideaGroupWidgetData.ideas) || !C7384Etj.areEqual(this.navigation, ideaGroupWidgetData.navigation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaGroupWidgetData copy$default(IdeaGroupWidgetData ideaGroupWidgetData, List list, NavigationWidgetData navigationWidgetData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ideaGroupWidgetData.ideas;
        }
        if ((i & 2) != 0) {
            navigationWidgetData = ideaGroupWidgetData.navigation;
        }
        C7384Etj.A0Y(list, 0);
        return new IdeaGroupWidgetData(list, navigationWidgetData);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(IdeaGroupWidgetData ideaGroupWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(ideaGroupWidgetData.ideas)) {
            c9j5.AAQ(ideaGroupWidgetData.ideas, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || ideaGroupWidgetData.navigation != null) {
            c9j5.AAP(ideaGroupWidgetData.navigation, NavigationWidgetData$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<IdeaWidgetData> component1() {
        return this.ideas;
    }

    public final NavigationWidgetData component2() {
        return this.navigation;
    }

    public final List<IdeaWidgetData> getIdeas() {
        return this.ideas;
    }

    public final NavigationWidgetData getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.ideas) + AnonymousClass006.A0D(this.navigation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaGroupWidgetData(int i, List list, NavigationWidgetData navigationWidgetData, C2hx c2hx) {
        this.ideas = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.navigation = null;
        } else {
            this.navigation = navigationWidgetData;
        }
    }

    public /* synthetic */ IdeaGroupWidgetData(List list, NavigationWidgetData navigationWidgetData, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : navigationWidgetData);
    }

    public IdeaGroupWidgetData() {
        this(C0881AGi.A00, null);
    }
}
