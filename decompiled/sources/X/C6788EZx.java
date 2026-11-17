package X;

import com.facebook.acra.util.UrlEncodingWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.EZx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6788EZx implements Serializable, Comparable<C6788EZx> {
    public static final C6788EZx A02 = new C6788EZx(new byte[0]);
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    public C6788EZx(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.data = bArr;
    }

    public final void A09(C6818EaW c6818EaW, int i) {
        long j;
        int i2 = 0;
        if (this instanceof C6791Ea0) {
            C6791Ea0 c6791Ea0 = (C6791Ea0) this;
            int i3 = 0;
            int iA03 = C6791Ea0.A03(c6791Ea0, 0);
            while (i3 < i) {
                int i4 = iA03 == 0 ? 0 : c6791Ea0.A00[iA03 - 1];
                int[] iArr = c6791Ea0.A00;
                int i5 = iArr[iA03] - i4;
                byte[][] bArr = c6791Ea0.A01;
                int i6 = iArr[bArr.length + iA03];
                int iMin = Math.min(i, i5 + i4) - i3;
                int i7 = i6 + (i3 - i4);
                C6830Eai c6830Eai = new C6830Eai(bArr[iA03], i7, i7 + iMin, true);
                C6830Eai c6830Eai2 = c6818EaW.A01;
                if (c6830Eai2 == null) {
                    c6830Eai.A03 = c6830Eai;
                    c6830Eai.A02 = c6830Eai;
                    c6818EaW.A01 = c6830Eai;
                } else {
                    C6830Eai c6830Eai3 = c6830Eai2.A03;
                    C7384Etj.A0X(c6830Eai3);
                    c6830Eai3.A03(c6830Eai);
                }
                i3 += iMin;
                iA03++;
            }
            j = c6818EaW.A00 + i;
        } else {
            byte[] bArr2 = this.data;
            int i8 = 0;
            C7384Etj.A0Y(bArr2, 0);
            long j2 = i;
            AbstractC6789EZy.A01(bArr2.length, 0L, j2);
            while (i2 < i) {
                C6830Eai c6830EaiA06 = c6818EaW.A06(1);
                int i9 = c6830EaiA06.A00;
                int iMin2 = Math.min(i - i2, 8192 - i9);
                i2 = i8 + iMin2;
                System.arraycopy(bArr2, i8, c6830EaiA06.A06, i9, i2 - i8);
                c6830EaiA06.A00 += iMin2;
                i8 = i2;
            }
            j = c6818EaW.A00 + j2;
        }
        c6818EaW.A00 = j;
    }

    public boolean A0D(C6788EZx c6788EZx, int i, int i2, int i3) {
        C7384Etj.A0Y(c6788EZx, 1);
        return c6788EZx.A0E(this.data, i2, i, i3);
    }

    public boolean A0E(byte[] bArr, int i, int i2, int i3) {
        C7384Etj.A0Y(bArr, 1);
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C6788EZx) {
                C6788EZx c6788EZx = (C6788EZx) obj;
                int iA0C = c6788EZx.A0C();
                byte[] bArr = this.data;
                int length = bArr.length;
                if (iA0C != length || !c6788EZx.A0E(bArr, 0, 0, length)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int A00(char c) {
        if ('0' <= c) {
            if (c < ':') {
                return c - '0';
            }
            if ('a' <= c) {
                if (c < 'g') {
                    return c - 'W';
                }
            } else if ('A' <= c && c < 'G') {
                return c - '7';
            }
        }
        throw C60O.A0i(FGI.A0E("Unexpected hex digit: ", c));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public final String A05() {
        int i;
        byte[] bArr = this.data;
        byte[] bArr2 = CxH.A00;
        boolean zA1Y = C60P.A1Y(bArr, bArr2);
        int length = bArr.length;
        byte[] bArr3 = new byte[((length + 2) / 3) * 4];
        int i2 = length - (length % 3);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            int i5 = i3 + 2;
            byte b2 = bArr[i3 + 1];
            i3 += 3;
            byte b3 = bArr[i5];
            bArr3[i4] = bArr2[(b & 255) >> 2];
            bArr3[i4 + 1] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr3[i4 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i4 += 4;
            bArr3[i6] = bArr2[b3 & UrlEncodingWriter.UTF16_REPLACEMENT_BYTE];
        }
        int i7 = length - i2;
        if (i7 != zA1Y) {
            if (i7 == 2) {
                byte b4 = bArr[i3];
                byte b5 = bArr[i3 + 1];
                bArr3[i4] = bArr2[(b4 & 255) >> 2];
                bArr3[i4 + 1] = bArr2[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                i = i4 + 3;
                bArr3[i4 + 2] = bArr2[(b5 & 15) << 2];
            }
            return BV4.A0o(bArr3);
        }
        byte b6 = bArr[i3];
        bArr3[i4] = bArr2[(b6 & 255) >> 2];
        bArr3[i4 + 1] = bArr2[(b6 & 3) << 4];
        i = i4 + 3;
        bArr3[i4 + 2] = 61;
        bArr3[i] = 61;
        return BV4.A0o(bArr3);
    }

    public final String A06() {
        if (this instanceof C6791Ea0) {
            return C6791Ea0.A04((C6791Ea0) this).A06();
        }
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC6790EZz.A00;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final String A07() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        byte[] bArrA0A = A0A();
        C7384Etj.A0Y(bArrA0A, 0);
        String strA0o = BV4.A0o(bArrA0A);
        this.A01 = strA0o;
        return strA0o;
    }

    public final C6788EZx A08() {
        if (this instanceof C6791Ea0) {
            return C6791Ea0.A04((C6791Ea0) this).A08();
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                C7384Etj.A0U(bArrCopyOf);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C6788EZx(bArrCopyOf);
            }
            i++;
        }
    }

    public final byte[] A0A() {
        if (!(this instanceof C6791Ea0)) {
            return this.data;
        }
        C6791Ea0 c6791Ea0 = (C6791Ea0) this;
        byte[] bArr = new byte[c6791Ea0.A0C()];
        byte[][] bArr2 = c6791Ea0.A01;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = c6791Ea0.A00;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr3 = bArr2[i];
            int i6 = i5 - i2;
            C7384Etj.A0Y(bArr3, 0);
            System.arraycopy(bArr3, i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public byte A0B(int i) {
        return this.data[i];
    }

    public int A0C() {
        return this.data.length;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6788EZx c6788EZx) {
        C6788EZx c6788EZx2 = c6788EZx;
        C7384Etj.A0Y(c6788EZx2, 0);
        int iA0C = A0C();
        int iA0C2 = c6788EZx2.A0C();
        int iMin = Math.min(iA0C, iA0C2);
        for (int i = 0; i < iMin; i++) {
            int iA0B = A0B(i) & 255;
            int iA0B2 = c6788EZx2.A0B(i) & 255;
            if (iA0B != iA0B2) {
                return iA0B < iA0B2 ? -1 : 1;
            }
        }
        if (iA0C == iA0C2) {
            return 0;
        }
        return iA0C < iA0C2 ? -1 : 1;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.A00 = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142 A[EDGE_INSN: B:89:0x0142->B:69:0x00b4 BREAK  A[LOOP:0: B:7:0x000f->B:143:?], EDGE_INSN: B:115:0x0142->B:89:0x0142 BREAK  A[LOOP:1: B:21:0x0039->B:36:0x0057, LOOP_LABEL: LOOP:0: B:7:0x000f->B:143:?], EDGE_INSN: B:113:0x0142->B:89:0x0142 BREAK  A[LOOP:1: B:21:0x0039->B:36:0x0057, LOOP_LABEL: LOOP:0: B:7:0x000f->B:143:?], EDGE_INSN: B:114:0x0142->B:89:0x0142 BREAK  A[LOOP:1: B:21:0x0039->B:36:0x0057, LOOP_LABEL: LOOP:0: B:7:0x000f->B:143:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6788EZx.toString():java.lang.String");
    }

    public static final C6788EZx A01(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw C60Q.A0U("Unexpected hex string: ", str);
        }
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((A00(str.charAt(i3)) << 4) + A00(str.charAt(i3 + 1)));
        }
        return new C6788EZx(bArr);
    }

    public static final C6788EZx A02(String str) {
        C6788EZx c6788EZx = new C6788EZx(C3cG.A1S(str));
        c6788EZx.A01 = str;
        return c6788EZx;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw BV5.A0Q("byteCount < 0: ", i);
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        Field declaredField = C6788EZx.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, bArr);
    }
}
