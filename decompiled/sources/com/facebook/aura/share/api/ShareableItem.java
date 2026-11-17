package com.facebook.aura.share.api;

import X.AnonymousClass005;

/* loaded from: classes.dex */
public final class ShareableItem {
    public final String id;
    public final ShareableItemKind kind;
    public final String title;

    public final String getId() {
        return this.id;
    }

    public final ShareableItemKind getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }

    public ShareableItem(ShareableItemKind shareableItemKind, String str, String str2) {
        AnonymousClass005.A0x(shareableItemKind, str, str2);
        this.kind = shareableItemKind;
        this.id = str;
        this.title = str2;
    }
}
