package com.facebook.aura.conversation.view;

import X.AHD;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.HatchWidget;

/* loaded from: classes.dex */
public interface InlineWidgetRenderItem {

    public final class IdeaGroup extends C06G implements InlineWidgetRenderItem {
        public static final int $stable = 0;
        public final AHD<HatchIdeaCardRow> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public IdeaGroup(AHD<? extends HatchIdeaCardRow> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.rows = ahd;
        }

        public final IdeaGroup copy(AHD<? extends HatchIdeaCardRow> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new IdeaGroup(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaGroup) && C7384Etj.areEqual(this.rows, ((IdeaGroup) obj).rows));
        }

        public static /* synthetic */ IdeaGroup copy$default(IdeaGroup ideaGroup, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = ideaGroup.rows;
            }
            C7384Etj.A0Y(ahd, 0);
            return new IdeaGroup(ahd);
        }

        public final AHD<HatchIdeaCardRow> component1() {
            return this.rows;
        }

        public final AHD<HatchIdeaCardRow> getRows() {
            return this.rows;
        }

        public int hashCode() {
            return this.rows.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Single extends C06G implements InlineWidgetRenderItem {
        public static final int $stable = HatchWidget.$stable;
        public final HatchWidget widget;

        public Single(HatchWidget hatchWidget) {
            C7384Etj.A0Y(hatchWidget, 0);
            this.widget = hatchWidget;
        }

        public final Single copy(HatchWidget hatchWidget) {
            C7384Etj.A0Y(hatchWidget, 0);
            return new Single(hatchWidget);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Single) && C7384Etj.areEqual(this.widget, ((Single) obj).widget));
        }

        public static /* synthetic */ Single copy$default(Single single, HatchWidget hatchWidget, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchWidget = single.widget;
            }
            C7384Etj.A0Y(hatchWidget, 0);
            return new Single(hatchWidget);
        }

        public final HatchWidget component1() {
            return this.widget;
        }

        public final HatchWidget getWidget() {
            return this.widget;
        }

        public int hashCode() {
            return this.widget.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
