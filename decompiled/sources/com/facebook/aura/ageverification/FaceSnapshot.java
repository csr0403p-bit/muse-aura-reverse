package com.facebook.aura.ageverification;

import X.AnonymousClass002;
import X.BV4;
import X.C7384Etj;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class FaceSnapshot {
    public static final int $stable = 8;
    public final Rect face;
    public final int height;
    public final Future<byte[]> nv21;
    public final float penalty;
    public final int rotationDegrees;
    public final int width;

    public FaceSnapshot(Future<byte[]> future, int i, int i2, int i3, Rect rect, float f) {
        AnonymousClass002.A1C(future, 0, rect);
        this.nv21 = future;
        this.width = i;
        this.height = i2;
        this.rotationDegrees = i3;
        this.face = rect;
        this.penalty = f;
    }

    public final CapturedPhoto writeJpeg(File file) throws IOException {
        C7384Etj.A0Y(file, 0);
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        new YuvImage(this.nv21.get(), 17, this.width, this.height, null).compressToJpeg(new Rect(0, 0, this.width, this.height), 100, byteArrayOutputStreamA0F);
        byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        if (bitmapDecodeByteArray == null) {
            throw BV4.A0K("Could not decode the selfie frame");
        }
        int width = bitmapDecodeByteArray.getWidth();
        int height = bitmapDecodeByteArray.getHeight();
        Matrix matrixA08 = BV4.A08();
        matrixA08.postRotate(this.rotationDegrees);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrixA08, true);
        C7384Etj.A0U(bitmapCreateBitmap);
        if (bitmapCreateBitmap != bitmapDecodeByteArray) {
            bitmapDecodeByteArray.recycle();
        }
        try {
            Rect rectNormalizedFace = SelfieSnapshotKt.normalizedFace(this.face);
            if (!rectNormalizedFace.intersect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()) || rectNormalizedFace.isEmpty()) {
                throw BV4.A0K("The face is outside the selfie frame");
            }
            Bitmap bitmapScaledToShortSide = SelfieSnapshotKt.scaledToShortSide(bitmapCreateBitmap, rectNormalizedFace);
            try {
                CapturedPhoto capturedPhotoWriteJpeg = AgeVerificationFiles.INSTANCE.writeJpeg(bitmapScaledToShortSide, file, 95);
                bitmapScaledToShortSide.recycle();
                return capturedPhotoWriteJpeg;
            } catch (Throwable th) {
                bitmapScaledToShortSide.recycle();
                throw th;
            }
        } finally {
            bitmapCreateBitmap.recycle();
        }
    }

    public final float getPenalty() {
        return this.penalty;
    }

    public final boolean isReady() {
        return this.nv21.isDone();
    }
}
