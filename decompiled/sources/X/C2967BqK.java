package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.BqK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2967BqK {
    public final int A00;
    public final int A01;
    public final byte[] A02;
    public static final Charset A03 = StandardCharsets.US_ASCII;
    public static final String[] A05 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] A04 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    public static C2967BqK A00(ByteOrder byteOrder, long[] jArr) {
        int i = A04[4];
        int length = jArr.length;
        ByteBuffer byteBufferA18 = BV8.A18(byteOrder, i, length);
        for (long j : jArr) {
            byteBufferA18.putInt((int) j);
        }
        return new C2967BqK(byteBufferA18.array(), 4, length);
    }

    public final String toString() {
        return FGI.A0A(this.A02.length, "(", A05[this.A00], ", data length:", ")");
    }

    public C2967BqK(byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }
}
