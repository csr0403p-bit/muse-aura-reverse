package com.facebook.aura.pairs;

import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConnectionsActivityPage {
    public static final int $stable = 8;
    public final List<PeerActivityJson> items;
    public final String nextCursor;

    public ConnectionsActivityPage(List<PeerActivityJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.nextCursor = str;
    }

    public final List<PeerActivityJson> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }
}
