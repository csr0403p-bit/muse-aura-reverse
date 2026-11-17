package com.facebook.webpsupport;

import X.C6935Eck;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.FileDescriptor;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class WebpBitmapFactoryImpl {
    public static final C6935Eck Companion = new C6935Eck();
    public static volatile boolean sWebPSandboxEnabled;

    public static final native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static final native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static final native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static final Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        return Companion.createBitmap(i, i2, options);
    }

    public static final byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        return Companion.getInTempStorageFromOptions(options);
    }

    public static final float getScaleFromOptions(BitmapFactory.Options options) {
        return Companion.getScaleFromOptions(options);
    }

    public static final Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return Companion.hookDecodeByteArray(bArr, i, i2, options);
    }

    public static final Bitmap hookDecodeFile(String str) {
        return Companion.hookDecodeFile(str);
    }

    public static final Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return Companion.hookDecodeFileDescriptor(fileDescriptor);
    }

    public static final Bitmap hookDecodeResource(Resources resources, int i) {
        return Companion.hookDecodeResource(resources, i);
    }

    public static final Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return Companion.hookDecodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static final Bitmap hookDecodeStream(InputStream inputStream) {
        return Companion.hookDecodeStream(inputStream);
    }

    public static final void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        Companion.setBitmapSize(options, i, i2);
    }

    public static final boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        return Companion.setOutDimensions(options, i, i2);
    }

    public static final void setPaddingDefaultValues(Rect rect) {
        Companion.setPaddingDefaultValues(rect);
    }

    public static final boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    public static final Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public static final Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static final Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static final Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static final Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static final Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static final void setWebPSandboxEnabled(boolean z) {
        sWebPSandboxEnabled = z;
    }

    public static final Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return Companion.hookDecodeByteArray(bArr, i, i2);
    }

    public static final Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        return Companion.hookDecodeFile(str, options);
    }

    public static final Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return Companion.hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static final Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return Companion.hookDecodeResource(resources, i, options);
    }

    public static final Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return Companion.hookDecodeStream(inputStream, rect, options);
    }

    public static final Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static final Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static final Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static final Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static final Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }
}
