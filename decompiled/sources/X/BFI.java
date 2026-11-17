package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BFI extends AbstractC0903AHf {
    public static final <T> int A09(T[] tArr, T t) {
        C7384Etj.A0Y(tArr, 0);
        int i = 0;
        int length = tArr.length;
        if (t == null) {
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < length) {
                if (t.equals(tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> int A0A(T[] r4, T r5) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            r3 = -1
            int r0 = r4.length
            int r2 = r0 + (-1)
            if (r5 != 0) goto L16
            if (r2 < 0) goto L27
        Lc:
            int r1 = r2 + (-1)
            r0 = r4[r2]
            if (r0 == 0) goto L26
            if (r1 < 0) goto L27
            r2 = r1
            goto Lc
        L16:
            if (r2 < 0) goto L27
        L18:
            int r1 = r2 + (-1)
            r0 = r4[r2]
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L26
            if (r1 < 0) goto L27
            r2 = r1
            goto L18
        L26:
            return r2
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFI.A0A(java.lang.Object[], java.lang.Object):int");
    }

    public static final String A0B(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, G0U g0u, Object[] objArr) {
        C7384Etj.A0Y(objArr, 0);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sbA0w.append(charSequence);
            }
            BMv.A13(sbA0w, obj, g0u);
        }
        sbA0w.append(charSequence3);
        return sbA0w.toString();
    }

    public static final List<Byte> A0D(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        if (length == 0) {
            return C0881AGi.A00;
        }
        if (length == 1) {
            return Collections.singletonList(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayListA11 = C60O.A11(length);
        do {
            arrayListA11.add(Byte.valueOf(bArr[i]));
            i++;
        } while (i < length);
        return arrayListA11;
    }

    public static final List<Float> A0E(float[] fArr) {
        int i = 0;
        int length = fArr.length;
        if (length == 0) {
            return C0881AGi.A00;
        }
        if (length == 1) {
            return Collections.singletonList(Float.valueOf(fArr[0]));
        }
        ArrayList arrayListA11 = C60O.A11(length);
        do {
            arrayListA11.add(Float.valueOf(fArr[i]));
            i++;
        } while (i < length);
        return arrayListA11;
    }

    public static final <T> List<T> A0F(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        for (T t : tArr) {
            if (t != null) {
                arrayListA0h.add(t);
            }
        }
        return arrayListA0h;
    }

    public static final <T> List<T> A0G(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        int length = tArr.length;
        if (length == 0) {
            return C0881AGi.A00;
        }
        if (length == 1) {
            return Collections.singletonList(tArr[0]);
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, length);
        C7384Etj.A0U(objArrCopyOf);
        return Arrays.asList(objArrCopyOf);
    }

    public static final <T> Set<T> A0H(T[] tArr) {
        int i = 0;
        C7384Etj.A0Y(tArr, 0);
        int length = tArr.length;
        if (length == 0) {
            return A3q.A00;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AIW.A0H(length));
        do {
            linkedHashSet.add(tArr[i]);
            i++;
        } while (i < length);
        return linkedHashSet;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>([TT;)[TT; */
    public static final void A0I(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw C8j3.A0x(C3cG.A0f(objArr, "null element found in "));
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>([TT;TT;)Z */
    public static final boolean A0J(Object obj, Object[] objArr) {
        C7384Etj.A0Y(objArr, 0);
        return A09(objArr, obj) >= 0;
    }

    public static final boolean A0K(char[] cArr, char c) {
        C7384Etj.A0Y(cArr, 0);
        int length = cArr.length;
        int i = 0;
        while (i < length) {
            if (c == cArr[i]) {
                return i >= 0;
            }
            i++;
        }
        return false;
    }

    public static final boolean A0L(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                return i2 >= 0;
            }
            i2++;
        }
        return false;
    }

    public static final String A0C(CharSequence charSequence, G0U g0u, byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sbA0w.append((CharSequence) "");
            }
            sbA0w.append((CharSequence) (g0u != null ? g0u.invoke(Byte.valueOf(b)) : String.valueOf((int) b)));
        }
        sbA0w.append(charSequence);
        return sbA0w.toString();
    }
}
