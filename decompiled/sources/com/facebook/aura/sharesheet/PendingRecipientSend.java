package com.facebook.aura.sharesheet;

import X.AnonymousClass005;
import X.HoC;
import android.content.Context;

/* loaded from: classes.dex */
public final class PendingRecipientSend {
    public final Context context;
    public HoC delayJob;
    public final String mediaUri;
    public final HatchShareRecipient recipient;

    public final Context getContext() {
        return this.context;
    }

    public final HoC getDelayJob() {
        return this.delayJob;
    }

    public final String getMediaUri() {
        return this.mediaUri;
    }

    public final HatchShareRecipient getRecipient() {
        return this.recipient;
    }

    public PendingRecipientSend(Context context, String str, HatchShareRecipient hatchShareRecipient) {
        AnonymousClass005.A0x(context, str, hatchShareRecipient);
        this.context = context;
        this.mediaUri = str;
        this.recipient = hatchShareRecipient;
    }

    public final void setDelayJob(HoC hoC) {
        this.delayJob = hoC;
    }
}
