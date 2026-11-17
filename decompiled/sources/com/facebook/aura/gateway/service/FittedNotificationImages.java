package com.facebook.aura.gateway.service;

import X.AnonymousClass003;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class FittedNotificationImages {
    public final Bitmap bigPicture;
    public final Bitmap largeIcon;

    public final Bitmap getBigPicture() {
        return this.bigPicture;
    }

    public final Bitmap getLargeIcon() {
        return this.largeIcon;
    }

    public FittedNotificationImages(Bitmap bitmap, Bitmap bitmap2) {
        AnonymousClass003.A0u(bitmap, bitmap2);
        this.largeIcon = bitmap;
        this.bigPicture = bitmap2;
    }
}
