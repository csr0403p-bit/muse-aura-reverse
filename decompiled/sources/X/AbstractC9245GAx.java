package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.GAx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC9245GAx {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T A00(C78T c78t, G0V<? super C3UX, ? super HtJ<? super T>, ? extends Object> g0v) throws Throwable {
        GB7 gb7A00;
        Hqw hqw;
        long jA06;
        if (c78t.get(InterfaceC10590Hxd.A00) == null) {
            gb7A00 = AbstractC9246GAy.A00();
            hqw = Hqw.A00;
            c78t = c78t.plus(gb7A00);
        } else {
            gb7A00 = AbstractC9246GAy.A00.get();
            hqw = Hqw.A00;
        }
        C78T c78tA02 = GAr.A02(c78t, hqw);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBM.A00;
        GAw gAw = new GAw(Thread.currentThread(), c78tA02, gb7A00);
        GAl.A00(gAw, gAw, g0v);
        GB7 gb7 = gAw.A00;
        if (gb7 != null) {
            gb7.A00++;
            gb7.A02 = true;
        }
        while (true) {
            if (gb7 != null) {
                try {
                    jA06 = gb7.A06();
                } finally {
                    if (gb7 != null) {
                        gb7.A04(false);
                    }
                }
            } else {
                jA06 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            }
            if (gAw.AOG()) {
                break;
            }
            LockSupport.parkNanos(gAw, jA06);
            if (Thread.interrupted()) {
                gAw.A0Q(new InterruptedException());
            }
        }
        T t = (T) AbstractC9251GBe.A00(GBM.A01.get(gAw));
        C10474Hkl c10474Hkl = t instanceof C10474Hkl ? (C10474Hkl) t : null;
        if (c10474Hkl == null) {
            return t;
        }
        throw c10474Hkl.A00;
    }
}
