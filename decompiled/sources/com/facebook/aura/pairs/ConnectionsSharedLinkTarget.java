package com.facebook.aura.pairs;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes3.dex */
public final class ConnectionsSharedLinkTarget {
    public static final int $stable = 8;
    public final AuraNavKey destination;
    public final String fileReference;
    public final String mimeType;
    public final String title;

    public ConnectionsSharedLinkTarget(String str, String str2, String str3, AuraNavKey auraNavKey) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
        this.fileReference = str2;
        this.mimeType = str3;
        this.destination = auraNavKey;
    }

    public final AuraNavKey getDestination() {
        return this.destination;
    }

    public final String getFileReference() {
        return this.fileReference;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getTitle() {
        return this.title;
    }
}
