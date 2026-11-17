package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class BnS implements BpR<AbstractC2815Bls, AbstractC2866BnZ<InterfaceC2873Bng>> {
    @Override // X.BpR
    public final /* bridge */ /* synthetic */ AbstractC2866BnZ<InterfaceC2873Bng> apply(AbstractC2815Bls abstractC2815Bls) throws ImageCaptureException {
        BqP bqP;
        C2701BiJ c2701BiJ = (C2701BiJ) abstractC2815Bls;
        InterfaceC2873Bng interfaceC2873Bng = c2701BiJ.A00;
        Bi7 bi7 = c2701BiJ.A01;
        if (AbstractC2797BlZ.A00(interfaceC2873Bng.AFp())) {
            try {
                Bo0[] bo0ArrAIj = interfaceC2873Bng.AIj();
                ByteBuffer byteBufferA02 = C2887Bnv.A02(bo0ArrAIj, 0);
                byteBufferA02.rewind();
                byte[] bArr = new byte[byteBufferA02.capacity()];
                byteBufferA02.get(bArr);
                bqP = new BqP(new BqQ(BV4.A0E(bArr)));
                C2887Bnv.A02(bo0ArrAIj, 0).rewind();
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to extract EXIF data.", e);
            }
        } else {
            bqP = null;
        }
        if (AbstractC2399BaC.A00.A01(ImageCaptureRotationOptionQuirk.class) != null || !AbstractC2797BlZ.A00(interfaceC2873Bng.AFp())) {
            Rect rect = bi7.A05;
            int i = bi7.A03;
            Matrix matrix = bi7.A04;
            InterfaceC2886Bnt interfaceC2886BntAGK = interfaceC2873Bng.AGK();
            InterfaceC2861BnK bnI = interfaceC2886BntAGK instanceof BnL ? ((BnL) interfaceC2886BntAGK).A00 : new BnI();
            Size sizeA0P = BV6.A0P(interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight());
            if (AbstractC2797BlZ.A00(interfaceC2873Bng.AFp())) {
                BeS.A03(bqP, "JPEG image must have Exif.");
            }
            return new BnX(matrix, rect, sizeA0P, bnI, bqP, interfaceC2873Bng, interfaceC2873Bng.AFp(), i);
        }
        BeS.A03(bqP, "JPEG image must have exif.");
        Size sizeA0P2 = BV6.A0P(interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight());
        int iA00 = bi7.A03 - bqP.A00();
        Size sizeA0a = BfO.A03(((iA00 % 360) + 360) % 360) ? BV8.A0a(sizeA0P2) : sizeA0P2;
        Matrix matrixA00 = BfO.A00(new RectF(0.0f, 0.0f, sizeA0P2.getWidth(), sizeA0P2.getHeight()), BV8.A0Q(sizeA0a), iA00, false);
        RectF rectF = new RectF(bi7.A05);
        matrixA00.mapRect(rectF);
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        int iA002 = bqP.A00();
        Matrix matrix2 = new Matrix(bi7.A04);
        matrix2.postConcat(matrixA00);
        InterfaceC2886Bnt interfaceC2886BntAGK2 = interfaceC2873Bng.AGK();
        InterfaceC2861BnK bnI2 = interfaceC2886BntAGK2 instanceof BnL ? ((BnL) interfaceC2886BntAGK2).A00 : new BnI();
        interfaceC2873Bng.AFp();
        return new BnX(matrix2, rect2, sizeA0a, bnI2, bqP, interfaceC2873Bng, interfaceC2873Bng.AFp(), iA002);
    }
}
