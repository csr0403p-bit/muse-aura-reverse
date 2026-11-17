package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class CE0<TResult> extends AbstractC7391EuP<TResult> {
    public Exception A00;
    public TResult A01;
    public ArrayList<CE1<TResult>> A02;
    public boolean A03;
    public final Object A04 = C3cG.A0T();

    public static final void A00(CE0 ce0) {
        synchronized (ce0.A04) {
            if (!ce0.A07()) {
                throw C3cG.A0Q("task has not completed");
            }
        }
    }

    public static final void A01(CE0 ce0) {
        synchronized (ce0.A04) {
            if (ce0.A07()) {
                throw C3cG.A0Q("task has already completed");
            }
        }
    }

    public static final void A02(CE0 ce0) {
        ArrayList<CE1<TResult>> arrayList;
        synchronized (ce0.A04) {
            ArrayList<CE1<TResult>> arrayList2 = ce0.A02;
            arrayList = null;
            if (arrayList2 != null && ce0.A03) {
                ce0.A02 = null;
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            Iterator<CE1<TResult>> it = arrayList.iterator();
            while (it.hasNext()) {
                CE1<TResult> next = it.next();
                C10543Hqv c10543HqvA0z = C3cG.A0z();
                synchronized (next.A01) {
                    c10543HqvA0z.element = next.A00;
                }
                if (c10543HqvA0z.element != 0) {
                    next.A02.execute(new CE2(ce0, c10543HqvA0z));
                }
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (TTResult;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A06(Object obj) {
        Object obj2 = this.A04;
        synchronized (obj2) {
            if (this.A03) {
                return;
            }
            A01(this);
            this.A03 = true;
            this.A01 = obj;
            obj2.notifyAll();
            A02(this);
        }
    }

    public final boolean A07() {
        boolean z;
        synchronized (this.A04) {
            z = this.A03;
        }
        return z;
    }
}
