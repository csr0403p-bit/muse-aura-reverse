package com.facebook.aura.pairs;

import X.AnonymousClass005;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ConnectionsResourcePage {
    public static final int $stable = 0;
    public final Map<ConnectionsSharedItemKind, Integer> counts;
    public final boolean hasUnavailableHosts;
    public final String next;
    public final List<String> participantNames;
    public final List<ConnectionsResource> resources;

    public final Map<ConnectionsSharedItemKind, Integer> getCounts() {
        return this.counts;
    }

    public final boolean getHasUnavailableHosts() {
        return this.hasUnavailableHosts;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<String> getParticipantNames() {
        return this.participantNames;
    }

    public final List<ConnectionsResource> getResources() {
        return this.resources;
    }

    public ConnectionsResourcePage(List<ConnectionsResource> list, List<String> list2, Map<ConnectionsSharedItemKind, Integer> map, String str, boolean z) {
        AnonymousClass005.A0x(list, list2, map);
        this.resources = list;
        this.participantNames = list2;
        this.counts = map;
        this.next = str;
        this.hasUnavailableHosts = z;
    }
}
