package com.facebook.aura.pairs;

import X.A3q;
import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PairsHubSnapshot {
    public static final int $stable = 0;
    public final Set<String> acceptedRequestGenerations;
    public final PairsAccess access;
    public final List<PairsContact> contacts;
    public final List<PairsHeldInvite> heldInvites;
    public final List<PairsInboxRequest> inboxRequests;
    public final List<PairsInviteRecord> invites;
    public final List<PairsInvite> liveInvites;
    public final Set<String> mintedInviteIds;

    public final Set<String> getAcceptedRequestGenerations() {
        return this.acceptedRequestGenerations;
    }

    public final PairsAccess getAccess() {
        return this.access;
    }

    public final List<PairsContact> getContacts() {
        return this.contacts;
    }

    public final List<PairsHeldInvite> getHeldInvites() {
        return this.heldInvites;
    }

    public final List<PairsInboxRequest> getInboxRequests() {
        return this.inboxRequests;
    }

    public final List<PairsInviteRecord> getInvites() {
        return this.invites;
    }

    public final List<PairsInvite> getLiveInvites() {
        return this.liveInvites;
    }

    public final Set<String> getMintedInviteIds() {
        return this.mintedInviteIds;
    }

    public PairsHubSnapshot(PairsAccess pairsAccess, List<PairsContact> list, List<PairsInviteRecord> list2, List<PairsInvite> list3, List<PairsHeldInvite> list4, Set<String> set, List<PairsInboxRequest> list5, Set<String> set2) {
        AnonymousClass005.A17(pairsAccess, list, list2, list3, list4);
        AnonymousClass005.A0z(set, list5, set2);
        this.access = pairsAccess;
        this.contacts = list;
        this.invites = list2;
        this.liveInvites = list3;
        this.heldInvites = list4;
        this.mintedInviteIds = set;
        this.inboxRequests = list5;
        this.acceptedRequestGenerations = set2;
    }

    public /* synthetic */ PairsHubSnapshot(PairsAccess pairsAccess, List list, List list2, List list3, List list4, Set set, List list5, Set set2, int i, C06H c06h) {
        this(pairsAccess, list, list2, list3, list4, (i & 32) != 0 ? A3q.A00 : set, (i & 64) != 0 ? C0881AGi.A00 : list5, (i & 128) != 0 ? A3q.A00 : set2);
    }
}
