package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.jsoup.helper.ValidationException;

/* loaded from: classes6.dex */
public final class Gt7 implements Iterable<Gt6>, Cloneable {
    public int A00 = 0;
    public String[] A02 = new String[3];
    public Object[] A01 = new Object[3];

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Gt7 gt7 = (Gt7) obj;
                if (this.A00 == gt7.A00) {
                    for (int i = 0; i < this.A00; i++) {
                        int iA06 = gt7.A06(this.A02[i]);
                        if (iA06 != -1 && C6xC.A00(this.A01[i], gt7.A01[iA06])) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A02(Object obj, String str, Gt7 gt7) {
        int i = gt7.A00;
        int i2 = i + 1;
        if (i2 < i) {
            throw new ValidationException("Must be true");
        }
        String[] strArr = gt7.A02;
        int length = strArr.length;
        if (length < i2) {
            int i3 = length >= 3 ? i * 2 : 3;
            if (i2 <= i3) {
                i2 = i3;
            }
            gt7.A02 = (String[]) Arrays.copyOf(strArr, i2);
            gt7.A01 = Arrays.copyOf(gt7.A01, i2);
        }
        String[] strArr2 = gt7.A02;
        int i4 = gt7.A00;
        strArr2[i4] = str;
        gt7.A01[i4] = obj;
        gt7.A00 = i4 + 1;
    }

    public static void A03(Gt7 gt7, int i) {
        int[] iArr;
        int i2;
        int length;
        if (i >= gt7.A00) {
            throw new ValidationException("Must be false");
        }
        C10261GtF c10261GtFA0D = gt7.A0D();
        if (c10261GtFA0D != null && !A04(gt7.A02[i])) {
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                if (!A04(gt7.A02[i4])) {
                    i3++;
                }
            }
            if (i3 >= 0 && (i2 = i3 * 4) < (length = (iArr = c10261GtFA0D.A05).length)) {
                int i5 = i2 + 4;
                int i6 = length - i5;
                if (i6 > 0) {
                    System.arraycopy(iArr, i5, iArr, i2, i6);
                }
                Arrays.fill(iArr, length - 4, length, -1);
            }
        }
        int i7 = (gt7.A00 - i) - 1;
        if (i7 > 0) {
            String[] strArr = gt7.A02;
            int i8 = i + 1;
            System.arraycopy(strArr, i8, strArr, i, i7);
            Object[] objArr = gt7.A01;
            System.arraycopy(objArr, i8, objArr, i, i7);
        }
        int i9 = gt7.A00 - 1;
        gt7.A00 = i9;
        gt7.A02[i9] = null;
        gt7.A01[i9] = null;
    }

    public final int A05() {
        if (this.A00 == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            if (!A04(this.A02[i2])) {
                i++;
            }
        }
        return i;
    }

    public final Map<String, Object> A0A() {
        int iA06 = A06("/jsoup.userdata");
        if (iA06 != -1) {
            return (Map) this.A01[iA06];
        }
        HashMap mapA0u = BV4.A0u();
        A02(mapA0u, "/jsoup.userdata", this);
        return mapA0u;
    }

    public final C10261GtF A0D() {
        int iA06 = A06("/jsoup.spans");
        if (iA06 == -1) {
            return null;
        }
        return (C10261GtF) this.A01[iA06];
    }

    public final void A0F(Hy9 hy9, C10532Hqa c10532Hqa) {
        int i = this.A00;
        HashSet hashSet = null;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.A02[i2];
            if (!A04(str)) {
                String strA00 = Gt6.A00(str);
                if (!strA00.equals(str)) {
                    if (hashSet == null) {
                        hashSet = new HashSet(this.A00);
                        for (int i3 = 0; i3 < this.A00; i3++) {
                            String str2 = this.A02[i3];
                            if (!A04(str2)) {
                                hashSet.add(Gu9.A00(str2));
                            }
                        }
                    }
                    while (!hashSet.add(Gu9.A00(strA00))) {
                        StringBuilder sbA0t = AbstractC7609F5w.A0t();
                        sbA0t.append('_');
                        sbA0t.append(strA00);
                        strA00 = Gt5.A01(sbA0t);
                    }
                }
                String str3 = (String) this.A01[i2];
                hy9.A01(' ');
                Gt6.A01(strA00, str3, hy9, c10532Hqa);
            }
        }
    }

