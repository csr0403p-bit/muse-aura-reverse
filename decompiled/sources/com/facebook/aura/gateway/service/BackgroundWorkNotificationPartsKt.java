package com.facebook.aura.gateway.service;

import X.C7384Etj;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public abstract class BackgroundWorkNotificationPartsKt {
    public static final int LARGE_ICON_SIZE_PX = 192;

    public static final Bitmap fitCenter(Bitmap bitmap, int i, int i2) {
        float f = i;
        float f2 = i2;
        float fMin = Math.min(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        float width = bitmap.getWidth() * fMin;
        float height = bitmap.getHeight() * fMin;
        float f3 = (f - width) / 2.0f;
        float f4 = (f2 - height) / 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, new RectF(f3, f4, width + f3, height + f4), new Paint(2));
        return bitmapCreateBitmap;
    }

    public static final FittedNotificationImages fitNotificationImages(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        return new FittedNotificationImages(fitCenter(bitmap, 192, 192), fitCenter(bitmap, Math.max(bitmap.getWidth(), (bitmap.getHeight() * 4) / 3), bitmap.getHeight()));
    }
}
