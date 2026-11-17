package com.facebook.aura.conversation.view;

import X.AHD;
import X.AnonymousClass003;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;

/* loaded from: classes.dex */
public interface TranscriptBubbleItem {

    public final class Cards implements TranscriptBubbleItem {
        public static final int $stable = 0;
        public final AHD<String> ids;
        public final String sequenceKey;

        public final AHD<String> getIds() {
            return this.ids;
        }

        @Override // com.facebook.aura.conversation.view.TranscriptBubbleItem
        public String getSequenceKey() {
            return this.sequenceKey;
        }

        public Cards(AHD<String> ahd, String str) {
            AnonymousClass003.A0u(ahd, str);
            this.ids = ahd;
            this.sequenceKey = str;
        }
    }

    public final class Text implements TranscriptBubbleItem {
        public static final int $stable = HatchRenderSegment.TextSegment.$stable;
        public final boolean isFirstNonEmpty;
        public final boolean isStreamingLast;
        public final HatchRenderSegment.TextSegment segment;
        public final String sequenceKey;

        public final HatchRenderSegment.TextSegment getSegment() {
            return this.segment;
        }

        @Override // com.facebook.aura.conversation.view.TranscriptBubbleItem
        public String getSequenceKey() {
            return this.sequenceKey;
        }

        public final boolean isFirstNonEmpty() {
            return this.isFirstNonEmpty;
        }

        public final boolean isStreamingLast() {
            return this.isStreamingLast;
        }

        public Text(HatchRenderSegment.TextSegment textSegment, boolean z, boolean z2, String str) {
            AnonymousClass003.A0w(textSegment, str);
            this.segment = textSegment;
            this.isStreamingLast = z;
            this.isFirstNonEmpty = z2;
            this.sequenceKey = str;
        }
    }

    String getSequenceKey();
}
