package X;

/* loaded from: classes5.dex */
public abstract class CQX {
    public CQj A00(CQU<?> future, CQj update) {
        CQj cQj;
        if (!(this instanceof CQZ)) {
            return ((CQY) this).A00.getAndSet(future, update);
        }
        synchronized (future) {
            boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
            cQj = future.listeners;
            if (cQj != update) {
                future.listeners = update;
            }
        }
        return cQj;
    }

    public C3491CQo A01(CQU<?> future, C3491CQo update) {
        C3491CQo c3491CQo;
        if (!(this instanceof CQZ)) {
            return ((CQY) this).A04.getAndSet(future, update);
        }
        synchronized (future) {
            boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
            c3491CQo = future.waiters;
            if (c3491CQo != update) {
                future.waiters = update;
            }
        }
        return c3491CQo;
    }

    public void A02(C3491CQo waiter, C3491CQo newValue) {
        if (this instanceof CQZ) {
            waiter.next = newValue;
        } else {
            ((CQY) this).A02.lazySet(waiter, newValue);
        }
    }

    public void A03(C3491CQo waiter, Thread newValue) {
        if (this instanceof CQZ) {
            waiter.thread = newValue;
        } else {
            ((CQY) this).A03.lazySet(waiter, newValue);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQU<*>;LX/CQj;LX/CQj;)Z */
    public boolean A04(CQj future, CQj expect, CQU update) {
        boolean z;
        if (!(this instanceof CQZ)) {
            return AbstractC5217DdT.A00(update, future, expect, ((CQY) this).A00);
        }
        synchronized (update) {
            boolean z2 = CQU.GENERATE_CANCELLATION_CAUSES;
            if (update.listeners == future) {
                update.listeners = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQU<*>;LX/CQo;LX/CQo;)Z */
    public boolean A05(C3491CQo future, C3491CQo expect, CQU update) {
        boolean z;
        if (!(this instanceof CQZ)) {
            return AbstractC5217DdT.A00(update, future, expect, ((CQY) this).A04);
        }
        synchronized (update) {
            boolean z2 = CQU.GENERATE_CANCELLATION_CAUSES;
            if (update.waiters == future) {
                update.waiters = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean A06(CQU<?> future, Object expect, Object update) {
        boolean z;
        if (!(this instanceof CQZ)) {
            return AbstractC5217DdT.A00(future, expect, update, ((CQY) this).A01);
        }
        synchronized (future) {
            boolean z2 = CQU.GENERATE_CANCELLATION_CAUSES;
            if (future.value == expect) {
                future.value = update;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
