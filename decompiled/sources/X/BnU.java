package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;

/* loaded from: classes5.dex */
public final class BnU implements BpR<AbstractC2866BnZ<byte[]>, AbstractC2866BnZ<InterfaceC2873Bng>> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BpR
    public final /* bridge */ /* synthetic */ AbstractC2866BnZ<InterfaceC2873Bng> apply(AbstractC2866BnZ<byte[]> abstractC2866BnZ) {
        InterfaceC2873Bng interfaceC2873BngA30;
        BnX bnX = (BnX) abstractC2866BnZ;
        Size size = bnX.A04;
        C2863BnN c2863BnNA00 = C2863BnN.A00(size.getWidth(), size.getHeight(), 256, 2);
        byte[] bArr = (byte[]) bnX.A07;
        int i = ImageProcessingUtil.A00;
        BeS.A05(AnonymousClass002.A1Q(c2863BnNA00.AGJ(), 256));
        bArr.getClass();
        Surface surface = c2863BnNA00.getSurface();
        surface.getClass();
        if (ImageProcessingUtil.nativeWriteJpegToSurface(bArr, surface) != 0) {
            AbstractC2875Bni.A02("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            interfaceC2873BngA30 = null;
        } else {
            interfaceC2873BngA30 = c2863BnNA00.A30();
            if (interfaceC2873BngA30 == null) {
                AbstractC2875Bni.A02("ImageProcessingUtil", "Failed to get acquire JPEG image.");
            }
        }
        c2863BnNA00.A01();
        interfaceC2873BngA30.getClass();
        BqP bqP = bnX.A06;
        bqP.getClass();
        Rect rect = bnX.A03;
        int i2 = bnX.A01;
        Matrix matrix = bnX.A02;
        InterfaceC2861BnK interfaceC2861BnK = bnX.A05;
        Size sizeA0P = BV6.A0P(interfaceC2873BngA30.getWidth(), interfaceC2873BngA30.getHeight());
        interfaceC2873BngA30.AFp();
        return new BnX(matrix, rect, sizeA0P, interfaceC2861BnK, bqP, interfaceC2873BngA30, interfaceC2873BngA30.AFp(), i2);
    }
}
