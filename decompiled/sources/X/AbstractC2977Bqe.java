package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.Bqe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2977Bqe {
    public static final byte[] A00 = {60, -15};

    public static String A00(ByteBuffer byteBuffer, int i) {
        Object[] objArrA1Z;
        String str;
        int i2;
        if (i < 8) {
            return "file size too small";
        }
        if (byteBuffer.limit() < i) {
            return String.format(Locale.ROOT, "Buffer limit %d is less than file length %d", BV5.A1Z(byteBuffer.limit(), i));
        }
        byte b = byteBuffer.get();
        byte[] bArr = A00;
        if (b != bArr[0] || byteBuffer.get() != bArr[1]) {
            byteBuffer.position(0);
            return "";
        }
        byte b2 = byteBuffer.get();
        if (b2 <= 0 || b2 > 1) {
            objArrA1Z = new Object[]{Byte.valueOf(b2), (byte) 1};
            str = "Bad file ver:%d, current:%d";
        } else {
            byte b3 = byteBuffer.get();
            if (b3 <= 0 || b3 >= (i2 = i - 2)) {
                objArrA1Z = new Object[]{Byte.valueOf(b3)};
                str = "Bad bodyOffset:%d";
            } else {
                int i3 = byteBuffer.getInt();
                if (i3 != i) {
                    objArrA1Z = BV5.A1Z(i3, i);
                    str = "Bad fileSize:%d, actual fileSize:%d";
                } else {
                    byteBuffer.position(i2);
                    byte b4 = byteBuffer.get();
                    byte b5 = byteBuffer.get();
                    if (b4 == bArr[0] && b5 == bArr[1]) {
                        byteBuffer.position(b3);
                        return "";
                    }
                    objArrA1Z = new Object[]{Byte.valueOf(b4), Byte.valueOf(b5)};
                    str = "Bad footer magicHex:%02X %02X";
                }
            }
        }
        return String.format(str, objArrA1Z);
    }
}
