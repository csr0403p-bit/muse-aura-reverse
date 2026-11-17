package X;

import java.util.Deque;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Dn9 {
    public static boolean A00;
    public static Function0<Long> A01;
    public static final Dn9 A02 = new Dn9();
    public static final Deque<Long> A04 = BV4.A0s();
    public static final Deque<Long> A03 = BV4.A0s();
    public static final Deque<Long> A05 = BV4.A0s();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r1v0 X.Dn9) */
    public static final synchronized Function0 A00(Dn9 dn9) {
        Function0 function0A00;
        synchronized (dn9) {
            function0A00 = A01;
            if (function0A00 == null) {
                function0A00 = C6724EXi.A00(36);
                A01 = function0A00;
            }
        }
        return function0A00;
    }

    public final synchronized int A01(int i) {
        int i2;
        i2 = 0;
        if (A00) {
            Deque<Long> deque = A04;
            if (!deque.isEmpty()) {
                long jA0Q = C8j4.A0Q(A00(this)) - i;
                Iterator itA0O = C7384Etj.A0O(deque);
                while (itA0O.hasNext() && BV4.A06(itA0O.next()) >= jA0Q) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public final synchronized long A02() {
        long jLongValue;
        Long lPeekLast;
        jLongValue = -1;
        if (A00) {
            Deque<Long> deque = A04;
            if (!deque.isEmpty() && (lPeekLast = deque.peekLast()) != null) {
                jLongValue = lPeekLast.longValue();
            }
        }
        return jLongValue;
    }
}
