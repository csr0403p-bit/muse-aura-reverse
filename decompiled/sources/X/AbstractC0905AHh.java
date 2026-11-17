package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;

/* renamed from: X.AHh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0905AHh {
    public static final Object[] A00 = new Object[0];

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    @kotlin.Deprecated(message = "This function will be made internal in a future release")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object[] A01(java.util.Collection<?> r6, java.lang.Object[] r7) throws java.lang.NegativeArraySizeException {
        /*
            r3 = 0
            r7.getClass()
            int r1 = r6.size()
            r5 = 0
            r2 = 0
            if (r1 == 0) goto L65
            java.util.Iterator r4 = r6.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L65
            int r0 = r7.length
            if (r1 > r0) goto L51
            r1 = r7
        L1a:
            int r3 = r3 + 1
            java.lang.Object r0 = r4.next()
            r1[r2] = r0
            int r2 = r1.length
            boolean r0 = r4.hasNext()
            if (r3 < r2) goto L3f
            if (r0 != 0) goto L2c
            return r1
        L2c:
            int r0 = r3 * 3
            int r0 = r0 + 1
            int r0 = r0 >>> 1
            if (r0 > r3) goto L48
            r0 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 < r0) goto L48
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
        L3f:
            if (r0 != 0) goto L4f
            if (r1 == r7) goto L68
            java.lang.Object[] r0 = X.C8j3.A1a(r1, r3)
            return r0
        L48:
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.C7384Etj.A0U(r1)
        L4f:
            r2 = r3
            goto L1a
        L51:
            java.lang.Class r0 = r7.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            X.C7384Etj.A0Z(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            goto L1a
        L65:
            int r0 = r7.length
            if (r0 <= 0) goto L6a
        L68:
            r7[r3] = r5
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC0905AHh.A01(java.util.Collection, java.lang.Object[]):java.lang.Object[]");
    }

    @Deprecated(message = "This function will be made internal in a future release")
    public static final Object[] A00(Collection<?> collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    int length = objArrCopyOf.length;
                    boolean zHasNext = it.hasNext();
                    if (i2 >= length) {
                        if (!zHasNext) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        C7384Etj.A0U(objArrCopyOf);
                    } else if (!zHasNext) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        C7384Etj.A0U(objArrCopyOf2);
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return A00;
    }
}
