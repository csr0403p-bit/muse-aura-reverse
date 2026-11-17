package com.facebook.aura.ageverification;

import X.AnonymousClass002;
import X.BV4;
import X.Bo0;
import X.C2887Bnv;
import X.C7384Etj;
import X.F0C;
import X.InterfaceC2873Bng;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public abstract class SelfieSnapshotKt {
    public static final float FACE_COMPENSATION_BOTTOM = 0.15f;
    public static final float FACE_COMPENSATION_HORIZONTAL = 0.15f;
    public static final float FACE_COMPENSATION_TOP = 0.2f;
    public static final long MIN_SNAPSHOT_DELAY_MS = 500;
    public static final long NOT_TAKEN = -1;
    public static final int SELFIE_JPEG_QUALITY = 95;
    public static final int SNAPSHOT_SHORT_SIDE = 512;

    public static final FaceSnapshot faceSnapshot(final InterfaceC2873Bng interfaceC2873Bng, Rect rect, float f) {
        boolean zA1a = AnonymousClass002.A1a(interfaceC2873Bng, rect);
        final int width = interfaceC2873Bng.getWidth() & (-2);
        final int height = interfaceC2873Bng.getHeight() & (-2);
        Bo0[] bo0ArrAIj = interfaceC2873Bng.AIj();
        C7384Etj.A0U(bo0ArrAIj);
        Bo0 bo0 = bo0ArrAIj[0];
        Bo0 bo02 = bo0ArrAIj[zA1a ? 1 : 0];
        Bo0 bo03 = bo0ArrAIj[2];
        C7384Etj.A0X(bo0);
        if (holds(bo0, height, width)) {
            C7384Etj.A0X(bo02);
            int i = height / 2;
            int i2 = width / 2;
            if (holds(bo02, i, i2)) {
                C7384Etj.A0X(bo03);
                if (holds(bo03, i, i2)) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.facebook.aura.ageverification.SelfieSnapshotKt$faceSnapshot$nv21$1
                        @Override // java.util.concurrent.Callable
                        public final byte[] call() {
                            try {
                                return SelfieSnapshotKt.toNv21(interfaceC2873Bng, width, height);
                            } finally {
                                interfaceC2873Bng.close();
                            }
                        }
                    });
                    try {
                        F0C.A05().execute(futureTask);
                        return new FaceSnapshot(futureTask, width, height, interfaceC2873Bng.AGK().AJr(), new Rect(rect), f);
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }
        return null;
    }

    public static final boolean holds(Bo0 bo0, int i, int i2) {
        Image.Plane plane = ((C2887Bnv) bo0).A00;
        return plane.getBuffer().limit() > ((i - 1) * plane.getRowStride()) + ((i2 - 1) * plane.getPixelStride());
    }

    public static final byte[] toNv21(InterfaceC2873Bng interfaceC2873Bng, int i, int i2) {
        byte[] bArr = new byte[((i * i2) * 3) / 2];
        Bo0[] bo0ArrAIj = interfaceC2873Bng.AIj();
        int i3 = 0;
        Bo0 bo0 = bo0ArrAIj[0];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = 0;
            while (i6 < i) {
                i3++;
                C2887Bnv.A03(bo0, bArr, i5, i6, i4);
                i6++;
                i4 = i3;
            }
        }
        Bo0 bo02 = bo0ArrAIj[1];
        Bo0 bo03 = bo0ArrAIj[2];
        int i7 = i2 / 2;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = i / 2;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i4 + 1;
                C2887Bnv.A03(bo03, bArr, i8, i10, i4);
                i4 += 2;
                C2887Bnv.A03(bo02, bArr, i8, i10, i11);
            }
        }
        return bArr;
    }

    public static final Rect normalizedFace(Rect rect) {
        int iWidth = rect.width();
        float f = iWidth * 0.15f;
        int i = (int) (rect.left - f);
        float fHeight = rect.height();
        return new Rect(i, (int) (rect.top - (0.2f * fHeight)), (int) (iWidth + i + (f * 2.0f)), (int) (r6 + r3 + (fHeight * 0.35000002f)));
    }

    public static final Bitmap scaledToShortSide(Bitmap bitmap, Rect rect) {
        float fMin = 512.0f / Math.min(rect.width(), rect.height());
        Matrix matrixA08 = BV4.A08();
        matrixA08.setScale(fMin, fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), matrixA08, true);
        C7384Etj.A0U(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
