package X;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class CAC {
    public static final CA9 A01 = new CA9("MLKitImageUtils", "");
    public static final CAC A00 = new CAC();

    public static final int A00(C3665CcL c3665CcL) {
        int i = c3665CcL.A03;
        if (i == -1) {
            Bitmap bitmap = c3665CcL.A04;
            CRy.A03(bitmap);
            return bitmap.getAllocationByteCount();
        }
        if (i == 17) {
            ByteBuffer byteBuffer = c3665CcL.A06;
            CRy.A03(byteBuffer);
            return byteBuffer.limit();
        }
        if (i != 35) {
            return 0;
        }
        Image.Plane[] planes = c3665CcL.A05 == null ? null : c3665CcL.A05.A00.getPlanes();
        CRy.A03(planes);
        return (planes[0].getBuffer().limit() * 3) / 2;
    }

    public static final ObjectWrapper A01(C3665CcL c3665CcL) {
        Object obj;
        int i = c3665CcL.A03;
        if (i == -1) {
            obj = c3665CcL.A04;
        } else {
            if (i != 17) {
                if (i != 35) {
                    throw new MlKitException(FGI.A0H("Unsupported image format: ", i), 3);
                }
                obj = c3665CcL.A05 == null ? null : c3665CcL.A05.A00;
                return new ObjectWrapper(obj);
            }
            obj = c3665CcL.A06;
        }
        CRy.A03(obj);
        return new ObjectWrapper(obj);
    }
}
