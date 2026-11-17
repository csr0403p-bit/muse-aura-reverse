package X;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes5.dex */
public final class E33 {
    public E3X A01;
    public final E5L A04;
    public final ArrayDeque<E1P> A02 = BV4.A0s();
    public final ArrayDeque<E3X> A05 = BV4.A0s();
    public final PriorityQueue<E3X> A03 = new PriorityQueue<>();
    public int A00 = -1;

    public static void A00(E33 e33, int i) {
        List<E1P> list;
        while (true) {
            PriorityQueue<E3X> priorityQueue = e33.A03;
            if (priorityQueue.size() <= i) {
                return;
            }
            E3X e3xPoll = priorityQueue.poll();
            int i2 = 0;
            while (true) {
                list = e3xPoll.A01;
                if (i2 >= list.size()) {
                    break;
                }
                e33.A04.A6y(list.get(i2), e3xPoll.A00);
                e33.A02.push(list.get(i2));
                i2++;
            }
            list.clear();
            E3X e3x = e33.A01;
            if (e3x != null && e3x.A00 == e3xPoll.A00) {
                e33.A01 = null;
            }
            e33.A05.push(e3xPoll);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r9 < r2.peek().A00) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.E1P r8, long r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L1d
            r4 = -1
            if (r0 == r4) goto L23
            java.util.PriorityQueue<X.E3X> r2 = r7.A03
            int r1 = r2.size()
            int r0 = r7.A00
            if (r1 < r0) goto L23
            java.lang.Object r0 = r2.peek()
            X.E3X r0 = (X.E3X) r0
            long r1 = r0.A00
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L23
        L1d:
            X.E5L r0 = r7.A04
            r0.A6y(r8, r9)
        L22:
            return
        L23:
            java.util.ArrayDeque<X.E1P> r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L54
            X.E1P r5 = X.BV6.A0X()
        L2f:
            int r0 = r8.A04()
            r5.A0P(r0)
            byte[] r6 = r8.A02
            int r3 = r8.A01
            byte[] r2 = r5.A02
            r1 = 0
            int r0 = r5.A04()
            java.lang.System.arraycopy(r6, r3, r2, r1, r0)
            X.E3X r3 = r7.A01
            if (r3 == 0) goto L5b
            long r1 = r3.A00
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L5b
            java.util.List<X.E1P> r0 = r3.A01
            r0.add(r5)
            return
        L54:
            java.lang.Object r5 = r1.pop()
            X.E1P r5 = (X.E1P) r5
            goto L2f
        L5b:
            java.util.ArrayDeque<X.E3X> r1 = r7.A05
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L93
            X.E3X r0 = new X.E3X
            r0.<init>()
        L68:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass002.A1L(r1)
            X.C1G.A07(r1)
            java.util.List<X.E1P> r2 = r0.A01
            boolean r1 = r2.isEmpty()
            X.C1G.A08(r1)
            r0.A00 = r9
            r2.add(r5)
            java.util.PriorityQueue<X.E3X> r1 = r7.A03
            r1.add(r0)
            r7.A01 = r0
            int r0 = r7.A00
            if (r0 == r4) goto L22
            A00(r7, r0)
            return
        L93:
            java.lang.Object r0 = r1.pop()
            X.E3X r0 = (X.E3X) r0
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E33.A02(X.E1P, long):void");
    }

    public E33(E5L e5l) {
        this.A04 = e5l;
    }

    public final void A01(int i) {
        C1G.A08(C8j3.A1Q(i));
        this.A00 = i;
        A00(this, i);
    }
}
