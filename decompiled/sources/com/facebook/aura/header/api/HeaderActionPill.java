package com.facebook.aura.header.api;

import X.AaC;
import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes.dex */
public final class HeaderActionPill {
    public static final int $stable = 0;
    public final AaC boundsInWindow;
    public final List<HeaderActionIcon> icons;
    public final int index;

    public final AaC getBoundsInWindow() {
        return this.boundsInWindow;
    }

    public final List<HeaderActionIcon> getIcons() {
        return this.icons;
    }

    public final int getIndex() {
        return this.index;
    }

    public HeaderActionPill(AaC aaC, List<HeaderActionIcon> list, int i) {
        AnonymousClass003.A0u(aaC, list);
        this.boundsInWindow = aaC;
        this.icons = list;
        this.index = i;
    }
}
