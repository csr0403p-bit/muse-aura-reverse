package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.C06H;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class ConnectionsActivity {
    public static final int $stable = (PairsContact.$stable | PairsInboxRequest.$stable) | PairsImageRef.$stable;
    public final long atMs;
    public final PairsContact confirmContact;
    public final AuraNavKey destination;
    public final String feedActivityId;
    public final ConnectionsSharedFile file;
    public final String id;
    public final ConnectionsSharedItem item;
    public final ConnectionsActivityKind kind;
    public final ConnectionsSharedLink link;
    public final String museId;
    public final String personName;
    public final PairsImageRef photo;
    public final String receivedShareId;
    public final PairsInboxRequest request;
    public final ConnectionsSharedSpace space;

    public /* synthetic */ ConnectionsActivity(String str, ConnectionsActivityKind connectionsActivityKind, String str2, String str3, PairsImageRef pairsImageRef, long j, String str4, PairsInboxRequest pairsInboxRequest, ConnectionsSharedFile connectionsSharedFile, ConnectionsSharedSpace connectionsSharedSpace, ConnectionsSharedItem connectionsSharedItem, ConnectionsSharedLink connectionsSharedLink, AuraNavKey auraNavKey, String str5, PairsContact pairsContact, int i, C06H c06h) {
        this(str, connectionsActivityKind, str2, str3, pairsImageRef, j, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : pairsInboxRequest, (i & 256) != 0 ? null : connectionsSharedFile, (i & 512) != 0 ? null : connectionsSharedSpace, (i & 1024) != 0 ? null : connectionsSharedItem, (i & 2048) != 0 ? null : connectionsSharedLink, (i & 4096) != 0 ? null : auraNavKey, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : pairsContact);
    }

    public final long getAtMs() {
        return this.atMs;
    }

    public final PairsContact getConfirmContact() {
        return this.confirmContact;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final String getFeedActivityId() {
        return this.feedActivityId;
    }

    public final ConnectionsSharedFile getFile() {
        return this.file;
    }

    public final String getId() {
        return this.id;
    }

    public final ConnectionsSharedItem getItem() {
        return this.item;
    }

    public final ConnectionsActivityKind getKind() {
        return this.kind;
    }

    public final ConnectionsSharedLink getLink() {
        return this.link;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public final String getPersonName() {
        return this.personName;
    }

    public final PairsImageRef getPhoto() {
        return this.photo;
    }

    public final String getReceivedShareId() {
        return this.receivedShareId;
    }

    public final PairsInboxRequest getRequest() {
        return this.request;
    }

    public final ConnectionsSharedSpace getSpace() {
        return this.space;
    }

    public ConnectionsActivity(String str, ConnectionsActivityKind connectionsActivityKind, String str2, String str3, PairsImageRef pairsImageRef, long j, String str4, PairsInboxRequest pairsInboxRequest, ConnectionsSharedFile connectionsSharedFile, ConnectionsSharedSpace connectionsSharedSpace, ConnectionsSharedItem connectionsSharedItem, ConnectionsSharedLink connectionsSharedLink, AuraNavKey auraNavKey, String str5, PairsContact pairsContact) {
        AnonymousClass005.A0x(str, connectionsActivityKind, str2);
        this.id = str;
        this.kind = connectionsActivityKind;
        this.museId = str2;
        this.personName = str3;
        this.photo = pairsImageRef;
        this.atMs = j;
        this.feedActivityId = str4;
        this.request = pairsInboxRequest;
        this.file = connectionsSharedFile;
        this.space = connectionsSharedSpace;
        this.item = connectionsSharedItem;
        this.link = connectionsSharedLink;
        this.destination = auraNavKey;
        this.receivedShareId = str5;
        this.confirmContact = pairsContact;
    }
}
