package X;

import java.util.Queue;

/* loaded from: classes5.dex */
public final class CSF {
    public Queue A00;
    public boolean A01;
    public final Object A02 = C3cG.A0T();

    public final void A00(CSA csa) {
        CMT cmt;
        Object obj = this.A02;
        synchronized (obj) {
            if (this.A00 == null || this.A01) {
                return;
            }
            this.A01 = true;
            while (true) {
                synchronized (obj) {
                    cmt = (CMT) this.A00.poll();
                    if (cmt == null) {
                        this.A01 = false;
                        return;
                    }
                }
                cmt.Ajb(csa);
            }
        }
    }

    public final void A01(CMT cmt) {
        synchronized (this.A02) {
            Queue queueA0s = this.A00;
            if (queueA0s == null) {
                queueA0s = BV4.A0s();
                this.A00 = queueA0s;
            }
            queueA0s.add(cmt);
        }
    }
}
