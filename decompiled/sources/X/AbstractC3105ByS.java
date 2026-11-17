package X;

import com.facebook.acra.util.UrlEncodingWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ByS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3105ByS {
    public static long A00(byte b, byte b2) {
        int i;
        int i2 = b & 255;
        int i3 = b & 3;
        int i4 = 1;
        if (i3 != 0) {
            i4 = 2;
            if (i3 != 1 && i3 != 2) {
                i4 = b2 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE;
            }
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        int i7 = 2500;
        if (i5 < 16) {
            i7 = 10000;
            if (i5 >= 12) {
                i6 = i5 & 1;
            } else {
                i = 60000;
                if (i6 != 3) {
                }
            }
            i = i7 << i6;
        } else {
            i = i7 << i6;
        }
        return i4 * i;
    }

    public static List<byte[]> A01(byte[] bArr) {
        ArrayList arrayListA11 = C60O.A11(3);
        arrayListA11.add(bArr);
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        byteBufferOrder.putLong((((bArr[10] & 255) | BV6.A0D(bArr, 11)) * 1000000000) / 48000);
        arrayListA11.add(byteBufferOrder.array());
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        byteBufferOrder2.putLong(80000000L);
        arrayListA11.add(byteBufferOrder2.array());
        return arrayListA11;
    }
}
