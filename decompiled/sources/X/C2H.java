package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class C2H {
    public static final C2H A00 = new C2H();

    public static Bitmap A00(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrixA08 = BV4.A08();
        matrixA08.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrixA08, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.nio.ByteBuffer A01(android.media.Image.Plane[] r17, int r18, int r19) {
        /*
            r9 = r18
            r10 = r19
            int r1 = r18 * r19
            int r0 = r1 / 4
            int r0 = r0 + r0
            int r0 = r0 + r1
            byte[] r8 = new byte[r0]
            r12 = 1
            r0 = r17[r12]
            java.nio.ByteBuffer r7 = r0.getBuffer()
            r16 = 2
            r0 = r17[r16]
            java.nio.ByteBuffer r6 = r0.getBuffer()
            int r5 = r6.position()
            int r4 = r7.limit()
            int r0 = r5 + 1
            r6.position(r0)
            int r0 = r4 + (-1)
            r7.limit(r0)
            int r2 = r6.remaining()
            int r0 = r1 + r1
            int r3 = r0 / 4
            int r0 = r3 + (-2)
            r11 = 0
            if (r2 != r0) goto L41
            int r2 = r6.compareTo(r7)
            r0 = 1
            if (r2 == 0) goto L42
        L41:
            r0 = 0
        L42:
            r6.position(r5)
            r7.limit(r4)
            if (r0 == 0) goto L6e
            r0 = r17[r11]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r0.get(r8, r11, r1)
            r0 = r17[r12]
            java.nio.ByteBuffer r2 = r0.getBuffer()
            r0 = r17[r16]
            java.nio.ByteBuffer r0 = r0.getBuffer()
            r0.get(r8, r1, r12)
            int r1 = r1 + 1
            int r0 = r3 + (-1)
            r2.get(r8, r1, r0)
        L69:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r8)
            return r0
        L6e:
            r7 = r17[r11]
            A02(r7, r8, r9, r10, r11, r12)
            r11 = r17[r12]
            int r15 = r1 + 1
            r12 = r8
            r13 = r9
            r14 = r10
            A02(r11, r12, r13, r14, r15, r16)
            r2 = r17[r16]
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r1
            r7 = r16
            A02(r2, r3, r4, r5, r6, r7)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2H.A01(android.media.Image$Plane[], int, int):java.nio.ByteBuffer");
    }

    public final ByteBuffer A03(C3665CcL c3665CcL) {
        int i = c3665CcL.A03;
        if (i != -1) {
            if (i == 17) {
                ByteBuffer byteBuffer = c3665CcL.A06;
                CRy.A03(byteBuffer);
                return byteBuffer;
            }
            if (i != 35) {
                throw new MlKitException("Unsupported image format", 13);
            }
            Image.Plane[] planes = c3665CcL.A05 == null ? null : c3665CcL.A05.A00.getPlanes();
            CRy.A03(planes);
            return A01(planes, c3665CcL.A00, c3665CcL.A01);
        }
        Bitmap bitmapCopy = c3665CcL.A04;
        CRy.A03(bitmapCopy);
        if (bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        int i3 = 0;
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i2);
        int i4 = 0;
        for (int i5 = 0; i5 < height; i5++) {
            int i6 = 0;
            while (i6 < width) {
                int i7 = iArr[i4];
                int i8 = i7 >> 16;
                int i9 = i7 >> 8;
                int i10 = i7 & 255;
                int i11 = i3 + 1;
                int i12 = i8 & 255;
                int i13 = i9 & 255;
                byteBufferAllocateDirect.put(i3, (byte) Math.min(255, (((((i12 * 66) + (i13 * AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS)) + (i10 * 25)) + 128) >> 8) + 16));
                if (i5 % 2 == 0 && i4 % 2 == 0) {
                    int i14 = i13 * 94;
                    int i15 = (((((i12 * (-38)) - (i13 * 74)) + (i10 * HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)) + 128) >> 8) + 128;
                    int i16 = i2 + 1;
                    byteBufferAllocateDirect.put(i2, (byte) Math.min(255, (((((i12 * HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) - i14) - (i10 * 18)) + 128) >> 8) + 128));
                    i2 += 2;
                    byteBufferAllocateDirect.put(i16, (byte) Math.min(255, i15));
                }
                i4++;
                i6++;
                i3 = i11;
            }
        }
        return byteBufferAllocateDirect;
    }

    public static final void A02(Image.Plane plane, byte[] bArr, int i, int i2, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int iLimit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (iLimit != 0) {
            int i5 = i / (i2 / iLimit);
            int rowStride = 0;
            for (int i6 = 0; i6 < iLimit; i6++) {
                int pixelStride = rowStride;
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i3] = buffer.get(pixelStride);
                    i3 += i4;
                    pixelStride += plane.getPixelStride();
                }
                rowStride += plane.getRowStride();
            }
        }
    }
}
