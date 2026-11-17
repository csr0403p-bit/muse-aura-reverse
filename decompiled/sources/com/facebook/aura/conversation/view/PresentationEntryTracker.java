package com.facebook.aura.conversation.view;

import X.C7384Etj;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class PresentationEntryTracker {
    public static final int $stable = 8;
    public final Set<String> seen = new LinkedHashSet();
    public boolean warm;

    public final void markSeen(String str) {
        C7384Etj.A0Y(str, 0);
        this.seen.add(str);
    }

    public final void markWarm() {
        this.warm = true;
    }

    public final boolean shouldAnimate(String str) {
        C7384Etj.A0Y(str, 0);
        return this.warm && !this.seen.contains(str);
    }
}
