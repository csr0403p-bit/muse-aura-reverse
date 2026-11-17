package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class ConnectionsResource {
    public static final int $stable = 8;
    public final String bindingId;
    public final AuraNavKey destination;
    public final boolean isSharedByOwner;
    public final ConnectionsSharedItemKind kind;
    public final String reference;
    public final String resourceId;
    public final String sharedByName;
    public final String title;
    public final String workspacePath;

    public final String getBindingId() {
        return this.bindingId;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final ConnectionsSharedItemKind getKind() {
        return this.kind;
    }

    public final String getReference() {
        return this.reference;
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    public final String getSharedByName() {
        return this.sharedByName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWorkspacePath() {
        return this.workspacePath;
    }

    public final boolean isSharedByOwner() {
        return this.isSharedByOwner;
    }

    public ConnectionsResource(String str, ConnectionsSharedItemKind connectionsSharedItemKind, String str2, String str3, AuraNavKey auraNavKey, String str4, boolean z, String str5, String str6) {
        AnonymousClass005.A14(str, connectionsSharedItemKind, str2, str3);
        C7384Etj.A0Y(str6, 8);
        this.bindingId = str;
        this.kind = connectionsSharedItemKind;
        this.title = str2;
        this.reference = str3;
        this.destination = auraNavKey;
        this.workspacePath = str4;
        this.isSharedByOwner = z;
        this.sharedByName = str5;
        this.resourceId = str6;
    }

    public /* synthetic */ ConnectionsResource(String str, ConnectionsSharedItemKind connectionsSharedItemKind, String str2, String str3, AuraNavKey auraNavKey, String str4, boolean z, String str5, String str6, int i, C06H c06h) {
        this(str, connectionsSharedItemKind, str2, str3, auraNavKey, str4, z, str5, (i & 256) != 0 ? "" : str6);
    }
}
