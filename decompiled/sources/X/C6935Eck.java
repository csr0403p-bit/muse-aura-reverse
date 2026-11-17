package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Eck, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6935Eck {
    private final Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2) {
        return WebpBitmapFactoryImpl.nativeDecodeByteArray(bArr, i, i2, options, f, bArr2);
    }

    public final Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        C7384Etj.A0Y(bArr, 0);
        ETo.A00();
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public final Bitmap hookDecodeFile(String str) {
        C7384Etj.A0Y(str, 0);
        return hookDecodeFile(str, null);
    }

    public final Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        C7384Etj.A0Y(fileDescriptor, 0);
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public final Bitmap hookDecodeResource(Resources resources, int i) {
        C7384Etj.A0Y(resources, 0);
        return hookDecodeResource(resources, i, null);
    }

    public final Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        C7384Etj.A0Y(inputStream, 2);
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                i = 160;
            } else if (i != 65535) {
            }
            options.inDensity = i;
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    public final Bitmap hookDecodeStream(InputStream inputStream) {
        C7384Etj.A0Y(inputStream, 0);
        return hookDecodeStream(inputStream, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        C7384Etj.A0X(null);
        throw F60.createAndThrow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f = i > 1 ? 1.0f / i : 1.0f;
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : i3 / i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private final boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    private final Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr) {
        return WebpBitmapFactoryImpl.nativeDecodeStream(inputStream, options, f, bArr);
    }

    private final long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z) {
        return WebpBitmapFactoryImpl.nativeSeek(fileDescriptor, j, z);
    }

    private final Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    private final Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    private final Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    private final Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    private final Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    private final Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public final void setWebPSandboxEnabled(boolean z) {
        WebpBitmapFactoryImpl.sWebPSandboxEnabled = z;
    }

    private final Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    private final Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private final Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    private final Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    private final Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public final Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        ETo.A00();
        return BitmapFactory.decodeByteArray(bArr, i, i2, null);
    }

    public final Bitmap hookDecodeFile(String str, BitmapFactory.Options options) throws IOException {
        C7384Etj.A0Y(str, 0);
        Bitmap bitmapHookDecodeStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmapHookDecodeStream = WebpBitmapFactoryImpl.Companion.hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmapHookDecodeStream;
            } finally {
            }
        } catch (Exception unused) {
            return bitmapHookDecodeStream;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:8:0x0027, B:10:0x002f, B:12:0x0033, B:17:0x003c, B:18:0x0042, B:15:0x0039), top: B:35:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap hookDecodeFileDescriptor(java.io.FileDescriptor r6, android.graphics.Rect r7, android.graphics.BitmapFactory.Options r8) {
        /*
            r5 = this;
            r2 = 0
            X.C7384Etj.A0Y(r6, r2)
            X.ETo.A00()
            r0 = 0
            long r0 = com.facebook.webpsupport.WebpBitmapFactoryImpl.nativeSeek(r6, r0, r2)
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L53
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r6)
            boolean r2 = r3.markSupported()
            if (r2 != 0) goto L26
            r2 = 20
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            r5.<init>(r3, r2)
            goto L27
        L26:
            r5 = r3
        L27:
            r4 = 20
            r5.mark(r4)     // Catch: java.lang.Throwable -> L4e
            r2 = 0
            if (r8 == 0) goto L31
            byte[] r2 = r8.inTempStorage     // Catch: java.lang.Throwable -> L4e
        L31:
            if (r2 == 0) goto L39
            byte[] r3 = r8.inTempStorage     // Catch: java.lang.Throwable -> L4e
            int r2 = r3.length     // Catch: java.lang.Throwable -> L4e
            if (r2 < r4) goto L39
            goto L3b
        L39:
            byte[] r3 = new byte[r4]     // Catch: java.lang.Throwable -> L4e
        L3b:
            r2 = 0
            r5.read(r3, r2, r4)     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L4e
            r5.reset()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L4e
        L42:
            r2 = 1
            com.facebook.webpsupport.WebpBitmapFactoryImpl.nativeSeek(r6, r0, r2)     // Catch: java.lang.Throwable -> L4e
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r6, r7, r8)     // Catch: java.lang.Throwable -> L4e
            r5.close()     // Catch: java.lang.Throwable -> L4d
        L4d:
            return r0
        L4e:
            r0 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L52
        L52:
            throw r0
        L53:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            android.graphics.Bitmap r0 = r5.hookDecodeStream(r0, r7, r8)
            r5.setPaddingDefaultValues(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6935Eck.hookDecodeFileDescriptor(java.io.FileDescriptor, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) throws Resources.NotFoundException, IOException {
        InputStream inputStreamOpenRawResource;
        C7384Etj.A0Y(resources, 0);
        Bitmap typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            try {
                inputStreamOpenRawResource = resources.openRawResource(i, typedValue);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            typedValue = 0;
        }
        try {
            C6935Eck c6935Eck = WebpBitmapFactoryImpl.Companion;
            C7384Etj.A0X(inputStreamOpenRawResource);
            try {
                typedValue = c6935Eck.hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                inputStreamOpenRawResource.close();
                if (typedValue == 0) {
                    if (options != null) {
                        bitmap = options.inBitmap;
                    }
                    if (bitmap != null) {
                        throw C60O.A0i("Problem decoding into existing bitmap");
                    }
                }
                return typedValue;
            } catch (Throwable th) {
                th = th;
                typedValue = 0;
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC7531Ezs.A00(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        InputStream bufferedInputStream;
        C7384Etj.A0Y(inputStream, 0);
        ETo.A00();
        if (!inputStream.markSupported()) {
            bufferedInputStream = new BufferedInputStream(inputStream, 20);
        } else {
            bufferedInputStream = inputStream;
        }
        return BitmapFactory.decodeStream(bufferedInputStream, rect, options);
    }
}
