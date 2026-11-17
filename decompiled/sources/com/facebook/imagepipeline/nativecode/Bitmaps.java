package com.facebook.imagepipeline.nativecode;

import X.AnonymousClass003;
import X.C3463COl;
import X.C60O;
import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class Bitmaps {
    public static final Bitmaps INSTANCE = new Bitmaps();

    public static final native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    static {
        C3463COl.loadLibrary("imagepipeline");
    }

    public static final void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        AnonymousClass003.A0u(bitmap, bitmap2);
        if (bitmap2.getConfig() != bitmap.getConfig()) {
            throw C60O.A0i("Failed requirement.");
        }
        if (!bitmap.isMutable()) {
            throw C60O.A0i("Failed requirement.");
        }
        if (bitmap.getWidth() != bitmap2.getWidth()) {
            throw C60O.A0i("Failed requirement.");
        }
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            throw C60O.A0i("Failed requirement.");
        }
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
