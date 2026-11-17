package X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: X.Bzr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3151Bzr {
    public static final OutputStream A00 = new CRO();

    public static byte[] A00(InputStream in) throws IOException {
        in.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 0;
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        while (i < 2147483639) {
            int iA0F = C8j3.A0F(2147483639, i, iMin);
            byte[] bArr = new byte[iA0F];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iA0F) {
                int i3 = in.read(bArr, i2, iA0F - i2);
                if (i3 == -1) {
                    return A01(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            int i4 = 2;
            if (iMin < 4096) {
                i4 = 4;
            }
            iMin = DX6.A01(iMin * i4);
        }
        if (in.read() == -1) {
            return A01(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] A01(Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = bufs.remove();
        int length = bArrRemove.length;
        if (length == totalLen) {
            return bArrRemove;
        }
        int i = totalLen - length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, totalLen);
        while (i > 0) {
            byte[] bArrRemove2 = bufs.remove();
            int iMin = Math.min(i, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, totalLen - i, iMin);
            i -= iMin;
        }
        return bArrCopyOf;
    }
}
