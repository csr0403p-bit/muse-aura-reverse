package com.facebook.aura.conversation.view;

import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.IdeaWidgetData;
import com.facebook.aura.model.NavigationWidgetData;

/* loaded from: classes.dex */
public interface HatchIdeaCardRow {

    public final class Idea extends C06G implements HatchIdeaCardRow {
        public static final int $stable = IdeaWidgetData.$stable;
        public final IdeaWidgetData data;

        public Idea(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            this.data = ideaWidgetData;
        }

        public final Idea copy(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            return new Idea(ideaWidgetData);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Idea) && C7384Etj.areEqual(this.data, ((Idea) obj).data));
        }

        public static /* synthetic */ Idea copy$default(Idea idea, IdeaWidgetData ideaWidgetData, int i, Object obj) {
            if ((i & 1) != 0) {
                ideaWidgetData = idea.data;
            }
            C7384Etj.A0Y(ideaWidgetData, 0);
            return new Idea(ideaWidgetData);
        }

        public final IdeaWidgetData component1() {
            return this.data;
        }

        public final IdeaWidgetData getData() {
            return this.data;
        }

        @Override // com.facebook.aura.conversation.view.HatchIdeaCardRow
        public String getSummary() {
            return this.data.summary;
        }

        @Override // com.facebook.aura.conversation.view.HatchIdeaCardRow
        public String getTitle() {
            return this.data.title;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Navigation extends C06G implements HatchIdeaCardRow {
        public static final int $stable = NavigationWidgetData.$stable;
        public final NavigationWidgetData data;

        public Navigation(NavigationWidgetData navigationWidgetData) {
            C7384Etj.A0Y(navigationWidgetData, 0);
            this.data = navigationWidgetData;
        }

        public final Navigation copy(NavigationWidgetData navigationWidgetData) {
            C7384Etj.A0Y(navigationWidgetData, 0);
            return new Navigation(navigationWidgetData);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Navigation) && C7384Etj.areEqual(this.data, ((Navigation) obj).data));
        }

        public static /* synthetic */ Navigation copy$default(Navigation navigation, NavigationWidgetData navigationWidgetData, int i, Object obj) {
            if ((i & 1) != 0) {
                navigationWidgetData = navigation.data;
            }
            C7384Etj.A0Y(navigationWidgetData, 0);
            return new Navigation(navigationWidgetData);
        }

        public final NavigationWidgetData component1() {
            return this.data;
        }

        public final NavigationWidgetData getData() {
            return this.data;
        }

        @Override // com.facebook.aura.conversation.view.HatchIdeaCardRow
        public String getSummary() {
            return this.data.summary;
        }

        @Override // com.facebook.aura.conversation.view.HatchIdeaCardRow
        public String getTitle() {
            return this.data.title;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    String getSummary();

    String getTitle();
}