    public final int hashCode() {
        return (((this.A00 * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A01);
    }

    @Override // java.lang.Iterable
    public final Iterator<Gt6> iterator() {
        return new I11(this);
    }

    public static int A00(String str, Gt7 gt7) {
        C10293Gtx.A00(str);
        for (int i = 0; i < gt7.A00; i++) {
            if (str.equalsIgnoreCase(gt7.A02[i])) {
                return i;
            }
        }
        return -1;
    }

    public static C10261GtF A01(Gt7 gt7) {
        C10261GtF c10261GtFA0D = gt7.A0D();
        if (c10261GtFA0D != null) {
            return c10261GtFA0D;
        }
        C10261GtF c10261GtF = new C10261GtF();
        A02(c10261GtF, "/jsoup.spans", gt7);
        return c10261GtF;
    }

    public static boolean A04(String str) {
        return str.length() > 1 && str.charAt(0) == '/';
    }

    public final int A06(String str) {
        C10293Gtx.A00(str);
        for (int i = 0; i < this.A00; i++) {
            if (str.equals(this.A02[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int A07(String str) {
        C10293Gtx.A00(str);
        int i = 0;
        for (int i2 = 0; i2 < this.A00; i2++) {
            String str2 = this.A02[i2];
            if (!A04(str2)) {
                if (str.equals(str2)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final String A08(String str) {
        int iA06 = A06(str);
        if (iA06 == -1) {
            return "";
        }
        Object obj = this.A01[iA06];
        return obj instanceof String ? (String) obj : "";
    }

    public final String A09(String str) {
        int iA00 = A00(str, this);
        if (iA00 == -1) {
            return "";
        }
        Object obj = this.A01[iA00];
        return obj instanceof String ? (String) obj : "";
    }

    /* renamed from: A0B, reason: merged with bridge method [inline-methods] */
    public final Gt7 clone() {
        try {
            Gt7 gt7 = (Gt7) super.clone();
            gt7.A00 = this.A00;
            gt7.A02 = (String[]) Arrays.copyOf(this.A02, this.A00);
            Object[] objArrCopyOf = Arrays.copyOf(this.A01, this.A00);
            gt7.A01 = objArrCopyOf;
            int iA06 = A06("/jsoup.userdata");
            if (iA06 != -1) {
                objArrCopyOf[iA06] = BV4.A0w((Map) this.A01[iA06]);
            }
            int iA062 = A06("/jsoup.spans");
            if (iA062 != -1) {
                gt7.A01[iA062] = ((C10261GtF) this.A01[iA062]).A01();
            }
            return gt7;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }

    public final GtO A0C(String str) {
        C10261GtF c10261GtFA0D;
        int iA07 = A07(str);
        if (iA07 != -1 && (c10261GtFA0D = A0D()) != null && iA07 >= 0) {
            int[] iArr = c10261GtFA0D.A05;
            int i = iA07 * 4;
            int i2 = i + 2;
            int i3 = i2 + 1;
            if (i3 < iArr.length) {
                int i4 = iArr[i];
                int i5 = iArr[i + 1];
                int i6 = iArr[i2];
                int i7 = iArr[i3];
                if (i4 != -1) {
                    return new GtO(c10261GtFA0D.A04, i4, i5, i6, i7);
                }
            }
        }
        return GtO.A05;
    }

    public final void A0E(String str, String str2) {
        C10293Gtx.A00(str);
        int iA06 = A06(str);
        if (iA06 != -1) {
            this.A01[iA06] = str2;
        } else {
            A02(str2, str, this);
        }
    }

    public final String toString() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        A0F(Hy9.A00(sbA0t), new C10532Hqa());
        return Gt5.A01(sbA0t);
    }
}
