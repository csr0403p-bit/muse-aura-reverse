package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Edr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6990Edr implements InterfaceC7004Ee9 {
    public static final byte[] A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A04;
    public static final byte[] A05;
    public static final byte[] A06;
    public static final byte[] A09;
    public static final byte[] A0A;
    public static final byte[][] A0D;
    public static final int A0E;
    public final int A00;
    public static final byte[] A0B = {-1, -40, -1};
    public static final byte[] A0C = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] A07 = CA7.A00("GIF87a");
    public static final byte[] A08 = CA7.A00("GIF89a");

    static {
        byte[] bArrA00 = CA7.A00("BM");
        A04 = bArrA00;
        A0E = bArrA00.length;
        A0A = new byte[]{0, 0, 1, 0};
        A09 = CA7.A00("ftyp");
        A0D = new byte[][]{CA7.A00("heic"), CA7.A00("heix"), CA7.A00("hevc"), CA7.A00("hevx"), CA7.A00("mif1"), CA7.A00("msf1")};
        A05 = new byte[]{73, 73, 42, 0};
        A06 = new byte[]{77, 77, 0, 42};
        A03 = new byte[]{3, 0, 8, 0};
        A01 = CA7.A00("ftyp");
        A02 = CA7.A00("avif");
    }

    public static final boolean A00(byte[] bArr, int i, byte[] bArr2) {
        C7384Etj.A0Y(bArr2, 1);
        int length = bArr2.length;
        if (length + i <= bArr.length) {
            Iterable aDq = new ADq(0, length - 1);
            if (!(aDq instanceof Collection) || !((Collection) aDq).isEmpty()) {
                Iterator<Integer> it = aDq.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    if (bArr[i + iA00] != bArr2[iA00]) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bd, code lost:
    
        if (A00(r6, 0, r0) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // X.InterfaceC7004Ee9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C7003Ee6 determineFormat(byte[] r6, int r7) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6990Edr.determineFormat(byte[], int):X.Ee6");
    }

    public C6990Edr() {
        Integer numA0Y = BV4.A0Y();
        Integer numValueOf = Integer.valueOf(A0E);
        Integer numA0Z = BV4.A0Z();
        Integer[] numArr = {21, 20, numA0Y, 8, 6, numValueOf, numA0Z, 12, numA0Z, 12};
        Integer num = numArr[0];
        int i = 1;
        while (true) {
            Integer num2 = numArr[i];
            num = num.compareTo(num2) < 0 ? num2 : num;
            if (i == 9) {
                break;
            } else {
                i++;
            }
        }
        if (num == null) {
            throw BV4.A0U();
        }
        this.A00 = num.intValue();
    }

    @Override // X.InterfaceC7004Ee9
    public final int getHeaderSize() {
        return this.A00;
    }
}
