package com.facebook.aura.spaces.conversation;

import X.AnonymousClass003;
import com.facebook.aura.library.repo.ArtifactOpenTarget;

/* loaded from: classes3.dex */
public final class SharedSpace {
    public final String iconUrl;
    public final String senderName;
    public final ArtifactOpenTarget.PeerSpace target;
    public final String title;

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final ArtifactOpenTarget.PeerSpace getTarget() {
        return this.target;
    }

    public final String getTitle() {
        return this.title;
    }

    public SharedSpace(ArtifactOpenTarget.PeerSpace peerSpace, String str, String str2, String str3) {
        AnonymousClass003.A0u(peerSpace, str);
        this.target = peerSpace;
        this.title = str;
        this.senderName = str2;
        this.iconUrl = str3;
    }
}
