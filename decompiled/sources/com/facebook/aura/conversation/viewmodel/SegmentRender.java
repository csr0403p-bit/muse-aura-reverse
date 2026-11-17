package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityState;

/* loaded from: classes3.dex */
public final class SegmentRender extends C06G {
    public static final int $stable = 8;
    public final int inlineEntityCount;
    public final ConversationInlineEntityState inlineEntityState;
    public final String markdown;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SegmentRender) {
                SegmentRender segmentRender = (SegmentRender) obj;
                if (!C7384Etj.areEqual(this.markdown, segmentRender.markdown) || !C7384Etj.areEqual(this.inlineEntityState, segmentRender.inlineEntityState) || this.inlineEntityCount != segmentRender.inlineEntityCount) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SegmentRender copy$default(SegmentRender segmentRender, String str, ConversationInlineEntityState conversationInlineEntityState, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = segmentRender.markdown;
        }
        if ((i2 & 2) != 0) {
            conversationInlineEntityState = segmentRender.inlineEntityState;
        }
        if ((i2 & 4) != 0) {
            i = segmentRender.inlineEntityCount;
        }
        return segmentRender.copy(str, conversationInlineEntityState, i);
    }

    public final String component1() {
        return this.markdown;
    }

    public final ConversationInlineEntityState component2() {
        return this.inlineEntityState;
    }

    public final int component3() {
        return this.inlineEntityCount;
    }

    public final int getInlineEntityCount() {
        return this.inlineEntityCount;
    }

    public final ConversationInlineEntityState getInlineEntityState() {
        return this.inlineEntityState;
    }

    public final String getMarkdown() {
        return this.markdown;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.inlineEntityState, AnonymousClass001.A0G(this.markdown)) + this.inlineEntityCount;
    }

    public SegmentRender(String str, ConversationInlineEntityState conversationInlineEntityState, int i) {
        AnonymousClass003.A0u(str, conversationInlineEntityState);
        this.markdown = str;
        this.inlineEntityState = conversationInlineEntityState;
        this.inlineEntityCount = i;
    }

    public final SegmentRender copy(String str, ConversationInlineEntityState conversationInlineEntityState, int i) {
        AnonymousClass003.A0u(str, conversationInlineEntityState);
        return new SegmentRender(str, conversationInlineEntityState, i);
    }

    public String toString() {
        return super.toString();
    }
}
