package X;

import X.GBD;
import java.lang.Comparable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public class GB5<T extends GBD & Comparable<? super T>> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(GB5.class, "_size$volatile");
    public T[] A00;
    public volatile /* synthetic */ int _size$volatile;

    private final void A00(int i, int i2) {
        T[] tArr = this.A00;
        C7384Etj.A0X(tArr);
        T t = tArr[i2];
        C7384Etj.A0X(t);
        T t2 = tArr[i];
        C7384Etj.A0X(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        ((GB6) t).A00 = i;
        ((GB6) t2).A00 = i2;
    }

    public static final void A01(GB5 gb5, int i) {
        while (i > 0) {
            T[] tArr = gb5.A00;
            C7384Etj.A0X(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C7384Etj.A0X(t);
            T t2 = tArr[i];
            C7384Etj.A0X(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            gb5.A00(i, i2);
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A02(int r8) {
        /*
            r7 = this;
            T extends X.GBD & java.lang.Comparable<? super T>[] r5 = r7.A00
            X.C7384Etj.A0X(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = X.GB5.A01
            int r0 = r6.get(r7)
            int r0 = r0 + (-1)
            r6.set(r7, r0)
            int r0 = r6.get(r7)
            if (r8 >= r0) goto L3b
            int r0 = r6.get(r7)
            r7.A00(r8, r0)
            int r0 = r8 + (-1)
            int r2 = r0 / 2
            if (r8 <= 0) goto L5a
            r1 = r5[r8]
            X.C7384Etj.A0X(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r5[r2]
            X.C7384Etj.A0X(r0)
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L5a
            r7.A00(r8, r2)
            A01(r7, r2)
        L3b:
            int r0 = r6.get(r7)
            r4 = r5[r0]
            X.C7384Etj.A0X(r4)
            r3 = 0
            r2 = r4
            X.GB6 r2 = (X.GB6) r2
            java.lang.Object r1 = r2._heap
            X.HrH r0 = X.GBC.A01
            if (r1 == r0) goto L9c
            r2._heap = r3
            r0 = -1
            r2.A00 = r0
            int r0 = r6.get(r7)
            r5[r0] = r3
            return r4
        L5a:
            int r1 = r8 * 2
            int r4 = r1 + 1
            int r0 = r6.get(r7)
            if (r4 >= r0) goto L3b
            T extends X.GBD & java.lang.Comparable<? super T>[] r3 = r7.A00
            X.C7384Etj.A0X(r3)
            int r2 = r1 + 2
            int r0 = r6.get(r7)
            if (r2 >= r0) goto L9a
            r1 = r3[r2]
            X.C7384Etj.A0X(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r3[r4]
            X.C7384Etj.A0X(r0)
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L9a
        L83:
            r1 = r3[r8]
            X.C7384Etj.A0X(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r0 = r3[r2]
            X.C7384Etj.A0X(r0)
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L3b
            r7.A00(r8, r2)
            r8 = r2
            goto L5a
        L9a:
            r2 = r4
            goto L83
        L9c:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GB5.A02(int):X.GBD");
    }
}
