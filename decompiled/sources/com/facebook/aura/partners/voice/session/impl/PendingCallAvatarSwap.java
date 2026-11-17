package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;

/* loaded from: classes2.dex */
public final class PendingCallAvatarSwap {
    public final String avatarImagePath;
    public final String avatarStem;
    public final String callId;
    public final HatchVideoCrop portraitCrop;
    public final boolean stillShown;

    public PendingCallAvatarSwap(String str, HatchVideoCrop hatchVideoCrop, String str2, boolean z, String str3) {
        C7384Etj.A0Y(str, 0);
        this.callId = str;
        this.portraitCrop = hatchVideoCrop;
        this.avatarStem = str2;
        this.stillShown = z;
        this.avatarImagePath = str3;
    }

    public final String getAvatarImagePath() {
        return this.avatarImagePath;
    }

    public final String getAvatarStem() {
        return this.avatarStem;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final HatchVideoCrop getPortraitCrop() {
        return this.portraitCrop;
    }

    public final boolean getStillShown() {
        return this.stillShown;
    }
}
