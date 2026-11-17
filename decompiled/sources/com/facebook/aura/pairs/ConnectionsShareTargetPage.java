package com.facebook.aura.pairs;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConnectionsShareTargetPage {
    public static final int $stable = 8;
    public final String next;
    public final List<ConnectionsShareTarget> targets;

    public ConnectionsShareTargetPage(List<ConnectionsShareTarget> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.targets = list;
        this.next = str;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<ConnectionsShareTarget> getTargets() {
        return this.targets;
    }
}
