package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C06H;
import X.C1DM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationGenericListContext {
    public static final int $stable = 0;
    public final long containerBackgroundColor;
    public final C1DM containerShape;
    public final String hostMessageId;
    public final String presentationId;
    public final G0W<BRg, BFM, Integer, Unit> renderDefault;
    public final String sessionId;

    /* renamed from: getContainerBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m713getContainerBackgroundColor0d7_KjU() {
        return this.containerBackgroundColor;
    }

    public final C1DM getContainerShape() {
        return this.containerShape;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final G0W<BRg, BFM, Integer, Unit> getRenderDefault() {
        return this.renderDefault;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public /* synthetic */ ConversationGenericListContext(String str, String str2, String str3, long j, C1DM c1dm, G0W g0w, C06H c06h) {
        this(str, str2, str3, j, c1dm, g0w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationGenericListContext(String str, String str2, String str3, long j, C1DM c1dm, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(c1dm, g0w);
        this.hostMessageId = str;
        this.presentationId = str2;
        this.sessionId = str3;
        this.containerBackgroundColor = j;
        this.containerShape = c1dm;
        this.renderDefault = g0w;
    }
}
