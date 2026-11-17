package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ImageCaptureException;
import java.io.IOException;

/* renamed from: X.BnW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2865BnW implements BpR<AbstractC2866BnZ<byte[]>, AbstractC2866BnZ<Bitmap>> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BpR
    public final /* bridge */ /* synthetic */ AbstractC2866BnZ<Bitmap> apply(AbstractC2866BnZ<byte[]> abstractC2866BnZ) throws ImageCaptureException, IOException {
        BnX bnX = (BnX) abstractC2866BnZ;
        Rect rect = bnX.A03;
        byte[] bArr = (byte[]) bnX.A07;
        try {
            Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
            BqP bqP = bnX.A06;
            bqP.getClass();
            Rect rect2 = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
            int i = bnX.A01;
            Matrix matrix = bnX.A02;
            RectF rectF = BfO.A00;
            Matrix matrix2 = new Matrix(matrix);
            matrix2.postTranslate(-rect.left, -rect.top);
            return new BnX(matrix2, rect2, BV6.A0P(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), bnX.A05, bqP, bitmapDecodeRegion, 42, i);
        } catch (IOException e) {
            throw new ImageCaptureException(1, "Failed to decode JPEG.", e);
        }
    }
}
