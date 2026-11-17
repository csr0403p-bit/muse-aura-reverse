package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes2.dex */
public final class NodeCardMessagingResolvedState {
    public static final int $stable = ContactInfo.$stable | MessagingApp.$stable;
    public final ContactInfo contact;
    public final boolean isLoaded;
    public final MessagingApp messagingApp;

    public final ContactInfo getContact() {
        return this.contact;
    }

    public final MessagingApp getMessagingApp() {
        return this.messagingApp;
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public NodeCardMessagingResolvedState(MessagingApp messagingApp, ContactInfo contactInfo, boolean z) {
        this.messagingApp = messagingApp;
        this.contact = contactInfo;
        this.isLoaded = z;
    }

    public /* synthetic */ NodeCardMessagingResolvedState(MessagingApp messagingApp, ContactInfo contactInfo, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? null : messagingApp, (i & 2) != 0 ? null : contactInfo, AnonymousClass005.A1O(i, z));
    }

    public NodeCardMessagingResolvedState() {
        this(null, null, false);
    }
}
