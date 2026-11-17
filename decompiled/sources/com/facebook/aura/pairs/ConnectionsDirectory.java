package com.facebook.aura.pairs;

import X.AnonymousClass003;
import java.util.List;

/* loaded from: classes3.dex */
public final class ConnectionsDirectory {
    public static final int $stable = 0;
    public final List<ConnectionsGroup> groups;
    public final List<PairsContact> people;

    public final List<ConnectionsGroup> getGroups() {
        return this.groups;
    }

    public final List<PairsContact> getPeople() {
        return this.people;
    }

    public ConnectionsDirectory(List<PairsContact> list, List<ConnectionsGroup> list2) {
        AnonymousClass003.A0u(list, list2);
        this.people = list;
        this.groups = list2;
    }
}
