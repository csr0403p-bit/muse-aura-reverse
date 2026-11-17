package com.facebook.aura.conversation.api;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ConversationWidgetMatch<W> {
    public static final int $stable = 0;
    public final boolean isNewestOfKind;
    public final W widget;

    public ConversationWidgetMatch(W w, boolean z) {
        C7384Etj.A0Y(w, 0);
        this.widget = w;
        this.isNewestOfKind = z;
    }

    public final W getWidget() {
        return this.widget;
    }

    public final boolean isNewestOfKind() {
        return this.isNewestOfKind;
    }
}
