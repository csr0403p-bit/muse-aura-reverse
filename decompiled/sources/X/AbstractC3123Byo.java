package X;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.Byo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3123Byo {
    public static void A01(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(FGI.A0H("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void A00(MediaFormat mediaFormat, C6180DxO c6180DxO) {
        if (c6180DxO != null) {
            int i = c6180DxO.A04;
            if (i != -1) {
                mediaFormat.setInteger("color-transfer", i);
            }
            int i2 = c6180DxO.A03;
            if (i2 != -1) {
                mediaFormat.setInteger("color-standard", i2);
            }
            int i3 = c6180DxO.A02;
            if (i3 != -1) {
                mediaFormat.setInteger("color-range", i3);
            }
            byte[] bArr = c6180DxO.A06;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
