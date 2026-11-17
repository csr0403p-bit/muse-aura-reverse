package com.facebook.aura.watchhandoff;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes5.dex */
public final class ConnectedWatches {
    public final List<String> withMuse;
    public final List<String> withoutMuse;

    public final List<String> getWithMuse() {
        return this.withMuse;
    }

    public final List<String> getWithoutMuse() {
        return this.withoutMuse;
    }

    public ConnectedWatches(List<String> list, List<String> list2) {
        AnonymousClass003.A0u(list, list2);
        this.withMuse = list;
        this.withoutMuse = list2;
    }
}
