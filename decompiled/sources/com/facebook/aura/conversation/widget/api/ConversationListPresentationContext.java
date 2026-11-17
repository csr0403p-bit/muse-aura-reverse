package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C1D3;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConversationListPresentationContext extends C06G {
    public static final int $stable = 0;
    public final long containerBackgroundColor;
    public final C1D3 containerShape;
    public final String presentationId;
    public final String sessionId;

    /* renamed from: copy-9LQNqLg$default, reason: not valid java name */
    public static /* synthetic */ ConversationListPresentationContext m714copy9LQNqLg$default(ConversationListPresentationContext conversationListPresentationContext, String str, String str2, long j, C1D3 c1d3, int i, Object obj) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        C1D3 c1d32 = c1d3;
        if ((i & 1) != 0) {
            str3 = conversationListPresentationContext.presentationId;
        }
        if ((i & 2) != 0) {
            str4 = conversationListPresentationContext.sessionId;
        }
        if ((i & 4) != 0) {
            j2 = conversationListPresentationContext.containerBackgroundColor;
        }
        if ((i & 8) != 0) {
            c1d32 = conversationListPresentationContext.containerShape;
        }
        AnonymousClass003.A0u(str3, str4);
        return new ConversationListPresentationContext(str3, str4, j2, c1d32);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConversationListPresentationContext) {
                ConversationListPresentationContext conversationListPresentationContext = (ConversationListPresentationContext) obj;
                if (C7384Etj.areEqual(this.presentationId, conversationListPresentationContext.presentationId) && C7384Etj.areEqual(this.sessionId, conversationListPresentationContext.sessionId)) {
                    long j = this.containerBackgroundColor;
                    long j2 = conversationListPresentationContext.containerBackgroundColor;
                    long j3 = B6A.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.containerShape, conversationListPresentationContext.containerShape)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.sessionId;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m715component30d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1D3 component4() {
        return this.containerShape;
    }

    /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m717getContainerBackgroundColor0d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1D3 getContainerShape() {
        return this.containerShape;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int iA0I = AnonymousClass005.A0I(this.sessionId, AnonymousClass001.A0G(this.presentationId));
        long j = this.containerBackgroundColor;
        long j2 = B6A.A01;
        return AnonymousClass006.A06(j, iA0I) + AnonymousClass006.A0D(this.containerShape);
    }

    public /* synthetic */ ConversationListPresentationContext(String str, String str2, long j, C1D3 c1d3, C06H c06h) {
        this(str, str2, j, c1d3);
    }

    /* renamed from: copy-9LQNqLg, reason: not valid java name */
    public final ConversationListPresentationContext m716copy9LQNqLg(String str, String str2, long j, C1D3 c1d3) {
        AnonymousClass003.A0u(str, str2);
        return new ConversationListPresentationContext(str, str2, j, c1d3);
    }

    public String toString() {
        return super.toString();
    }

    public ConversationListPresentationContext(String str, String str2, long j, C1D3 c1d3) {
        AnonymousClass003.A0u(str, str2);
        this.presentationId = str;
        this.sessionId = str2;
        this.containerBackgroundColor = j;
        this.containerShape = c1d3;
    }
}
