package com.facebook.aura.localbrowser;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class LocalBrowserTaskAuthority {
    public static final int $stable = 0;
    public final LocalBrowserControl control;
    public final long revision;

    public LocalBrowserTaskAuthority(long j, LocalBrowserControl localBrowserControl) {
        C7384Etj.A0Y(localBrowserControl, 1);
        this.revision = j;
        this.control = localBrowserControl;
    }

    public final LocalBrowserControl getControl() {
        return this.control;
    }

    public final long getRevision() {
        return this.revision;
    }
}
