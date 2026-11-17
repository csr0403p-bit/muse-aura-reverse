package com.facebook.aura.bugreport;

import X.AnonymousClass003;
import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes.dex */
public final class ScreenshotAnnotationTarget {
    public final Bitmap bitmap;
    public final Uri uri;

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public ScreenshotAnnotationTarget(Uri uri, Bitmap bitmap) {
        AnonymousClass003.A0u(uri, bitmap);
        this.uri = uri;
        this.bitmap = bitmap;
    }
}
