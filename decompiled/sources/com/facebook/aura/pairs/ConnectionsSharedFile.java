package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsSharedFile {
    public static final int $stable = 0;
    public final boolean isAwaitingApproval;
    public final String mimeType;
    public final String name;
    public final String workspacePath;

    public ConnectionsSharedFile(String str, String str2, boolean z, String str3) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.mimeType = str2;
        this.isAwaitingApproval = z;
        this.workspacePath = str3;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getWorkspacePath() {
        return this.workspacePath;
    }

    public final boolean isAwaitingApproval() {
        return this.isAwaitingApproval;
    }
}
