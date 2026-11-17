package X;

import android.text.SpannableStringBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.E1f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6330E1f {
    public List<C6330E1f> A00;
    public final long A01;
    public final long A02;
    public final C6330E1f A03;
    public final E1j A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final String[] A0A;
    public final HashMap<String, Integer> A0B;
    public final HashMap<String, Integer> A0C;

    /* JADX WARN: Incorrect types in method signature: (LX/E1j;[Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;LX/E1j;>;)LX/E1j; */
    public static E1j A01(E1j e1j, Map map, String[] strArr) {
        int length;
        int i = 0;
        if (e1j == null) {
            if (strArr == null) {
                return null;
            }
            length = strArr.length;
            if (length == 1) {
                return (E1j) map.get(strArr[0]);
            }
            if (length <= 1) {
                return e1j;
            }
            e1j = new E1j();
        } else {
            if (strArr == null) {
                return e1j;
            }
            length = strArr.length;
            if (length == 1) {
                e1j.A00((E1j) map.get(strArr[0]));
                return e1j;
            }
            if (length <= 1) {
                return e1j;
            }
        }
        do {
            e1j.A00((E1j) map.get(strArr[i]));
            i++;
        } while (i < length);
        return e1j;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C6330E1f r11, java.lang.String r12, java.util.Map r13, long r14, boolean r16) {
        /*
            r6 = r12
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r11.A0C
            r5.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r11.A0B
            r3.clear()
            java.lang.String r0 = "metadata"
            java.lang.String r4 = r11.A07
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L33
            java.lang.String r0 = ""
            java.lang.String r1 = r11.A06
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            r6 = r1
        L20:
            boolean r0 = r11.A09
            r7 = r13
            if (r0 == 0) goto L34
            if (r16 == 0) goto L34
            android.text.SpannableStringBuilder r1 = A00(r6, r13)
            java.lang.String r0 = r11.A08
            r0.getClass()
            r1.append(r0)
        L33:
            return
        L34:
            java.lang.String r0 = "br"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L48
            if (r16 == 0) goto L48
            android.text.SpannableStringBuilder r1 = A00(r6, r13)
            r0 = 10
            r1.append(r0)
            return
        L48:
            r8 = r14
            boolean r0 = r11.A06(r14)
            if (r0 == 0) goto L33
            java.util.Iterator r2 = X.AnonymousClass002.A0n(r13)
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.util.Map$Entry r0 = X.C3cH.A0l(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.E0L r0 = (X.E0L) r0
            java.lang.CharSequence r0 = r0.A0G
            r0.getClass()
            int r0 = r0.length()
            X.C8j4.A1O(r1, r5, r0)
            goto L53
        L74:
            java.lang.String r0 = "p"
            boolean r2 = r0.equals(r4)
            r1 = 0
        L7b:
            java.util.List<X.E1f> r0 = r11.A00
            if (r0 != 0) goto L92
            r0 = 0
        L80:
            if (r1 >= r0) goto L97
            X.E1f r5 = r11.A07(r1)
            if (r16 != 0) goto L8b
            r10 = 0
            if (r2 == 0) goto L8c
        L8b:
            r10 = 1
        L8c:
            A03(r5, r6, r7, r8, r10)
            int r1 = r1 + 1
            goto L7b
        L92:
            int r0 = r0.size()
            goto L80
        L97:
            if (r2 == 0) goto Lb8
            android.text.SpannableStringBuilder r4 = A00(r6, r13)
            int r2 = r4.length()
        La1:
            int r2 = r2 + (-1)
            if (r2 < 0) goto Lb8
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 == r0) goto La1
            char r1 = r4.charAt(r2)
            r0 = 10
            if (r1 == r0) goto Lb8
            r4.append(r0)
        Lb8:
            java.util.Iterator r2 = X.AnonymousClass002.A0n(r13)
        Lbc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L33
            java.util.Map$Entry r0 = X.C3cH.A0l(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            X.E0L r0 = (X.E0L) r0
            java.lang.CharSequence r0 = r0.A0G
            r0.getClass()
            int r0 = r0.length()
            X.C8j4.A1O(r1, r3, r0)
            goto Lbc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6330E1f.A03(X.E1f, java.lang.String, java.util.Map, long, boolean):void");
    }

    public static void A02(C6330E1f c6330E1f, String str, List list, long j) {
        String str2;
        String str3 = c6330E1f.A06;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (c6330E1f.A06(j) && "div".equals(c6330E1f.A07) && (str2 = c6330E1f.A05) != null) {
            list.add(BV4.A0A(str, str2));
            return;
        }
        int i = 0;
        while (true) {
            List<C6330E1f> list2 = c6330E1f.A00;
            if (i >= (list2 == null ? 0 : list2.size())) {
                return;
            }
            A02(c6330E1f.A07(i), str, list, j);
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.C6330E1f r22, java.lang.String r23, java.util.Map r24, java.util.Map r25, java.util.Map r26, long r27) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6330E1f.A04(X.E1f, java.lang.String, java.util.Map, java.util.Map, java.util.Map, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.C6330E1f r6, java.util.TreeSet r7, boolean r8) {
        /*
            java.lang.String r0 = "p"
            java.lang.String r1 = r6.A07
            boolean r5 = r0.equals(r1)
            java.lang.String r0 = "div"
            boolean r0 = r0.equals(r1)
            if (r8 != 0) goto L18
            if (r5 != 0) goto L18
            if (r0 == 0) goto L2f
            java.lang.String r0 = r6.A05
            if (r0 == 0) goto L2f
        L18:
            long r1 = r6.A02
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L26
            X.BV6.A1R(r7, r1)
        L26:
            long r1 = r6.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L2f
            X.BV6.A1R(r7, r1)
        L2f:
            java.util.List<X.E1f> r0 = r6.A00
            if (r0 == 0) goto L50
            r2 = 0
        L34:
            java.util.List<X.E1f> r0 = r6.A00
            int r0 = r0.size()
            if (r2 >= r0) goto L50
            java.util.List<X.E1f> r0 = r6.A00
            java.lang.Object r1 = r0.get(r2)
            X.E1f r1 = (X.C6330E1f) r1
            if (r8 != 0) goto L49
            r0 = 0
            if (r5 == 0) goto L4a
        L49:
            r0 = 1
        L4a:
            A05(r1, r7, r0)
            int r2 = r2 + 1
            goto L34
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6330E1f.A05(X.E1f, java.util.TreeSet, boolean):void");
    }

    private final boolean A06(long j) {
        long j2 = this.A02;
        if (j2 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.A01) {
            return j2 <= j && j < this.A01;
        }
        return true;
    }

    private final C6330E1f A07(int i) {
        List<C6330E1f> list = this.A00;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public C6330E1f(C6330E1f c6330E1f, E1j e1j, String str, String str2, String str3, String str4, String[] strArr, long j, long j2) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = e1j;
        this.A0A = strArr;
        this.A09 = AnonymousClass002.A1X(str2);
        this.A02 = j;
        this.A01 = j2;
        str3.getClass();
        this.A06 = str3;
        this.A03 = c6330E1f;
        this.A0C = BV4.A0u();
        this.A0B = BV4.A0u();
    }

    public static SpannableStringBuilder A00(String str, Map<String, E0L> map) {
        if (!map.containsKey(str)) {
            E0L e0l = new E0L();
            e0l.A0G = new SpannableStringBuilder();
            e0l.A0D = null;
            map.put(str, e0l);
        }
        CharSequence charSequence = map.get(str).A0G;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }
}
