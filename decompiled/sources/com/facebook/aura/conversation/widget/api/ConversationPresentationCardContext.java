package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.C06H;
import X.C1D3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConversationPresentationCardContext {
    public static final int $stable = 0;
    public final long containerBackgroundColor;
    public final C1D3 containerShape;
    public final boolean fromHistory;
    public final String hostMessageId;
    public final G0U<String, Unit> performAction;
    public final String presentationEventId;
    public final String presentationId;
    public final String sessionId;

    /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m718getContainerBackgroundColor0d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1D3 getContainerShape() {
        return this.containerShape;
    }

    public final boolean getFromHistory() {
        return this.fromHistory;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final G0U<String, Unit> getPerformAction() {
        return this.performAction;
    }

    public final String getPresentationEventId() {
        return this.presentationEventId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationPresentationCardContext(String str, String str2, boolean z, String str3, String str4, long j, C1D3 c1d3, G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0w(str, str3);
        AnonymousClass003.A10(c1d3, g0u);
        this.presentationId = str;
        this.presentationEventId = str2;
        this.fromHistory = z;
        this.hostMessageId = str3;
        this.sessionId = str4;
        this.containerBackgroundColor = j;
        this.containerShape = c1d3;
        this.performAction = g0u;
    }

    public /* synthetic */ ConversationPresentationCardContext(String str, String str2, boolean z, String str3, String str4, long j, C1D3 c1d3, G0U g0u, C06H c06h) {
        this(str, str2, z, str3, str4, j, c1d3, g0u);
    }
}
