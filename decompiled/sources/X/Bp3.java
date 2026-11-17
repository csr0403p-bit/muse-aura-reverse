package X;

import X.EnumC7442Ew5;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.utils.ImageUtil$CodecFailedException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Bp3 implements BpR<AbstractC2812Blp, AbstractC2866BnZ<byte[]>> {
    public final C2434BbK A00;

    @Override // X.BpR
    public final /* bridge */ /* synthetic */ AbstractC2866BnZ<byte[]> apply(AbstractC2812Blp abstractC2812Blp) throws ImageCaptureException {
        InterfaceC2873Bng interfaceC2873Bng;
        BnX bnX;
        byte[] bArrCopyOfRange;
        AbstractC2812Blp abstractC2812Blp2 = abstractC2812Blp;
        try {
            BiI biI = (BiI) abstractC2812Blp2;
            BnX bnX2 = (BnX) biI.A01;
            int i = bnX2.A00;
            if (i == 35) {
                interfaceC2873Bng = (InterfaceC2873Bng) bnX2.A07;
                Rect rect = bnX2.A03;
                try {
                    int i2 = biI.A00;
                    int i3 = bnX2.A01;
                    Rect rect2 = rect;
                    if (interfaceC2873Bng.AFp() != 35) {
                        throw BV5.A0Q("Incorrect image format of the input image proxy: ", interfaceC2873Bng.AFp());
                    }
                    Bo0[] bo0ArrAIj = interfaceC2873Bng.AIj();
                    Bo0 bo0 = bo0ArrAIj[0];
                    Bo0 bo02 = bo0ArrAIj[1];
                    Bo0 bo03 = bo0ArrAIj[2];
                    ByteBuffer buffer = ((C2887Bnv) bo0).A00.getBuffer();
                    Image.Plane plane = ((C2887Bnv) bo02).A00;
                    ByteBuffer buffer2 = plane.getBuffer();
                    Image.Plane plane2 = ((C2887Bnv) bo03).A00;
                    ByteBuffer buffer3 = plane2.getBuffer();
                    buffer.rewind();
                    buffer2.rewind();
                    buffer3.rewind();
                    int iRemaining = buffer.remaining();
                    byte[] bArr = new byte[((interfaceC2873Bng.getWidth() * interfaceC2873Bng.getHeight()) / 2) + iRemaining];
                    int width = 0;
                    for (int i4 = 0; i4 < interfaceC2873Bng.getHeight(); i4++) {
                        buffer.get(bArr, width, interfaceC2873Bng.getWidth());
                        width += interfaceC2873Bng.getWidth();
                        buffer.position(Math.min(iRemaining, (buffer.position() - interfaceC2873Bng.getWidth()) + ((C2887Bnv) bo0).A00.getRowStride()));
                    }
                    int height = interfaceC2873Bng.getHeight() / 2;
                    int width2 = interfaceC2873Bng.getWidth() / 2;
                    int rowStride = plane2.getRowStride();
                    int rowStride2 = plane.getRowStride();
                    int pixelStride = plane2.getPixelStride();
                    int pixelStride2 = plane.getPixelStride();
                    byte[] bArr2 = new byte[rowStride];
                    byte[] bArr3 = new byte[rowStride2];
                    for (int i5 = 0; i5 < height; i5++) {
                        buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
                        buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
                        int i6 = 0;
                        int i7 = 0;
                        for (int i8 = 0; i8 < width2; i8++) {
                            int i9 = width + 1;
                            bArr[width] = bArr2[i6];
                            width += 2;
                            bArr[i9] = bArr3[i7];
                            i6 += pixelStride;
                            i7 += pixelStride2;
                        }
                    }
                    YuvImage yuvImage = new YuvImage(bArr, 17, interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight(), null);
                    ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                    byte[] bArr4 = C2966BqI.A06;
                    C2963BqE c2963BqE = new C2963BqE(ByteOrder.BIG_ENDIAN);
                    String strValueOf = String.valueOf(1);
                    c2963BqE.A04("Orientation", strValueOf);
                    c2963BqE.A04("XResolution", "72/1");
                    c2963BqE.A04("YResolution", "72/1");
                    String strValueOf2 = String.valueOf(2);
                    c2963BqE.A04("ResolutionUnit", strValueOf2);
                    c2963BqE.A04("YCbCrPositioning", strValueOf);
                    c2963BqE.A04("Make", Build.MANUFACTURER);
                    c2963BqE.A04("Model", Build.MODEL);
                    InterfaceC2886Bnt interfaceC2886BntAGK = interfaceC2873Bng.AGK();
                    if (interfaceC2886BntAGK != null) {
                        interfaceC2886BntAGK.AY5(c2963BqE);
                    }
                    c2963BqE.A03(i3);
                    c2963BqE.A04("ImageWidth", String.valueOf(interfaceC2873Bng.getWidth()));
                    c2963BqE.A04("ImageLength", String.valueOf(interfaceC2873Bng.getHeight()));
                    ArrayList list = Collections.list(new BqC(c2963BqE));
                    if (!((Map) list.get(1)).isEmpty()) {
                        String strValueOf3 = String.valueOf(0);
                        C2963BqE.A01(c2963BqE, "ExposureProgram", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "ExifVersion", "0230", list);
                        C2963BqE.A01(c2963BqE, "ComponentsConfiguration", "1,2,3,0", list);
                        C2963BqE.A01(c2963BqE, "MeteringMode", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "LightSource", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "FlashpixVersion", "0100", list);
                        C2963BqE.A01(c2963BqE, "FocalPlaneResolutionUnit", strValueOf2, list);
                        C2963BqE.A01(c2963BqE, "FileSource", String.valueOf(3), list);
                        C2963BqE.A01(c2963BqE, "SceneType", strValueOf, list);
                        C2963BqE.A01(c2963BqE, "CustomRendered", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "SceneCaptureType", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "Contrast", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "Saturation", strValueOf3, list);
                        C2963BqE.A01(c2963BqE, "Sharpness", strValueOf3, list);
                    }
                    if (!((Map) list.get(2)).isEmpty()) {
                        C2963BqE.A01(c2963BqE, "GPSVersionID", "2300", list);
                        C2963BqE.A01(c2963BqE, "GPSSpeedRef", "K", list);
                        C2963BqE.A01(c2963BqE, "GPSTrackRef", "T", list);
                        C2963BqE.A01(c2963BqE, "GPSImgDirectionRef", "T", list);
                        C2963BqE.A01(c2963BqE, "GPSDestBearingRef", "T", list);
                        C2963BqE.A01(c2963BqE, "GPSDestDistanceRef", "K", list);
                    }
                    C2966BqI c2966BqI = new C2966BqI(new BqH(c2963BqE.A00, list), byteArrayOutputStreamA0F);
                    if (rect == null) {
                        rect2 = new Rect(0, 0, interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight());
                    }
                    if (!yuvImage.compressToJpeg(rect2, i2, c2966BqI)) {
                        final EnumC7442Ew5 enumC7442Ew5 = EnumC7442Ew5.ENCODE_FAILED;
                        throw new Exception(enumC7442Ew5) { // from class: androidx.camera.core.internal.utils.ImageUtil$CodecFailedException
                            public final EnumC7442Ew5 mFailureType;

                            {
                                super("YuvImage failed to encode jpeg.");
                                this.mFailureType = enumC7442Ew5;
                            }
                        };
                    }
                    byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
                    try {
                        BqP bqP = new BqP(new BqQ(BV4.A0E(byteArray)));
                        Size sizeA0Z = BV8.A0Z(rect);
                        Rect rect3 = new Rect(0, 0, rect.width(), rect.height());
                        Matrix matrix = bnX2.A02;
                        RectF rectF = BfO.A00;
                        Matrix matrix2 = new Matrix(matrix);
                        matrix2.postTranslate(-rect.left, -rect.top);
                        bnX = new BnX(matrix2, rect3, sizeA0Z, bnX2.A05, bqP, byteArray, 256, i3);
                    } catch (IOException e) {
                        throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
                    }
                } catch (ImageUtil$CodecFailedException e2) {
                    throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
                }
            } else {
                if (i != 256 && i != 4101) {
                    throw BV5.A0Q("Unexpected format: ", i);
                }
                C2434BbK c2434BbK = this.A00;
                interfaceC2873Bng = (InterfaceC2873Bng) bnX2.A07;
                if (c2434BbK.A00 == null) {
                    ByteBuffer byteBufferA02 = C2887Bnv.A02(interfaceC2873Bng.AIj(), 0);
                    bArrCopyOfRange = new byte[byteBufferA02.capacity()];
                    byteBufferA02.rewind();
                    byteBufferA02.get(bArrCopyOfRange);
                } else {
                    int i10 = 0;
                    ByteBuffer byteBufferA022 = C2887Bnv.A02(interfaceC2873Bng.AIj(), 0);
                    int iCapacity = byteBufferA022.capacity();
                    bArrCopyOfRange = new byte[iCapacity];
                    byteBufferA022.rewind();
                    byteBufferA022.get(bArrCopyOfRange);
                    for (int iA0D = 2; iA0D + 4 <= iCapacity && bArrCopyOfRange[iA0D] == -1; iA0D += (BV6.A0D(bArrCopyOfRange, iA0D + 2) | (bArrCopyOfRange[iA0D + 3] & 255)) + 2) {
                        if (bArrCopyOfRange[iA0D + 1] == -38) {
                            break;
                        }
                    }
                    i10 = 2;
                    while (true) {
                        int i11 = i10 + 1;
                        if (i11 > iCapacity) {
                            break;
                        }
                        if (bArrCopyOfRange[i10] == -1 && bArrCopyOfRange[i11] == -40) {
                            if (i10 != -1) {
                                break;
                            }
                        } else {
                            i10 = i11;
                        }
                    }
                    bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, i10, byteBufferA022.limit());
                }
                BqP bqP2 = bnX2.A06;
                bqP2.getClass();
                bnX = new BnX(bnX2.A02, bnX2.A03, bnX2.A04, bnX2.A05, bqP2, bArrCopyOfRange, i, bnX2.A01);
            }
            interfaceC2873Bng.close();
            return bnX;
        } catch (Throwable th) {
            ((InterfaceC2873Bng) ((BnX) ((BiI) abstractC2812Blp2).A01).A07).close();
            throw th;
        }
    }

    public Bp3(C2511Bch c2511Bch) {
        this.A00 = new C2434BbK(c2511Bch);
    }
}
