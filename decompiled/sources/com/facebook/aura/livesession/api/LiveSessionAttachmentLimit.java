package com.facebook.aura.livesession.api;

import X.AnonymousClass003;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class LiveSessionAttachmentLimit {
    public static final int $stable = 0;
    public final Function0<Boolean> filesAllowed;
    public final int filesBlockedMessageRes;
    public final int limitReachedMessageRes;
    public final int maxAttachments;
    public final int sendBlockedMessageRes;

    public LiveSessionAttachmentLimit(int i, int i2, int i3, int i4, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 4);
        this.maxAttachments = i;
        this.limitReachedMessageRes = i2;
        this.sendBlockedMessageRes = i3;
        this.filesBlockedMessageRes = i4;
        this.filesAllowed = function0;
    }

    public final boolean getAllowsFiles() {
        return AnonymousClass003.A1Y(this.filesAllowed);
    }

    public final int getFilesBlockedMessageRes() {
        return this.filesBlockedMessageRes;
    }

    public final int getLimitReachedMessageRes() {
        return this.limitReachedMessageRes;
    }

    public final int getMaxAttachments() {
        return this.maxAttachments;
    }

    public final int getSendBlockedMessageRes() {
        return this.sendBlockedMessageRes;
    }
}
