package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import X.C06H;
import X.C1D3;
import X.C3cH;
import X.G0U;
import com.facebook.aura.model.HatchSendMessage;
import com.facebook.aura.model.WidgetStateMutationHost;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class ConversationWidgetContext {
    public static final int $stable = 8;
    public final long containerBackgroundColor;
    public final C1D3 containerShape;
    public final String hostMessageId;
    public final boolean inBubble;
    public final G0U<String, Unit> openUrl;
    public final G0U<HatchSendMessage, Unit> sendMessage;
    public final String sessionId;
    public final WidgetStateMutationHost widgetStateMutationHost;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationWidgetContext(String str, String str2, long j, C1D3 c1d3, G0U<? super HatchSendMessage, Unit> g0u, G0U<? super String, Unit> g0u2, WidgetStateMutationHost widgetStateMutationHost, boolean z) {
        AnonymousClass005.A16(str, c1d3, g0u, g0u2, 0);
        this.hostMessageId = str;
        this.sessionId = str2;
        this.containerBackgroundColor = j;
        this.containerShape = c1d3;
        this.sendMessage = g0u;
        this.openUrl = g0u2;
        this.widgetStateMutationHost = widgetStateMutationHost;
        this.inBubble = z;
    }

    /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m720getContainerBackgroundColor0d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1D3 getContainerShape() {
        return this.containerShape;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final boolean getInBubble() {
        return this.inBubble;
    }

    public final G0U<String, Unit> getOpenUrl() {
        return this.openUrl;
    }

    public final G0U<HatchSendMessage, Unit> getSendMessage() {
        return this.sendMessage;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final WidgetStateMutationHost getWidgetStateMutationHost() {
        return this.widgetStateMutationHost;
    }

    public /* synthetic */ ConversationWidgetContext(String str, String str2, long j, C1D3 c1d3, G0U g0u, G0U g0u2, WidgetStateMutationHost widgetStateMutationHost, boolean z, C06H c06h) {
        this(str, str2, j, c1d3, g0u, g0u2, widgetStateMutationHost, z);
    }

    public /* synthetic */ ConversationWidgetContext(String str, String str2, long j, C1D3 c1d3, G0U g0u, G0U g0u2, WidgetStateMutationHost widgetStateMutationHost, boolean z, int i, C06H c06h) {
        this(str, str2, j, c1d3, g0u, g0u2, (i & 64) != 0 ? null : widgetStateMutationHost, C3cH.A1N(i, z));
    }
}
