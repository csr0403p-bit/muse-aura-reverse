package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.DHl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4952DHl {
    public int A00;
    public int A01;
    public List<String> A02;
    public int A05;
    public int A06;
    public String A07;
    public final ArrayList<String> A0B = new ArrayList<>();
    public final ArrayList<Object> A0C = new ArrayList<>();
    public double[] A03 = new double[15];
    public long[] A0A = new long[15];
    public byte[] A08 = new byte[20];
    public int[] A09 = new int[20];
    public int A04 = -1;

    public static ArrayList A02(AbstractC4952DHl abstractC4952DHl, Object obj, Object obj2) {
        C7384Etj.A0Y(obj, 1);
        abstractC4952DHl.A02 = null;
        ArrayList<String> arrayList = abstractC4952DHl.A0B;
        arrayList.add(obj2);
        return arrayList;
    }

    private final void A05(int i, int i2) {
        int iA08 = A08(i);
        if (iA08 != i2) {
            throw new IllegalArgumentException(FGI.A0Z("Wrong annotation type requested at index ", ". Requested type was ", " but actual stored type is ", i, i2, iA08));
        }
    }

    public double A06(int i) {
        A05(i, 6);
        return this.A03[this.A09[i]];
    }

    public int A07(int i) {
        A05(i, 2);
        return (int) this.A0A[this.A09[i]];
    }

    public int A09(String str, double d) {
        this.A02 = null;
        ArrayList<String> arrayList = this.A0B;
        arrayList.add(str);
        int i = this.A00;
        double[] dArrCopyOf = this.A03;
        int length = dArrCopyOf.length;
        if (i == length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, (int) (length * 1.4d));
            C7384Etj.A0U(dArrCopyOf);
            this.A03 = dArrCopyOf;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        dArrCopyOf[i2] = d;
        A03((byte) 6);
        A04(i2);
        return C8j3.A0K(arrayList);
    }

    public int A0A(String str, int i) {
        this.A02 = null;
        this.A0B.add(str);
        int iA00 = A00(i);
        A03((byte) 2);
        A04(iA00);
        return r2.size() - 1;
    }

    public int A0B(String str, long j) {
        this.A02 = null;
        ArrayList<String> arrayList = this.A0B;
        arrayList.add(str);
        int iA00 = A00(j);
        A03((byte) 3);
        A04(iA00);
        return C8j3.A0K(arrayList);
    }

    public int A0C(String str, String str2) {
        this.A02 = null;
        ArrayList<String> arrayList = this.A0B;
        arrayList.add(str);
        ArrayList<Object> arrayList2 = this.A0C;
        arrayList2.add(str2);
        A03((byte) 1);
        A04(arrayList2.size() - 1);
        return arrayList.size() - 1;
    }

    public int A0D(String str, boolean z) {
        this.A02 = null;
        this.A0B.add(str);
        int iA00 = A00(z ? 1L : 0L);
        A03((byte) 8);
        A04(iA00);
        return r2.size() - 1;
    }

    public long A0J(int i) {
        A05(i, 3);
        return this.A0A[this.A09[i]];
    }

    public String A0M(int i) {
        A05(i, 1);
        return (String) this.A0C.get(this.A09[i]);
    }

    public String A0O(String str) {
        int iIndexOf;
        synchronized (this) {
            iIndexOf = this.A0B.indexOf(str);
        }
        if (iIndexOf < 0) {
            return null;
        }
        return A0N(iIndexOf);
    }

    public void A0Q() {
        this.A02 = null;
        this.A01 = 0;
        this.A0B.clear();
        this.A0C.clear();
        this.A05 = 0;
        this.A00 = 0;
        this.A07 = null;
        this.A04 = -1;
        this.A06 = 0;
    }

    public double[] A0S(int i) {
        A05(i, 7);
        double[] dArr = (double[]) this.A0C.get(this.A09[i]);
        C7384Etj.A0X(dArr);
        return dArr;
    }

    public int[] A0T(int i) {
        A05(i, 5);
        int[] iArr = (int[]) this.A0C.get(this.A09[i]);
        C7384Etj.A0X(iArr);
        return iArr;
    }

    public String[] A0W(int i) {
        A05(i, 4);
        String[] strArr = (String[]) this.A0C.get(this.A09[i]);
        C7384Etj.A0X(strArr);
        return strArr;
    }

    private final int A00(long j) {
        int i = this.A05;
        long[] jArrCopyOf = this.A0A;
        int length = jArrCopyOf.length;
        if (i == length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, (int) (length * 1.4d));
            C7384Etj.A0U(jArrCopyOf);
            this.A0A = jArrCopyOf;
        }
        int i2 = this.A05;
        this.A05 = i2 + 1;
        jArrCopyOf[i2] = j;
        return i2;
    }

    private final void A03(byte b) {
        int i = this.A01;
        byte[] bArrCopyOf = this.A08;
        int length = bArrCopyOf.length;
        if (i == length) {
            if (length == 0) {
                bArrCopyOf = new byte[20];
            } else {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, (int) (length * 1.4d));
                C7384Etj.A0U(bArrCopyOf);
            }
            this.A08 = bArrCopyOf;
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        bArrCopyOf[i2] = b;
    }

    private final void A04(int i) {
        int i2 = this.A06;
        int[] iArrCopyOf = this.A09;
        int length = iArrCopyOf.length;
        if (i2 == length) {
            if (length == 0) {
                iArrCopyOf = new int[20];
            } else {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, (int) (length * 1.4d));
                C7384Etj.A0U(iArrCopyOf);
            }
            this.A09 = iArrCopyOf;
        }
        int i3 = this.A06;
        this.A06 = i3 + 1;
        iArrCopyOf[i3] = i;
    }

    public int A08(int i) {
        if (i < 0 || i >= this.A01) {
            throw new IndexOutOfBoundsException();
        }
        return this.A08[i];
    }

    public String A0L(int i) {
        return this.A0B.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A0N(int r7) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC4952DHl.A0N(int):java.lang.String");
    }

    public List<String> A0P() {
        int i;
        List<String> list = this.A02;
        if (list != null) {
            return list;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return C0881AGi.A00;
        }
        ArrayList arrayList = new ArrayList(i2 * 2);
        synchronized (this) {
            i = this.A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(A0L(i3));
            arrayList.add(A0N(i3));
        }
        this.A02 = arrayList;
        return arrayList;
    }

    public boolean A0R(int i) {
        A05(i, 8);
        return this.A0A[this.A09[i]] != 0;
    }

    public long[] A0U(int i) {
        A05(i, 10);
        long[] jArr = (long[]) this.A0C.get(this.A09[i]);
        C7384Etj.A0X(jArr);
        return jArr;
    }

    public boolean[] A0X(int i) {
        A05(i, 9);
        boolean[] zArr = (boolean[]) this.A0C.get(this.A09[i]);
        C7384Etj.A0X(zArr);
        return zArr;
    }

    public static int A01(AbstractC4952DHl abstractC4952DHl, AbstractCollection abstractCollection, AbstractCollection abstractCollection2, byte b) {
        abstractC4952DHl.A03(b);
        abstractC4952DHl.A04(abstractCollection.size() - 1);
        return abstractCollection2.size() - 1;
    }

    public int A0E(String str, double[] dArr) {
        ArrayList arrayListA02 = A02(this, dArr, str);
        ArrayList<Object> arrayList = this.A0C;
        double[] dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
        C7384Etj.A0U(dArrCopyOf);
        arrayList.add(dArrCopyOf);
        return A01(this, arrayList, arrayListA02, (byte) 7);
    }

    public int A0F(String str, int[] iArr) {
        ArrayList arrayListA02 = A02(this, iArr, str);
        ArrayList<Object> arrayList = this.A0C;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        C7384Etj.A0U(iArrCopyOf);
        arrayList.add(iArrCopyOf);
        return A01(this, arrayList, arrayListA02, (byte) 5);
    }

    public int A0G(String str, long[] jArr) {
        ArrayList arrayListA02 = A02(this, jArr, str);
        ArrayList<Object> arrayList = this.A0C;
        long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
        C7384Etj.A0U(jArrCopyOf);
        arrayList.add(jArrCopyOf);
        return A01(this, arrayList, arrayListA02, (byte) 10);
    }

    public int A0H(String str, boolean[] zArr) {
        ArrayList arrayListA02 = A02(this, zArr, str);
        ArrayList<Object> arrayList = this.A0C;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, zArr.length);
        C7384Etj.A0U(zArrCopyOf);
        arrayList.add(zArrCopyOf);
        return A01(this, arrayList, arrayListA02, (byte) 9);
    }

    public int A0I(String[] strArr, String str) {
        ArrayList arrayListA02 = A02(this, strArr, str);
        ArrayList<Object> arrayList = this.A0C;
        arrayList.add(C8j3.A1a(strArr, strArr.length));
        return A01(this, arrayList, arrayListA02, (byte) 4);
    }

    public long A0K(int i) {
        int iA08 = A08(i);
        if (iA08 == 2) {
            return A07(i);
        }
        if (iA08 == 3) {
            return A0J(i);
        }
        throw new IllegalStateException(FGI.A0Y("safelyGetLongValue called on type ", " at index ", "; expected INT or LONG", iA08, i));
    }

    public long[] A0V(int i) {
        int iA08 = A08(i);
        if (iA08 != 5) {
            if (iA08 == 10) {
                return A0U(i);
            }
            throw C3cG.A0Q(FGI.A0Y("safelyGetLongArrayValue called on type ", " at index ", "; expected INT_ARRAY or LONG_ARRAY", iA08, i));
        }
        int length = A0T(i).length;
        long[] jArr = new long[length];
        for (int i2 = 0; i2 < length; i2++) {
            jArr[i2] = r4[i2];
        }
        return jArr;
    }
}
