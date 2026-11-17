package com.facebook.aura.conversation.api;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class FoundWidget {
    public static final int $stable = 8;
    public final boolean isNewestOfKind;
    public final Object widget;

    public FoundWidget(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        this.widget = obj;
        this.isNewestOfKind = z;
    }

    public final Object getWidget() {
        return this.widget;
    }

    public final boolean isNewestOfKind() {
        return this.isNewestOfKind;
    }
}
