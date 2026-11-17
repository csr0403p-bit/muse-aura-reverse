package X;

/* loaded from: classes5.dex */
public abstract class CQf {
    /* JADX WARN: Incorrect types in method signature: (LX/CQd<*>;LX/CQi;LX/CQi;)Z */
    public final boolean A00(CQi future, CQi expect, AbstractC3485CQd update) {
        boolean z;
        if (!(this instanceof C3486CQe)) {
            return AbstractC5217DdT.A00(update, future, expect, ((C3484CQc) this).A00);
        }
        synchronized (update) {
            if (update.listeners == future) {
                update.listeners = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQd<*>;LX/CQn;LX/CQn;)Z */
    public final boolean A01(C3490CQn future, C3490CQn expect, AbstractC3485CQd update) {
        boolean z;
        if (!(this instanceof C3486CQe)) {
            return AbstractC5217DdT.A00(update, future, expect, ((C3484CQc) this).A04);
        }
        synchronized (update) {
            if (update.waiters == future) {
                update.waiters = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
