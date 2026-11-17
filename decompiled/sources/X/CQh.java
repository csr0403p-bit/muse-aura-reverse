package X;

/* loaded from: classes5.dex */
public abstract class CQh {
    /* JADX WARN: Incorrect types in method signature: (LX/CQV<*>;LX/CQp;LX/CQp;)Z */
    public boolean A00(C3492CQp c3492CQp, C3492CQp c3492CQp2, CQV cqv) {
        boolean z;
        synchronized (cqv) {
            if (cqv.listeners == c3492CQp) {
                cqv.listeners = c3492CQp2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQV<*>;LX/CQm;LX/CQm;)Z */
    public boolean A01(C3489CQm c3489CQm, C3489CQm c3489CQm2, CQV cqv) {
        boolean z;
        synchronized (cqv) {
            if (cqv.waiters == c3489CQm) {
                cqv.waiters = c3489CQm2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A02(CQV<?> cqv, Object obj, Object obj2) {
        boolean z;
        synchronized (cqv) {
            if (cqv.value == obj) {
                cqv.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
