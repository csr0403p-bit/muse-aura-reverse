package com.facebook.aura.pairs;

import X.AnonymousClass005;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class ConnectionsReceivedItem {
    public static final int $stable = 8;
    public final AuraNavKey destination;
    public final String fileName;
    public final String itemId;
    public final ConnectionsSharedItemKind kind;
    public final String mimeType;
    public final String shareId;
    public final String text;
    public final String title;
    public final String workspacePath;

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final ConnectionsSharedItemKind getKind() {
        return this.kind;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWorkspacePath() {
        return this.workspacePath;
    }

    public ConnectionsReceivedItem(String str, String str2, ConnectionsSharedItemKind connectionsSharedItemKind, String str3, String str4, AuraNavKey auraNavKey, String str5, String str6, String str7) {
        AnonymousClass005.A14(str, str2, connectionsSharedItemKind, str3);
        this.shareId = str;
        this.itemId = str2;
        this.kind = connectionsSharedItemKind;
        this.title = str3;
        this.text = str4;
        this.destination = auraNavKey;
        this.workspacePath = str5;
        this.fileName = str6;
        this.mimeType = str7;
    }
}
