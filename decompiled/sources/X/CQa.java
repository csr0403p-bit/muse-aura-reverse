package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes5.dex */
public final class CQa extends CQX {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    @Override // X.CQX
    public final CQj A00(CQU<?> future, CQj update) {
        CQj cQj;
        do {
            boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
            cQj = future.listeners;
            if (update == cQj) {
                break;
            }
        } while (!A04(cQj, update, future));
        return cQj;
    }

    @Override // X.CQX
    public final C3491CQo A01(CQU<?> future, C3491CQo update) {
        C3491CQo c3491CQo;
        do {
            boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
            c3491CQo = future.waiters;
            if (update == c3491CQo) {
                break;
            }
        } while (!A05(c3491CQo, update, future));
        return c3491CQo;
    }

    @Override // X.CQX
    public final void A02(C3491CQo waiter, C3491CQo newValue) {
        A05.putObject(waiter, A03, newValue);
    }

    @Override // X.CQX
    public final void A03(C3491CQo waiter, Thread newValue) {
        A05.putObject(waiter, A04, newValue);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQU<*>;LX/CQj;LX/CQj;)Z */
    @Override // X.CQX
    public final boolean A04(CQj future, CQj expect, CQU update) {
        return AbstractC3494CQr.A00(update, future, expect, A05, A00);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CQU<*>;LX/CQo;LX/CQo;)Z */
    @Override // X.CQX
    public final boolean A05(C3491CQo future, C3491CQo expect, CQU update) {
        return AbstractC3494CQr.A00(update, future, expect, A05, A02);
    }

    @Override // X.CQX
    public final boolean A06(CQU<?> future, Object expect, Object update) {
        return AbstractC3494CQr.A00(future, expect, update, A05, A01);
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw BV4.A0d("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C3495CQs());
        }
        try {
            A02 = unsafe.objectFieldOffset(CQU.class.getDeclaredField("waiters"));
            A00 = unsafe.objectFieldOffset(CQU.class.getDeclaredField("listeners"));
            A01 = unsafe.objectFieldOffset(CQU.class.getDeclaredField(BrowserOperationCatalogKt.VALUE));
            A04 = unsafe.objectFieldOffset(C3491CQo.class.getDeclaredField("thread"));
            A03 = unsafe.objectFieldOffset(C3491CQo.class.getDeclaredField("next"));
            A05 = unsafe;
        } catch (NoSuchFieldException e2) {
            throw BV4.A0e(e2);
        }
    }
}
