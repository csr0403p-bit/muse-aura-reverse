package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.BqR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2970BqR {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public static C2970BqR A01(ByteOrder byteOrder, int[] iArr) {
        int i = BqQ.A0l[3];
        int length = iArr.length;
        ByteBuffer byteBufferA18 = BV8.A18(byteOrder, i, length);
        for (int i2 : iArr) {
            byteBufferA18.putShort((short) i2);
        }
        return A04(byteBufferA18.array(), 3, length);
    }

    public static C2970BqR A02(ByteOrder byteOrder, long[] jArr) {
        int i = BqQ.A0l[4];
        int length = jArr.length;
        ByteBuffer byteBufferA18 = BV8.A18(byteOrder, i, length);
        for (long j : jArr) {
            byteBufferA18.putInt((int) j);
        }
        return A04(byteBufferA18.array(), 4, length);
    }

    public static C2970BqR A03(ByteOrder byteOrder, BqV[] bqVArr) {
        int i = BqQ.A0l[5];
        int length = bqVArr.length;
        ByteBuffer byteBufferA18 = BV8.A18(byteOrder, i, length);
        for (BqV bqV : bqVArr) {
            byteBufferA18.putInt((int) bqV.A01);
            byteBufferA18.putInt((int) bqV.A00);
        }
        return A04(byteBufferA18.array(), 5, length);
    }

    public static C2970BqR A04(byte[] bArr, int i, int i2) {
        return new C2970BqR(-1L, bArr, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x012a: MOVE (r12 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:298), block:B:78:0x012a */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [double[]] */
    /* JADX WARN: Type inference failed for: r8v1, types: [double[]] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v5, types: [long[]] */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.BqV[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.BqV[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.nio.ByteOrder r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2970BqR.A07(java.nio.ByteOrder):java.lang.Object");
    }

    public final String toString() {
        return FGI.A0A(this.A03.length, "(", BqQ.A0m[this.A00], ", data length:", ")");
    }

    public C2970BqR(long j, byte[] bArr, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = bArr;
    }

    public static C2970BqR A00(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new C2970BqR(-1L, new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
        }
        byte[] bytes = str.getBytes(BqQ.A0K);
        return A04(bytes, 1, bytes.length);
    }

    public final double A05(ByteOrder byteOrder) throws Throwable {
        Object objA07 = A07(byteOrder);
        if (objA07 == null) {
            throw BV6.A0k("NULL can't be converted to a double value");
        }
        if (objA07 instanceof String) {
            return Double.parseDouble((String) objA07);
        }
        if (objA07 instanceof long[]) {
            if (((long[]) objA07).length == 1) {
                return r4[0];
            }
            throw BV6.A0k("There are more than one component");
        }
        if (objA07 instanceof int[]) {
            if (((int[]) objA07).length == 1) {
                return r4[0];
            }
            throw BV6.A0k("There are more than one component");
        }
        if (objA07 instanceof double[]) {
            double[] dArr = (double[]) objA07;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw BV6.A0k("There are more than one component");
        }
        if (!(objA07 instanceof BqV[])) {
            throw BV6.A0k("Couldn't find a double value");
        }
        BqV[] bqVArr = (BqV[]) objA07;
        if (bqVArr.length != 1) {
            throw BV6.A0k("There are more than one component");
        }
        BqV bqV = bqVArr[0];
        return bqV.A01 / bqV.A00;
    }

    public final int A06(ByteOrder byteOrder) throws Throwable {
        Object objA07 = A07(byteOrder);
        if (objA07 == null) {
            throw BV6.A0k("NULL can't be converted to a integer value");
        }
        if (objA07 instanceof String) {
            return Integer.parseInt((String) objA07);
        }
        if (objA07 instanceof long[]) {
            long[] jArr = (long[]) objA07;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw BV6.A0k("There are more than one component");
        }
        if (!(objA07 instanceof int[])) {
            throw BV6.A0k("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objA07;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw BV6.A0k("There are more than one component");
    }

    public final String A08(ByteOrder byteOrder) throws Throwable {
        Object objA07 = A07(byteOrder);
        if (objA07 == null) {
            return null;
        }
        if (objA07 instanceof String) {
            return (String) objA07;
        }
        StringBuilder sbA0w = C60O.A0w();
        int i = 0;
        if (objA07 instanceof long[]) {
            long[] jArr = (long[]) objA07;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sbA0w.append(jArr[i]);
                i++;
                if (i != length) {
                    sbA0w.append(",");
                }
            }
        } else if (objA07 instanceof int[]) {
            int[] iArr = (int[]) objA07;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sbA0w.append(iArr[i]);
                i++;
                if (i != length2) {
                    sbA0w.append(",");
                }
            }
        } else if (objA07 instanceof double[]) {
            double[] dArr = (double[]) objA07;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sbA0w.append(dArr[i]);
                i++;
                if (i != length3) {
                    sbA0w.append(",");
                }
            }
        } else {
            if (!(objA07 instanceof BqV[])) {
                return null;
            }
            BqV[] bqVArr = (BqV[]) objA07;
            while (true) {
                int length4 = bqVArr.length;
                if (i >= length4) {
                    break;
                }
                BqV bqV = bqVArr[i];
                sbA0w.append(bqV.A01);
                sbA0w.append('/');
                sbA0w.append(bqV.A00);
                i++;
                if (i != length4) {
                    sbA0w.append(",");
                }
            }
        }
        return sbA0w.toString();
    }
}
