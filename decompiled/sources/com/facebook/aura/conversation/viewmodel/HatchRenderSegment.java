package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchContentViewModelData;

/* loaded from: classes.dex */
public abstract class HatchRenderSegment {
    public static final int $stable = 8;

    public final class ActivitySegment extends HatchRenderSegment {
        public static final int $stable = ActivitySubAgentRowUiModel.$stable;
        public final String headerLabel;
        public final boolean isActive;
        public final AHD<ActivitySubAgentRowUiModel> subAgentRows;

        public ActivitySegment(AHD<ActivitySubAgentRowUiModel> ahd, boolean z, String str) {
            C7384Etj.A0Y(ahd, 0);
            this.subAgentRows = ahd;
            this.isActive = z;
            this.headerLabel = str;
        }

        public final ActivitySegment copy(AHD<ActivitySubAgentRowUiModel> ahd, boolean z, String str) {
            C7384Etj.A0Y(ahd, 0);
            return new ActivitySegment(ahd, z, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActivitySegment) {
                    ActivitySegment activitySegment = (ActivitySegment) obj;
                    if (!C7384Etj.areEqual(this.subAgentRows, activitySegment.subAgentRows) || this.isActive != activitySegment.isActive || !C7384Etj.areEqual(this.headerLabel, activitySegment.headerLabel)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActivitySegment copy$default(ActivitySegment activitySegment, AHD ahd, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = activitySegment.subAgentRows;
            }
            if ((i & 2) != 0) {
                z = activitySegment.isActive;
            }
            if ((i & 4) != 0) {
                str = activitySegment.headerLabel;
            }
            return activitySegment.copy(ahd, z, str);
        }

        public final AHD<ActivitySubAgentRowUiModel> component1() {
            return this.subAgentRows;
        }

        public final boolean component2() {
            return this.isActive;
        }

        public final String component3() {
            return this.headerLabel;
        }

        public final String getHeaderLabel() {
            return this.headerLabel;
        }

        public final AHD<ActivitySubAgentRowUiModel> getSubAgentRows() {
            return this.subAgentRows;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass005.A0E(this.subAgentRows), this.isActive) + AnonymousClass006.A0G(this.headerLabel);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ActivitySegment(AHD ahd, boolean z, String str, int i, C06H c06h) {
            this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass006.A0t(i, str));
        }

        public ActivitySegment() {
            this(AHI.A01, false, null);
        }
    }

    public final class TextSegment extends HatchRenderSegment {
        public static final int $stable = HatchContentBlock.TextBlock.$stable;
        public final HatchContentBlock.TextBlock block;
        public final boolean isLast;
        public final AHD<HatchContentViewModelData> richContent;
        public final AHD<String> widgetTokenIds;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TextSegment) {
                    TextSegment textSegment = (TextSegment) obj;
                    if (!C7384Etj.areEqual(this.block, textSegment.block) || this.isLast != textSegment.isLast || !C7384Etj.areEqual(this.richContent, textSegment.richContent) || !C7384Etj.areEqual(this.widgetTokenIds, textSegment.widgetTokenIds)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TextSegment copy$default(TextSegment textSegment, HatchContentBlock.TextBlock textBlock, boolean z, AHD ahd, AHD ahd2, int i, Object obj) {
            if ((i & 1) != 0) {
                textBlock = textSegment.block;
            }
            if ((i & 2) != 0) {
                z = textSegment.isLast;
            }
            if ((i & 4) != 0) {
                ahd = textSegment.richContent;
            }
            if ((i & 8) != 0) {
                ahd2 = textSegment.widgetTokenIds;
            }
            AnonymousClass003.A0w(textBlock, ahd2);
            return new TextSegment(textBlock, z, ahd, ahd2);
        }

        public final HatchContentBlock.TextBlock component1() {
            return this.block;
        }

        public final boolean component2() {
            return this.isLast;
        }

        public final AHD<HatchContentViewModelData> component3() {
            return this.richContent;
        }

        public final AHD<String> component4() {
            return this.widgetTokenIds;
        }

        public final HatchContentBlock.TextBlock getBlock() {
            return this.block;
        }

        public final AHD<HatchContentViewModelData> getRichContent() {
            return this.richContent;
        }

        public final AHD<String> getWidgetTokenIds() {
            return this.widgetTokenIds;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.widgetTokenIds, (C0KA.A01(AnonymousClass005.A0E(this.block), this.isLast) + AnonymousClass006.A0D(this.richContent)) * 31);
        }

        public final boolean isLast() {
            return this.isLast;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextSegment(HatchContentBlock.TextBlock textBlock, boolean z, AHD<? extends HatchContentViewModelData> ahd, AHD<String> ahd2) {
            AnonymousClass003.A0w(textBlock, ahd2);
            this.block = textBlock;
            this.isLast = z;
            this.richContent = ahd;
            this.widgetTokenIds = ahd2;
        }

        public final TextSegment copy(HatchContentBlock.TextBlock textBlock, boolean z, AHD<? extends HatchContentViewModelData> ahd, AHD<String> ahd2) {
            AnonymousClass003.A0w(textBlock, ahd2);
            return new TextSegment(textBlock, z, ahd, ahd2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ TextSegment(HatchContentBlock.TextBlock textBlock, boolean z, AHD ahd, AHD ahd2, int i, C06H c06h) {
            this(textBlock, z, (i & 4) != 0 ? null : ahd, (i & 8) != 0 ? AHI.A01 : ahd2);
        }
    }

    public final class WidgetTokenSegment extends HatchRenderSegment {
        public static final int $stable = 0;
        public final AHD<String> widgetTokenIds;

        public WidgetTokenSegment(AHD<String> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.widgetTokenIds = ahd;
        }

        public final WidgetTokenSegment copy(AHD<String> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new WidgetTokenSegment(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WidgetTokenSegment) && C7384Etj.areEqual(this.widgetTokenIds, ((WidgetTokenSegment) obj).widgetTokenIds));
        }

        public static /* synthetic */ WidgetTokenSegment copy$default(WidgetTokenSegment widgetTokenSegment, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = widgetTokenSegment.widgetTokenIds;
            }
            C7384Etj.A0Y(ahd, 0);
            return new WidgetTokenSegment(ahd);
        }

        public final AHD<String> component1() {
            return this.widgetTokenIds;
        }

        public final AHD<String> getWidgetTokenIds() {
            return this.widgetTokenIds;
        }

        public int hashCode() {
            return this.widgetTokenIds.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public /* synthetic */ HatchRenderSegment(C06H c06h) {
    }

    public HatchRenderSegment() {
    }
}
