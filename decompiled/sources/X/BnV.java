package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class BnV implements BpR<AbstractC2866BnZ<InterfaceC2873Bng>, Bitmap> {
    @Override // X.BpR
    public final /* bridge */ /* synthetic */ Bitmap apply(AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZ) throws Throwable {
        Bitmap bitmapCreateBitmap;
        AbstractC2866BnZ<InterfaceC2873Bng> abstractC2866BnZ2 = abstractC2866BnZ;
        C2863BnN c2863BnN = null;
        try {
            try {
                BnX bnX = (BnX) abstractC2866BnZ2;
                int i = bnX.A00;
                if (i == 35) {
                    InterfaceC2873Bng interfaceC2873Bng = (InterfaceC2873Bng) bnX.A07;
                    int i2 = bnX.A01;
                    boolean zA1L = AnonymousClass002.A1L(i2 % 180);
                    C2863BnN c2863BnNA00 = C2863BnN.A00(zA1L ? interfaceC2873Bng.getHeight() : interfaceC2873Bng.getWidth(), zA1L ? interfaceC2873Bng.getWidth() : interfaceC2873Bng.getHeight(), 1, 2);
                    try {
                        C2876Bnj c2876BnjA00 = ImageProcessingUtil.A00(interfaceC2873Bng, c2863BnNA00, ByteBuffer.allocateDirect(interfaceC2873Bng.getWidth() * interfaceC2873Bng.getHeight() * 4), i2, false);
                        interfaceC2873Bng.close();
                        if (c2876BnjA00 == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = A00(c2876BnjA00);
                        c2876BnjA00.close();
                        c2863BnN = c2863BnNA00;
                    } catch (UnsupportedOperationException e) {
                        e = e;
                        throw new ImageCaptureException(0, FGI.A0U("Can't convert ", ((BnX) abstractC2866BnZ2).A00 == 35 ? "YUV" : "JPEG", " to bitmap"), e);
                    } catch (Throwable th) {
                        th = th;
                        c2863BnN = c2863BnNA00;
                        if (c2863BnN != null) {
                            c2863BnN.close();
                        }
                        throw th;
                    }
                } else {
                    if (i != 256) {
                        throw BV5.A0Q("Invalid postview image format : ", i);
                    }
                    InterfaceC2873Bng interfaceC2873Bng2 = (InterfaceC2873Bng) bnX.A07;
                    Bitmap bitmapA00 = A00(interfaceC2873Bng2);
                    interfaceC2873Bng2.close();
                    int i3 = bnX.A01;
                    Matrix matrixA08 = BV4.A08();
                    matrixA08.postRotate(i3);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapA00, 0, 0, bitmapA00.getWidth(), bitmapA00.getHeight(), matrixA08, true);
                }
                if (c2863BnN != null) {
                    c2863BnN.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public static Bitmap A00(InterfaceC2873Bng interfaceC2873Bng) {
        int iAFp = interfaceC2873Bng.AFp();
        if (iAFp == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight(), Bitmap.Config.ARGB_8888);
            Bo0[] bo0ArrAIj = interfaceC2873Bng.AIj();
            C2887Bnv.A02(bo0ArrAIj, 0).rewind();
            ByteBuffer byteBufferA02 = C2887Bnv.A02(bo0ArrAIj, 0);
            int iA01 = C2887Bnv.A01(bo0ArrAIj, 0);
            int i = ImageProcessingUtil.A00;
            ImageProcessingUtil.nativeCopyBetweenByteBufferAndBitmap(bitmapCreateBitmap, byteBufferA02, iA01, bitmapCreateBitmap.getRowBytes(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), true);
            return bitmapCreateBitmap;
        }
        if (iAFp != 35) {
            if (iAFp != 256 && iAFp != 4101) {
                throw BV5.A0S("Incorrect image format of the input image proxy: ", ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported", interfaceC2873Bng.AFp());
            }
            if (!AbstractC2797BlZ.A00(interfaceC2873Bng.AFp())) {
                throw BV5.A0Q("Incorrect image format of the input image proxy: ", interfaceC2873Bng.AFp());
            }
            ByteBuffer byteBufferA022 = C2887Bnv.A02(interfaceC2873Bng.AIj(), 0);
            int iCapacity = byteBufferA022.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBufferA022.rewind();
            byteBufferA022.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
            if (bitmapDecodeByteArray == null) {
                throw C8j3.A18("Decode jpeg byte array failed");
            }
            return bitmapDecodeByteArray;
        }
        int i2 = ImageProcessingUtil.A00;
        if (interfaceC2873Bng.AFp() != 35) {
            throw C60O.A0i("Input image format must be YUV_420_888");
        }
        int width = interfaceC2873Bng.getWidth();
        int height = interfaceC2873Bng.getHeight();
        Bo0[] bo0ArrAIj2 = interfaceC2873Bng.AIj();
        int iA012 = C2887Bnv.A01(bo0ArrAIj2, 0);
        int iA013 = C2887Bnv.A01(bo0ArrAIj2, 1);
        int iA014 = C2887Bnv.A01(bo0ArrAIj2, 2);
        int iA00 = C2887Bnv.A00(bo0ArrAIj2, 0);
        int iA002 = C2887Bnv.A00(bo0ArrAIj2, 1);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight(), Bitmap.Config.ARGB_8888);
        if (ImageProcessingUtil.nativeConvertAndroid420ToBitmap(C2887Bnv.A02(bo0ArrAIj2, 0), iA012, C2887Bnv.A02(bo0ArrAIj2, 1), iA013, C2887Bnv.A02(bo0ArrAIj2, 2), iA014, iA00, iA002, bitmapCreateBitmap2, bitmapCreateBitmap2.getRowBytes(), width, height) != 0) {
            throw C8j3.A18("YUV to RGB conversion failed");
        }
        return bitmapCreateBitmap2;
    }
}
