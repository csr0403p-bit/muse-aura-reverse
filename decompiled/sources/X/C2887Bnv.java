package X;

import android.media.Image;
import java.nio.ByteBuffer;

/* renamed from: X.Bnv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2887Bnv implements Bo0 {
    public final Image.Plane A00;

    public static int A00(Bo0[] bo0Arr, int i) {
        return ((C2887Bnv) bo0Arr[i]).A00.getPixelStride();
    }

    public static int A01(Bo0[] bo0Arr, int i) {
        return ((C2887Bnv) bo0Arr[i]).A00.getRowStride();
    }

    public static ByteBuffer A02(Bo0[] bo0Arr, int i) {
        return ((C2887Bnv) bo0Arr[i]).A00.getBuffer();
    }

    public static void A03(Object obj, byte[] bArr, int i, int i2, int i3) {
        Image.Plane plane = ((C2887Bnv) obj).A00;
        bArr[i3] = plane.getBuffer().get((plane.getRowStride() * i) + (plane.getPixelStride() * i2));
    }

    public C2887Bnv(Image.Plane plane) {
        this.A00 = plane;
    }
}
