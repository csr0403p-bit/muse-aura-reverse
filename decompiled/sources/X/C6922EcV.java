package X;

import java.util.List;
import java.util.logging.Level;

/* renamed from: X.EcV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6922EcV {
    public AbstractC6924EcX A00;
    public boolean A01;
    public boolean A02;
    public final String A03;
    public final List<AbstractC6924EcX> A04;
    public final C6920EcT A05;

    public C6922EcV(String str, C6920EcT c6920EcT) {
        C7384Etj.A0Y(str, 1);
        this.A05 = c6920EcT;
        this.A03 = str;
        this.A04 = C3cG.A0h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r3 = r5.size();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[EDGE_INSN: B:36:0x006b->B:27:0x006b BREAK  A[LOOP:0: B:22:0x0056->B:32:0x0076], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A04(X.AbstractC6924EcX r12, long r13, boolean r15) {
        /*
            r11 = this;
            r10 = 0
            X.EcV r0 = r12.A01
            if (r0 == r11) goto L9
            if (r0 != 0) goto L7c
            r12.A01 = r11
        L9:
            long r8 = java.lang.System.nanoTime()
            long r2 = r8 + r13
            java.util.List<X.EcX> r5 = r11.A04
            int r7 = r5.indexOf(r12)
            r4 = -1
            if (r7 == r4) goto L31
            long r0 = r12.A00
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L2e
            java.util.logging.Logger r1 = X.C6920EcT.A07
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L2d
            java.lang.String r0 = "already scheduled"
            X.AbstractC6923EcW.A01(r0, r12, r11)
        L2d:
            return r10
        L2e:
            r5.remove(r7)
        L31:
            r12.A00 = r2
            java.util.logging.Logger r1 = X.C6920EcT.A07
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L51
            long r2 = r2 - r8
            java.lang.String r2 = X.AbstractC6923EcW.A00(r2)
            if (r15 == 0) goto L79
            java.lang.String r1 = "run again after "
        L46:
            java.lang.StringBuilder r0 = X.C60O.A0w()
            java.lang.String r0 = X.AnonymousClass006.A0y(r2, r1, r0)
            X.AbstractC6923EcW.A01(r0, r12, r11)
        L51:
            java.util.Iterator r6 = r5.iterator()
            r3 = 0
        L56:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r6.next()
            X.EcX r0 = (X.AbstractC6924EcX) r0
            long r1 = r0.A00
            long r1 = r1 - r8
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L76
            if (r3 != r4) goto L6f
        L6b:
            int r3 = r5.size()
        L6f:
            r5.add(r3, r12)
            if (r3 != 0) goto L2d
            r10 = 1
            return r10
        L76:
            int r3 = r3 + 1
            goto L56
        L79:
            java.lang.String r1 = "scheduled after "
            goto L46
        L7c:
            java.lang.String r0 = "task is in multiple queues"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6922EcV.A04(X.EcX, long, boolean):boolean");
    }

    public final void A00() {
        byte[] bArr = AbstractC6843Eav.A06;
        C6920EcT c6920EcT = this.A05;
        synchronized (c6920EcT) {
            if (A03()) {
                c6920EcT.A02(this);
            }
        }
    }

    public final void A01() {
        byte[] bArr = AbstractC6843Eav.A06;
        C6920EcT c6920EcT = this.A05;
        synchronized (c6920EcT) {
            this.A02 = true;
            if (A03()) {
                c6920EcT.A02(this);
            }
        }
    }

    public final void A02(AbstractC6924EcX abstractC6924EcX) {
        C7384Etj.A0Y(abstractC6924EcX, 0);
        C6920EcT c6920EcT = this.A05;
        synchronized (c6920EcT) {
            if (this.A02) {
                if (C6920EcT.A07.isLoggable(Level.FINE)) {
                    AbstractC6923EcW.A01("schedule canceled (queue is shutdown)", abstractC6924EcX, this);
                }
            } else if (A04(abstractC6924EcX, 0L, false)) {
                c6920EcT.A02(this);
            }
        }
    }

    public final boolean A03() {
        if (this.A00 != null) {
            this.A01 = true;
        }
        List<AbstractC6924EcX> list = this.A04;
        int size = list.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                list.get(size);
                AbstractC6924EcX abstractC6924EcX = list.get(size);
                if (C6920EcT.A07.isLoggable(Level.FINE)) {
                    AbstractC6923EcW.A01("canceled", abstractC6924EcX, this);
                }
                list.remove(size);
                z = true;
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return z;
    }

    public final String toString() {
        return this.A03;
    }
}
