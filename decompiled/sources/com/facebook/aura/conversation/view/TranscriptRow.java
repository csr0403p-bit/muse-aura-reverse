package com.facebook.aura.conversation.view;

import X.AHD;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import java.util.List;

/* loaded from: classes.dex */
public interface TranscriptRow {

    public final class BareActivity implements TranscriptRow {
        public static final int $stable = HatchRenderSegment.ActivitySegment.$stable;
        public final HatchRenderSegment.ActivitySegment segment;

        public BareActivity(HatchRenderSegment.ActivitySegment activitySegment) {
            C7384Etj.A0Y(activitySegment, 0);
            this.segment = activitySegment;
        }

        public final HatchRenderSegment.ActivitySegment getSegment() {
            return this.segment;
        }
    }

    public final class BareWidgets implements TranscriptRow {
        public static final int $stable = 0;
        public final AHD<String> ids;
        public final String sequenceKey;

        public final AHD<String> getIds() {
            return this.ids;
        }

        public final String getSequenceKey() {
            return this.sequenceKey;
        }

        public BareWidgets(AHD<String> ahd, String str) {
            AnonymousClass003.A0u(ahd, str);
            this.ids = ahd;
            this.sequenceKey = str;
        }
    }

    public final class Bubble implements TranscriptRow {
        public static final int $stable = 8;
        public final boolean hasStreamingLast;
        public boolean includeTrailingContent;
        public final List<TranscriptBubbleItem> items;
        public final boolean showReactionBadge;

        /* JADX WARN: Multi-variable type inference failed */
        public Bubble(List<? extends TranscriptBubbleItem> list, boolean z, boolean z2) {
            C7384Etj.A0Y(list, 0);
            this.items = list;
            this.showReactionBadge = z;
            this.hasStreamingLast = z2;
        }

        public final boolean getHasStreamingLast() {
            return this.hasStreamingLast;
        }

        public final boolean getIncludeTrailingContent() {
            return this.includeTrailingContent;
        }

        public final List<TranscriptBubbleItem> getItems() {
            return this.items;
        }

        public final boolean getShowReactionBadge() {
            return this.showReactionBadge;
        }

        public final void setIncludeTrailingContent(boolean z) {
            this.includeTrailingContent = z;
        }
    }
}
